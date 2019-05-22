package com.lxisoft.map;
import java.util.*;
import java.lang.*;

public class Map
{
	public static void main(String [] args)
	{
		//Map <Integer,String> map =new HashMap<Integer,String>();
		HashMap<String,String> map=new HashMap<String,String>();  
		map.put("Aa","Thriha");
		map.put("Ss","Vismay");
		map.put("Cc","Adwaith");

		/*for(HashMap.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}*/
		System.out.println(map);
		if(map.containsKey("Cc"));
		{	
			System.out.println(map.get("Cc"));
		}	
		//map.clear();
		map.remove("Cc");
		print(map);
	}
		public static void print(HashMap<String,String> map)
		{
			if(map.isEmpty())
			{
				System.out.println("Map is empty");
			}
			else
				System.out.println(map);
		}
		

}
