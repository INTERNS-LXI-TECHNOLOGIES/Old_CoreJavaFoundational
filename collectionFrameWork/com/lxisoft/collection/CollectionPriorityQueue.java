package com.lxisoft.collection;
import java.util.*;
public class CollectionPriorityQueue<T> implements CollectionRepository<T>
{
	Class clazz; 
	String field = "id";
     PriorityQueue<T> data=new PriorityQueue<T>(new Comparator()
	    {
		//anonymous class
		public int compare(Object a,Object b)
		{	try{
				return ((String)clazz.cast(a).getClass().getDeclaredField("name").get(a)).compareTo((String)clazz.cast(b).getClass().getDeclaredField("name").get(b));
			   }
			catch(Exception e){}
			return 3;
		}		
	    }); 
       public CollectionPriorityQueue(Class clazz)
	   {
	  this.clazz = clazz;
       }
	public void create(T a)
	{
		 data.add(a);
	}
    public Collection<T> read()
    {
		return data;
	}	
	public void update(T a, T a1)
	{
		for(int i=0;i<data.size();i++)
		{
			
		   
		}
	}
	public void delete(T a)
	{
		
	}
	public void sort()
	{
		//this.field = field;
		
	}
}