package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class PriorityQueueStore<T> implements CollectionRepository<T>
{
	Queue<T> priorityQueue=new PriorityQueue<>(new Comparator(){
	public int compare(Object t1,Object t2)
	{
		return ((Interns)t1).getName().compareTo(((Interns)t2).getName());
	}
	});
	public void create(T data)
	{
		priorityQueue.add(data);
	}
	public Collection<T> read()
	{	
		MyLogger.logger().info(priorityQueue.toString());
		return priorityQueue;
	}
	public void update(T data,T data1)
	{
		priorityQueue.remove(data);
		priorityQueue.add(data1);
		MyLogger.logger().info(priorityQueue.toString());
	}
	public void delete(T data)
	{
		priorityQueue.remove(data);
		MyLogger.logger().info(priorityQueue.toString());
	}
	public void sort()
	{
		List a=new ArrayList();
		int i=0;
			while(!priorityQueue.isEmpty())
			{
			a.add(priorityQueue.poll());
			}

	MyLogger.logger().info(a.toString());
	}
}
/*class SortQueue implements Comparator<T> {
    @Override
    public int compare(Object t1, Object t2) {
        return compare(((Interns)t2).getName(), ((Interns)t1).getName());
	}
}*/