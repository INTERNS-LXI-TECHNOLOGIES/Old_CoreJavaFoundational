package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.*;
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
		List a=new ArrayList();
		int i=0;
			while(!priorityQueue.isEmpty())
			{
			a.add(priorityQueue.poll());
			}

	System.out.println(a);
	}
}
/*class SortQueue implements Comparator<T> {
    @Override
    public int compare(Object t1, Object t2) {
        return compare(((Interns)t2).getName(), ((Interns)t1).getName());
	}
}*/