package com.lxisoft.collections;
import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
	CollectionRepository<String>  c=new TreeSetStore<String>();
	//Interns i=new Intern("Pavana");
	c.create("Pavana");
	c.create("Sanjana");
	c.create("Greeshma");
	System.out.println(c.read());
	c.update("Greeshma","Ayana");
	System.out.println(c.read());
	c.delete("Sanjana");
	System.out.println(c.read());
	c.sort();
	System.out.println(c.read());
	}
}