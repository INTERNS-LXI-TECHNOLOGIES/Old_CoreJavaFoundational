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
		String FOOD_ADD_DATE=rs.getString("food_add_date");
		System.out.println("SI_NO:"+SI_NO);
		System.out.println("Food name:"+FOODNAME);
		System.out.println("Food count:"+FOODCOUNT);
		System.out.println("Food price:"+FOODPRICE);
		System.out.println("date:"+FOOD_ADD_DATE);
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
	
	
	public void insert(Food food)throws Exception
	{
		Connection con=null;
	//Statement stmt=null;
	PreparedStatement ps=null;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("connecting to database");
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	System.out.println("creating database");

	String sql;
	//stmt=con.createStatement();
	Calendar calendar=Calendar.getInstance();
	java.sql.Date dateobj=new java.sql.Date(calendar.getTime().getTime());
	sql="INSERT INTO food"+ "(FOODNAME,FOODCOUNT,FOODPRICE,FOOD_ADD_DATE)values"+"(?,?,?,?)";
	//ResultSet rs=stmt.executeQuery(sql);
	ps=con.prepareStatement(sql);
	ps.setString(1,food.getName());
	ps.setInt(2,food.getFoodCount());
	ps.setInt(3,food.getFoodPrice());
	ps.setDate(4,dateobj);
	
	ps.execute();

	
	//foods.clear();
	ps.close();
	
	//rs.close();
	//stmt.close();
	
	
	con.close();
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try{
			if(con!=null)
			con.close();
		}
		catch(SQLException se2){
		}
	}
	}
	public void delete(String n)throws Exception
	{
		Connection con=null;
	Statement stmt=null;
	PreparedStatement ps=null;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("connecting to database");
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	//System.out.println("creating database");
	String sql;
	sql="DELETE FROM food WHERE FOODNAME='"+n+"'";
	stmt=con.createStatement();
	//ps=con.prepareStatement(sql);	
	//ps.execute();
	//ps.close();
	stmt.execute(sql);
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
			if(con!=null)
			con.close();
		}
		catch(SQLException se2){
		}
	}
	}
		
	public void editName(String nam,String edit)throws Exception
	{
		Connection con=null;
	Statement stmt=null;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("connecting to database");
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	Calendar calendar=Calendar.getInstance();
	java.sql.Date dateobj=new java.sql.Date(calendar.getTime().getTime());
	String sql;
	sql="update food  set FOODNAME='"+nam+"',FOOD_ADD_DATE='"+dateobj+"' WHERE FOODNAME='"+edit+"'";
	stmt=con.createStatement();
	stmt.execute(sql);
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
			if(con!=null)
			con.close();
		}
		catch(SQLException se2){
		}
	}
	}	
	/*public void editCount(String nam,int c)throws Exception
	{
		Connection con=null;
	Statement stmt=null;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("connecting to database");
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	Calendar calendar=Calendar.getInstance();
	java.sql.Date dateobj=new java.sql.Date(calendar.getTime().getTime());
	String sql;
	sql="update food  set FOODCOUNT='"+c+"',FOOD_ADD_DATE='"+dateobj+"' WHERE FOODNAME='"+edit+"'";
	stmt=con.createStatement();
	stmt.execute(sql);
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
			if(con!=null)
			con.close();
		}
		catch(SQLException se2){
		}
	}
	}	
	public void editPrice(String nam,int p)throws Exception
	{
		Connection con=null;
	Statement stmt=null;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("connecting to database");
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	Calendar calendar=Calendar.getInstance();
	java.sql.Date dateobj=new java.sql.Date(calendar.getTime().getTime());
	String sql;
	sql="update food  set FOODPRICE='"+p+"',FOOD_ADD_DATE='"+dateobj+"' WHERE FOODNAME='"+edit+"'";
	stmt=con.createStatement();
	stmt.execute(sql);
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
			if(con!=null)
			con.close();
		}
		catch(SQLException se2){
		}
	}
	}	*/






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
