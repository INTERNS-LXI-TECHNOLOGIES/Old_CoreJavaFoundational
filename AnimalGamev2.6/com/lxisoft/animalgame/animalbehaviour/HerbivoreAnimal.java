package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.Animal;
import com.lxisoft.animalgame.animalbehaviour.Herbivore;
public class HerbivoreAnimal extends Animal implements Herbivore 
	{
		 public HerbivoreAnimal(int numID,int strength,int hunger)
			{
				 super(numID,strength,hunger);
			}
		 
		 public void runAway(Animal a)
			{
				 System.out.println("\t"+this.getID()+" ran away from "+a.getID());
			}
			
		 public void defeated(Animal lost)
			{
				 setStrength(lost.getStrength()/2);
				 runAway(lost);
				 lost.setStrength(lost.getStrength()-(getStrength()/2));
			}
	}