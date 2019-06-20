package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class LinkedHashSetStore<T> implements CollectionRepository<T>
{
	Set<T> linkedHashSet = new LinkedHashSet<>();
	public void create(T data)
	{
		linkedHashSet.add(data);
	}
	public Collection<T> read()
	{
		MyLogger.logger().info(linkedHashSet.toString());
		return linkedHashSet;
	}	
	public void update(T data,T data1)
	{
		if(linkedHashSet.contains(data))
		{
			linkedHashSet.remove(data);
			linkedHashSet.add(data1);
		}
		MyLogger.logger().info(linkedHashSet.toString());
	}
	public void delete(T data)
	{
		linkedHashSet.remove(data);
		MyLogger.logger().info(linkedHashSet.toString());
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