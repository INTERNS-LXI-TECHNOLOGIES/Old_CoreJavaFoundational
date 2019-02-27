package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class HotelRepoImpl implements HotelRepo{

	Hotel hotelModel = new Hotel();
	public void hotelRepo() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		Statement s = c.createStatement();
		s.execute("CREATE TABLE IF NOT EXISTS foodDetails(name TEXT , price INT , nos INT )");
		ResultSet r = s.executeQuery("SELECT * FROM foodDetails");
		while(r.next()){
			Food food = new Food();
			food.setName(r.getString(1));
			food.setPrice(r.getInt(2));
			food.setNos(r.getInt(3));
			hotelModel.getFoods().add(food);
		}
	}
	public void add(Food food) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		hotelModel.getFoods().add(food);
		PreparedStatement p = c.prepareStatement("INSERT INTO foodDetails(name,price,nos) VALUES(?,?,?)");
		p.setString(1,food.getName());
		p.setInt(2,food.getPrice());
		p.setInt(3,food.getNos());
	}
	public void edit(String foodName,int foodPrice,int nos,String name) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		PreparedStatement p = c.prepareStatement("UPDATE foodDetails SET name = ?,price = ?,nos = ? WHERE name = ?");
		p.setString(1,foodName);
		p.setInt(2,foodPrice);
		p.setInt(3,nos);
		p.setString(4,name);
	}
	public void delete(Food selectedFood) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		PreparedStatement s = c.prepareStatement("DELETE FROM foodDetails Where name = ?");
		s.setString(1,selectedFood.getName());
		hotelModel.getFoods().remove(selectedFood);
	}
}