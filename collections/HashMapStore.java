package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.*;
public class HashMapStore<K,V>
{
	HashMap<K,V> hashMap=new HashMap<K,V>();
	public void create(K k,V v)
	{
		hashMap.put(k,v);
	}
	public Map<K,V> read()
	{
		return hashMap;
	}
	public void update(K k,V nv)
	{
		hashMap.remove(k);
		hashMap.put(k,nv);
		System.out.println(hashMap);
	}
	public void delete(K k)
	{
		hashMap.remove(k);
		System.out.println(hashMap);
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