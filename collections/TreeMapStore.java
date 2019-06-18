package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.*;
public class TreeMapStore<K,V>
{
	TreeMap<K,V> treeMap=new TreeMap<K,V>();
	public void create(K k,V v)
	{
		treeMap.put(k,v);
	}
	public Map<K,V> read()
	{
		return treeMap;
	}
	public void update(K k,V nv)
	{
		treeMap.remove(k);
		treeMap.put(k,nv);
		System.out.println(treeMap);
	}
	public void delete(K k)
	{
		treeMap.remove(k);
		System.out.println(treeMap);
	}
	public void sort()
	{
		List arr=new ArrayList();
		arr.add(treeMap);
		//System.out.println(arr);
		Object[] a=arr.toArray();
			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}