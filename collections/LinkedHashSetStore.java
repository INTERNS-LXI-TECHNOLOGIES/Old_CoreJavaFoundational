package com.lxisoft.collections;
import java.util.*;
import java.io.*;
public class LinkedHashSetStore<T> implements CollectionRepository<T>
{
	Set<T> linkedHashSet = new LinkedHashSet<>();
	public void create(T data)
	{
		linkedHashSet.add(data);
	}
	public Collection<T> read()
	{
		return linkedHashSet;
	}	
	public void update(T data,T data1)
	{
		if(linkedHashSet.contains(data))
		{
			linkedHashSet.remove(data);
			linkedHashSet.add(data1);
		}
	}
	public void delete(T data)
	{
		linkedHashSet.remove(data);
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