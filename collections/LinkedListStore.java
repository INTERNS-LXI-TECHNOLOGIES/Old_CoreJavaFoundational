package com.lxisoft.collections;
import java.util.*;
import java.io.*;
public class LinkedListStore<T> implements CollectionRepository<T>
{
	List<T> linkedList = new LinkedList<>();
	public void create(T data)
	{
		linkedList.add(data);
	}
	public Collection<T> read()
	{
		return linkedList;
	}
	public void update(T data,T data1)
	{
		for(int i=0;i<linkedList.size();i++)
		{
			if(data.equals(linkedList.get(i)))
			{
				linkedList.set(i,data1);
			}
		}
	}
	public void delete(T data)
	{
		for(int i=0;i<linkedList.size();i++)
		{
			if(data.equals(linkedList.get(i)))
			{
				linkedList.remove(i);
			}
		}
	}
	public void sort()
	{
		
	}
}