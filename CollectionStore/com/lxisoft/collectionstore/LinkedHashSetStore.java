package com.lxisoft.collectionstore;
import java.util.*;

public class LinkedHashSetStore<T> implements CollectionRepository<T>
{
	Set <T> linkedHashSet =new LinkedHashSet<T>();

	public void create(T user)
	{
		linkedHashSet.add(user);
	}

	public Collection<T> read()
	{
		return linkedHashSet;
	}

	public void update(int id,T user)
	{
		System.out.println("HashSet"+linkedHashSet);
		User userRemove=null;

		for(Object u:linkedHashSet)
		{
			if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				break;
			}
		}
		linkedHashSet.remove(userRemove);
		linkedHashSet.add(user);
	}

	public void update(T user,T user1)
	{
		if(linkedHashSet.contains(user))
		{
			linkedHashSet.remove(user);
			linkedHashSet.add(user1);
		}
	}

	public void delete(T user)
	{
		if(linkedHashSet.contains(user))
			{
				linkedHashSet.remove(user);
			}
	}

	public void delete(int id)
	{
		User userRemove=null;
		for(Object u:linkedHashSet)
		{
			if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				break;
			}
		}
		linkedHashSet.remove(userRemove);
	}

	public void sort(String value)
	{
		System.out.println("LinkedHashSet preserves order based on insertion order. Collections.sort does not work on Set.");
	}

}
