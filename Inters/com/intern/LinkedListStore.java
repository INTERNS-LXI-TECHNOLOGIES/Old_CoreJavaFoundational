package com.intern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LinkedListStore<T> implements Repository<T>
{
	
	private Class <T> type;
	public LinkedListStore(Class<T>type)
	{
		this.type=type;
	}
	List<T>linklist=new ArrayList<T>();
	private String name="id";
	public void create(T value)
	{
		linklist.add(value);
	}
	public Collection<T>readAll()
	{
		return linklist;
	}
	public void update(T element, T element1)
	{
		for(int i=0;i<linklist.size();i++)
		{
			if(element.equals(linklist.get(i)))
			{
				linklist.set(i,element1);	
			}
		}
	}
	public void update(int index, T element)
	{
		linklist.set(index,element);
	}
	public void delete(T element)
	{
		for(int i=0;i<linklist.size();i++)
		{
			if(element.equals(linklist.get(i)))
			{
				linklist.remove(i);
			}
		}
	}
	public void delete(int index)
	{
		linklist.remove(index);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void sort()
	{
		try
		{
			if( type==Double.class||type==Integer.class||type==Character.class||type==Short.class||
		            type==Float.class||type==String.class)
			{
				Object[] obj = linklist.toArray();
				Arrays.sort(obj);
				for(int i=0;i<obj.length;i++)
				{
					System.out.println(obj[i]);
				}
			}
			else
			{
			Collections.sort(linklist, new Comparator()
			{
			
			public int compare(Object i1, Object i2)
			{
				
					try {
						if(type.getDeclaredField(name).getType()==String.class)
						{
							return ((String) type.getClass().getDeclaredField(name).get(i1)).compareTo((String)type.getClass().getDeclaredField(name).get(i2));

						}
						
					} catch (NoSuchFieldException | SecurityException | IllegalArgumentException
							| IllegalAccessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				System.out.println();
			try {
				return (Integer) type.getDeclaredField(name).get(i1)-(Integer)type.getDeclaredField(name).get(i2);
			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				
			}
			return 4;
			}
			});
		}
		}
			
		catch(SecurityException e)
		{
			
		}


	}

	public void sort(String name)
	{
		
	}

	
	}
