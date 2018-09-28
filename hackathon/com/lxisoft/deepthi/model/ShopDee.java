package com.lxisoft.deepthi.model;
import java.util.*;
import java.io.*;
import com.lxisoft.deepthi.controller.*;


public class ShopDee 
{

private String shopName ;

private int totalSales ;

private List<CustomerDee> customers ;

private InventoryDee inventory ;

private InventoryControllerDee inventoryController ;

private SaleControllerDee  saleController ;



public ShopDee() throws IOException
{
//Scanner input = new Scanner(System.in);
Properties p = new Properties();

p.setProperty("shopName","Inventory Shoppie");
p.setProperty("State","");
p.setProperty("Addrss","");
p.setProperty("Street","");
p.setProperty("District","");
p.setProperty("Contry","");
p.store(new FileWriter("configuration"),"Details");
FileReader reader=new FileReader("configuration");
p.load(reader);
System.out.println(p.getProperty("shopName"));


//@Create Customers in Shop

customers = new ArrayList<CustomerDee>();

//@Create Inventory in Shop

inventory = new InventoryDee();

inventoryController = new InventoryControllerDee(inventory);

saleController = new SaleControllerDee();

initSale();

}

//@Conduct sale 
public void initSale()
	{
	Scanner in = new Scanner(System.in);
	CustomerDee customer=customerDetails();		
	inventoryController.displayStock();
	System.out.print("Select product and quantity : ");
	int selection=in.nextInt();
	int quantity=in.nextInt();
	ProductDee product=inventoryController.getProduct(selection,quantity);
	double cost=product.getPrice()*quantity;
		if(customer.getCashInHand()>=cost)
		{
			saleController.sell(product,quantity);
			inventoryController.changeStock(product,quantity);
			customer.setCashInHand(customer.getCashInHand()-cost);
			totalSales+=cost;
		}
		else
		{
			System.out.println("Sorry... \n You have less Money...");
		}
	}


public CustomerDee customerDetails()
	{
		CustomerDee customer=new CustomerDee();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Name of customer : ");
		customer.setName(in.nextLine());
		System.out.print("Enter affordable amount : ");
		customer.setCashInHand(in.nextInt());
		return customer;
	}

public void setShopName(String shopName)
{
	this.shopName = shopName;
}

public String getShopName()
{
	return shopName;
}

public void setInventory(InventoryDee inventory)
{
	this.inventory = inventory;
}

public InventoryDee getInventory()
{
	return inventory;
}

}