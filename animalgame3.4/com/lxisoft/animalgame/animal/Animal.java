package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.Random;

abstract public class Animal
{
	private String name;
	private int strength;
	private int reach;
	private int hunger;
	private int luck;
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
public void setname(String name)
{
this.name=name;
}
public void setstrength(int strength)
{
this.strength=strength;
}
public void setreach(int reach)
{
this.reach=reach;
}
public void sethunger(int hunger)
{
this.hunger=hunger;
}
public void setLuck(int luck)
{
this.luck=luck;
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
public String getname()
{
	return name;
}
public int getstrength()
{
	return strength;
}
public int getreach()
{
	return reach;
}
public int gethunger()
{
	return hunger;
}
public int getLuck()
{
	return luck;
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