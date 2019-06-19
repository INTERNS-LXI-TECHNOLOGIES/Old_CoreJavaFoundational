package com.lxisoft.test;
import java.util.*;
import com.lxisoft.collection.*;
public class Tdd
{
	public static void main(String args[])
	{
         ///CollectionRepository<Intern> intern=new CollectionPriorityQueue<Intern>(Intern.class);
	    ///CollectionRepository<Intern> intern=new CollectionHashSet<Intern>();
	   ///CollectionRepository<Intern> intern= new CollectionArrayList<Intern>();
      //CollectionRepository<Integer> intern= new CollectionTreeSet<Integer>();
     ///CollectionRepository<Intern> intern= new CollectionLinkedHashSet<Intern>();
    CollectionRepository<Intern> intern= new CollectionLinkedList<Intern>();
   //CollectionRepository<Intern> intern= new CollectionLinkedHashMap<Intern>();
	  intern.create(new Intern("x",3));
      intern.create(new Intern("b",1));
      intern.create(new Intern ("z",5));
      intern.create(new Intern ("d",1));
	  System.out.println("CREATE"+intern.read()+"\n"+"READ"+intern.read());
	  intern.update(new Intern ("b",1),(new Intern ("g",9)));
	  intern.delete(new Intern ("x",3));
	  intern.sort();
	}

}