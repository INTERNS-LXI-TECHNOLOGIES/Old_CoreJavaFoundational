package com.lxisoft.animalGame.forest;

public abstract class Animal
{
    private String name;
	private int strength,locationX,locationY;
	
	public abstract void  eat();
	
	public void s ()
	{
		System.out.println("dddddddddd");
	}
	
	
	
	
	public void setLocationX()
	{
		this.locationX=(int)(Math.random()*30);
	}
	public int getLocationX()
	{
		return locationX;
	}
	public void setLocationY()
	{
		this.locationY=(int)(Math.random()*50);
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
	} public void  setStrength()
	{
		this.strength=(int)(Math.random()*100);
	}
	public int getStrength()
	{
		return strength; 
	}

}
