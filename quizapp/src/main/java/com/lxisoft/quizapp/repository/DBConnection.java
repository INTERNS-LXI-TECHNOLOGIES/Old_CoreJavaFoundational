package com.lxisoft.quizapp.repository;

import java.util.Hashtable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection obj = new DBConnection();

    private static Connection dbConnection;

    private static  String database;

    private DBConnection() {}

    public static void setParameters(Hashtable<String , String> parameters) 
    throws ClassNotFoundException , SQLException {

        String driver = (String) parameters.get("driver");
        String host = (String) parameters.get("host");
        String user = (String) parameters.get("user");
        String pwd = (String) parameters.get("pwd");

        DBConnection.database = (String) parameters.get("database");

        String url = host;

        Class.forName(driver);

        DBConnection.dbConnection = DriverManager.getConnection(url, user, pwd);

        DBConnection.dbConnection.createStatement().executeQuery("CREATE DATABASE IF NOT EXISTS " + DBConnection.database);
        DBConnection.dbConnection.createStatement().executeQuery("USE " + DBConnection.database);

    }
    
    public static DBConnection getConnection() {

        return DBConnection.obj;

    }

    public static Connection getDatabaseConnection() {

        return DBConnection.dbConnection;
    }

    public static void reset() throws SQLException {

        DBConnection.dbConnection.createStatement().executeQuery("DROP DATABASE IF EXISTS " + DBConnection.database);
        DBConnection.dbConnection.createStatement().executeQuery("CREATE DATABASE IF NOT EXISTS " + DBConnection.database);
        DBConnection.dbConnection.createStatement().executeQuery("USE " + DBConnection.database);
    }

}