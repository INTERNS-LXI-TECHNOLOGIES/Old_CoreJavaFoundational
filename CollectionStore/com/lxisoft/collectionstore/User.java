package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;

public class User 
//implements Comparable 
{
	//private int id;
	private String name;

	/*public User(int id,String name)
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
	}*/
	public void setName()
	{ 
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return /*"ID :"+this.id+":"+*/"Name :"+this.name;

	}
	

	public boolean equals(Object object)
	{
		User u=(User)object;

		/*if(this.id == null)
			{
				if(u.id!=null)
					{
						return false;
					}
			}
			else if(this.id.equals(u.id))
			{
				return true;
			}
			else{return false;}*/
		
		if(this.name==null)
			{
				if(u.name!=null)
					{
						return false;
					}
			}
			else if(this.name.equals(u.name))
			{
				return true;
			}
			else
			{
				return false;
			}
			return true;
	}
	
	
}


/*public boolean equals(Object object)
	{
		User u=(User)object;

		if(this.id == null)
			{
				if(u.id!=null){return false;}
			}
			else if(this.id.equals(u.id))
			{
				return true;
			}
			else{return false;}
		
		if(this.name==null)
			{
				if(u.name!=null){return false;}
			}
			else if(this.naame.equals(u.name))
			{
				return true;
			}
			else{return false;}
	}*/
