package com.intern;
import java.util.*;
public class PriorityQueueStore<T> implements Repository<T> 
{
	   private Class<T> type;
	   PriorityQueue<T> pq;
	    String name="id";
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void set()
	  {
	   pq=new PriorityQueue<T>(new Comparator()
	   {
		   public int compare(Object o1, Object o2) 
		    {
		    	T int1=(T)o1;
		    	T int2=(T)o2;
		    	try {
					if(type.getDeclaredField(name).getType()==String.class)
					{

					try {
						
						return ((String) int1.getClass().getDeclaredField(name).get(o1)).compareTo((String)int2.getClass().getDeclaredField(name).get(o2));
					 
						}catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
					
						e.printStackTrace();
						}
					return 4;
					}
					else {
						try{
						return ((Integer) int1.getClass().getDeclaredField("id").get(o1))-((Integer)int2.getClass().getDeclaredField("id").get(o2));
						}catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
					
					}
				} catch (NoSuchFieldException e) {
					
					e.printStackTrace();
				} catch (SecurityException e) {
				
					e.printStackTrace();
				}
				return 4;
		      
		    }
	   });
	  }
	    public PriorityQueueStore(Class<T> type)
	    {
	        this.type=type;
	        if( type==Double.class||type==Integer.class||type==Character.class||type==Short.class||
	            type==Float.class)
	        {
	           pq=new PriorityQueue<T>(); 
	        }
	        else 
	        {
	        	set();
	        }
	        
	         System.out.println(pq);
	    } 
	    public Class<T>getMyType()
	    {
	        return this.type;
	    }
	   
	@Override
	public void create(T value)
	{
		pq.add(value);
		
	}

	@Override
	public Collection<T> readAll() 
	{
		
		return pq;
	}

	@Override
	public void update(T element, T element1) 
	{
		if(pq.contains(element))
	       {
	        pq.remove(element);
	        pq.add(element);
	       }
	        System.out.println(pq);

		
	}

	@Override
	public void update(int index, T element1)
	{
		if(pq.contains(index))
		{
			pq.remove(index);
			pq.add(element1);
		}
		
	}

	@Override
	public void delete(T element)
	{
		 pq.remove(element);
	        System.out.println(pq);
		
	}

	@Override
	public void delete(int index)
	{
		  try
	        {
	            pq.remove(index);
	        }
	        catch(Exception e)
	        {}
	}

	@Override
	public void sort(String name)
	{
		this.name= name;
    	PriorityQueue<T> pq=this.pq;
        System.out.println("name sorted :"+pq);
		
	}

	@Override
	public void sort()
	{
		if(type.equals(Integer.class)||type.equals(Integer.class))
		{
			Object[] obj=pq.toArray();
			Arrays.sort(obj);
			for(Object ob:obj)
			{
				System.out.println(ob);
			}
		}
		
	}

}
