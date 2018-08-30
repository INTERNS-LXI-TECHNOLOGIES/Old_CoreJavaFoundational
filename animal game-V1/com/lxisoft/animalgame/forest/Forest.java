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
	
	Animal lion;
	Animal tiger;
	Animal rabbit;
	Animal zeebra;
	
	int row,column;
	
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
		}
		for(int t=0;t<5;t++)
		{	
			tiger=new Tiger();
			tiger.setName("Tiger"+(t+1));
			tiger.setEnergylevel(50);
			tiger.setHungrylevel(10);
			placeAnimal(tiger);
		}
		for(int r=0;r<5;r++)
		{	
			rabbit=new Rabbit();
			rabbit.setName("Rabbit"+(r+1));
			rabbit.setEnergylevel(20);
			rabbit.setHungrylevel(3);
			placeAnimal(rabbit);
		}
		for(int z=0;z<5;z++)
		{
			zeebra=new Zeebra();
			zeebra.setName("Zeebra"+(z+1));
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
		animalFighting(fighter1,fighter2);
	}
	
	public void animalFighting(Animal fighter1,Animal fighter2)
	{
		System.out.println("Select your fighter from the grid:");
		System.out.println("1.Lion\n2.Tiger\n3.Rabbit\n4.Zeebra\n");
		int selection=sc.nextInt();
		if(selection==1)
		{
			fighter1=lion;
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