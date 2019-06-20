package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class LinkedListStore<T> implements CollectionRepository<T>
{
	Class<T> type;
	public LinkedListStore(Class<T> type)
	{
		this.type=type;
	}
	List<T> linkedList = new LinkedList<>();
	public void create(T data)
	{
		MyLogger.logger().info("Start");
		linkedList.add(data);
	}
	public Collection<T> read()
	{
		MyLogger.logger().info("Start");
		MyLogger.logger().info(linkedList.toString());
		return linkedList;
	}
	public void update(T data,T data1)
	{
		MyLogger.logger().info("Start");
		for(int i=0;i<linkedList.size();i++)
		{
			if(data.equals(linkedList.get(i)))
			{
				linkedList.set(i,data1);
			}
		}
		MyLogger.logger().info(linkedList.toString());
	}
	public void delete(T data)
	{
		MyLogger.logger().info("Start");
		for(int i=0;i<linkedList.size();i++)
		{
			if(data.equals(linkedList.get(i)))
			{
				linkedList.remove(i);
			}
		}
		MyLogger.logger().info(linkedList.toString());
	}
	public void sort()
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		{
			Object[] a=linkedList.toArray();
			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			MyLogger.logger().info(a[i].toString());
		}
		else
		{
		Collections.sort(linkedList,new Comparator(){
	public int compare(Object t1,Object t2)
	{
		return ((Interns)t1).getName().compareTo(((Interns)t2).getName());
	}
	});
	MyLogger.logger().info(linkedList.toString());
	}
	}
}