package com.lxisoft.test;
import java.util.*;
import com.lxisoft.collection.*;
public class Tdd
{
	public static void main(String args[])
	{
	  //CollectionRepository<String> intern= new CollectionArrayList<String>();
      //CollectionRepository<String> intern= new CollectionTreeSet<String>();
      //CollectionRepository<String> intern= new CollectionLinkedHashSet<String>();
      CollectionRepository<String> intern= new CollectionLinkedList<String>();
     //CollectionRepository<String> intern= new CollectionLinkedHashMap<String>();
	  intern.create("1");
      intern.create("2");
      intern.create("46");
      intern.create("56");
	  System.out.println("READ"+intern.read());
	  intern.update("46","99999");
	  intern.delete("56");
	}	
}