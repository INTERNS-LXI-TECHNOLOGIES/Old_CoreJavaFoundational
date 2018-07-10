package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.HerbivoreAnimal;
public class Elephant extends HerbivoreAnimal
	{
		 public Elephant(int numID,int strength,int hunger) 
			{
				 setAlive(true);
				 setID(this.getClass().getSimpleName()+" "+String.valueOf(numID)); 
				 setStrength(strength);
				 setHunger(hunger);
			}
	}