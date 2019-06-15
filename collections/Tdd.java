package com.lxisoft.collections;
import java.util.*;
import java.lang.reflect.*;
public class Tdd
{
	public static void main(String[] args)
	{
	/*CollectionRepository<String>  c=new PriorityQueueStore<String>(String.class);
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
	System.out.println(c.read());
	Interns i6=new Interns("Jose",106);
	c.update(i2,i6);
	System.out.println(c.read());
	c.delete(i1);
	System.out.println(c.read());
	c.sort();*/
	TreeMapStore<Integer,String> t=new TreeMapStore<Integer,String>();
	t.create(2,"Sanjana");
	t.create(1,"Greeshma");
	t.create(3,"Ajay");
	t.create(4,"Pavana");
	t.create(5,"Ayana");
	/*Map sortedMap = sortByValues(treemap);
	Set set = sortedMap.entrySet();
    Iterator i = set.iterator();
    while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }*/
	System.out.println(t.read());
	t.update(2,"Gopika");
	t.delete(2);
	}
}