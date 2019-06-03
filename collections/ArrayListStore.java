package com.lxisoft.collections;
import java.util.*;
import java.io.*;
public class ArrayListStore<T> implements CollectionRepository<T>
{
	List<T> arrayList = new ArrayList<>();
	public void create(T data)
	{
		arrayList.add(data);
	}
	public Collection<T> read()
	{
		return arrayList;
	}
	public void update(T data,T data1)
	{
		for(int i=0;i<arrayList.size();i++)
		{
			if(data.equals(arrayList.get(i)))
			{
				arrayList.set(i,data1);
			}
		}
	}
	public void delete(T data)
	{
		for(int i=0;i<arrayList.size();i++)
		{
			if(data.equals(arrayList.get(i)))
			{
				arrayList.remove(i);
			}
		}
	}
	public void sort()
	{
	//Collections.sort(arrayList);
	}
}