package com.lxisoft.deepthi.model;
import java.util.HashMap;

public class InventoryDee
{
	private HashMap<ProductDee,Integer> stock;
	
	public InventoryDee()
	{
		stock = new HashMap<ProductDee,Integer>();
	}
	
	public HashMap<ProductDee,Integer> getStock()
	{
		return stock;
	}
}