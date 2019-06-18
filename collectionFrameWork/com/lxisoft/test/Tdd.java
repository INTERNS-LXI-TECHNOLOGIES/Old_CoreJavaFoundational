package com.lxisoft.test;
import java.util.*;
import com.lxisoft.collection.*;
public class Tdd
{
	public static void main(String args[])
	{

		 CollectionRepository<Intern> intern=new CollectionPriorityQueue<Intern>(Intern.class);
	    //CollectionRepository<Intern> intern=new CollectionHashSet<Intern>();
	   //CollectionRepository<Intern> intern= new CollectionArrayList<Intern>();
      //CollectionRepository<Integer> intern= new CollectionTreeSet<Integer>();
     //CollectionRepository<Intern> intern= new CollectionLinkedHashSet<Intern>();
    //CollectionRepository<Intern> intern= new CollectionLinkedList<Intern>();
   //CollectionRepository<String> intern= new CollectionLinkedHashMap<String>();
	  intern.create(new Intern("z",3));
      intern.create(new Intern("u",12));
      intern.create(new Intern ("h",132));
      intern.create(new Intern ("re",123));
	  System.out.println("CREATE"+intern.read()+"\n"+"READ"+intern.read());
	  intern.update(new Intern ("u",12),(new Intern ("tytr",9)));
	  intern.delete(new Intern ("re",123));
	  intern.sort();
	}

}