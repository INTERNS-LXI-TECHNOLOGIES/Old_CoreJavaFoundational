package com.intern;
import java.util.*;
public class LinkedHashSetStore<T> implements Repository<T>
{
	LinkedHashSet<T>lhs=new LinkedHashSet<T>();
		public void create(T value)
	{
		lhs.add(value);
	}
	public Collection<T>readAll()
	{
		return lhs;

	}
	public void update(T element, T element1)
	{
		if(lhs.contains(element))
		{
			lhs.remove(element);
			lhs.add(element1);

		}
	} 
	public void update(int index,T element)
	{
		if(lhs.contains(index))
		{
			lhs.remove(index);
			lhs.add(element);
			System.out.println(lhs);
		}
	}
		public void delete(T element)
		{
			lhs.remove(element);

		}
		public void delete(int index)
		{
			lhs.remove(index);
		}
		public void sort(String name)
		{
			TreeSet<T> tree= new TreeSet<T>(lhs);
			System.out.println(tree);
		}

		 public void sort()
		 {
		 	
		 }
}