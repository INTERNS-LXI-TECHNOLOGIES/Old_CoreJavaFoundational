package com.lxisoft.animalgame.forest.animal.carnivores;
import com.lxisoft.animalgame.forest.animal.Animal;
abstract public class Carnivores implements Animal
{
	private String name;
	private int energyLevel;
	private int hungryLevel;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEnergylevel(int energyLevel)
	{
		this.energyLevel=energyLevel;
	}
	public void setHungrylevel(int hungryLevel)
	{
		this.hungryLevel=hungryLevel;
	}
	public String toString()
	{
		return name;
		
	}
	public int getEnergylevel()
	{
		return energyLevel;
	}
	public int getHungrylevel()
	{
		return hungryLevel;
	}
}
