package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.CarnivoreAnimal;
public class Tiger extends CarnivoreAnimal
	{ 
		 public Tiger(int numID,int strength,int hunger)
			{  
				 super(numID,strength,hunger);
				 setRoam(3); 
			} 
	}