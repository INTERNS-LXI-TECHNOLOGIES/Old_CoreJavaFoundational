package com.lxisoft.hotel;
import java.util.ArrayList;
import java.io.*;
public class MenuList
{
	File f=new File("A.Txt");
	FileReader fr;
	BufferedReader br;
	String s=null;
	public  void listOfFood( ArrayList<Food> foods) throws Exception
	{
		System.out.println("AVILABLE FOOD");
	    System.out.println("***************");
		System.out.println("   FOOD    "+"    PRICE    "+"    COUNT");
	   
			fr=new FileReader(f);
			br=new BufferedReader(fr);
	     //	System.out.println("          "+foods.get(i).getName()+"               "+foods.get(i).getPrice()+"             "+foods.get(i).getCount());
		    while((s=br.readLine())!=null){
			   System.out.println(">>>>>"+s);
		   }
		    
		
	}
}
//""+foods.get(i).getName()+""+foods.get(i).getPrice()+""+foods.get(i).getCount()