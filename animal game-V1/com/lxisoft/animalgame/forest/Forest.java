package com.lxisoft.animalgame.forest;
import java.util.*;
import java.io.*;
import com.lxisoft.animalgame.forest.animal.Animal;
import com.lxisoft.animalgame.forest.animal.carnivores.Carnivores;
import com.lxisoft.animalgame.forest.animal.carnivores.lion.Lion;
import com.lxisoft.animalgame.forest.animal.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.forest.animal.herbivores.rabbit.Rabbit;
import com.lxisoft.animalgame.forest.animal.herbivores.zeebra.Zeebra;
public class Forest
{
	Random randomNum=new Random();
	Animal fighter1,fighter2;
	Animal[][] forestGrid=new Animal[10][10];
	Scanner sc=new Scanner(System.in);
	ArrayList<Animal> animals=new ArrayList<Animal>();
	Animal lions;
	Animal tigers;
	Animal rabbits;
	Animal zeebras;
	
	int row,column,k;
	
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
		placeAnimal();
		printGrid();	
	}
	
	public void placeAnimal()
	{
		for(k=0;k<5;k++)
		{
			
			animals.add(new Lion());
			animals.get(k).setName("Lion"+ (k+1));
			animals.get(k).setEnergylevel(50);
			animals.get(k).setHungrylevel(10);
			
			
			animals.add(new Tiger());
			animals.get(k).setName("Tiger"+ (k+1));
			animals.get(k).setEnergylevel(50);
			animals.get(k).setHungrylevel(10);

			
			animals.add(new Rabbit());
			animals.get(k).setName("Rabbit"+ (k+1));
			animals.get(k).setEnergylevel(20);
			animals.get(k).setHungrylevel(3);
			

			animals.add(new Zeebra());
			animals.get(k).setName("Zeebra"+ (k+1));
			animals.get(k).setEnergylevel(30);
			animals.get(k).setHungrylevel(7);
			
			createAnimal(animals.get(k));
			
			
		}
		
	}
	public void createAnimal(Animal animal)
	{
			int i=(int)(Math.random()*5);
			int j=(int)(Math.random()*5);
			do
			{
				forestGrid[i][j]=animal;
			}
			while(forestGrid[i][j]==null);	
	
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
		animalFighting(fighter1,fighter2);
	}
	
	public void animalFighting(Animal fighter1,Animal fighter2)
	{
		System.out.println("Select your fighter from the grid:");
		System.out.println("1.Lion\n2.Tiger\n3.Rabbit\n4.Zeebra\n");
		int selection=sc.nextInt();
		if(selection==1)
		{
			fighter1=lions;
		}
		System.out.println("Co-ordinates of the selected animal are:");
		displayCoordinates(fighter1);
		
		for(int i=0;i<forestGrid.length;i++)
		{
			for(int j=0;j<forestGrid[row].length;j++)
			{
				if(fighter1 instanceof Carnivores)
				{
					if(fighter2 instanceof Carnivores)
					{
						System.out.println("no fighting");
					}
				}
				//forestGrid[i][j]=null;		
			}	
		}
	}
	
	public void displayCoordinates(Animal fighter1)
	{
		
			for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=column;j++)
				{
					if(forestGrid[i][j]==fighter1)
					{
						System.out.println("\t"+i+"\t"+j);	
					}
				}
			}
	}
	
}