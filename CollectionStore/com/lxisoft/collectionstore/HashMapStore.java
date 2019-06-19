package com.lxisoft.collectionstore;
import java.util.*;

public class HashMapStore<K,V> 
{
	Map<K,V> hashMap =new HashMap<K,V>();

	public void create(K k,V v)
	{
		hashMap.put(k,v);
	}

	public Map<K,V> read()
	{
		return hashMap;
	}

	public void update(K k,V v)
	{
		hashMap.remove(k);
		hashMap.put(k,v);
		// System.out.println(hashMap);
	}
	public void delete(K k)
	{
		hashMap.remove(k);
		//System.out.println(hashMap);
	}
}
