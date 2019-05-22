package com.lxisoft.collection;
import java.util.*;

public class Phone implements Comparable<Phone>
{
	String brand;
	String model;
	//int price;
	public String getPhone(String brand,String model)
	{
		brand=this.brand;
		model=this.model;
		//price=this.price;
		return brand;
		//return model;
	}
	public int compareTo(Phone phone)
	{
		if(brand==phone.brand)
			{return 0;}
		else if(model==phone.model)
			{return 0;}
		else 
			return 1;
	}

}