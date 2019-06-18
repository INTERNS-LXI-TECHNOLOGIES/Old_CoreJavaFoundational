package com.lxisoft.collections;
import java.util.*;
import java.lang.reflect.*;
//import org.apache.log4j.*;
public class Tdd
{
	//private static Final Logg=Logger.getLogger(Tdd.class.getName)
	public static void main(String[] args)
	{
		//Logger log=new Logger();
	/*CollectionRepository<String>  c=new HashSetStore<String>(String.class);
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
	c.sort();*/
	/*CollectionRepository<Integer>  c=new ArrayListStore<Integer>(Integer.class);
	c.create(12);
	c.create(36);
	c.create(24);
	c.create(153);
	c.create(40);
	c.create(37);
	System.out.println(c.read());
	c.update(24,51);
	System.out.println(c.read());
	c.delete(36);
	System.out.println(c.read());
	c.sort();*/
	CollectionRepository<Interns>  c=new ArrayListStore<Interns>(Interns.class);
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
	System.out.println(c.read());
	Interns i6=new Interns("Jose",106);
	c.update(i2,i6);
	System.out.println(c.read());
	c.delete(i1);
	System.out.println(c.read());
	c.sort();
	/*HashMapStore<Integer,String> t=new HashMapStore<Integer,String>();
	t.create(2,"Sanjana");
	t.create(1,"Greeshma");
	t.create(3,"Ajay");
	t.create(4,"Pavana");
	t.create(5,"Ayana");
	System.out.println(t.read());
	t.update(2,"Gopika");
	t.delete(2);
	t.sort();*/
	/*HashMapStore<String,Interns> t=new HashMapStore<String,Interns>();
	t.create("2",new Interns("Pavana",101));
	t.create("5",new Interns("Sanjana",102));
	t.create("3",new Interns("Greeshma",103));
	t.create("1",new Interns("Ajay",104));
	t.create("4",new Interns("Akhil",105));
	System.out.println(t.read());
	t.update("1",new Interns("Ajay",106));
	System.out.println(t.read());
	t.delete("4");
	System.out.println(t.read());
	t.sort();*/
	}
}