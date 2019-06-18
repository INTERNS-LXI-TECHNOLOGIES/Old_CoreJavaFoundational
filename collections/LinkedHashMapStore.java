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
		return linkedHashMap;
	}
	public void update(K k,V nv)
	{
		linkedHashMap.remove(k);
		linkedHashMap.put(k,nv);
		System.out.println(linkedHashMap);
	}
	public void delete(K k)
	{
		linkedHashMap.remove(k);
		System.out.println(linkedHashMap);
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