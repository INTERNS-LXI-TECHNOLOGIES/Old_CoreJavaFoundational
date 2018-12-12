package com.lxisoft.quizapp.repository;

import java.sql.*;
import java.sql.PreparedStatement;
import java.lang.reflect.*;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Arrays;
import java.util.stream.*;

import com.lxisoft.quizapp.repository.DBConnection;
import com.lxisoft.quizapp.repository.annotation.*;
import com.lxisoft.quizapp.repository.annotation.Type;

public class QueryBuilder {

    private static Field FOREIGN_KEY_FIELD;

    /** 
     * 
     * Creates Prepared Statement For Creating Tables From Class 
     * 
    **/
    public static PreparedStatement createTableQuery(Class<?> pclass) 
    throws SQLException{

        PreparedStatement statement = null;

        String query = "CREATE TABLE IF NOT EXISTS " + pclass.getSimpleName() +"(";
        
        Dictionary<String , String> colNmTp = new Hashtable<>();
        colNmTp.put("int", "INT");
        colNmTp.put("varchar", "VARCHAR(100)");
        colNmTp.put("text", "TEXT");
        

        Stream<Field> fields = Arrays.asList(pclass.getDeclaredFields()).stream();

        String columns = fields.map(field->{

            String fieldType = field.getDeclaredAnnotation(Type.class).value();

            String fieldName = field.getName();

            String fieldString = fieldName.concat(" " + colNmTp.get(fieldType));

            if(field.getDeclaredAnnotation(PrimaryKey.class) != null){

                fieldString = fieldString.concat(" PRIMARY KEY AUTO_INCREMENT");
            }

            if(field.getDeclaredAnnotation(ForeignKey.class) != null) {

                QueryBuilder.FOREIGN_KEY_FIELD = field;
            }

            if(field.getDeclaredAnnotation(Unique.class) != null) {

                fieldString = fieldString.concat(" UNIQUE NOT NULL");

                if(fieldType == "text") {
                    try {

                        throw new Exception("Cannot Assign a Text field as Unique");

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }
            }
            
            return fieldString;

        }).collect(Collectors.joining(","));

        query = query.concat(columns);

        String foreignKeyString = null;

        foreignKeyString = QueryBuilder.createForeignKey();
        QueryBuilder.FOREIGN_KEY_FIELD = null;

        if(foreignKeyString != null) {
            
            query = query.concat("," + foreignKeyString + ")");
        }
        else {

            query = query.concat(")");
        }

        statement =  DBConnection.getDatabaseConnection().prepareStatement(query);

        return statement;
    }

    /** 
     * 
     * Create a Foreign key format String 
     * 
    **/
    public static String createForeignKey() {

        try {

            Field field = QueryBuilder.FOREIGN_KEY_FIELD;

            String foreignKeyString;
            
            if(field != null) {

                ForeignKey foreignKey = field.getDeclaredAnnotation(ForeignKey.class);
            
                String referenceTable = foreignKey.table();
                String referenceColumn = foreignKey.column();
        
                foreignKeyString = "FOREIGN KEY(" + field.getName() + ") REFERENCES ";
                foreignKeyString = foreignKeyString.concat(referenceTable + "(");
                foreignKeyString = foreignKeyString.concat(referenceColumn + ")");
    
                return foreignKeyString;
    
            }
        
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return null;

    }

    /** 
     * 
     * Creates Prepared Statement For Retrieving Data From Tables 
     * 
    **/
    public static String retrieveQuery(Class<?> pclass , String ...condition) {

        String query = "SELECT * FROM " + pclass.getSimpleName();

        if(condition.length > 0) {

            query = query.concat(" " + condition[0]);
        }
        
        return query;
    }
    

    /** 
     * 
     * Creates Prepared Statement For Inserting Data Into Tables From Objects 
     * 
    **/
    public static PreparedStatement createQuery(Hashtable<String,String> tableColumns , String tableName) 
    throws SQLException {

        PreparedStatement statement = null;
        String query = "INSERT INTO " + tableName;
        String columns = "(";
        String values = "values(";
        int index = 1;

        Enumeration<String> keys = tableColumns.keys();

        while(keys.hasMoreElements()) {

            columns = columns.concat((String)keys.nextElement() + ",");
            values = values.concat("? ,");
        }

        columns = columns.substring(0, columns.length()-1);
        columns = columns.concat(")");
        values = values.substring(0, values.length() - 1);
        values = values.concat(")");

        query = query.concat(columns + " " + values);

        statement =  DBConnection.getDatabaseConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        for(String svalues:tableColumns.values()) {

            String type = svalues.split(":")[1];
            String value = svalues.split(":")[0];

            switch(type) {

                case "int":statement.setInt(index, Integer.parseInt(value));break;
                case "varchar":statement.setString(index, value);break;
                case "text":statement.setString(index, value);break;
            }

            index++;
        }

        return statement;
    }


    /** 
     * 
     * Creates Prepared Statement For Updating Data In Tables 
     * 
    **/
    public static PreparedStatement updateQuery(Hashtable<String,String> tableColumns,String tableName , String condition)
    throws SQLException {

        PreparedStatement statement = null;

        String query = "UPDATE " + tableName + " SET "; 

        Enumeration<String> keys = tableColumns.keys();

        while(keys.hasMoreElements()) {
            
            query = query.concat((String)keys.nextElement() + "= ? ,");
        }

        query = query.substring(0, query.length()-1);

        query = query.concat("WHERE " + condition);

        statement =  DBConnection.getDatabaseConnection().prepareStatement(query);

        int index = 1;

        for(String pvalue : tableColumns.values()) {

            String value = pvalue.split(":")[0];
            String type = pvalue.split(":")[1];

            switch(type) {

                case "int":statement.setInt(index, Integer.parseInt(value));break;
                case "varchar":statement.setString(index, value);break;
                case "text":statement.setString(index, value);break;
            }

            index++;
        }

        return statement;
    }


    
    /** 
     * 
     * Creates Prepared Statement For Deleting Data In Tables 
     * 
    **/
    public static PreparedStatement deleteQuery(String tableName , String condition)
    throws SQLException {

        PreparedStatement statement = null;

        String query = "DELETE FROM " + tableName + " "; 

        query = query.concat("WHERE " + condition);

        statement =  DBConnection.getDatabaseConnection().prepareStatement(query);

        return statement;
    }

    /** 
     * 
     * Convert Object Into A Dictionary key , value:type  
     * 
    **/
    public static Hashtable<String , String> createKeyValuePair(Object obj) {

        Hashtable<String , String> temp = new Hashtable<>();

        Field[] fields = obj.getClass().getDeclaredFields();

        try {

            for(Field field : fields) {
                
                field.setAccessible(true);

                if(field.getDeclaredAnnotation(AutoIncrement.class) == null) {

                    String fieldType = field.getDeclaredAnnotation(Type.class).value();

                    temp.put((String)field.getName(), field.get(obj) + ":" + fieldType);
                }
            } 

            return temp;

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return null;
        
    }
}