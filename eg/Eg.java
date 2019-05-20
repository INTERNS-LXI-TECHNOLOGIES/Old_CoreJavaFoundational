package com.lxisoft.eg;
import java.util.*;
public class Eg
{
	String brand;
	String price;
	String model;
	public Eg(String brand,String price,String model)
	{
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	public String toString()
	{
		return brand+" "+price+" "+model;
	}
}