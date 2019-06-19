package com.lxisoft.collection;
import java.util.*;
public class CollectionPriorityQueue<T> implements CollectionRepository<T>
{
	Class clazz; 
	String field = "reg";
	boolean sort = false;
	PriorityQueue<T> data ;		
       public CollectionPriorityQueue(Class clazz)
	   {
	  this.clazz = clazz;
	  if(clazz == String.class||clazz == Integer.class)
		{
			data=new PriorityQueue<T>();
		}
		else{
            data=new PriorityQueue<T>(new Comparator()
	            {
					//anonymous class
					public int compare(Object a,Object b)
					{	
					   try{
						   if(clazz.cast(a).getClass().getDeclaredField(field).getType()==String.class){
							 return ((String)clazz.cast(a).getClass().getDeclaredField(field).get(a)).compareTo((String)clazz.cast(b).getClass().getDeclaredField(field).get(b));
						  }
						  else{
							 return ((Integer)clazz.cast(a).getClass().getDeclaredField(field).get(a))-(Integer)clazz.cast(b).getClass().getDeclaredField(field).get(b);
						  }
						}
					   catch(Exception e)
					   {
						   e.printStackTrace();
					   }
						return 3;
					}		
	             });
				 
		     }
       }
	public void create(T a)
	{
		data.add(a);
	}
    public Collection<T> read()
    {
		ArrayList<T> a = new ArrayList<T>();
		if(sort){
			while (!data.isEmpty()) {
           a.add(data.poll());
		}
		return a;
		}
		return data;
	}	
	public void update(T a, T a1)
	{
		data.remove(a);
		data.add(a1);
		System.out.println("UPDATE"+data);
	}
	public void delete(T a)
	{
		data.remove(a);
		System.out.println("DELETE"+data);
	}
		
	public void sort(String field)
	{
		this.field = field;
		
	}
	public void sort()
	{
		sort = true;
		System.out.println("SORT"+read());
	}
}