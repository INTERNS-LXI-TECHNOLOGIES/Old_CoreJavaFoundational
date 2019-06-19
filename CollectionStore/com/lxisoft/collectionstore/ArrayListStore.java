package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;
import java.lang.*;

public class ArrayListStore<T> implements CollectionRepository<T>
{
	Class<T> type;
	
	List <T> arrayList=new ArrayList <T>();

	public ArrayListStore (Class<T> type)
	{
		this.type=type;
	}
	
	//private Comparator comparator;

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
	if(value=="id")
	{
		if(type.equals(Integer.class)||type.equals(String.class))
		{
			System.out.println("SSS"+type);
			Object[] a =arrayList.toArray();
			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			{
			 System.out.println("\n"+a[i]);
			}
		}
		else
		{
			Collections.sort(arrayList,new Comparator()
			{
				public int compare(Object o1,Object o2)
				{
					try
					{
						//System.out.println("SS:"+(String)type.getDeclaredField("name").get(o1));
						return ((Integer)type.getDeclaredField("id").get(o1)).compareTo ((Integer)type.getDeclaredField("id").get(o2));
					}
					catch (Exception e)
					{
						e.printStackTrace();
					};
					return 3;  
				}
			});
		}
	}
	else
	{
		Collections.sort(arrayList,new Comparator()
			{
				public int compare(Object o1,Object o2)
				{
					try
					{
						//System.out.println("SS:"+(String)type.getDeclaredField("name").get(o1));
						return ((String)type.getDeclaredField("name").get(o1)).compareTo ((String)type.getDeclaredField("name").get(o2));
					}
					catch (Exception e)
					{
						e.printStackTrace();
					};
					return 3;  
				}
			});
	}
	}
}


/*public void sort(String value)
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

}*//*
public void sort(String value)
	{
		if(value=="Id")
		{
			Collections.sort(arrayList,new Comparator()
			{
				public int compare(Object o1, Object o2) 
    			{
        			User u1=(User)o1;
       				User u2=(User)o2;

       				return u1.getId()-u2.getId();
    			}
    		});
		}
		else
		{
			Collections.sort(arrayList,new Comparator()
			{
				public int compare(Object o1,Object o2)
				{
					User u1=(User)o1;
					User u2=(User)o2;

			    	return u1.getName().compareTo(u2.getName());
				}
			});
		}
	}*/




