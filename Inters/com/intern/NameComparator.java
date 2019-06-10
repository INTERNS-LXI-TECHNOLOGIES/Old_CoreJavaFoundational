package com.intern;
import java.util.*;
public class NameComparator<T> implements Comparator<T>
{
    public int compare(Object o1, Object o2) 
    {
    	Intern int1=(Intern)o1;
    	Intern int2=(Intern)o2;

    	return int1.getName().compareTo(int2.getName());
      
    }
}