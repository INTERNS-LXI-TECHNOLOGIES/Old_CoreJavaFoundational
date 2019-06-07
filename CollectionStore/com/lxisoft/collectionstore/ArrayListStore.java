package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;

public class ArrayListStore<T> implements CollectionRepository<T>
{
	List <T> arrayList=new ArrayList <T>();
	
	private Comparator comparator;

	public void create(T user)
	{
		arrayList.add(user);
	}

	public Collection<T> read()
	{
		return arrayList;

	}
	

	public void update(int index, T user)
	{

		arrayList.set(index,user);
		Iterator<T> itr=arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println("\nAfter Updation"+itr.next());
		}
	}

	public void update(T user,T user1)
	{
		int index=arrayList.indexOf(user); 
		arrayList.set(index,user1);
		
		Iterator<T> itr=arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println("\nAfter Updation2"+itr.next());
		}
	}

	public void delete(T user)
	{
		int index=arrayList.indexOf(user);
		arrayList.remove(index);

		Iterator<T> itr=arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println("\nAfter Deletion"+itr.next());
		}
	}

	// public void deleteStore(int id)
	// {
	// 	arrayList.remove(id);
	// 	Iterator<T> itr=arrayList.iterator();
	// 	while(itr.hasNext())
	// 	{
	// 		System.out.println("\nAfter deletion"+itr.next());
	// 	}
	// }
public void sort(String value)
{
		if (value=="Id")
		{
			this.comparator=new IdComparator();
	
		}
		else 
			{ 
				this.comparator=new NameComparator();
			}

}


}


