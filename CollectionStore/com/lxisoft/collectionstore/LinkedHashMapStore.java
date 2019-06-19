package com.lxisoft.collectionstore;
import java.util.*;

public class LinkedHashMapStore<K,V> 
{
	Map<K,V> linkedHashMap =new HashMap<K,V>();

	public void create(K k,V v)
	{
		linkedHashMap.put(k,v);
	}

	public Map<K,V> read()
	{
		return linkedHashMap;
	}

	public void update(K k,V v)
	{
		linkedHashMap.remove(k);
		linkedHashMap.put(k,v);
		// System.out.println(linkedHashMap);
	}
	public void delete(K k)
	{
		linkedHashMap.remove(k);
		//System.out.println(linkedHashMap);
	}
}
