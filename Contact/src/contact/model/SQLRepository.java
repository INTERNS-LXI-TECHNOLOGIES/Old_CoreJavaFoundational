/**
 * Java Class SQLRepository
 * 
 * This class is used to store data in an a Database
 * 
 * Provides CRUD operations to manipulate Data;
 *
 * @author Jishnu
 * 
 * @version 1.00
 * 
 * @LastUpdated : 
 * 
 */

package contact.model;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.reflect.Field;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class SQLRepository<T> extends RepositoryParser<T> implements Repository<T> {
	

	private Connection sqlConnection;
	
	private String DB_HOST;
	
	private String DB_USER;
	
	private String DB_PWD;
	
	private String table_name;
	
	private String CREATE_TABLE_QUERY;
	
	private String DELETE_TABLE_QUERY;
	
	private String INSERT_TABLE_QUERY;
	
	private String SELECT_TABLE_QUERY;
	
	private String UPDATE_TABLE_QUERY;


	// Constructors

	public SQLRepository(String host , String user , String pwd,Class<T> _class) {
		
		this.setDB_HOST(host);
		
		this.setDB_USER(user);
		
		this.setDB_PWD(pwd);
		
		this.setClassType(_class);
		
		this.setTableName(this.getClassType().getSimpleName());
		
		this.CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS " + this.getTableName();
		
		this.DELETE_TABLE_QUERY = "DROP TABLE IF EXISTS " + this.getTableName();

		this.INSERT_TABLE_QUERY = "INSERT INTO " + this.getTableName() + "(";
		
		this.SELECT_TABLE_QUERY = "SELECT * FROM " + this.getTableName();
		
		this.UPDATE_TABLE_QUERY = "UPDATE  " + this.getTableName() + " SET";
		
		this.initSQLConnections();
		
	}
	
	
	// Setters and Getters


	/**
	 * Returns the Database Connection Reference
	 * 
	 * @return Connection
	 * 
	 */
	public Connection getSqlConnection() {
		
		return sqlConnection;
	}

	
	/**
	 * Sets the Database Connection Reference
	 * 
	 * @param sqlConnection : Database Connection reference
	 * 
	 */
	public void setSqlConnection(Connection sqlConnection) {
		
		this.sqlConnection = sqlConnection;
	}

	
	/**
	 * Returns The Host Address of the Database
	 * 
	 * @return String
	 * 
	 */
	public String getDB_HOST() {
		
		return DB_HOST;
	}

	
	/**
	 * Sets the Host address for Database
	 * 
	 * @param dB_HOST : Host Address
	 * 
	 */
	public void setDB_HOST(String dB_HOST) {
		
		DB_HOST = dB_HOST;
	}

	
	/**
	 * Returns the USERNAME used to log into Database
	 * 
	 * @return String
	 * 
	 */
	public String getDB_USER() {
		
		return DB_USER;
	}

	
	/**
	 * Sets the USERNAME for DATABASE Connection
	 * 
	 * @param dB_USER : Username
	 * 
	 */
	public void setDB_USER(String dB_USER) {
		
		DB_USER = dB_USER;
	}

	/**
	 * Returns The Password used to log into Database
	 * 
	 * @return String
	 * 
	 */
	public String getDB_PWD() {
		
		return DB_PWD;
	}

	/**
	 * Sets the Login Password for Database Connection
	 * 
	 * @param db_PWD : Password
	 * 
	 */
	public void setDB_PWD(String dB_PWD) {
		
		DB_PWD = dB_PWD;
	}
	
	/**
	 * Returns The currently used table name
	 * 
	 * @return String
	 * 
	 */
	public String getTableName() {
		
		return this.table_name;
	}
	
	/**
	 * Sets the Database table to be Used 
	 * 
	 * @param table_name : Name of the table
	 * 
	 */
	public void setTableName(String table_name) {
		
		this.table_name = table_name;
	}

	
	// Database Initializations methods
	
	/**
	 * Connects to the database using the current given credentials 
	 * 
	 * @return boolean : True if connection was Successful , false otherwise
	 * 
	 */
	public boolean initSQLConnections() {
	
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			this.sqlConnection = DriverManager.getConnection(DB_HOST, DB_USER, DB_PWD);
			
			this.createTable();
			
			return true;
				
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	/**
	 * Removes the currently used Table from database 
	 * 
	 * @return boolean : True if Operation was Successful , false otherwise
	 * 
	 */
	public boolean dropTable() {
		
		try {
			
			String query = DELETE_TABLE_QUERY;

			Statement stmt = this.getSqlConnection().createStatement();

			stmt.executeQuery(query);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return false;
	}

	
	/**
	 * Create a Table with columns According to the Fields of given Model Class 
	 * 
	 * @return boolean : True if Operation was Successful , false otherwise
	 * 
	 */
	public boolean createTable() {
		
		try {
			
			int count = 0;
			
			String columns = "(";
			
			String query = CREATE_TABLE_QUERY;
			
			Stream<Field> fstreams = Arrays.asList(this.getClassType().getDeclaredFields()).stream();
			
			List<String> fieldNames = fstreams.map(field->field.getName()).collect(Collectors.toList());
			
			List<String> fieldTypes = Arrays.asList(this.getClassType().getDeclaredFields()).stream().map((field)->{
				
				String type = null;
				
				switch(field.getType().getSimpleName()) {
				
					case "int":type = "INT";break;
					
					case "String":type = "VARCHAR(100)";break;
				}
				
				if(field.getDeclaredAnnotation(Distinct.class) != null) {
				
					type = type.concat(" PRIMARY KEY");
				}
				
				return type;
				
			}).collect(Collectors.toList());
			
			for(String fname : fieldNames) {
				
				columns = columns.concat(fname + " " + fieldTypes.get(count));
					
				if(count + 1 != fieldTypes.size()) {
						
					columns = columns.concat(",");
						
					count++;
					
					continue;
				}			
			}
			
			columns = columns.concat(")");

			query = query.concat(columns);
			
			Statement stmt = this.getSqlConnection().createStatement();
			
			stmt.executeQuery(query);
			
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
	// CRUD operations
	
	/**
	 * Insert T Object to database
	 * 
	 * @param obj Object to insert
	 * @return boolean : true if insertion is successful else false
	 * 
	 */
	@Override
	public boolean create(T obj) {
		
		PreparedStatement insertT = null;
		
		String query = INSERT_TABLE_QUERY;
		
		String values = " VALUES(";
		

		try
		{
			Stream<Field> sfield = Arrays.asList(this.getClassType().getDeclaredFields()).stream();
			
			List<String> fieldNames = sfield.map(field->field.getName()).collect(Collectors.toList());
						
			values = values.concat(fieldNames.stream().map(str->str = "?").collect(Collectors.joining(",")));
			
			query = query.concat(fieldNames.stream().map(Object::toString).collect(Collectors.joining(",")));
			
			query = query.concat(")");
			
			values = values.concat(")");
			
			query = query.concat(values);
	
			insertT = this.sqlConnection.prepareStatement(query);
			
			int count = 1;
			
			for(Field field : this.getClassType().getDeclaredFields()) {
			
				field.setAccessible(true);
				
				switch(field.getType().getSimpleName()) {
				
					case "int" : insertT.setInt(count, (int)field.get(obj));break;
					case "String" : insertT.setString(count , (String)field.get(obj));break;
				}
				
				count++;
			}
			
			insertT.executeQuery();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return false;

	}
	
	
	/**
	 * Retrieve T Objects from Database
	 * 
	 * @param __condition Specifies which elements are to be selected
	 * @return ArrayList of T Objects which matches __condition
	 * 
	 */
	@Override
	public CopyOnWriteArrayList<T> retrieve(String __condition) {
	
		try {
			
			Statement stmt = this.sqlConnection.createStatement();
			
			if(__condition.equals("*")) {
				
				final ResultSet set = stmt.executeQuery(SELECT_TABLE_QUERY);
				
				return this.sqlParseResult(set);
			}
			else
			{
				final ResultSet set = stmt.executeQuery(SELECT_TABLE_QUERY + " WHERE " + __condition);
				
				return this.sqlParseResult(set);
			}
	
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	
	/**
	 * Replace Object in Database
	 * 
	 * @param nobj Updated Object
	 * @param odobj Old Object
	 * @return boolean : true if updating is successful
	 * 
	 */
	@Override
	public boolean update(T nobj, T odobj) {
	
	    final Field distinctField = this.getDistinctField();
		
		Stream<Field> fields = Arrays.asList(this.getClassType().getDeclaredFields()).stream();
		
		try {
			
			String distinctValue = distinctField.get(odobj).toString();

			String query = UPDATE_TABLE_QUERY;
			
			String fieldSetters = fields.map(field->{
				
				return field.getName();
				
			}).map(name->{ return name + "= ?"; }).collect(Collectors.joining(","));
			
			query = query.concat(" " + fieldSetters);
			
			query = query.concat(" WHERE " + distinctField.getName() + "=" + distinctValue);

			PreparedStatement stmt = this.sqlConnection.prepareStatement(query);
			
			int count = 1;
			
			for(Field field : this.getClassType().getDeclaredFields()) {
				
				field.setAccessible(true);
				
				switch(field.getType().getSimpleName()) {
				
					case "int" : stmt.setInt(count, (int)field.get(nobj));break;
					case "String" : stmt.setString(count , (String)field.get(nobj));break;
				}
				
				count++;
			}
			
			
			stmt.execute();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return false;
	}

	/**
	 * Delete T Object from database
	 * 
	 * @param obj Object to be deleted
	 * @return boolean : true if deletion is successful else false
	 * 
	 */
	@Override
	public boolean delete(T obj) {

	
		Field distinctField = this.getDistinctField();
		
		try {
			String distinctValue = distinctField.get(obj).toString();

			String query = "DELETE FROM " + this.getClassType().getSimpleName() + " WHERE id=" + distinctValue;

			Statement stmt = this.sqlConnection.createStatement();

			stmt.executeQuery(query);
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	
		return false;
	}

	
	/**
	 * Replace Object in Database , which has same ID field has obj
	 * 
	 * @param obj Updated Object
	 * @return boolean : true if updating is successful
	 * 
	 */	
	@Override
	public boolean update(T obj) {
		
		final Field distinctField = this.getDistinctField();
		
		Stream<Field> fields = Arrays.asList(this.getClassType().getDeclaredFields()).stream();
		
		try {
			String distinctValue = distinctField.get(obj).toString();

			String query = "UPDATE " + this.getClassType().getSimpleName();
		
			String setter = " SET ";
					
			String fieldSetters = fields.map(field->{
				
				return field.getName();
				
			}).map(name->{ return name + "= ?"; }).collect(Collectors.joining(","));
			
			setter = setter.concat(fieldSetters);
			
			query = query.concat(" " + setter + " WHERE " + distinctField.getName() + "=" + distinctValue);
			
			PreparedStatement stmt = this.sqlConnection.prepareStatement(query);
			
			int count = 1;
			
			for(Field field : this.getClassType().getDeclaredFields()) {
				
				field.setAccessible(true);

				
				switch(field.getType().getSimpleName()) {
				
					case "int" : stmt.setInt(count, (int)field.get(obj));break;
					case "String" : stmt.setString(count , (String)field.get(obj));break;
				}
				
				count++;
			}
			
			
			stmt.execute();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return false;
	}

}
