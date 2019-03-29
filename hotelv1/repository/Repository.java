package com.lxisoft.hotelv1.repository;
import com.lxisoft.hotelv1.model.Food;
import java.util.*;
import java.io.*;
import java.sql.*;
public class Repository
{
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/hotel";
	static final String USER="root";
	static final String PASS="root";
	public void connectWithDb() throws Exception
	{	
	Connection con=null;
	Statement stmt=null;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("connecting to database");
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	System.out.println("creating database");
	stmt=con.createStatement();
	String sql;
	sql="select * from food";
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next())
	{
		int SI_NO=rs.getInt("SI_NO");
		String FOODNAME=rs.getString("foodname");
		int FOODCOUNT=rs.getInt("foodcount");
		int FOODPRICE=rs.getInt("foodprice");
		//String DATE=rs.getString("date");
	System.out.println("SI_NO:"+SI_NO);
	System.out.println("Food name:"+FOODNAME);
	System.out.println("Food count:"+FOODCOUNT);
	System.out.println("Food price:"+FOODPRICE);
	//System.out.println("date:"+DATE);
	}
	rs.close();
	stmt.close();
	con.close();
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try{
			if(stmt!=null)
			stmt.close();
		}
		catch(SQLException se1)
		{}
		try{
			if(con!=null)
			con.close();
		}
		catch(SQLException se2){
		}
	}
	}
		
		
public void writeToFile(ArrayList <Food> foods)throws Exception
{
	
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
	//ArrayList <String> f=new ArrayList <String>();
			Collections.sort(foods,new Sorting());
		
	for(int i=0;i<foods.size();i++)
	{
		
	bw.write(foods.get(i).getName()+","+foods.get(i).getFoodCount()+","+foods.get(i).getFoodPrice()+"\n");
		
	}
	bw.close();
	//foods.clear();
	//System.out.println(hotel.getFoods().size());
	
	
}
public void readFromFile(ArrayList <Food> foods)throws Exception
{
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file,true);
	FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
				int k=0;	
				String data;	
				while((data=br.readLine())!=null)
				{
				Food f=new Food();
				String item[]=data.split(",");
				f.setName(item[k]);
				f.setFoodCount(Integer.parseInt(item[k+1]));
				f.setFoodPrice(Integer.parseInt(item[k+2]));
				foods.add(f);
				}
				System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
			for(int i=0;i<foods.size();i++)
			{
			System.out.print((i+1)+"\t\t"+foods.get(i).getName()+"\t\t\t"+foods.get(i).getFoodCount()+"\t\t"+foods.get(i).getFoodPrice()+"\n");
			}
}
}
