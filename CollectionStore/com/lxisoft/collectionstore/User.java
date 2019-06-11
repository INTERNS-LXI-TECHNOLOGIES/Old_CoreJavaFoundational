package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;

public class User 
//implements Comparable 
{
	private int id;
	private String name;

	public User(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public void setId()
	{
		this.id=id;
	}
	public Integer getId()
	{
		return id;
	}
	public void setName()
	{ this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		//return User(this.id,this.name);
		return "ID :"+this.id+":"+"Name :"+this.name;

	}
	
	// public int hashCode()
	// {
	// 	return this.id;
	// }

	/*public int compareTo(Object o1,Object o2)
	{
		return 
	}*/
}