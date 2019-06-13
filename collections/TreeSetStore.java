package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
public class TreeSetStore<T> implements CollectionRepository<T>
{
	Set<T> treeSet = new TreeSet<>(new Comparator(){
	public int compare(Object t1,Object t2)
	{
		return ((Interns)t1).getName().compareTo(((Interns)t2).getName());
	}
	});
	public void create(T data)
	
	{
		treeSet.add(data);
	}
	public Collection<T> read()
	{
		return treeSet;
	}
	public void update(T data,T data1)
	{
		if(treeSet.contains(data))
		{
			treeSet.remove(data);
			treeSet.add(data1);
		}
	}
	public void delete(T data)
	{
		treeSet.remove(data);
	}
	public void sort()
	{
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