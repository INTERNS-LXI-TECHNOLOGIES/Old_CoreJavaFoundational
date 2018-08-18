package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.animal.AnimalLevel;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import java.util.*;
public class ForestControl
{
	Scanner scan=new  Scanner(System.in);
	Forest forest=new Forest();
	Animal[][] animalArray;
	int n1,n2,animalCount=0;
	double[] distance=new double[10];
  public  void setForest()
	{
		System.out.println("Enter the size of forest");
		n1=scan.nextInt();
		n2=scan.nextInt();
		forest.setForestArea(n1,n2);

	}
	
	public void setAnimalLocation(Animal animal)
	{  int i,j;
		do
		{i=(int)(Math.random()*n1);
		j=(int)(Math.random()*n2);
		animalArray=forest.getForestArea();
		}
		while(animalArray[i][j]!=null);
		animalArray[i][j]=animal;
		
	
	}
	  public  void getForeststatus()
	{
	for(int i=0;i<n1;i++)
		{  System.out.print( "\t\t\t");
			for(int j=0;j<n2;j++)
			{
		  System.out.print( animalArray[i][j]+"\t"); 
		    }
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public void setDistance(int m,int n)
	{
		int breadth,length;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(animalArray[i][j]!=null)
				{
					breadth=j-n;
					length=i-m;
				
				distance[animalCount]=Math.sqrt((breadth*breadth) +(length*length));
				animalCount++;
				}
			}
		}
					
		
	}
	public double[] getDistance()
	{
		return distance;
	}
	public int getanimalCount()
	{
		return animalCount;
	}
	public void getanimallocation(Animal animal)
	{
		for(int i=0;i<n1;i++)
		{  
			for(int j=0;j<n2;j++)
			{
				
				if( animalArray[i][j]==animal)
				{
					
				System.out.println( "The cordinates of the "+animal+"is "+i+j); 
					
				}
			}
			
		}
	}
	public void animalFight(Animal animal1,Animal animal2)
	 {  
	 int energy=15,energyLevel1,hungryLevel1,energyLevel2,hungryLevel2;
	 energyLevel1=animal1.getEnergyLevel();
	 hungryLevel1= animal1.getHungryLevel();
	 energyLevel2=animal2.getEnergyLevel();
	 hungryLevel2= animal2.getHungryLevel();

	    System.out.println( "fighting");
		if(animal1.getanimaltype()=="Carnivorous")
		{
			System.out.println(animal2.getanimaltype()+energyLevel2);
		
		 if(animal2.getanimaltype()=="Carnivorous")
		 {
			 if(energyLevel1> energyLevel2)
			 {
	
				 energyLevel1=energyLevel1- energyLevel2; 
				  hungryLevel1= hungryLevel1+( energyLevel2/2);
				  System.out.println( "The  "+animal1+"has beaten the"+animal2);
				kill(animal2);
				
			 }
			 else
			 {
				 energyLevel2=energyLevel2-energyLevel1; 
				 hungryLevel2= hungryLevel2+(energyLevel1/2);
				   System.out.println( "The  "+animal2+"has eaten the"+animal1);
				 kill(animal1);
			 }
		 }
		
		 if(animal2.getanimaltype()=="Herbivorous")
		 {
			 System.out.println( "Herbivorous  ");
			
			 if(energyLevel1> energyLevel2)
			 { System.out.println( "Herbivorous0  ");
				 energyLevel1=energyLevel1- energyLevel2;
				 hungryLevel1= hungryLevel1-( energyLevel2/2);
				  System.out.println( "The  "+animal1+"has eaten the"+animal2);
				 kill(animal2);
				 energyLevel1=energyLevel1+energy;
			 }
		 
		 else
		 { System.out.println( "Herbivorous1  ");
			energyLevel1=0;
			  energyLevel2= energyLevel2-energyLevel1; 
			  hungryLevel1=hungryLevel2+(energyLevel1/2);
			 if(hungryLevel1>100)
			 {
				 System.out.println( "The animal "+animal1+"is dead due to increase in Hunger level."); 
					
				 kill(animal1);
			 }
			 else
			 {
				  energyLevel1=energyLevel1+energy;
			 }
			  System.out.println( "The animal "+animal2+"has escaped from"+animal1); 
			  energyLevel2= energyLevel2+energy;
		 }
		}
	 }
	 }
	public void kill(Animal animal)
	 {
		 
		 	for(int i=0;i<n1;i++)
		{  
			for(int j=0;j<n2;j++)
			{
				if( animalArray[i][j]==animal)
				{
				System.out.println( "The cordinates of the "+animal+"which dead on the fight is "+i+j); 
					animalArray[i][j]=null;
				}
			}
			
		}
	 }
		
				
	
}