package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.services.*;
public class RoomController{
	RoomService roomService = new RoomService();
	/**
	*This method is for calling roomCreation method in RoomService class for Creating rooms
	*/
	public String roomCreation(){
		return roomService.roomCreation();
	}
	/**
	*This method is for calling checkingRoom method for checking whether the selected room was booked or not
	*@param roomNo Room No
	*@param inDate checkin Date
	*@param outDate checkout Date
	*@return boolean 
	*@throws Exception exception 
	*/
	public boolean checkingRoom(int roomNo,String inDate,String outDate)throws Exception{
		return roomService.checkingRoom(roomNo,inDate,outDate);
	}
	/**
	*This method is for calling roomBooking method in RoomService class for storing booking details to database
	*@param roomNo Room No
	*@param inDate checkin Date
	*@param outDate checkout Date
	*@throws Exception exception 
	*/
	public void roomBooking(int roomNo,String inDate,String outDate)throws Exception{
		roomService.roomBooking(roomNo,inDate,outDate);
	}
}