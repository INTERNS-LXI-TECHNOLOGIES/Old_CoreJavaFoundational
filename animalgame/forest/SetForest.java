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

	public double[] space = new double[5];
	
	
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
	
		//animalCount=-1;
		//String[] name = new String[10];
		//String animalNAme;
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
					
					/*if(animalCount==-1)
					{
						animalCount++;
					}*/					
				/*animalNAme=printAnimal(animalArr[i][j]);
				name[animalCount] = animalNAme;*/
				space[animalCount]= Math.sqrt((i-i1)*(i-i1) + (j-j1)*(j-j1));
				System.out.println("space to animal " +  (animalCount+1) + " is::" + space[animalCount]);
				//System.out.println("Animal " + (animalCount+1) + " is" + animalNAme );
				animalCount++;
				}
			}
			}
	    }
		
	   double[] distArray = {space[0],space[1],space[2],space[3],space[4]};
	   Arrays.sort(distArray);
	   for (int i = 0; i < distArray.length; i++) 
		{
			
		}
		System.out.println("Nearest distance for " + animalName +" is :: " + distArray[0]);
		
		
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
					System.out.print("The  " +animalName+ "  is at the position:: \t" + i +" " +j);
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
	
	
	public void setAnimalFight(Animal animal1, Animal animal2)
	{
		int bonus = 20;
		int energyLevel1= animal1.getenergyLevel();
		int energyLevel2= animal2.getenergyLevel();
		int hungerLevel1= animal1.gethungerLevel();
		int hungerLevel2= animal2.gethungerLevel();
		String firstAnimal = printAnimal(animal1);
		String secondAnimal = printAnimal(animal2);
		
		System.out.println("Animals started Fighting!!");
		if(animal1.getanimalType()=="Carnivores")
		{
			if(animal2.getanimalType()=="Carnivores")
			{
				if(energyLevel1 > energyLevel2)
				{
					energyLevel1 = energyLevel1 - energyLevel2; 
					hungerLevel1 = hungerLevel1 + (energyLevel1/4);
					System.out.println("Fighting ended...");
					System.out.println(firstAnimal+ " won..!"); //ivide only beat
					killIt(animal2);
				}
				else
				{
					energyLevel2 = energyLevel2 - energyLevel1; 
					hungerLevel2 = hungerLevel2 + (energyLevel2/4);
					System.out.println("Fighting ended...");
					System.out.println(secondAnimal+ " won..!");//ivide only beat
					killIt(animal1);
				}
			}
			else
			{
				if(animal2.getanimalType()=="Herbivores")
				{
					if(energyLevel1 > energyLevel2)
						{
							energyLevel1 = energyLevel1 - energyLevel2; 
							hungerLevel1 = hungerLevel1 + (energyLevel1/4);
							System.out.println("Fighting ended...");
							System.out.println(firstAnimal+ " won..!");//ivide only beat and eat
							killIt(animal2);
						}
					else
						{
							
							energyLevel2 = energyLevel2 - energyLevel1; 
							hungerLevel1 = hungerLevel2 + (energyLevel2/4);
							if(hungerLevel1 > 100)
							{
								System.out.println( "DHAARIDRYAM...!!!" +firstAnimal+ " dead out of hunger ");
								
								killIt(animal1);
							}
							
							else
							{
								energyLevel1 = energyLevel1 + bonus;
							}
							System.out.println(secondAnimal+ " pedichittuu oodipoyiiii tto.." +"\n"+ firstAnimal+ " won");
							
							
						}
				}
			}
		}
		else
		{
			
		}
			
	}
	
	public void killIt(Animal animal)
	{
		String animalName=printAnimal(animal);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{			
				if(animalArr[i][j]==animal)
				{
					System.out.println(animalName+ " has been killed and removed from the grid " +"\t"+ i + "\t"+j);
					animalArr[i][j]=null;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}