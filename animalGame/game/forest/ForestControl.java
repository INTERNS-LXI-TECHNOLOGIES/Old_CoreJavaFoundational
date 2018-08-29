package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.animal.carnivorous.*;
import com.lxisoft.animalGame.game.animal.herbivorous.*;
import java.util.*;
public class ForestControl
{
	Scanner scan=new  Scanner(System.in);
	Forest forest=new Forest();
	double[] distance=new double[10];
	Animal[][] animalArray;
	int n1,n2,animalCount,fighteLife=1;
	String animalName;
String[] name=new String[10];
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
		{
		i=(int)(Math.random()*n1);
		j=(int)(Math.random()*n2);
		animalArray=forest.getForestArea();
		}
		while(animalArray[i][j]!=null);
		animalArray[i][j]=animal;
		
	
	}
	  public  void getForeststatus()
	{  try{
	for(int i=0;i<n1;i++)
		{  System.out.print( "\t\t\t");
			for(int j=0;j<n2;j++)
			{System.out.print( "\t");
		if(animalArray[i][j] !=null)
		{
		  if(animalArray[i][j] instanceof Lion)
		  {System.out.print( "lion");
		  }
		   if(animalArray[i][j] instanceof Tiger)
		  {System.out.print( "Tiger");
		  }
		    if(animalArray[i][j] instanceof Elephant)
		  {System.out.print( "Elephant");
		  }
		   if(animalArray[i][j] instanceof Rabbit)
		  {System.out.print( "Rabbit");
		  }
		   if(animalArray[i][j] instanceof Deer)
		  {System.out.print( "Deer");
		  }
		  if(animalArray[i][j] instanceof Athulya)
		  {System.out.print( "Athulya");
		  }
		}
			else 
			{System.out.print( "null");
			}				
		    }
			System.out.print("\n");
		}
		System.out.print("\n");
	}catch(NullPointerException e)
	{System.out.print("0");}
	}
	public void setAnimalDistance(int m,int n)
	{
		int breadth,length;
		animalCount=-1; 
		String animalName;
		//getForeststatus();
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(animalArray[i][j]!=null)
				{
					if(i==m&&j==n)
					{
						
					}
				    else
					{
					if (animalCount==-1)
					{	animalCount++;
					}
					animalName=findAnimal(animalArray[i][j]);
					breadth=j-n;
					length=i-m;
				     name[animalCount]= animalName;
					distance[animalCount]=Math.sqrt((breadth*breadth)+(length*length));
					System.out.print("Name["+animalCount+"]="+name[animalCount]);
					System.out.println("\tdistance["+animalCount+"]="+distance[animalCount]);
					
					animalCount++;
					}
				}
			}
		}
					
		
	}
	
	public double[] getAnimalDistance()
	{
		return distance;
	}
	public String[] getAnimalName()
	{
		return name;
	}
	public int getanimalCount()
	{
		return animalCount;
	}
	
	
	public void getanimallocation(Animal animal)
	{	String animalName=findAnimal(animal);
		for(int i=0;i<n1;i++)
		{  
			for(int j=0;j<n2;j++)
			{
				
				if( animalArray[i][j]==animal)
				{
					
				System.out.println( "The cordinates of the "+animalName+" is \n"+i+"\n"+j); 
					
				}
			}
			
		}
	}
	public void animalFight(Animal animal1,Animal animal2)
	 {  
	 int energy=15,energyLevel1,hungryLevel1,energyLevel2,hungryLevel2;
	 energyLevel1=animal1.getEnergyLevel();
	 hungryLevel1=animal1.getHungryLevel();
	 energyLevel2=animal2.getEnergyLevel();
	 hungryLevel2= animal2.getHungryLevel();
	 String animalOne=findAnimal(animal1);
	 String animalTwo=findAnimal(animal2);

	    System.out.println( "fighting" );
		if(animal1.getanimaltype()=="Carnivorous")
		{
			
		
		 if(animal2.getanimaltype()=="Carnivorous")
		 {
			 if(energyLevel1> energyLevel2)
			 {
	
				  energyLevel1=energyLevel1- energyLevel2; 
				  hungryLevel1= hungryLevel1+( energyLevel2/2);
				  System.out.println( "The  "+animalOne+" has beaten "+animalTwo);
				  kill(animal2);
				
			 }
			 else
			 {
				 energyLevel2=energyLevel2-energyLevel1; 
				 hungryLevel2= hungryLevel2+(energyLevel1/2);
				   System.out.println( "The  "+animalTwo+" has beaten "+animalOne);
				 kill(animal1);
				 fighteLife=0;
			 }
		 }
		
		 if(animal2.getanimaltype()=="Herbivorous")
		 {
			
			
			 if(energyLevel1> energyLevel2)
			 {
				 energyLevel1=energyLevel1- energyLevel2;
				 hungryLevel1= hungryLevel1-( energyLevel2/2);
				  System.out.println( "The  "+animalOne+" has eaten the "+animalTwo);
				 kill(animal2);
				 energyLevel1=energyLevel1+energy;
			 }
		 
		 else
		 { 
			energyLevel1=0;
			  energyLevel2= energyLevel2-energyLevel1; 
			  hungryLevel1=hungryLevel2+(energyLevel1/2);
			 if(hungryLevel1>100)
			 {
				 System.out.println( "The animal "+animalOne+" is dead due to increase in Hunger level."); 
					
				 kill(animal1);
				 fighteLife=0;
			 }
			 else
			 {
				  energyLevel1=energyLevel1+energy;
			 }
			  System.out.println( "The animal "+animalTwo+" has escaped from "+animalOne); 
			   kill(animal2);
			  energyLevel2= energyLevel2+energy;
		 }
		}
	 }
	 	if(animal1.getanimaltype()=="Herbivorous")
		 {
			
		
		 if(animal2.getanimaltype()=="Carnivorous")
		 {
			 if(energyLevel1> energyLevel2)
			 {
	
				 energyLevel1=energyLevel1- energyLevel2;
                 hungryLevel2= hungryLevel2+(energyLevel1/2);				 
				  System.out.println( "The  "+animalOne+" has beaten  "+animalTwo);
				kill(animal2);
				
			 }
			 else
			 {
				 energyLevel2=energyLevel2-energyLevel1; 
				 hungryLevel2= hungryLevel2+(energyLevel1/2);
				   System.out.println( "The  "+animalOne+" has been eaten by the "+animalTwo);
				 kill(animal1);
				 fighteLife=0;
			 }
		 }
		
		 if(animal2.getanimaltype()=="Herbivorous")
		 {
			// System.out.println( "No fighting both are Herbivorous ");
			  if(energyLevel1> energyLevel2)
			 {
	
				 energyLevel1=energyLevel1- energyLevel2;
                 hungryLevel2= hungryLevel2+(energyLevel1/2);				 
				  System.out.println( "The  "+animalTwo+" has ran away from  "+animalOne);
				kill(animal2);
				
			 }
			 else
			 {
				 energyLevel2=energyLevel2-energyLevel1; 
				 hungryLevel2= hungryLevel2+(energyLevel1/2);
				   System.out.println( "The  "+animalOne+" has lower energy than "+animalTwo);
				 kill(animal1);
				 fighteLife=0;
			 }
			
			
		 }
	 }
	 }
	public void kill(Animal animal)
	 {	String animalName=findAnimal(animal);
		 
		 	for(int i=0;i<n1;i++)
		{  
			for(int j=0;j<n2;j++)
			{
				if( animalArray[i][j]==animal)
				{
				System.out.println( "The cordinates of the "+animalName+" which has been removed from forst is "+i+"\t"+j); 
				animalArray[i][j]=null;
				}
			}
			
		}
	 }
	 public String findAnimal(Animal animal)
	 {
		 
	 	
		  if(animal instanceof Lion)
		  {animalName= "lion";
		  }
		   if(animal instanceof Tiger)
		  {animalName= "Tiger";
		  }
		    if(animal instanceof Elephant)
		  {animalName="Elephant";
		  }
		   if(animal instanceof Rabbit)
		  {animalName= "Rabbit";
		  }
		   if(animal instanceof Deer)
		  {animalName="Deer";
		  }
		    if(animal instanceof Athulya)
		  {animalName="Athulya";
		  }
		
		return animalName;
			
	 }
	  public int getFighterLife()
	 {
		 return fighteLife;
	 }
				
	
}