package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.Animal;
public interface Carnivore
	{
		 public void eatMeat(Animal a);
		 public boolean canRoam(); 
		 public void checkNearby();
		 public void combat(Animal a);
	}