package com.lxisoft.map;
import java.util.*;
import java.lang.*;
import java.io.*;

public class TreeMap
{
	public static void main(String [] args)
	{
		TreeMap<String,String> mapp=new TreeMap<String,String>();  
		mapp.put("A","Thriha");
		mapp.put("B","Vismay");
		mapp.put("C","Adwaith");

		for(Map.Entry m : mapp.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}
		 System.out.println(mapp);
	// if(mapp.containsKey("Cc"));
	// 	{	
	// 		System.out.println(mapp.get("Cc"));
	// 	}	
	// 	//map.clear();
	// 	mapp.remove("Cc");
	// 	print(mapp);
	// }
	// 	public static void print(TreeMap<String,String> mapp)
	// 	{
	// 		if(mapp.isEmpty())
	// 		{
	// 			System.out.println("Map is empty");
	// 		}
	// 		else
	// 			System.out.println(mapp);
	 	}
		
}
