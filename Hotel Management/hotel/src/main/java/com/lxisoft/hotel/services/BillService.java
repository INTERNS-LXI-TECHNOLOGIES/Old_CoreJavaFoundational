package com.lxisoft.hotel.services;
import com.lxisoft.hotel.model.*;
import com.lxisoft.hotel.repo.*;
import java.util.*;
public class BillService{
	BillRepo billRepo = new BillRepo();
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
	public void prevBill(String name,String foodName,String foodPrice, String foodNos, int id) throws Exception{
		billRepo.prevBill(name,foodName,foodPrice,foodNos,id);
	}
	public void setprevBill(int id) throws Exception{
		billRepo.setPrevBill(id);
	}
}