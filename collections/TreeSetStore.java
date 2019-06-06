package com.lxisoft.collections;
import java.util.*;
import java.io.*;
public class TreeSetStore<T> implements CollectionRepository<T>
{
	Set<T> treeSet = new TreeSet<>();
	public void create(T data)
	{
		treeSet.add(data);
	}
	public Collection<T> read()
	{
		return treeSet;
	}
	public void update(T data,T data1)
	{
		if(treeSet.contains(data))
		{
			treeSet.remove(data);
			treeSet.add(data1);
		}
	}
	public void delete(T data)
	{
		treeSet.remove(data);
	}
	public void sort()
	{
		
	}
}