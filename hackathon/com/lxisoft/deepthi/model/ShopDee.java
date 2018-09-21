package com.lxisoft.deepthi.model;
import java.util.*;
import java.io.*;



public class ShopDee 
{

private String shopName ;
//private InventoryDee inventory ;
private int totalSales ;
//private List<CustomerDee> customers ;


//private InventoryControllerDee inventorycontroller;
//private SaleController  SaleController ;


public static void main(String args[]) throws Exception
{

//Create Shop
ShopDee shop = new ShopDee();
Scanner input=new Scanner(System.in);
Properties p=new Properties();
p.setProperty("AppName","Inventory Shoppie");
p.setProperty("Addrss","");
p.setProperty("Street","");
p.setProperty("District","");
p.setProperty("State","");
p.setProperty("Contry","");
p.store(new FileWriter("configuration"),"Details");
//FileReader reader=new FileReader("configuration");
//p.load(reader);
//System.out.println(p.getProperty("AppName"));
	

	





}

//@Create Customers in Shop

//customers = new ArrayList<CustomerDee>();

//@Create Inventory in Shop
 //inventory = new InventoryDee();

//@Conduct sale 



public void setShopName(String shopName)
{
	this.shopName = shopName;
}

public String getShopName()
{
	return shopName;
}

//public void setInventory(InventoryDee inventory)
//{
	//this.inventory = inventory;
//}

//public InventoryDee getInventory()
//{
	//return inventory;
//}

public void setTotalSales(int totalSales)
{
	this.totalSales = totalSales;
}

public int getTotalSales()
{
	return totalSales;
}





}
