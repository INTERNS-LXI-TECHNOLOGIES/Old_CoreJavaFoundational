package com.lxisoft.deepthi.controller;
import com.lxisoft.deepthi.model.*;
//import java.io.*;
import java.util.*;

public class InventoryControllerDee 
{
InventoryDee inventories;
List<ProductDee> inventory ;


	public InventoryControllerDee(InventoryDee inventories)
	{
		this.inventories=inventories;
		addProducts();
	}
//add products to map
	public void addProducts()
	{
		ProductDee product=createProduct(1,"Mango","Fruits",20);
		addStockToInventory(product,3);
		product=createProduct(2,"Mobile","Electronics",1500);
		addStockToInventory(product,7);
		product=createProduct(3,"Froke","Kids wear",300);
		addStockToInventory(product,5);
	}
	
//create product
	public ProductDee createProduct(int id,String name,String description,double price)
	{
		return new ProductDee(id,name,description,price);
	}
//@override
	public void addStockToInventory( ProductDee productToAdd, int quantityToadd)
	{
		inventories.getStock().put(productToAdd,quantityToadd);
	}
//@override
	public void removeStockFromInventory(ProductDee productToRemove,int quantityToRemove)
	{
		int availableQuantity=(int)(inventories.getStock().get(productToRemove));
		availableQuantity-=quantityToRemove;
		inventories.getStock().put(productToRemove,availableQuantity);
	}
	
	public void displayStock()
	{
		HashMap<ProductDee,Integer> stock=inventories.getStock();
		int i=0;
		for(Map.Entry<ProductDee,Integer> entry:stock.entrySet())
		{  
		System.out.println(++i+" . "+entry.getKey()+"      "+entry.getValue());  
		}  
	}
	public ProductDee getProduct(int selection,int quantity)
	{
		HashMap<ProductDee,Integer> storage=inventories.getStock();
		inventory = new ArrayList<ProductDee>(storage.keySet());
		ProductDee product= inventory.get(selection-1);
		return product;
	
	}
	public void changeStock(ProductDee product,int quantity)
	{
		int availableQuantity=(int)(inventories.getStock().get(product));
		if(quantity<=availableQuantity)
		{
			removeStockFromInventory(product,quantity);
		}
		else
		{
			System.out.println("Out of stock");
			System.exit(0);
		}
	}
}