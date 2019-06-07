package com.lxisoft.collection;
import java.util.*;
public class CollectionArrayList<T> implements CollectionRepository<T>
{
	public ArrayList<T> data=new ArrayList<T>();
	 public void create(T a)
	 {
		data.add(a);
	 }
    public Collection<T> read()
	 {  
	     return data;	
     }
	public void update(T a,T a1)
	 {		 
        for(int i=0;i<data.size();i++)
		{
			
		   if(a.equals(data.get(i)))
			{
				data.set(i,a1);
			    System.out.println("UPDATE"+data);
			}
		}
	 }
	public void delete(T a)
	 {
		for(int i=0;i<data.size();i++)
		{
			
		   if(a.equals(data.get(i)))
			{
				 data.remove(i);
				 System.out.println("DELETE="+data);
		    }
		} 
	 }
}