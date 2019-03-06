package com.lxisoft.hotel.repo;
import java.sql.*;
import com.lxisoft.hotel.view.*;
public class BillRepo{
	Repo r = new Repo();
	public void prevBill(String name,String foodName,String foodPrice,String foodNos,int id) throws Exception{
		PreparedStatement p = r.c.prepareStatement("insert into bill(id,name,foodname,foodprice,foodnos) values(?,?,?,?,?)");
		p.setInt(1,id);
		p.setString(2,name);
		p.setString(3,foodName);
		p.setString(4,foodPrice);
		p.setString(5,foodNos);
		p.execute();
	}
	public void setPrevBill(int id) throws Exception{
		Statement s = r.c.createStatement();
		ResultSet r = s.executeQuery("select * from bill where id = '"+id+"'");
		r.next();
		int billNo = Integer.parseInt(r.getString(1));
		String buyername = r.getString(2);
		String foodName = r.getString(3);
		String foodPrice = r.getString(4);
		String foodNos = r.getString(5);
		View.prevBillView(buyername,foodName,foodPrice,foodNos,billNo);
	}
}