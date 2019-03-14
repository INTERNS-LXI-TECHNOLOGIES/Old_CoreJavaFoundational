package com.lxisoft.hotel.repo;
import java.sql.*;
import com.lxisoft.hotel.view.*;
/**
*<h1>Repo Class For Bill</h1>
<p>
*This is the class where database operations are done for Bill.
*@author Mohammed Anish
*@version 1.1
*/
public class BillRepo{
	Repo r = new Repo();
	/**
	*this method is used for storing bill details in database 
	*@param name name of the buyer
	*@param foodName name of the food 
	*@param foodPrice price fir the food 
	*@param foodNos no of foods
	*@param id bill no
	*@param date bill date
	*@param time bill time
	*@throws Exception
	*/
	public void prevBill(String name,String foodName,String foodPrice,String foodNos,int id,String date,String time) throws Exception{
		PreparedStatement p = r.c.prepareStatement("insert into bill(id,name,foodname,foodprice,foodnos,date,time) values(?,?,?,?,?,?,?)");
		p.setInt(1,id);
		p.setString(2,name);
		p.setString(3,foodName);
		p.setString(4,foodPrice);
		p.setString(5,foodNos);
		p.setString(6,date);
		p.setString(7,time);
		p.execute(); 
	}
	/**
	*this method is used for gettting bills fro database using bill no .
	*and senting it as details as an parameter to a method called prevBillView to View class
	*@param id bill no
	*@throws Exception
	*/
	public void setPrevBill(int id) throws Exception{
		Statement s = r.c.createStatement();
		ResultSet r = s.executeQuery("select * from bill where id = '"+id+"'");
		r.next();
		int billNo = Integer.parseInt(r.getString(1));
		String buyername = r.getString(2);
		String foodName = r.getString(3);
		String foodPrice = r.getString(4);
		String foodNos = r.getString(5);
		String date = r.getString(6).toString();
		String time = r.getString(7).toString();
		View.prevBillView(buyername,foodName,foodPrice,foodNos,billNo,date,time);
	}
}