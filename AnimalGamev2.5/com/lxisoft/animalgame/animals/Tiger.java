package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.CarnivoreAnimal;
public class Tiger extends CarnivoreAnimal
	{
		 public Tiger(int numID,int strength,int hunger)
			{  
				 setAlive(true);
				 setID("Tiger "+String.valueOf(numID));
				 setRoam(3); 
				 setStrength(strength);
				 setHunger(hunger);
			} 
	}