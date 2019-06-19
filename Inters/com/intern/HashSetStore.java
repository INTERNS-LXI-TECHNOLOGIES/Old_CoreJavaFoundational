package com.intern;
import java.util.*;
import com.intern.*;
public class HashSetStore<T> implements Repository<T>
{
	Set<T>hashSet=new HashSet<T>();
	
	@SuppressWarnings("unused")
	private String name= "id";

	@SuppressWarnings("unused")
	private Class<T> type;
	public HashSetStore(Class<Intern> class1) {
		// TODO Auto-generated constructor stub
	}
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

		 @SuppressWarnings("unchecked")
		public void sort()
		 {
		 	try {
				Object[] obj = hashSet.toArray();
				Arrays.sort(obj);
				for (Object s : obj) {
					hashSet.add((T) s);
				} 
			} catch (Exception e) {
				// TODO: handle exception
			}
		 	
		 
		 }

}