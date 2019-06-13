package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;

public class LinkedListStore<T> implements CollectionRepository<T>
{
	List <T> linkedList=new LinkedList <T>();

	public void create(T user)
	{
		linkedList.add(user);
	}

	public Collection<T> read()
	{
		return linkedList;

	}
	public void update(int id, T user)
	{
		for(int i=0;i<linkedList.size()-1;i++)
		{
			if(((User)linkedList.get(i)).getId()==id)
			{
			//	System.out.println("ID"+((User)linkedList.get(i)).getId());
				linkedList.remove((User)linkedList.get(i));
				linkedList.add(user);
			}
		}
	}
	
	public void update(T user,T user1)
	{
		int index=linkedList.indexOf(user); 
		linkedList.set(index,user1);
	
	}
	
	public void delete(T user)
	{
		int index=linkedList.indexOf(user);
		linkedList.remove(index);
	}
	public void delete(int id)
	{
		for(int i=0;i<linkedList.size();i++)
		{
			if(((User)linkedList.get(i)).getId()==id)
			{
				linkedList.remove((User)linkedList.get(i));
			}

		}
	
		
	}
	public void sort(String value)
	{
			if(value=="Id")
			{
				Collections.sort(linkedList,new Comparator()
					{
						public int compare(Object o1,Object o2)
						{
							User u1=(User)o1;
							User u2=(User)o2;

							return u1.getId()-u2.getId();
						}
					});
			}
			else
			{
				Collections.sort(linkedList,new Comparator()
					{
						public int compare(Object o1,Object o2)
						{
							User u1=(User)o1;
							User u2=(User)o2;

							return u1.getName().compareTo(u2.getName());
						}
					});
			}
	}

}

/*if (value=="Id")
		{
			Comparator comparator=new IdComparator();
			// System.out.println("Id Sorting");
			for(int i=0;i<linkedList.size();i++)
			{
			for(int j = i+1; j <linkedList.size(); j++) 
			{
				
				// System.out.println("Getting"+(i+1));
				User u1 = (User)linkedList.get(i);
				User u2 = (User)linkedList.get(j);

				if(comparator.compare(u1,u2)>0) 
				{

					linkedList.set(j ,(T) u1);
					linkedList.set(i ,(T) u2);
				}

			} 
			}
		}
		else 
			{ 
				Comparator comparator=new NameComparator();
				//System.out.println("Name Based Sorting");
				for(int i=0;i<linkedList.size();i++)
					{
						for(int j=i+1;j<linkedList.size();j++)
						{
							User u1=(User)linkedList.get(i);
							User u2=(User)linkedList.get(j);		
						
							if(comparator.compare(u1,u2)<0)
							{
								linkedList.set(j,(T)u1);
								linkedList.set(i,(T)u2);
							}
						}
					}

			}*/