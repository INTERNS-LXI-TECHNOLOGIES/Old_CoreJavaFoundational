package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.Animal;
public interface Carnivore
	{
		 void eatMeat(Animal a);
		 boolean canRoam(); 
		 void checkNearby();
		 void combat(Animal a);
	}