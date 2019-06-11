package com.intern;
import java.util.*;
import com.intern.*;
public class LinkedListStore<T> implements Repository<T>
{
 List<T>linkedList=new LinkedList<T>();
 private Comparator comparator;

 public void create(T value)
 {
 	linkedList.add(value);
 }
 public Collection<T>readAll()
 {
 	return linkedList;
 }
 public void update(int index, T element)
 {
 	
 	linkedList.set(index,element);
 }
 public void update(T element,T element1)
 {
 	for(int i=0;i<linkedList.size();i++)
 	{
 		if(element.equals(linkedList.get(i)))
			{
			linkedList.set(i,element1);	
			}
 	}
 	 System.out.println(linkedList);
 

 }
 public void delete(T element)
 {
 	linkedList.remove(element);
 }
 public void delete(int index)
 {
 	linkedList.remove(index);
 }
 
 public void sort(String name)
 {
 	try
		{
			if(name==name)
			{
				comparator= new NameComparator();
				for(int i=0;i<linkedList.size();i++)
				{
					for(int j=0;j<linkedList.size();j++)
					{
						Intern int1=(Intern)linkedList.get(i);
						Intern int2=(Intern)linkedList.get(j);
						if(comparator.compare(int1,int2)>0)
						{
							linkedList.set(j,(T)int1);
							linkedList.set(i,(T)int2);
						                                                                                                                                                                                                                                                  
						}

					}
				}
			}
			else
			{
				comparator=new IdComparator();
				for(int i=0;i<linkedList.size();i++)
				{
					for(int k=0;k<linkedList.size();k++)
					{
						Intern in1=(Intern)linkedList.get(i);
						Intern in2=(Intern)linkedList.get(k);
						if(comparator.compare(in1,in2)<0)
						{
							linkedList.set(k,(T)in1);
							linkedList.set(i,(T)in2);
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