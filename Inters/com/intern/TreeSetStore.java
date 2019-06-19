package com.intern;
import java.util.*;
import com.intern.*;
public class TreeSetStore<T> implements Repository<T>

{
    private Class<T> type;
    Set<T> treeSet;
    String name="id";
  @SuppressWarnings({ "unchecked", "rawtypes" })
public void set()
  {
   treeSet=new TreeSet<T>(new Comparator()
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
    public TreeSetStore(Class<T> type)
    {
        this.type=type;
        if( type==Double.class||type==Integer.class||type==Character.class||type==Short.class||
            type==Float.class)
        {
           treeSet=new TreeSet<T>(); 
        }
        else 
        {
        	set();
        }
        
         System.out.println(treeSet);
    } 
    public Class<T>getMyType()
    {
        return this.type;
    }
        public void create(T value)
        {
           treeSet.add(value);
            
        }

   public Collection<T>readAll()
   {
    return treeSet;
   }
    public Collection<T> read()
    {
        return treeSet;
    }
    public void update(T element,T element1)
    {
       if(treeSet.contains(element))
       {
        treeSet.remove(element);
        treeSet.add(element1);
       }
        System.out.println(treeSet);

    }
    public void update(int index,T element)
    {
    	
    }
    public void delete(int index)
    {
        try
        {
            treeSet.remove(index);
        }
        catch(Exception e)
        {

        }
    }

    public void delete(T element)
    {
        treeSet.remove(element);
        System.out.println(treeSet);
    }

    public void sort(String name)
    {
    	this.name= name;
    	Set<T> treeSet=this.treeSet;
        System.out.println("name sorted :"+treeSet);
    }
   
	
	public void sort()
    {
		if(type.equals(Integer.class)||type.equals(Integer.class))
		{
			Object[] obj=treeSet.toArray();
			Arrays.sort(obj);
			for(Object ob:obj)
			{
				System.out.println(ob);
			}
		}
    }
  }
