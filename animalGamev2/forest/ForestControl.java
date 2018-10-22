package com.lxisoft.animalGamev2.forest;
import com.lxisoft.animalGamev2.forest.Forest;
import com.lxisoft.animalGamev2.animals.*;
import java.util.*;
public class ForestControl
{
	Forest forest=new Forest();
	public Animal[][] animalArray;
	String[] animalName=new String[30];
	String animal;
	int noOfLions,noOfTigers,noOfAthulyas,noOfElephants,noOfDeers,noOfRabbits;
	double[] animalDistance=new double[30];
	public int row,column,animalPosition;
	public  void setForest()
	{	Scanner scan=new  Scanner(System.in);
		System.out.println("Enter the size of forest");
		row=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(row,column);

	}
		
	public void setAnimalLocation(Animal animal)
	{  int i,j;
	   animalArray=forest.getForestArea();
		do
		{
		i=(int)(Math.random()*row);
		j=(int)(Math.random()*column);
		animalArray=forest.getForestArea();
		}
		while(animalArray[i][j]!=null);
		animalArray[i][j]=animal;
	}
	 public  void getForeststatus()
	{  
		for(int i=0;i<row;i++)
		{  
		//System.out.print( "\t\t\t");
		for(int j=0;j<column;j++)
		{
		System.out.print( "\t");
			//if(animalArray[i][j] !=null)
			try{
		  
			  System.out.print(animalArray[i][j].getAnimalName()+animalArray[i][j].getAnimalId());
		  
			}
			catch(Exception e) 
			{
			 System.out.print("*");
			}
		  
		}
		System.out.print( "\n");
		}
	}
	public void  animalCreation()
	{
		noOfLions=getRandomNo();
		forest.lionCreation(noOfLions);
		noOfTigers=getRandomNo();
		forest.tigerCreation(noOfTigers);
		noOfAthulyas=getRandomNo();
		forest.athulyaCreation(noOfAthulyas);
		noOfElephants=getRandomNo();
		forest.elephantCreation(noOfElephants);
		noOfDeers=getRandomNo();
		forest.deerCreation(noOfDeers);
		noOfRabbits=getRandomNo();
	    forest.rabbitCreation(noOfRabbits);
		
			
	}
	public int getRandomNo()
	{
		int j=(int)(Math.random()*4)+1; 
		return j;
	}
	public void placeingAnimals()
	{
		for(int i=0;i< noOfLions;i++)
		{
		setAnimalLocation( forest.lions.get(i));
		}
		for(int i=0;i< noOfTigers;i++)
		{
		setAnimalLocation(forest.tigers.get(i));
		}
		for(int i=0;i< noOfAthulyas;i++)
		{
		setAnimalLocation( forest.athulyas.get(i));
		}
		for(int i=0;i< noOfDeers;i++)
		{
		setAnimalLocation( forest.deers.get(i));
		}
		for(int i=0;i< noOfRabbits;i++)
		{
		setAnimalLocation( forest.rabbits.get(i));
		}
		for(int i=0;i<noOfElephants;i++)
		{
		setAnimalLocation( forest.elephants.get(i));
		}
		
	}
	public void getanimallocation(Animal animal)
	{	String animalName=findAnimal(animal);
		for(int i=0;i<row;i++)
		{  
			for(int j=0;j<column;j++)
			{
				
				if( animalArray[i][j]==animal)
				{
					
				System.out.println( "The cordinates of the "+animalName+" is \n"+i+"\n"+j); 
					
				}
			}
			
		}
	}
	public void calculateAnimalDistance(int m,int n)
	{
		int breadth,length;
		animalPosition=-1; 
		String name;
		//getForeststatus();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(animalArray[i][j]!=null)
				{
					if(i==m&&j==n)
					{
						
					}
				    else
					{
					if (animalPosition==-1)
					{	animalPosition++;
					}
					name=animalArray[i][j].getAnimalName();
					breadth=j-n;
					length=i-m;
				    animalName[animalPosition]= name;
					animalDistance[animalPosition]=Math.sqrt((breadth*breadth)+(length*length));
					System.out.print("Name["+animalPosition+"]="+animalName[animalPosition]);
					System.out.println("\tdistance["+animalPosition+"]="+animalDistance[animalPosition]);
					
					animalPosition++;
					}
				}
			}
		}
						
	}
	 public String findAnimal(Animal animal)
	 {
		 String animalName=null;
	 	
		  if(animal instanceof Lion)
		  {animalName= animal.getAnimalName();
		  }
		   if(animal instanceof Tiger)
		  {animalName= animal.getAnimalName();
		  }
		    if(animal instanceof Elephant)
		  {animalName= animal.getAnimalName();
		  }
		   if(animal instanceof Rabbit)
		  {animalName=  animal.getAnimalName();
		  }
		   if(animal instanceof Deer)
		  {animalName= animal.getAnimalName();
		  }
		    if(animal instanceof Athulya)
		  {animalName= animal.getAnimalName();
		  }
		
		return animalName;
			
	 }
	 public int noOfAnimals(int animalCount)
	 {
		int animalNo=0;
		if(animalCount==1)
		{animalNo=chooseFighter(noOfTigers,"Tiger");
		animal="Tiger";}
		if(animalCount==2)
		{animalNo=chooseFighter(noOfLions,"Lion");
		animal="Lion";}
		if(animalCount==3)
		{animalNo=chooseFighter(noOfRabbits,"Rabbit");
		animal="Rabbit";}
		if(animalCount==4)
		{animalNo=chooseFighter(noOfDeers,"Deer");
		animal="Deer";}
		if(animalCount==5)
		{animalNo=chooseFighter(noOfElephants,"Elephant");
		animal="Elephant";}
		if(animalCount==6)
		{animalNo=chooseFighter(noOfAthulyas,"Athulya");
		animal="Athulya";}
	    return animalNo;
	 }
	 public String getAnimalName()
	 {
		 return this.animal;
	 }
	int chooseFighter(int noOfAvailableAnimals,String animalName)
	{
		Scanner scan=new Scanner(System.in);
		int fighterNo,noOfAnimals=noOfAvailableAnimals;
		System.out.println("Totally there are "+noOfAnimals+" no of same animal  Choose your fighter among these");
		for(int i=0;i<noOfAnimals;i++)
		{
			System.out.println(i+". "+animalName+i);
		}
		fighterNo=scan.nextInt();
		return fighterNo;
	}
	public Animal getAnimal(String animalName,int animalNo)
	{	Animal animal=null;
      if(animalName=="lion")
	  {animal=forest.lions.get(animalNo);
	  }
	  if(animalName=="Tiger")
	  {animal=forest.tigers.get(animalNo);
	  }
	  if(animalName=="Athulya")
	  {animal=forest.athulyas.get(animalNo);
	  }
	  if(animalName=="Rabbit")
	  {animal=forest.rabbits.get(animalNo);
	  }
	   if(animalName=="Elephant")
	  {animal=forest.elephants.get(animalNo);
	  }
	   if(animalName=="Deer")
	  {animal=forest.deers.get(animalNo);
	  }
	 // System.out.println(animal);
	  return animal;
	}
}