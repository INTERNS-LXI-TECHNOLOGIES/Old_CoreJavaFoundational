package com.lxisoft.map;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd
{
	public static void main(String[] args)
	{
		String key=null;
		String price=null;
		//TreeMap<Object,Object> map=new TreeMap <Object,Object>();
		TreeMap <String,String> m=new TreeMap <String,String>(); 
		m.put("Oppo","20000");
		m.put("Samsung","17000");
		m.put("Redmi","15000");
		//map.addAll(m);
		System.out.println(m.get("Oppo"));
		m.remove("Oppo");
		System.out.println(m.toString());
	//System.out.println(map.toString());
	}
	
}