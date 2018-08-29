package com.lxisoft.animalgame.forest.animal;
public interface Animal
{
	
	void setName(String name);
	void setEnergylevel(int energyLevel);
	void setHungrylevel(int hungryLevel);
	String toString();
	int getEnergylevel();
	int getHungrylevel();
}
