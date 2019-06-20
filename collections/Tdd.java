package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.util.logging.*;
//import org.apache.log4j.*;
public class Tdd
{
	public static void main(String[] args)
	{
		MyLogger.logger().info("Start");
	/*CollectionRepository<String>  c=new HashSetStore<String>(String.class);
	c.create("Pavana");
	c.create("Sanjana");
	c.create("Greeshma");
	c.create("Greeshma");
	c.create("Akhil");
	c.create("Jose");
	c.read();
	c.update("Greeshma","Ayana");
	c.delete("Sanjana");
	c.sort();*/
	/*CollectionRepository<Integer>  c=new ArrayListStore<Integer>(Integer.class);
	c.create(12);
	c.create(36);
	c.create(24);
	c.create(153);
	c.create(40);
	c.create(37);
	c.read();
	c.update(24,51);
	c.delete(36);
	c.sort();*/
	/*CollectionRepository<Interns>  c=new LinkedListStore<Interns>(Interns.class);
	Interns i=new Interns("Pavana",101);
	Interns i1=new Interns("Sanjana",102);
	Interns i2=new Interns("Greeshma",103);
	Interns i3=new Interns("Greeshma",104);
	Interns i4=new Interns("Akhil",105);
	c.create(i);
	c.create(i1);
	c.create(i2);
	c.create(i3);
	c.create(i4);
	c.read();
	Interns i6=new Interns("Jose",106);
	c.update(i2,i6);
	c.delete(i1);
	c.sort();*/
	HashMapStore<Integer,String> t=new HashMapStore<Integer,String>();
	t.create(2,"Sanjana");
	t.create(1,"Greeshma");
	t.create(3,"Ajay");
	t.create(4,"Pavana");
	t.create(5,"Ayana");
	t.read();
	t.update(2,"Gopika");
	t.delete(2);
	t.sort();
	/*HashMapStore<String,Interns> t=new HashMapStore<String,Interns>();
	t.create("2",new Interns("Pavana",101));
	t.create("5",new Interns("Sanjana",102));
	t.create("3",new Interns("Greeshma",103));
	t.create("1",new Interns("Ajay",104));
	t.create("4",new Interns("Akhil",105));
	t.read();
	t.update("1",new Interns("Ajay",106));
	t.delete("4");
	t.sort();*/
	}
}