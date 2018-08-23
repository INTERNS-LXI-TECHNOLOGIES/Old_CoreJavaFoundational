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
	Animal animal;
	Tiger tiger = new Tiger();
	Rabbit rabbit = new Rabbit();
	Zebra zebra =new Zebra();
	Lion lion = new Lion();
	Fox fox = new Fox();
	Deer deer = new Deer();
	
	int row,column;
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
		
		row = scan.nextInt();
		column = scan.nextInt();
		space(row,column);
		
		
		
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
	
	public void space(int row1, int column1)
	{
		setforest.setSpace(row1,column1);
		space=setforest.getSpace();
		
		for(int i=0;i<setforest.getanimalCount();i++)
		{
			System.out.println("space=" + space[i]);
		}
	
	}
}
