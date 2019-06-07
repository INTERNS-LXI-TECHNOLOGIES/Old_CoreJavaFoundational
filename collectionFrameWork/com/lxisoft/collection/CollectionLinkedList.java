package com.lxisoft.collection;
import java.util.*;
public class CollectionLinkedList<T> implements CollectionRepository<T>
{
   LinkedList<T> data= new LinkedList<T>();
   public void create(T a)
   {
	   data.add(a);
	   System.out.println(data);
   }  
   public Collection<T> read()
   {
	   return data;
   }   
   public void update(T a,T a1)
   {
	   data.contains(a);
		data.remove(a);
		data.add(a1);
        System.out.println("UPDATE"+data);	
   }
   public void delete(T a)
   {
	   data.contains(a);
		data.remove(a);
		System.out.println("DELETE"+data);	
   }
}