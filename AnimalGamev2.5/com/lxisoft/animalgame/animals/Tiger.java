package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.CarnivoreAnimal;
public class Tiger extends CarnivoreAnimal
	{
		 public Tiger(int numID,int strength,int hunger)
			{  
				 setAlive(true);
				 setID(this.getClass().getSimpleName()+" "+String.valueOf(numID)); 
				 setStrength(strength);
				 setHunger(hunger);
				 setRoam(3); 
			} 
	}