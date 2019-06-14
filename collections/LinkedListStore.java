package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
public class LinkedListStore<T> implements CollectionRepository<T>
{
	Class<T> type;
	public LinkedListStore(Class<T> type)
	{
		this.type=type;
	}
	List<T> linkedList = new LinkedList<>();
	public void create(T data)
	{
		linkedList.add(data);
	}
	public Collection<T> read()
	{
		return linkedList;
	}
	public void update(T data,T data1)
	{
		for(int i=0;i<linkedList.size();i++)
		{
			if(data.equals(linkedList.get(i)))
			{
				linkedList.set(i,data1);
			}
		}
	}
	public void delete(T data)
	{
		for(int i=0;i<linkedList.size();i++)
		{
			if(data.equals(linkedList.get(i)))
			{
				linkedList.remove(i);
			}
		}
	}
	public void sort()
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		{
			Object[] a=linkedList.toArray();
			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		}
		else
		{
		Collections.sort(linkedList,new Comparator(){
	public int compare(Object t1,Object t2)
	{
		return ((Interns)t1).getName().compareTo(((Interns)t2).getName());
	}
	});System.out.println(linkedList);
	}
	}
}