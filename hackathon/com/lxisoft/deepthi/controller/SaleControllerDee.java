package com.lxisoft.deepthi.controller;
import com.lxisoft.deepthi.model.*;


public class SaleControllerDee 
{

public void sell(ProductDee productShopped, int quantity)
	{
		System.out.println("Item sold :"+productShopped+"\n"+"Quantity : "+quantity);
		double cost=totalAmount(productShopped,quantity);
		System.out.println("Total cost : "+cost);
	}
	public double totalAmount(ProductDee productShopped,int quantity)
	{
		return productShopped.getPrice()*quantity;
	}







}