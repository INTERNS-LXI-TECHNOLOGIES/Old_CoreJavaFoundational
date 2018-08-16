package com.lxisoft.animalGame.game;
import java.util.*;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.forest.ForestControl;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import com.lxisoft.animalGame.game.animal.carnivorous.Tiger;
import com.lxisoft.animalGame.game.animal.herbivorous.Rabbit;
import com.lxisoft.animalGame.game.animal.herbivorous.Deer;
public class AnimalGame

{  
	double[] distance;
	int animal;
	Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Rabbit rabbit=new Rabbit();
	Deer deer=new Deer();
	ForestControl forest=new ForestControl();
	Scanner scan=new Scanner(System.in);
	public void gaming()
	{
		forest.setForest();
	
		tiger.create();
		lion.create();
		rabbit.create();
		forest.setAnimalLocation(lion);
		forest.getForeststatus();
		forest.setAnimalLocation(tiger);
		forest.getForeststatus();
		forest.setAnimalLocation(rabbit);
		forest.getForeststatus();
		forest.setAnimalLocation(deer);
		forest.getForeststatus();
		forest.setDistance(0,0);
		distance=forest.getDistance();
		for(int i=0;i<forest.getanimalCount();i++)
		{
			System.out.println("Distance="+distance[i]);
		}
		System.out.println("Enter the name of the animal to get the location(1-Lion,2-Tiger,3-Rabbit,4-Deer");
		animal=scan.nextInt();
		if(animal==1)
		{forest.getanimallocation(lion);}
		if(animal==2)
		{forest.getanimallocation(tiger);}
		if(animal==3)
		{forest.getanimallocation(rabbit);}
		if(animal==4)
		{forest.getanimallocation(deer);}
	}
	
	
}