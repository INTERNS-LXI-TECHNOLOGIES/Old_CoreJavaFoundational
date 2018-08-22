package com.lxisoft.Animalgame.forest;
public class Animal
{
String name;
String type;
int energyLevel;
int healthLevel;


public void setName(String name)
{
	this.name=name;
}
public void setType(String type)
{
	this.type=type;
}
public void setEnergyLevel(int energyLevel)
{
	this.energyLevel=energyLevel;
}
public void  setHealthLevel(int healthLevel)
{
	this.healthLevel=healthLevel;
}
public String getName()
{
	return name;
}
public String getType()
{
	return type;
}
public int getEnergyLevel()
{
	return energyLevel;
}
public int getHealthLevel()
{
	return healthLevel;
}


}