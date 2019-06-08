package com.lxisoft.collectionstore;
import java.util.*;
import java.lang.*;

public class TreeSetStore<T> implements CollectionRepository<T>
{
	Set <T> treeSet =new TreeSet <T>(new NameComparator());
	private Comparator comparator;

	public void create(T user)
	{
		treeSet.add(user);

	
	}

	public Collection<T> read()
	{
		return treeSet;
	
	}

	public void update(int id,T user)
	{
		User userRemove=null;
		for(Object u:treeSet)
		{

		if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				//System.out.println("USer Found");
				break;
			}
		}
		 treeSet.remove(userRemove);
		 treeSet.add(user);
				
	}

	public void update(T user,T user1)
	{
		if(treeSet.contains(user))
		{
			treeSet.remove(user);
			treeSet.add(user1);
		}
	}


	public void delete(T user)
	{
		if(treeSet.contains(user))
		{
			treeSet.remove(user);
			
		}
	}

	public void delete(int id)
	{
		User userRemove=null;
		for(Object u:treeSet)
		{
		if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				break;
			}
		}
		treeSet.remove(userRemove);
	}

	// public void sort()


}