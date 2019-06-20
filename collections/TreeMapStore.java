package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class TreeMapStore<K,V>
{
	TreeMap<K,V> treeMap=new TreeMap<K,V>();
	public void create(K k,V v)
	{
		treeMap.put(k,v);
	}
	public Map<K,V> read()
	{
		MyLogger.logger().info(treeMap.toString());
		return treeMap;
	}
	public void update(K k,V nv)
	{
		treeMap.remove(k);
		treeMap.put(k,nv);
		MyLogger.logger().info(treeMap.toString());
	}
	public void delete(K k)
	{
		treeMap.remove(k);
		MyLogger.logger().info(treeMap.toString());
	}
	public void sort()
	{
		List arr=new ArrayList();
		arr.add(treeMap);
		//System.out.println(arr);
		Object[] a=arr.toArray();
			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			MyLogger.logger().info(a[i].toString());
		//treeMap.entrySet();
		//sorted(treeMap.Entry.comparingByValue());
			MyLogger.logger().info(treeMap.toString());
	}
}