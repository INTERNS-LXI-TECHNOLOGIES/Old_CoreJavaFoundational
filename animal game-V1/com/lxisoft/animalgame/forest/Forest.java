package com.lxisoft.animalgame.forest;
import java.util.*;
import java.io.*;
import com.lxisoft.animalgame.forest.animal.Animal;
import com.lxisoft.animalgame.forest.animal.carnivores.Carnivores;
import com.lxisoft.animalgame.forest.animal.herbivores.Herbivores;
import com.lxisoft.animalgame.forest.animal.carnivores.lion.Lion;
import com.lxisoft.animalgame.forest.animal.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.forest.animal.herbivores.rabbit.Rabbit;
import com.lxisoft.animalgame.forest.animal.herbivores.zeebra.Zeebra;
public class Forest
{
	Random randomNum=new Random();
	Animal fighter1,fighter2,oponent1,oponent2,oponent3,oponent4;
	Animal[][] forestGrid=new Animal[10][10];
	Scanner sc=new Scanner(System.in);
	
	Animal lion;
	Animal tiger;
	Animal rabbit;
	Animal zeebra;
	
	int row,column,fighterLoc1,fighterLoc2;
	
	public void createGrid()
	{
		System.out.println("Enter the Dimentions of the forest grid:");
		row=sc.nextInt();
		column=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				forestGrid[i][j]=null;		
			}	
		}
		createAnimal();
		printGrid();	
	}
	
	public void createAnimal()
	{
		for(int k=0;k<5;k++)
		{
			lion=new Lion();
			lion.setName("Lion"+(k+1));
			lion.setEnergylevel(50);
			lion.setHungrylevel(10);
			placeAnimal(lion);
		
			tiger=new Tiger();
			tiger.setName("Tiger"+(k+1));
			tiger.setEnergylevel(50);
			tiger.setHungrylevel(10);
			placeAnimal(tiger);
		
			rabbit=new Rabbit();
			rabbit.setName("Rabbit"+(k+1));
			rabbit.setEnergylevel(20);
			rabbit.setHungrylevel(3);
			placeAnimal(rabbit);
		
			zeebra=new Zeebra();
			zeebra.setName("Zeebra"+(k+1));
			zeebra.setEnergylevel(40);
			zeebra.setHungrylevel(7);
			placeAnimal(zeebra);
		}
			
		
		
	}
	public void placeAnimal(Animal animal)
	{
			int i,j;
			do
			{
				i=(int)(Math.random()*row);
				j=(int)(Math.random()*column);
				
			}
			while(forestGrid[i][j]!=null);	
			forestGrid[i][j]=animal;
	
	}
	
	public void printGrid()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("\t"+forestGrid[i][j]);	
			}
			System.out.println(" ");
		}
		animalSelection(fighter1);
	}
	
	public void animalSelection(Animal fighter1)
	{
		System.out.println("Select your fighter from the grid:");
		System.out.println("1.Lion\n2.Tiger\n3.Rabbit\n4.Zeebra\n");
		int selection=sc.nextInt();
		if(selection==1)
		{
			fighter1=lion;
		}
		else if(selection==2)
		{
			fighter1=tiger;
		}
		else if(selection==3)
		{
			fighter1=rabbit;
		}
		else if(selection==4)
		{
			fighter1=zeebra;
		}
		else
		{
			fighter1=null;
		}
		System.out.println("Your fighter is:");
		System.out.println(fighter1);
		System.out.println("Co-ordinates of the selected animal is:");
		displayCoordinates(fighter1);
		
	}
	
	public void displayCoordinates(Animal fighter1)
	{
		
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(forestGrid[i][j]==fighter1)
					{
						fighterLoc1=i;
						fighterLoc2=j;
						System.out.println("\t"+i+"\t"+j);	
					}
				}
			}
			findAdjacentAnimals(fighter1);
	}
	
	public void findAdjacentAnimals(Animal fighter1)
	{
		System.out.println("Animals which are ready to fight are:");

		System.out.println(forestGrid[fighterLoc1-1][fighterLoc2]);
		System.out.println(forestGrid[fighterLoc1+1][fighterLoc2]);
		System.out.println(forestGrid[fighterLoc1][fighterLoc2-1]);
		System.out.println(forestGrid[fighterLoc1][fighterLoc2+1]);
		oponent1=forestGrid[fighterLoc1-1][fighterLoc2];
		oponent2=forestGrid[fighterLoc1+1][fighterLoc2];
		oponent3=forestGrid[fighterLoc1][fighterLoc2-1];
		oponent4=forestGrid[fighterLoc1][fighterLoc2+1];
		checkAnimal(fighter1,oponent1);
		checkAnimal(fighter1,oponent2);
		checkAnimal(fighter1,oponent3);
		checkAnimal(fighter1,oponent4);


	}
	
	public void checkAnimal(Animal fighter1,Animal fighter2)
	{
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				
				if(fighter1 instanceof Carnivores)
				{
					if(fighter2 instanceof Carnivores)
					{
						System.out.println("no fighting");
					}
					if(fighter2 instanceof Herbivores)
					{
						System.out.println("carnivores win");
					}
				}
				if(fighter1 instanceof Herbivores)
				{
					if(fighter2 instanceof Herbivores)
					{
						System.out.println("no fight");
					}
					if(fighter2 instanceof Carnivores)
					{
						System.out.println("carnivores win");
					}
				}
				
				
			}	
		}
	}
	
}