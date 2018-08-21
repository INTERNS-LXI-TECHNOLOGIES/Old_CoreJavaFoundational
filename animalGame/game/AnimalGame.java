package com.lxisoft.animalGame.game;
import java.util.*;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.forest.ForestControl;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import com.lxisoft.animalGame.game.animal.carnivorous.Tiger;
import  com.lxisoft.animalGame.game.animal.carnivorous.Athulya;
import com.lxisoft.animalGame.game.animal.herbivorous.Rabbit;
import com.lxisoft.animalGame.game.animal.herbivorous.Deer;
import com.lxisoft.animalGame.game.animal.herbivorous.Elephant;
public class AnimalGame

{  
	double[] distance;
	int animalCount;
	Lion lion=new Lion();
	public ArrayList<Lion> lions=new ArrayList<Lion>();
	
	
	Tiger tiger=new Tiger();
	Rabbit rabbit=new Rabbit();
	Deer deer=new Deer();
	Elephant elephant=new Elephant();
	Athulya athulya=new Athulya();
	ForestControl forest=new ForestControl();
	Scanner scan=new Scanner(System.in);
	public void gaming()
	{
		forest.setForest();
	    tiger.create();
		lions.add(lion);
		lions.add(lion);
		lions.get(0).create();
		lions.get(1).create();
		
		rabbit.create();
		deer.create();
		elephant.create();
		athulya.create();
		forest.setAnimalLocation(lions.get(0));
		forest.setAnimalLocation(lions.get(1));
		forest.setAnimalLocation(tiger);
	    forest.setAnimalLocation(athulya);
		forest.setAnimalLocation(elephant);
		forest.setAnimalLocation(rabbit);
		forest.setAnimalLocation(deer);
		forest.getForeststatus();
		distance();
		animalLocation();
		forest.animalFight(rabbit,athulya);
		forest.getForeststatus();
		forest.animalFight(rabbit,deer);
		forest.getForeststatus();
	}
	 void animalLocation()
	 {
		System.out.println("Enter the name of the animal to get the location(1-Tiger,2-Lion,3-Rabbit,4-Deer,5-Elephant,6-Athulya)");
		animalCount=scan.nextInt();
		if(animalCount==2)
		{forest.getanimallocation(lion);}
		if(animalCount==1)
		{forest.getanimallocation(tiger);}
		if(animalCount==3)
		{forest.getanimallocation(rabbit);}
		if(animalCount==4)
		{forest.getanimallocation(deer);}
		if(animalCount==5)
		{forest.getanimallocation(elephant);}
		if(animalCount==6)
		{forest.getanimallocation(athulya);}
	 }
	 void distance()
	 {
		forest.setDistance(2,2);
		distance=forest.getDistance();
		for(int i=0;i<forest.getanimalCount();i++)
		{
			System.out.println("Distance="+distance[i]);
		}
	 }
	
	
		 

	
	
}