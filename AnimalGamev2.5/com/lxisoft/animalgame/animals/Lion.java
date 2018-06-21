package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.CarnivoreAnimal;
public class Lion extends CarnivoreAnimal
    {
        public Lion(int numID,int strength,int hunger)
			{
				 setAlive(true);
				 setID("Lion  "+String.valueOf(numID));
				 setRoam(2); 
				 setStrength(strength);
				 setHunger(hunger);
			}
	}