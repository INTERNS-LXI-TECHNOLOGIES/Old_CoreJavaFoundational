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
	int animalCount;
	int life=1;
	public String[] aName = new String[10];
	public double[] space = new double[5];
	public String position;
	
	
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
		animalCount=-1;
		String name;
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
					if(animalCount==-1)
					{
						animalCount++;
					}				
				name=printAnimal(animalArr[i][j]);
				aName[animalCount] = name;
				space[animalCount]= Math.sqrt((i-i1)*(i-i1) + (j-j1)*(j-j1));
				System.out.println("\n space to " + aName[animalCount] + " is::" + space[animalCount]);
				animalCount++;
				}
			}
			}
	    }
	}
	public void calculateMinimumDistance()
	{
			double d1=space[0];
			double d2=space[1];
			double d3=space[2];
			double d4=space[3];
			double d5=space[4];	
			double[] distArray = {d1,d2,d3,d4,d5};
			double temp;
			   for (int i = 0; i < 5; i++)
					{
					for (int j = i; j > 0; j--) 
						{
							if (distArray[j] < distArray [j - 1])
								{
								temp = distArray[j];
								distArray[j] = distArray[j - 1];
								distArray[j - 1] = temp;
								}
						}
					}
		for(int i=0;i<5;i++)
		{
			if(distArray[0]==space[i])
			{
				System.out.println("\n\nNearest animal:: "+aName[i]);
				position=aName[i];
			}
		}
		System.out.println("\tDistance:: " + distArray[0]);		
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
	
	public String[] getAnimalName()
	{
		return aName;
	}
	
	public int getLife()
	 {
		 return life;
	 }
		
	public String printAnimal(Animal animal)
	{
			if(animal instanceof Deer)
			{
				animalName="deer";
			}
			
			if(animal instanceof Rabbit)
			{
				animalName="rabbit";
			}
			
			if(animal instanceof Zebra)
			{
				animalName="zebra";
			}
			
			if(animal instanceof Lion)
			{
				animalName="lion";
			}
			
			if(animal instanceof Fox)
			{
				animalName="fox";
			}
			
			if(animal instanceof Tiger)
			{
				animalName="tiger";
			}
			
			return animalName; 
	}

	public void animalFight(Animal animal1, Animal animal2)
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
					System.out.println("\n" +firstAnimal+ " won..!"); // only beat
					killIt(animal2);	
				}
				else
				{
					energyLevel2 = energyLevel2 - energyLevel1; 
					hungerLevel2 = hungerLevel2 + (energyLevel2/4);
					System.out.println("Fighting ended...");
					System.out.println("\n" +secondAnimal+ " won..!");// only beat
					killIt(animal1);
					life=0;//predator dead
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
							System.out.println("\n" +firstAnimal+ " won..!");// beat and eat
							killIt(animal2);
							energyLevel1 = energyLevel1 + bonus;
						}
					else
						{
							energyLevel1=0;
							energyLevel2 = energyLevel2 - energyLevel1; 
							hungerLevel1 = hungerLevel2 + (energyLevel2/4);
							if(hungerLevel1 > 100)
							{
								System.out.println( "\n" + "DHAARIDRYAM...!!!" +firstAnimal+ " dead out of hunger ");
								
								killIt(animal1);
								life=0;//predator dead
							}
							
							else
							{
								energyLevel1 = energyLevel1 + bonus;
							}
							System.out.println("\n" +secondAnimal+ " pedichittuu oodipoyiiii tto.." +"\n"+ firstAnimal+ " won");	
							killIt(animal2);
							energyLevel2 = energyLevel2 + bonus;
						}
				}
			}
		}
		
		if(animal1.getanimalType()=="Herbivores")
		{
			if(animal2.getanimalType()=="Carnivores")
			{
				if(energyLevel1 > energyLevel2)
				{
					energyLevel1 = energyLevel1 - energyLevel2; 
					hungerLevel2 = hungerLevel2 + (energyLevel1/4);
					System.out.println("Fighting ended...");
					System.out.println("\n" +firstAnimal+ " won..!"); //ivide only beat
					killIt(animal2);
				}
				else
				{
					energyLevel2 = energyLevel2 - energyLevel1; 
					hungerLevel2 = hungerLevel2 + (energyLevel2/4);
					System.out.println("Fighting ended...");
					System.out.println("\n" +secondAnimal+ "has eaten" + firstAnimal  );//ivide only beat
					killIt(animal1);
					life=0;
					//predator dead
				}
			}
			else
			{
				if(animal1.getanimalType()=="Herbivores")
				{
					if(energyLevel1 > energyLevel2)
					{
						energyLevel1 = energyLevel1 - energyLevel2;
						hungerLevel2 = hungerLevel2 + (energyLevel1/4);
						System.out.println("\n" +secondAnimal+ " ran away out of fear from " + firstAnimal);
						killIt(animal2);
					}
					else
					{
						energyLevel2 = energyLevel2 - energyLevel1;
						hungerLevel1 = hungerLevel1 + (energyLevel2/4);
						System.out.println("\n" +firstAnimal+ " ran away out of fear from " + secondAnimal);
						killIt(animal1);
						life=0;//predator dead
					}	
				}
			}
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