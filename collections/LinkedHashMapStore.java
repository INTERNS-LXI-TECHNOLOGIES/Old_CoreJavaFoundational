package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.*;
public class LinkedHashMapStore<K,V>
{
	LinkedHashMap<K,V> linkedHashMap=new LinkedHashMap<K,V>();
	public void create(K k,V v)
	{
		linkedHashMap.put(k,v);
	}
	public Map<K,V> read()
	{
		MyLogger.logger().info(linkedHashMap.toString());
		return linkedHashMap;
	}
	public void update(K k,V nv)
	{
		linkedHashMap.remove(k);
		linkedHashMap.put(k,nv);
		MyLogger.logger().info(linkedHashMap.toString());
	}
	public void delete(K k)
	{
		linkedHashMap.remove(k);
		MyLogger.logger().info(linkedHashMap.toString());
	}
	public void sort()
	{
		try
		{
			throw new UnsupportedSortException("Hashmap cannot be sorted");
		}
		catch(UnsupportedSortException e)
		{
			e.printStackTrace();
		}
	}
}