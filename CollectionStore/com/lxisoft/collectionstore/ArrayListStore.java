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
	

	public void update(int id, T user)
	{
		for(int i=0;i<arrayList.size()-1;i++)
		{
			if(((User)arrayList.get(i)).getId()==id)
			{
				System.out.println("ID"+((User)arrayList.get(i)).getId());
				arrayList.remove((User)arrayList.get(i));
				arrayList.add(user);
			}
		}
	}

	public void update(T user,T user1)
	{
		int index=arrayList.indexOf(user); 
		arrayList.set(index,user1);
	
	}

	public void delete(T user)
	{
		int index=arrayList.indexOf(user);
		arrayList.remove(index);
	}

	public void delete(int id)
	{
		for(int i=0;i<arrayList.size();i++)
		{
			if(((User)arrayList.get(i)).getId()==id)
			{
				arrayList.remove((User)arrayList.get(i));
			}

		}
	
		
	}
public void sort(String value)
{
		if (value=="Id")
		{
			comparator=new IdComparator();
			System.out.println("Id Sorting");
			for(int i=0;i<arrayList.size();i++)
			{
			for(int j = i+1; j <arrayList.size(); j++) 
			{
				
				// System.out.println("Getting"+(i+1));
				User u1 = (User)arrayList.get(i);
				User u2 = (User)arrayList.get(j);

				if(comparator.compare(u1,u2)<0) 
				{

					arrayList.set(j ,(T) u1);
					arrayList.set(i , (T)u2);
				}

			} 
			}
		}
		else 
			{ 
				comparator=new NameComparator();
				//System.out.println("Name Based Sorting");
				for(int i=0;i<arrayList.size();i++)
					{
						for(int j=i+1;j<arrayList.size();j++)
						{
							User u1=(User)arrayList.get(i);
							User u2=(User)arrayList.get(j);		
						
							if(comparator.compare(u1,u2)>0)
							{
								arrayList.set(j,(T)u1);
								arrayList.set(i,(T)u2);
							}
						}
					}

			}

}


}


