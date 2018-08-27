package com.lxisoft.animalgame.forest;

import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.forest.animals.Animal;
import com.lxisoft.animalgame.forest.animals.carnivores.Tiger;
import com.lxisoft.animalgame.forest.animals.carnivores.Fox;
import com.lxisoft.animalgame.forest.animals.herbivores.Zebra;
import com.lxisoft.animalgame.forest.animals.carnivores.Lion;
import com.lxisoft.animalgame.forest.animals.herbivores.Deer;
import com.lxisoft.animalgame.forest.animals.herbivores.Rabbit;
import java.util.*;

public class SetForest
{
	Scanner scan = new Scanner(System.in);
	Forest forest = new Forest();
	Animal[][] animalArr;
	String animalName;
	int row,column,i,j;
	int animalCount=0;
	
	double[] space = new double[5];
	
	
	public void forestControl()
	{
		
		System.out.println("Enter the grid size::");
		row = scan.nextInt();
		column = scan.nextInt();
		forest.setforestGrid(row,column);
	}
	
	public void animalLocation(Animal animal)
	{
		do
		{
		i=(int)(Math.random()*row);
		j=(int)(Math.random()*column);
		animalArr = forest.getforestGrid();
		}
		
		while(animalArr[i][j]!=null);
		animalArr[i][j]=animal;
	}
		
	public void forestInfo()
	{
		try{
		
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
			
				{
				
					System.out.print("\t");
				
					if(animalArr[i][j]!=null)
					{
						if(animalArr[i][j] instanceof Lion)
						{
							System.out.print("Lion");
						}
						
						if(animalArr[i][j] instanceof Tiger)
						{
							System.out.print("Tiger");
						}
						
						if(animalArr[i][j] instanceof Fox)
						{
							System.out.print("Fox");
						}
						
						if(animalArr[i][j] instanceof Deer)
						{
							System.out.print("Deer");
						}
						
						if(animalArr[i][j] instanceof Rabbit)
						{
							System.out.print("Rabbit");
						}
						
						if(animalArr[i][j] instanceof Zebra)
						{
							System.out.print("Zebra");
						}
						
					}
					
					else
						{
							System.out.print("null");
						}
				
				}
				System.out.println("\n");
			}
			System.out.print("\n");	
		}
		catch(NullPointerException e)
			{
				System.out.println("0");
			}
	}
	
	public void setSpace(int i1, int j1)
	{
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
			if(animalArr[i][j]!=null)
			{
				if(i==i1&&j==j1)
				{
				}
				else
				{
					
				space[animalCount]= Math.sqrt((i-i1)*(i-i1) + (j-j1)*(j-j1));
				System.out.println("space to animal " + (animalCount+1) + " is::" + space[animalCount]);
				animalCount++;
				}
			}
			}

		}
		
		
	}
	
		
	public double[] getSpace()
	{
		return space;
	}
	
	public int getanimalCount()
	{
		return animalCount;
	}
	
	
	public void getanimalLocation(Animal animal)
	{
		String animalName = printAnimal(animal);
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				
				if(animalArr[i][j]==animal)
				{
					System.out.print("The  "+ animalName + "  is at the position:: \t" + i +" " +j);
				}
			}
		}
	}
	
	
	public String printAnimal(Animal animal)
	{
			if(animal instanceof Deer)
			{
				animalName="Deer";
			}
			
			if(animal instanceof Rabbit)
			{
				animalName="Rabbit";
			}
			
			if(animal instanceof Zebra)
			{
				animalName="Zebra";
			}
			
			if(animal instanceof Lion)
			{
				animalName="Lion";
			}
			
			if(animal instanceof Fox)
			{
				animalName="Fox";
			}
			
			if(animal instanceof Tiger)
			{
				animalName="Tiger";
			}
			
			return animalName; 
	}
	
	
	
	

}