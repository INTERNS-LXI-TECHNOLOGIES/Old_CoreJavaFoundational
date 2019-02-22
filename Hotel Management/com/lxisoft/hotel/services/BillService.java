package com.lxisoft.hotel.services;
import com.lxisoft.hotel.model.*;
import java.util.*;
public class BillService{
	public int totalBill(Map<Integer,Food> selectedfoods){
		Bill bill = new Bill();
		int totalPrice = 0;
		for(int i=0;i<selectedfoods.size();i++){
			totalPrice = totalPrice+bill.getFoodNos().get(i)*selectedfoods.get(i).getPrice();
		}
		return totalPrice;
	}
	public int foodPrice(int foodRate,int foodNos){
		int foodPrice = foodRate*foodNos;
		return foodPrice;
	}
}