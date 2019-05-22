package com.lxisoft.map;
import java.util.*;
import java.lang.*;

public class TreeMap
{
	public static void main(String [] args)
	{
		//Map <Integer,String> map =new HashMap<Integer,String>();
		TreeMap < Integer,String > map=new TreeMap < Integer,String >();  
		map.put(102,"Thriha");
		map.put(109,"Vismay");
		map.put(100,"Adwaith");

		for(TreeMap.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}
	//	System.out.println(map);
		/*if(map.containsKey("Cc"));
		{	
			System.out.println(map.get("Cc"));
		}	
		//map.clear();
		map.remove("Cc");
		print(map);*/
	}
	/*	public static void print(HashMap<Integer,String> map)
		{
			if(map.isEmpty())
			{
				System.out.println("Map is empty");
			}
			else
				System.out.println(map);
		}
		
*/
}
