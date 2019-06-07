package com.lxisoft.collections;
import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
	CollectionRepository<String>  c=new ArrayListStore<String>();
	//CollectionRepository<Interns>  c=new ArrayListStore<Interns>();
	//CollectionRepository<Integer>  c=new ArrayListStore<Integer>();
	//Interns i=new Interns("Pavana");
	c.create("Pavana");
	c.create("Sanjana");
	c.create("Greeshma");
	c.create("Greeshma");
	c.create("Akhil");
	c.create("Jose");
	System.out.println(c.read());
	c.update("Greeshma","Ayana");
	System.out.println(c.read());
	c.delete("Sanjana");
	System.out.println(c.read());
	c.sort();
	/*CollectionRepository<Interns>  c=new ArrayListStore<Interns>();
	Interns i=new Interns("Pavana");
	Interns i1=new Interns("Sanjana");
	Interns i2=new Interns("Greeshma");
	Interns i3=new Interns("Greeshma");
	Interns i4=new Interns("Akhil");
	Interns i5=new Interns("Jose");
	c.create(i);
	c.create(i1);
	c.create(i2);
	c.create(i3);
	c.create(i3);
	c.create(i4);
	System.out.println(c.read());
	Interns i6=new Interns("Jose");
	c.update(i2,i6);
	System.out.println(c.read());
	c.delete(i1);
	System.out.println(c.read());
	c.sort();*/
	}
}