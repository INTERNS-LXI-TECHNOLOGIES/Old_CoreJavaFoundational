package com.lxisoft.forestv4.forest.animals;
import java.util.ArrayList;
public abstract class Animal 
{
	private int strength;
	private String name;
	private int locationx;
	private int locationy;
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
	public void setLocationx(int locationx)
	{
		this.locationx=locationx;
	}
	public int getLocationx()
	{
		return locationx;
	}
	public void setLocationy(int locationy)
	{
		this.locationy=locationy;
	}
	public int getLocationy()
	{
		return locationy;
	}
	public int strength()
	{
	setStrength((int)(Math.random()*100));
	return getStrength();
	
	}
	public int locationx()
	{
		setLocationx((int)(Math.random()*50));
		return getLocationx();
		
	}
	public int locationy()
	{
		setLocationy((int)(Math.random()*50));
		return getLocationy();
		
	}
	
	
	
	
}