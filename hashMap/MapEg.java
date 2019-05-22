package com.lxisoft.hashMap;
import java.util.*;
public class MapEg implements Comparable<MapEg>
{
	String brand;
	String price;
	String model;
	public MapEg(String brand,String price,String model)
	{
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	public int compareTo(MapEg m)
	{
		return brand.compareTo(m.brand);
	}
	
	public String toString()
	{
		return brand+" "+price+" "+model;
	}
}
