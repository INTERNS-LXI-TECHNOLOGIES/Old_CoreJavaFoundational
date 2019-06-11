package com.lxisoft.collections;
import java.util.*;
public class Interns  
{
	String name;
	String id;
	public Interns(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return name+" "+id;
	}
	public boolean equals(Object o)
	{
		return this.name.equals(((Interns)o).name);
	}
	public int hashCode()
	{
		return name.hashCode();
	}
	/*public int compareTo(Object o)	
	{
		return name.compareTo(((Interns)o).name);
	}*/
	/*public int compareTo(Object o)	
	{
		return id.compareTo(((Interns)o).id);
	}*/
	
}
/*class Sorted implements Comparator
{
	public int compare(Interns i1,Interns i2)
}*/