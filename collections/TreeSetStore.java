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
		for(int i=0;i<treeSet.size();i++)
		{
			if(data.equals(treeSet.get(i)))
			{
				treeSet.set(i,data1);
				
			}
		}
	}
	public void delete(T data)
	{
	}
	public void sort()
	{
	}
}