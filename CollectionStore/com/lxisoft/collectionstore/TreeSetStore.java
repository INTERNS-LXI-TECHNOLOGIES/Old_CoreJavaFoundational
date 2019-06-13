package com.lxisoft.collectionstore;
import java.util.*;
import java.lang.*;

public class TreeSetStore<T> implements CollectionRepository<T>
{
	/*Set <T> treeSet =new TreeSet <T>(new IdComparator());

	class NameComparator implements Comparator
	{
    public int compare(Object o1, Object o2) 
    	{
    		User user1=(User)o1;
    		User user2=(User)o2;

    		return user1.getName().compareTo(user2.getName());
      
    	}
	}*/
	/*Set<T> treeSet =new TreeSet<T>(new Comparator()
	{
		 public int compare(Object o1, Object o2) 
    	{
    		User user1=(User)o1;
    		User user2=(User)o2;

    		//return user1.getName().compareTo(user2.getName());
    		return user1.getId()-user2.getId();
      
    	}
	});*/
	Set <T> treeSet =new TreeSet<T>(new Comparator()
		{
			public int compare(Object o1, Object o2) 
    			{
        			User u1=(User)o1;
       				User u2=(User)o2;

       				return u1.getId()-u2.getId();
    			}
		});
	
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

	public void sort(String value)
	{
		if(value=="Name")
		{
			Set<T> temp=new TreeSet<T>(new Comparator()
				{
					public int compare(Object o1, Object o2) 
    					{
    						User user1=(User)o1;
    						User user2=(User)o2;

    						return user1.getName().compareTo(user2.getName());
    				    }
				});
			for(T u: this.treeSet)
			{
				temp.add(u);
			}
			this.treeSet=temp;
			}
			else
			{

			}
	}
	
	
}