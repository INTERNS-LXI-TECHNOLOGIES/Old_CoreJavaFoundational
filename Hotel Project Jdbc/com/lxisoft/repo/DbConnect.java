package com.lxisoft.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.lxisoft.model.Admin;

public class DbConnect{

    

    static public Connection getConnection(){
        Connection con = null;
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");  
        
        }catch(Exception e){ System.out.println(e);}
        
        return con;  
    }  

    public ArrayList<Admin> adminDet(){
        ArrayList<Admin> admins = new ArrayList<Admin>();
        Connection con = getConnection();
        String query ="SELECT * FROM ADMIN";
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery(query);
            Admin admin;
            while(rs.next()){
                admin=new Admin(rs.getString(UserName),rs.getString(Password));
            }
           admins.add(admin); 
        }catch(Exception e){
            e.printStackTrace();
        }
        return admins;
    }
}