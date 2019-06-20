package com.lxisoft.collections;
import java.util.*;
import java.io.*;
import java.util.logging.*;
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
		MyLogger.logger().info(arrayList.toString());
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
		MyLogger.logger().info(arrayList.toString());
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
		MyLogger.logger().info(arrayList.toString());
	}
	public void sort()
	{
	//Collections.sort(arrayList);
	if(type.equals(Integer.class)||type.equals(String.class))
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
	MyLogger.logger().info(a[i].toString());
	}
	else{
		//System.out.print(type);
	Collections.sort(arrayList,new Comparator(){
	public int compare(Object t1,Object t2)
	{
		
		//System.out.print(type);
		try{
		return ((String)type.getDeclaredField("name").get(t1)).compareTo((String)type.getDeclaredField("name").get(t2));
		}
		catch(Exception e){ e.printStackTrace();};
		return 4;
	}
	});
	//System.out.println(arrayList);
	MyLogger.logger().info(arrayList.toString());
	}
	}
}