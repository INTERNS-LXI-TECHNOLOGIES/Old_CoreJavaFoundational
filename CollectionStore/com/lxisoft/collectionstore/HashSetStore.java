package com.lxisoft.collectionstore;
import java.util.*;

public class HashSetStore<T> implements CollectionRepository<T>
{
	Set <T> hashSet=new HashSet<T>();

	public void create(T user)
	{
		hashSet.add(user);
		//System.out.println("HashSet"+hashSet);
	}

	public Collection<T> read()
	{
		return hashSet;
	}

	public void update(int id,T user)
	{
		System.out.println("HashSet"+hashSet);
		User userRemove=null;

		for(Object u:hashSet)
		{
			if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				break;
			}
		}
		hashSet.remove(userRemove);
		hashSet.add(user);
	}

	public void update(T user,T user1)
	{
		if(hashSet.contains(user))
		{
			hashSet.remove(user);
			hashSet.add(user1);
		}
	}

	public void delete(T user)
	{
		if(hashSet.contains(user))
		{
			hashSet.remove(user);
			
		}
	}

	public void delete(int id)
	{
		User userRemove=null;
		for(Object u:hashSet)
		{
			if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				break;
			}
		}
		hashSet.remove(userRemove);
	}

	public void sort(String value)
	{
		System.out.println("HashSet does not maintains the order of its elements. Hence sorting of HashSet is not possible.");
	}
}