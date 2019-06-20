package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class HashMapStore<K,V>
{
	HashMap<K,V> hashMap=new HashMap<K,V>();
	public void create(K k,V v)
	{
		hashMap.put(k,v);
	}
	public Map<K,V> read()
	{
		MyLogger.logger().info(hashMap.toString());
		return hashMap;
	}
	public void update(K k,V nv)
	{
		hashMap.remove(k);
		hashMap.put(k,nv);
		MyLogger.logger().info(hashMap.toString());
	}
	public void delete(K k)
	{
		hashMap.remove(k);
		MyLogger.logger().info(hashMap.toString());
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