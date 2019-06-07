package com.lxisoft.collection;
import java.util.*;
public class CollectionLinkedHashSet<T> implements CollectionRepository<T>
{
    LinkedHashSet<T> data= new LinkedHashSet<T>();
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