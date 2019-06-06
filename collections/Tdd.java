package com.lxisoft.collections;
import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
	CollectionRepository<String>  c=new TreeSetStore<String>();
	//CollectionRepository<Interns>  c=new ArrayListStore<Interns>();
	//CollectionRepository<Integer>  c=new ArrayListStore<Integer>();
	//Interns i=new Interns("Pavana");
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