package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
public class HashSetStore<T> implements CollectionRepository<T> 
{
	Class<T> type;
	Set<T> hashSet;
	public HashSetStore(Class<T> type)
	{
		this.type=type;
	}
	public HashSetStore()
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		{
			hashSet = new HashSet<>();
		}
	}
	public void create(T data)
	{
		hashSet.add(data);
	}
	public Collection<T> read()
	{
		return hashSet;
	}	
	public void update(T data,T data1)
	{
		if(hashSet.contains(data))
		{
			hashSet.remove(data);
			hashSet.add(data1);
		}
	}
	public void delete(T data)
	{
		hashSet.remove(data);
	}
	public void sort()
	{
		try
		{
			throw new UnsupportedSortException("Hashset cannot be sorted");
		}
		catch(UnsupportedSortException e)
		{
			e.printStackTrace();
		}
	}
}