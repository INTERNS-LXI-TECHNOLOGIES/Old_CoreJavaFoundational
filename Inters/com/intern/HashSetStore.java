package com.intern;
import java.util.*;
import com.intern.*;
public class HashSetStore<T> implements Repository<T>
{
	Set<T>hashSet=new HashSet<T>();
	public void create(T value)
	{
		hashSet.add(value);
	}
	public Collection<T>readAll()
	{
		return hashSet;

	}
	public void update(T element, T element1)
	{
		if(hashSet.contains(element))
		{
			hashSet.remove(element);
			hashSet.add(element1);

		}
	} 
	public void update(int index,T element)
	{
		if(hashSet.contains(index))
		{
			hashSet.remove(index);
			hashSet.add(element);
			System.out.println(hashSet);
		}
	}
		public void delete(T element)
		{
			hashSet.remove(element);

		}
		public void delete(int index)
		{
			hashSet.remove(index);
		}
		public void sort(String name)
		{
			TreeSet<T>treeSet= new TreeSet<T>(hashSet);
			System.out.println(treeSet);
		}

		 public void sort()
		 {
		 	TreeSet<T>treeSet=new TreeSet<T>(hashSet);
		 	System.out.println(treeSet);
		 }

}