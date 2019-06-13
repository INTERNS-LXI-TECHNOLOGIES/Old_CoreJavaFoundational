package com.lxisoft.collectionstore;
import java.util.*;

public class PriorityQueueStore<T> implements CollectionRepository<T>
{
	Queue <T> priorQueue =new PriorityQueue <T>(new Comparator()
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
		priorQueue.add(user);
	}

	public Collection<T> read()
	{
		// 	ArrayList<T> a = new ArrayList<T>();
		// while (!priorQueue.isEmpty()) 
		// {
		//    		a.add(priorQueue.poll());
  //   	}
		// return a;

		return priorQueue;
	}

	public void delete(T user)
	{
		if(priorQueue.contains(user))
			{
				priorQueue.remove(user);
			}
	}

	public void delete(int id)
	{
		User userRemove=null;
		for(Object u:priorQueue)
		{
			if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				break;
			}
		}
		priorQueue.remove(userRemove);
	}

	public void update(T user,T user1)
	{
		if(priorQueue.contains(user))
		{
			priorQueue.remove(user);
			priorQueue.add(user1);
		}
	}

	public void update(int id,T user)
	{
		
		User userRemove=null;

		for(Object u:priorQueue)
		{
			if(((User)u).getId()==id)
			{
				userRemove=(User)u;
				break;
			}
		}
		priorQueue.remove(userRemove);
		priorQueue.add(user);
	}

	// public void sort(String value)
	// {

	// 	while (!priorQueue.isEmpty()) 
	// 		{
 //    			Integer i = priorQueue.poll();
 //    			System.out.println(priorQueue.poll().getId()); 
	
	
 //    		}
	// }

	public void sort(String value)
	{
		ArrayList<T> a = new ArrayList<T>();
		while (!priorQueue.isEmpty()) 
			{
		   		a.add(priorQueue.poll());
		   	//	System.out.println("Sorting: "+a);
    		}
		//return a;
    		System.out.println("Sorting");
    		for(int i=0;i<a.size();i++)
    		{
    			System.out.println(a.get(i));
    		}
	}

}