package com.intern;
import java.util.*;
import com.intern.*;
public class ArrayListStore<T> implements Repository<T>
{
	List<T>al=new ArrayList<T>();
	private Comparator comparator;
	public void create(T value)
	{
		al.add(value);
	}
	public Collection<T>readAll()
	{
		return al;
	}
	public void update(T element, T element1)
	{
		for(int i=0;i<al.size();i++)
		{
			if(element.equals(al.get(i)))
			{
			 al.set(i,element1);	
			}
		}
	}
	public void update(int index, T element)
	{
		al.set(index,element);
	}
	public void delete(T element)
	{
		for(int i=0;i<al.size();i++)
		{
			if(element.equals(al.get(i)))
			{
				al.remove(i);
			}
		}
	}
	public void delete(int index)
	{
		al.remove(index);
	}
	public void sort(String name)
	{
		try
		{
			if(name==name)
			{
				comparator= new NameComparator();
				for(int i=0;i<al.size();i++)
				{
					for(int j=0;j<al.size();j++)
					{
						Intern int1=(Intern)al.get(i);
						Intern int2=(Intern)al.get(j);
						if(comparator.compare(int1,int2)>0)
						{
							al.set(j,(T)int1);
							al.set(i,(T)int2);
						}
					}
				}
			}
			else
			{
				comparator=new IdComparator();
				for(int i=0;i<al.size();i++)
				{
					for(int k=0;k<al.size();k++)
					{
						Intern in1=(Intern)al.get(i);
						Intern in2=(Intern)al.get(k);
						if(comparator.compare(in1,in2)<0)
						{
							al.set(k,(T)in1);
							al.set(i,(T)in2);
						}
					}
				}
			}
		}
		catch(Exception e)
		{

		}

	}
	public void sort()
	{

	}
} 