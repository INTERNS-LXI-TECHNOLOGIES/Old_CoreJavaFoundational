package com.lxisoft.collections;
import java.util.*;
public class Interns 
{
	String name;
	public Interns(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	public boolean equals(Object o)
	{
		return this.name.equals(((Interns)o).name);
		
	}
	public int hashCode()
	{
		return name.hashCode();
	}

}