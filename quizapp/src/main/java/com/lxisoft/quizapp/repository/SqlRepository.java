package com.lxisoft.quizapp.repository;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.lang.reflect.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class SqlRepository<T> implements Repository<T> {

    private Class<T> instance;

    private int LAST_INSERT_ID;

    public SqlRepository(Class<T> instance) throws SQLException {

        this.instance = instance;

        PreparedStatement statement = QueryBuilder.createTableQuery(instance);

        statement.executeQuery();
    }

    public int getLastInsertId() {

        return this.LAST_INSERT_ID;
    }

    // CRUD Operations

    /**
     * 
     * Insert Data to a database
     * 
     **/
    public boolean create(T obj) {

        try {

            Hashtable<String, String> tableColumns = QueryBuilder.createKeyValuePair(obj);
            PreparedStatement query = QueryBuilder.createQuery(tableColumns, obj.getClass().getSimpleName());
            query.executeUpdate();

            ResultSet set = query.getGeneratedKeys();

            /**
             * Finds the Last Insert Id
             * 
             * Change this Code if a better alternative is found
             * 
             */

            while (set.next()) {

                Object iobj = set.getInt(1);
                this.LAST_INSERT_ID = (int)iobj;
            }

            return true;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

    }

    /**
     * 
     * Retrieve Data from database
     * 
     **/
    public List<T> retrieve(String... condition) {

        try {

            List<T> tlist = new ArrayList<>();

            String query = QueryBuilder.retrieveQuery(this.instance, condition);

            ResultSet data = DBConnection.getDatabaseConnection().createStatement().executeQuery(query);

            Field[] fields = this.instance.getDeclaredFields();

            while (data.next()) {

                T obj = this.instance.newInstance();

                int i = 1;

                for (Field field : fields) {

                    if (i > data.getMetaData().getColumnCount())
                        break;

                    field.setAccessible(true);

                    Object value = data.getObject(i);

                    field.set(obj, value);

                    i++;
                }

                tlist.add(obj);

            }

            return tlist;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }

    /**
     * 
     * Update Data in database
     * 
     **/
    public boolean update(T obj) {

        try {

            Hashtable<String, String> tableColumns = QueryBuilder.createKeyValuePair(obj);
            Field field = obj.getClass().getDeclaredField("id");
            field.setAccessible(true);
            String condition = "id = " + field.get(obj);
            PreparedStatement query = QueryBuilder.updateQuery(tableColumns, obj.getClass().getSimpleName(), condition);
            query.executeUpdate();
            return true;

        } catch (Exception e) {

            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(T obj) {

        try {

            Field field = obj.getClass().getDeclaredField("id");
            field.setAccessible(true);
            String condition = "id = " + field.get(obj);
            PreparedStatement query = QueryBuilder.deleteQuery(obj.getClass().getSimpleName(), condition);
            query.executeUpdate();
            return true;

        } catch (Exception e) {

            e.printStackTrace();
        }
        return false;
    }

}