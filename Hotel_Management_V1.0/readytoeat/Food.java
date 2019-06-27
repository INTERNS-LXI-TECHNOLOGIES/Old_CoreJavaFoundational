package com.lxisoft.hotel.readytoeat;
/**
* This is the food class for Hotel management program
*
* @author  Amal
* @version 1.0
* @since   2019-03-23
* @lastupdated on 2019-06-27
*/
 public class Food{
	private String foodName;
	private  String foodType;
	private  String foodMrp;
	 
	 public void setFoodName(String foodName)
	 {
		 this.foodName=foodName;
	 }
	 public void setFoodtype(String foodType )
	 {
		 this.foodType=foodType;
	 }
	 public void setFoodMrp(String foodMrp)
	 {
		 this.foodMrp=foodMrp;
	 }
	 
	 public String getFoodName()
	 {
		 return foodName;
	 }
	 public String getFoodType()
	 {
		 return foodType;
		
	 }
	 public String getFoodMrp()
	 {
		 return foodMrp;
	 }
	 
 }
