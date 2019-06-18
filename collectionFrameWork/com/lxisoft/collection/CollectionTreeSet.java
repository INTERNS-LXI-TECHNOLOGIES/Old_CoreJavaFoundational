package com.lxisoft.collection;
import java.util.*;
import java.io.*;
public class CollectionTreeSet<T> implements CollectionRepository<T>
{

	TreeSet<T> data= new TreeSet<T>();

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

	public void sort()
	{
	   	   Set<T> dataReverse=(TreeSet<T>)data.descendingSet();
	       System.out.println("sorting"+dataReverse);
	}
}