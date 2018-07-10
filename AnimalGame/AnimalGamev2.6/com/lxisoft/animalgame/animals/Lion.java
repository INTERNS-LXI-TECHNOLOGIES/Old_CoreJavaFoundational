package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.CarnivoreAnimal;
public final class Lion extends CarnivoreAnimal
    {
         public Lion(int numID,int strength,int hunger)
			{
				 super(numID,strength,hunger);
				 setRoam(1); 
			}
	}