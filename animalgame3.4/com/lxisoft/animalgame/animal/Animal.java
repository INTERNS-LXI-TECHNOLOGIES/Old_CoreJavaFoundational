package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.forest.*;
//import com.lxisoft.animalgame.hunter.*;
import java.io.*;
import java.util.Random;

abstract public class Animal
{
	private String name;
	private int strength;
	private int reach;
	private int hunger;
	private int luck;
	private int arrow;
	Random ran=new Random();
	int xloc,yloc;
	abstract public void animalsleep();

//setters
public void setX(int x)
{
	xloc = x;
}
public void setY(int y)
{
	yloc = y;
}
public void setName(String x)
{
this.name=x;
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
public void setArrow(int arrow)
{
	this.arrow=arrow;
}

//getters
public int getX()
{
	return xloc;
}
public int getY()
{
	return yloc;
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
public int getArrow()
{
	return arrow;
}	
	public void findloc()
	{
		do
		{
			xloc=ran.nextInt(5);
			yloc=ran.nextInt(5);
		}
		while(Forest.grid[xloc][yloc]!=null);
		
		Forest.grid[xloc][yloc]=this;
	}
}