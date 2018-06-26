package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.HerbivoreAnimal;
public class Deer extends HerbivoreAnimal
    {
         public  Deer(int numID,int strength,int hunger)
			{
				 setAlive(true);
				 setID(this.getClass().getSimpleName()+" "+String.valueOf(numID)); 
				 setStrength(strength);
				 setHunger(hunger);
			}
	}