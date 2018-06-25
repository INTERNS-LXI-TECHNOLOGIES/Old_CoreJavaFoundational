package com.lxisoft.animalGame.supporting_class;
import com.lxisoft.animalGame.supporting_class.*;
import com.lxisoft.animalGame.exception.*;
import com.lxisoft.animalGame.animal.*;
public class HerbiAnimal extends Animal implements Herbivorous{
		public void eatGrass(Animal d)throws NullException
	{
	System.out.println(d.getName()+" is eating grass");
	}
	
	
	
}