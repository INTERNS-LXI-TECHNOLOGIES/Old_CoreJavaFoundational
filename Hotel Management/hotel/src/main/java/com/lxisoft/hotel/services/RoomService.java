package com.lxisoft.hotel.services;
import com.lxisoft.hotel.repo.*;
import com.lxisoft.hotel.model.*;
import java.sql.*;
import java.text.*;
/**
*<h1>Service Class For Room</h1>
<p>
*This class is a Service class for Room.
*All business logics are done throw this class
*@author Mohammed Anish
*@version 1.1
*/
public class RoomService{
	RoomRepo roomRepo = new RoomRepo();
	/**
	*This method is for Creating rooms
	*/
	public String roomCreation(){
		String rooms = " ";
		for(int j=1;j<=10;j++){
			Room room = new Room();
			room.setRoomNo(j);
			rooms = rooms+"["+j+"]";
		}
		return rooms;
	}
	/**
	*This method is for checking whether the selected room was booked or not
	*@param roomNo Room No
	*@param inDate checkin Date
	*@param outDate checkout Date
	*@throws Exception exception 
	*@return boolean
	*/
	public boolean checkingRoom(int roomNo,String inDate,String outDate)throws Exception{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dateIn = format.parse(inDate);
		java.util.Date dateOut = format.parse(outDate);
		ResultSet r = roomRepo.checking(roomNo);
		boolean a = true;
		while(r.next()){
			if((dateIn.after(r.getDate(3))&&dateIn.before(r.getDate(4)))&&(dateOut.after(r.getDate(3))&&dateOut.before(r.getDate(4)))){
				a =  false;
				break;
			}
			else if((dateIn.before(r.getDate(3))&&dateIn.before(r.getDate(4)))&&(dateOut.after(r.getDate(3))&&dateOut.after(r.getDate(4)))){
				a =  false;
				break;
			}
			else if((dateIn.before(r.getDate(3))&&dateIn.before(r.getDate(4)))&&(dateOut.after(r.getDate(3))&&dateOut.before(r.getDate(4)))){
				a =  false;
				break;
			}
			else if((dateIn.after(r.getDate(3))&&dateIn.before(r.getDate(4)))&&(dateOut.after(r.getDate(3))&&dateOut.after(r.getDate(4)))){
				a =  false;
				break;
			}
			else if(dateIn.equals(r.getDate(3))||dateIn.equals(r.getDate(4))||dateOut.equals(r.getDate(3))||dateOut.equals(r.getDate(4))){
				a = false;
				break;
			}
			else{
				a =  true;
			}
		}
		return a;
	}
	/**
	*This method is for calling booking method in RoomRepo for storing booking details to database
	*@param roomNo Room No
	*@param inDate checkin Date
	*@param outDate checkout Date
	*@throws Exception exception 
	*/
	public void roomBooking(int roomNo,String inDate,String outDate)throws Exception{
		roomRepo.booking(roomNo,inDate,outDate);	
	}
}