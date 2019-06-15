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
	/*public static <K, V extends Comparable<V>> Map<K, V> 
    sortByValues(final Map<K, V> map)
	{
    Comparator<K> valueComparator = new Comparator<K>() 
	{
      public int compare(K k1, K k2) {
        int compare =map.get(k1).compareTo(map.get(k2));
        if (compare == 0) 
          return 1;
        else 
          return compare;
      }
    };
	Map<K, V> sortedByValues =new TreeMap<K, V>(valueComparator);
    sortedByValues.putAll(map);
    return sortedByValues;
  }*/
}