package com.lxisoft.animalGamev2.forest;
import com.lxisoft.animalGamev2.forest.Forest;
import com.lxisoft.animalGamev2.animals.*;
import java.util.*;
public class ForestControl
{
	Forest forest=new Forest();
	public Animal[][] animalArray;
	String[] animalName=new String[10];
	double[] animalDistance=new double[10];
	public int raw,column,animalPosition;
	public  void setForest()
	{	Scanner scan=new  Scanner(System.in);
		System.out.println("Enter the size of forest");
		raw=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(raw,column);

	}
		
	public void setAnimalLocation(Animal animal)
	{  int i,j;
		do
		{
		i=(int)(Math.random()*raw);
		j=(int)(Math.random()*column);
		animalArray=forest.getForestArea();
		}
		while(animalArray[i][j]!=null);
		animalArray[i][j]=animal;
	}
	 public  void getForeststatus()
	{  
		for(int i=0;i<raw;i++)
		{  
		System.out.print( "\t\t\t");
		for(int j=0;j<column;j++)
		{
		System.out.print( "\t");
			if(animalArray[i][j] !=null)
			{
		  
			  System.out.print(animalArray[i][j].getAnimalName());
		  
			}
			else 
			{
				System.out.print( "**");
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
		for(int i=0;i<raw;i++)
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
					name=findAnimal(animalArray[i][j]);
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
}