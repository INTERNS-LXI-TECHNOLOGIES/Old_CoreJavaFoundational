package com.lxisoft.arun.forest.animals;
public class Animal
{


	private String name ;
	private int energylevel ;

	public Animal(String name,int strength)
	{
		this.name=name;
		this.energylevel=strength;

	}
	
	public int getEnergylevel()
	{
		return this.energylevel;
	}
	
	public String getName()
	{
		return this.name;
	}
}