package com.lxisoft.forestv1.forest.animals;
import java.util.ArrayList;
public class Animal 
{
	private int strength;
	private String name;
	public void setStrength(int strength)
	{
		this.strength=strength;
	}
	public int getStrength()
	{
		return strength;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public int strength()
	{
	setStrength((int)(Math.random()*100));
	return getStrength();
	
	}
	
	
	
}