package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.*;
public class TreeSetStore<T> implements CollectionRepository<T>
{
	Class<T> type;
	Set<T> treeSet1; 
	Set<T> treeSet ;
	public TreeSetStore(Class<T> type)
	{
		this.type=type;
	}
	public TreeSetStore()
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		{
		treeSet1 = new TreeSet<>();
		}
		else{
		treeSet = new TreeSet<>(new Comparator(){
		public int compare(Object t1,Object t2)
		{
		return ((Interns)t1).getName().compareTo(((Interns)t2).getName());
		}
		});
		}
	}
	
	public void create(T data)
	{
		if(type.equals(Integer.class)||type.equals(String.class)){
		treeSet1.add(data);
		System.out.println("ffghhj");}
		else
		treeSet.add(data);
	}
	public Collection<T> read()
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		return treeSet1;
		else
		return treeSet;
		
	}
	public void update(T data,T data1)
	{
	if(type.equals(Integer.class)||type.equals(String.class))
	{
		if(treeSet1.contains(data))
		{
			treeSet1.remove(data);
			treeSet1.add(data1);
		}
	}
	else
	{
		if(treeSet.contains(data))
		{
			treeSet.remove(data);
			treeSet.add(data1);
		}
	}
	}
	public void delete(T data)
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		treeSet1.remove(data);
		else
		treeSet.remove(data);
	}
	public void sort()
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		{
		
		Object[] a=treeSet1.toArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		}
		else
		System.out.println(treeSet);
	}
}
/*class IdComparator implements Comparator<T>
{
	public int compare(T t1,T t2)
	{
		if(t1.id>t2.id)
		{
			return 1;
		}
		else
			return -1;
	}
}*/