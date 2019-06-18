package com.lxisoft.collections;
import java.util.*;
import java.lang.reflect.*;
public class Interns  
{
	private String name;
	private int id;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public Interns(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public Interns(int id)
	{
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