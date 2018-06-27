package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.Animal;
public interface Herbivore
	{
		 public void runAway(Animal a); 
		 public  void changeLocation();
		 public void runDirection(int east,int west,int south,int north);
	}