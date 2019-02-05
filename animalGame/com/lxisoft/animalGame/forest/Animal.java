package com.lxisoft.animalGame.forest;

public class Animal
{
    private String name;
	private int strength,locationX,locationY;
	
	
	public void setLocationX(int locationX)
	{
		this.locationX=locationX;
	}
	public int getLocationX()
	{
		return locationX;
	}
	public void setLocationY(int locationY)
	{
		this.locationY=locationY;
	}
	public int getLocationY()
	{
		return locationY;
	}
    public	void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	} public void  setStrength(int strength)
	{
		this.strength=strength;
	}
	public int getStrength()
	{
		return strength; 
	}
	public int returnStrength()
   { 
	setStrength((int)(Math.random()*100));
	return  getStrength();
   }
  public int location1()
   {
	   setLocationX((int)(Math.random()*60));
	   return getLocationX();
	   
   }
  public int location2()
   {
       setLocationY((int)(Math.random()*100));
	   return getLocationY();
   }
}
