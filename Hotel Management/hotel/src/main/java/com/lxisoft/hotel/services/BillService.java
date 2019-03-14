package com.lxisoft.hotel.services;
import com.lxisoft.hotel.model.*;
import com.lxisoft.hotel.repo.*;
import java.util.*;
/**
*<h1>Service Class For Bill</h1>
<p>
*This class is a Service class for Bill.
*All business logics are done throw this class
*@author Mohammed Anish
*@version 1.1
*/
public class BillService{
	BillRepo billRepo = new BillRepo();
	/**
	*this method is for getting tolal amount for all foods
	*@param selectedfoods customer selected foods
	*@return total amount
	*/
	public int totalBill(Map<Integer,Food> selectedfoods){
		Bill bill = new Bill();
		int totalPrice = 0;
		for(int i=0;i<selectedfoods.size();i++){
			totalPrice = totalPrice+bill.getFoodNos().get(i)*selectedfoods.get(i).getPrice();
		}
		return totalPrice;
	}
	/**
	*this method is for getting price of each food by multipling with its nos
	*@param foodRate rate of the food
	*@param foodNos no of food
	*@return price for each food
	*/
	public int foodPrice(int foodRate,int foodNos){
		int foodPrice = foodRate*foodNos;
		return foodPrice;
	}
	/**
	*this method is for senting bill details that coming from BillController class to BillRepo class
	*@param name name of the buyer
	*@param foodName name of the food 
	*@param foodPrice price fir the food 
	*@param foodNos no of foods
	*@param id bill no
	*@param date bill date
	*@param time bill time
	*@throws Exception
	*/
	public void prevBill(String name,String foodName,String foodPrice, String foodNos, int id,String date,String time) throws Exception{
		billRepo.prevBill(name,foodName,foodPrice,foodNos,id,date,time);
	}
	/**
	*this method is used for gettting bill using bill no from BillRepo 
	*@param id bill no
	*@throws Exception
	*/
	public void setprevBill(int id) throws Exception{
		billRepo.setPrevBill(id);
	}
}