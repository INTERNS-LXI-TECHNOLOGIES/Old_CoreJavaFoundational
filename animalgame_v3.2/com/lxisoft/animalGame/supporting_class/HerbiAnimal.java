package com.lxisoft.animalGame.supporting_class;
import com.lxisoft.animalGame.supporting_class.*;
import com.lxisoft.animalGame.animal.*;
public class HerbiAnimal extends Animal implements Herbivorous{
		public void eatGrass(Animal d)
	{try{
	System.out.println(d.getName()+" is eating grass");
	}
	catch(Exception e)
	{
		System.out.print("");
	}
	}
	
	
	
}