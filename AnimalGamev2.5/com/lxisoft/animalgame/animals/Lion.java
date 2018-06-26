package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.CarnivoreAnimal;
public class Lion extends CarnivoreAnimal
    {
         public Lion(int numID,int strength,int hunger)
			{
				 setAlive(true);
				 setID(this.getClass().getSimpleName()+" "+String.valueOf(numID)); 
				 setStrength(strength);
				 setHunger(hunger);
				 setRoam(2); 
			}
	}