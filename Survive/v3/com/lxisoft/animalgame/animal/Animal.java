package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
abstract public class Animal
{
	private String name;
	private int strength;
	private int reach;
	private int hunger;
	private int luck;
	private Random ran=new Random();
	private int xloc,yloc;
	abstract public void sleep();
	public void setName(String name)
	{
		this.name=name;
	}
	public void setStrength(int strength)
	{
		this.strength=strength;
	}
	public void setReach(int reach)
	{
		this.reach=reach;
	}
	public void setHunger(int hunger)
	{
		this.hunger=hunger;
	}
	public void setLuck(int luck)
	{
		this.luck=luck;
	}
	public void setXloc(int xloc)
	{
		this.xloc=xloc;
	}
	public void setYloc(int yloc)
	{
		this.yloc=yloc;
	}
	public String getName()
	{
		return name;
	}
	public int getStrength()
	{
		return strength;
		
	}
	public int getReach()
	{
		return reach;
	}
	public int getHunger()
	{
		return hunger;
	}
	public int getLuck()
	{
		return luck;
	}
	public int getXloc()
	{
		return xloc;
	}
	public int getYloc()
	{
		return yloc;
	}
	public void findloc()
	{
		
		do
		{
			
			setXloc(ran.nextInt(5));
			setYloc(ran.nextInt(5));
		}
		while(Forest.grid[xloc][yloc]!=null);
	    Forest.grid[xloc][yloc]=this;
	}
}