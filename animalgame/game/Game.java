package com.lxisoft.animalgame.game;

import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.forest.SetForest;
import com.lxisoft.animalgame.forest.animals.Animal;
import com.lxisoft.animalgame.forest.animals.carnivores.Tiger;
import com.lxisoft.animalgame.forest.animals.carnivores.Fox;
import com.lxisoft.animalgame.forest.animals.herbivores.Zebra;
import com.lxisoft.animalgame.forest.animals.carnivores.Lion;
import com.lxisoft.animalgame.forest.animals.herbivores.Deer;
import com.lxisoft.animalgame.forest.animals.herbivores.Rabbit;
import java.util.*;


public class Game
{
	Animal animal,animalOne,animalTwo,firstAnimal,secondAnimal;
	Tiger tiger = new Tiger();
	Rabbit rabbit = new Rabbit();
	Zebra zebra =new Zebra();
	Lion lion = new Lion();
	Fox fox = new Fox();
	Deer deer = new Deer();
	
	String animalName;
	String[] names;
	int row,column;
	int life;
	String enter;
	int animalCount;
	double[] space;
	
	SetForest setforest = new SetForest();
	Scanner scan = new Scanner(System.in);
	
	
	public void gameDetail()
	{
		setforest.forestControl();
		lion.create();
		tiger.create();
		fox.create();
		rabbit.create();
		zebra.create();
		deer.create();
		
		setforest.animalLocation(tiger);
		setforest.animalLocation(rabbit);
		setforest.animalLocation(lion);
		setforest.animalLocation(zebra);
		setforest.animalLocation(fox);
		setforest.animalLocation(deer);
		setforest.forestInfo();
		
		System.out.println("--Animal Grid Created..--");
		System.out.println("Enter to play Game!!");
		enter = scan.nextLine();
	
		
		System.out.println("Select the animal predator::");
		System.out.println("\n1.Tiger \n2.Lion \n3.Fox \n4.Rabbit \n5.Zebra \n6.Deer");
		animalCount = scan.nextInt();
		animalLocation(animalCount);
		
		life=setforest.getLife();
		while(life==1&&setforest.getanimalCount()!=-1)	
		{
			row = scan.nextInt();
			column = scan.nextInt();
			animalOne=setAnimalFight(animalCount);
			setforest.setSpace(row,column);
			
			if(setforest.getanimalCount()!=-1)
			{
			setforest.calculateMinimumDistance();
			animalTwo=getAnimal(setforest.position);
			//System.out.println(animalTwo);
			setforest.animalFight(animalOne,animalTwo);
			life=setforest.getLife();     
			setforest.forestInfo();                                       
			                                                                       
			}
		}	
			if(life!=1)
			{
				System.out.println("OOPS!! FIGHT DEAD...");
				System.out.println("---------GAME OVER---------");
			}
				
		
	}
		public void animalLocation(int animalCount)
			{
				if(animalCount==1)
				{
					setforest.getanimalLocation(tiger);
				}
				
				if(animalCount==2)
				{
					setforest.getanimalLocation(lion);
				}
				
				if(animalCount==3)
				{
					setforest.getanimalLocation(fox);
				}
				
				if(animalCount==4)
				{
					setforest.getanimalLocation(rabbit);
				}
				
				if(animalCount==5)
				{
					setforest.getanimalLocation(zebra);
				}
				
				if(animalCount==6)
				{
					setforest.getanimalLocation(deer);
				}
			}
			
			
			
			Animal getAnimal(String animalName)
			{
				if(animalName=="lion")
				{
					animal=lion;
				}
				if(animalName=="tiger")
				{
					animal=tiger;	
				}
				if(animalName=="fox")
				{
					animal=fox;
				}
				if(animalName=="rabbit")
				{
					animal=rabbit;
				}
				if(animalName=="deer")
				{
					animal=deer;
				}
				if(animalName=="zebra")
				{
					animal=zebra;
				}
				
				return animal;
			}
			
			Animal setAnimalFight(int animalNum)
			{
				animalCount=animalNum;
				if(animalCount==1)
				{
					firstAnimal=tiger;
				}
				if(animalCount==2)
				{
					firstAnimal=lion;
				}
				if(animalCount==3)
				{
					firstAnimal=fox;
				}
				if(animalCount==4)
				{
					firstAnimal=rabbit;
				}
				if(animalCount==5)
				{
					firstAnimal=zebra;
				}
				if(animalCount==6)
				{
					firstAnimal=deer;
				}
				
			return firstAnimal;
			}

	
}