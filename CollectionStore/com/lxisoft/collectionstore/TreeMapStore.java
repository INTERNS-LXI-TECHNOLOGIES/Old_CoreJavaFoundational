package com.lxisoft.collectionstore;
import java.util.*;

public class TreeMapStore<K,V> 
{
	Map<K,V> treeMap =new TreeMap<K,V>();

	public void create(K k,V v)
	{
		treeMap.put(k,v);
	}

	public Map<K,V> read()
	{
		return treeMap;
	}

	public void update(K k,V v)
	{
		treeMap.remove(k);
		treeMap.put(k,v);
		// System.out.println(treeMap);
	}
	public void delete(K k)
	{
		treeMap.remove(k);
		//System.out.println(treeMap);
	}
}
