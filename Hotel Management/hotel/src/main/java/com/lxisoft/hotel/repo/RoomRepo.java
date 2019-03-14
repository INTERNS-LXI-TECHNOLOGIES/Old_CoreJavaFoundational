package com.lxisoft.hotel.repo;
import java.sql.*;
/**
*<h1>Repo Class For Room</h1>
<p>
*This class is for crud operation.
*@author Mohammed Anish
*@version 1.1
*/
public class RoomRepo{
	Repo r = new Repo();
	/**
	*This method is for storing booking details to database
	*@param roomNo Room No
	*@param inDate checkin Date
	*@param outDate checkout Date
	*@throws Exception exception 
	*/
	public void booking(int roomNo,String inDate,String outDate) throws Exception{
		PreparedStatement p = r.c.prepareStatement("insert into room(roomNo,Checkin,checkout) values(?,?,?)");
		p.setInt(1,roomNo);
		p.setString(2,inDate);
		p.setString(3,outDate);
		p.execute();
	}
	/**
	*this method is for get booked Details of room no given
	*@param roomNo room no
	*@throws Exception exception
	*@return ResultSet of room
	*/
	public ResultSet checking(int roomNo) throws Exception{
		Statement s = r.c.createStatement();
		System.out.println(roomNo);
		return s.executeQuery("select * from room where roomNo = "+roomNo);
	}
}