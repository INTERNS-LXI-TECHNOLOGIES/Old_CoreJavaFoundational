package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
public class ArrayListStore<T> implements CollectionRepository<T>
{
	/*Interns obj=new Interns();
	Class cls = obj.getClass(); 
	Class c=boolean.class;*/
	Class<T> type;
	public ArrayListStore(Class<T> type)
	{
		this.type=type;
	}
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
	if(type.equals(Integer.class))
	{
		
		Object[] a=arrayList.toArray();
		//for(int i=0;i<a.length;i++)
		Arrays.sort(a);
		/*new Comparator(){
	public int compare(T t1,T t2)
	{
		return (T)t1.compareTo((T)t2);
	}
	});*/
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	}
	else{
	Collections.sort(arrayList,new Comparator(){
	public int compare(Object t1,Object t2)
	{
		return ((Interns)t1).getName().compareTo(((Interns)t2).getName());
	}
	});
	
	System.out.println(arrayList);
	}
	}
}