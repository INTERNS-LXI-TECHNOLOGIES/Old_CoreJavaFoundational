package com.lxisoft.collections;
import java.util.*;
import java.io.*;
public class PriorityQueueStore<T> implements CollectionRepository<T>
{
	Queue<T> priorityQueue=new PriorityQueue<>();
	public void create(T data)
	{
		priorityQueue.add(data);
	}
	public Collection<T> read()
	{
		return priorityQueue;
	}
	public void update(T data,T data1)
	{
		priorityQueue.remove(data);
		priorityQueue.add(data1);
	}
	public void delete(T data)
	{
		priorityQueue.remove(data);
	}
	public void sort()
	{
		/*Object[] temp
		Object[] a=priorityQueue.toArray();
		for(int j=0;j<a.length;j++)
		{
			if
			//System.out.println(a[j].toString());
		}*/
	
	}
}