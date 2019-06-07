package com.lxisoft.collectionstore;
import java.util.*;

public class LinkedListStore<T> implements CollectionRepository<T>

{
	List <T> linkedList=new LinkedList <T>();

	public void create(T user)
	{
		linkedList.add(user);
	}
	public void read()
	{
		Iterator<T> itr=linkedList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public void update(int index, T user)
	{
		linkedList.set(index,user);
		Iterator<T> itr=linkedList.iterator();
		while(itr.hasNext())
		{
			System.out.println("\nAfter Updation"+itr.next());
		}
	}

	public void update(T user1,T user)
	{
		int index=linkedList.indexOf(user1);

		linkedList.set(index,user);
		Iterator<T> itr=linkedList.iterator();
		while(itr.hasNext())
		{
			System.out.println("\nAfter Updation2"+itr.next());
		}
	}

	/*public void delete(int id)
	{
		linkedList.remove(id);
		Iterator<T> itr=linkedList.iterator();
		while(itr.hasNext())
		{
			System.out.println("\nAfter deletion"+itr.next());
		}
	}*/
	public void delete(T user)
	{
		int index=linkedList.indexOf(user);
		linkedList.remove(index);

		Iterator<T> itr=linkedList.iterator();
		while(itr.hasNext())
		{
			System.out.println("\nAfter Deletion"+itr.next());
		}
	}

}