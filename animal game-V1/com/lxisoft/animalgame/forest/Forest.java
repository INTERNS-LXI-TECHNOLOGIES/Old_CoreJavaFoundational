package com.lxisoft.animalgame.forest;
import java.util.*;
import java.io.*;
import com.lxisoft.animalgame.forest.animal.Animal;
import com.lxisoft.animalgame.forest.animal.carnivores.lion.Lion;
import com.lxisoft.animalgame.forest.animal.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.forest.animal.herbivores.rabbit.Rabbit;
import com.lxisoft.animalgame.forest.animal.herbivores.zeebra.Zeebra;
public class Forest
{
	Random randomNum=new Random();
	Animal[][] forestGrid=new Animal[10][10];
	Scanner sc=new Scanner(System.in);
	Animal[] lions=new Lion[5];
	Animal[] tigers=new Tiger[5];
	Animal[] rabbits=new Rabbit[5];
	Animal[] zeebras=new Zeebra[5];
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
		placeAnimal();
		printGrid();
		
		
	}
	public void placeAnimal()
	{
		for(int k=0;k<5;k++)
		{
			lions[k]=new Lion();
			lions[k].setName("Lion"+ (k+1));
			createAnimal(lions[k]);
			
			tigers[k]=new Tiger();
			tigers[k].setName("Tiger"+ (k+1));
			createAnimal(tigers[k]);
			
			rabbits[k]=new Rabbit();
			rabbits[k].setName("Rabbit"+ (k+1));
			createAnimal(rabbits[k]);
			
			zeebras[k]=new Zeebra();
			zeebras[k].setName("Zeebra"+ (k+1));
			createAnimal(zeebras[k]);
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
	}
	
}