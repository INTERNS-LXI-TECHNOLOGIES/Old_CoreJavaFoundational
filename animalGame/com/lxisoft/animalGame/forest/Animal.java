package com.lxisoft.animalGame.forest;

public class Animal
{
    private String name;
	private int strength;
	
	
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
	public int aa()
   { 
	setStrength((int)(Math.random()*100));
	return  getStrength();
   }
 
}
