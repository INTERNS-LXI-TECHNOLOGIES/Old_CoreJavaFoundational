package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Lion;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Tiger;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Deer;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Zebra;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Giraffe;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Cheeta;
import java.util.*;

public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animal[][] animalList;
	double[] distance=new double[10];
	String animalName;
	int animalcount,fighterlife=1;
	
	String[] name=new String[10];
	int row,column,i,j;
	
	public void setForest()
	{
		System.out.print("Enter the size of the forest:");
		row=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(row,column);
	}
	
	public void setAnimalLocation(Animal animal)
	{
		do
		{
			i=(int)(Math.random()*row);
			j=(int)(Math.random()*column);
			
			animalList=forest.getForestArea();
		}
		    while(animalList[i][j]!=null);
			animalList[i][j]=animal;
	}
	
	public void setForestStatus()
	{
		try{
		for(int i=0;i<row;i++)
		{

			for(int j=0;j<column;j++)
			{
				System.out.print("\t\t");
				
			      if(animalList[i][j]!=null)
				{
					if(animalList[i][j] instanceof Lion)
					{
						System.out.print("Lion");
					}
					
				   if(animalList[i][j] instanceof Tiger)
				   {
					   System.out.print("Tiger");
				   }
				   
				   if(animalList[i][j] instanceof Deer)
				   {
					   System.out.print("Deer");
				   }
				   
				   if(animalList[i][j] instanceof Zebra)
				   {
					   System.out.print("Zebra");
				   }
				    if(animalList[i][j] instanceof Cheeta)
				   {
					   System.out.print("Cheeta");
				   }
				    if(animalList[i][j] instanceof Giraffe)
				   {
					   System.out.print("Giraffe");
				   }
				}
				else
				{
					System.out.print("null");
				}
			}
				System.out.println("\n");
				

		}  
		     //System.out.println("Welcome to forest");
		}
		catch(NullPointerException e)
		{
			System.out.println("0");
		}	
	}

		public void getanimalLocation(Animal animal)
		{
			String animalName=findAnimal(animal);
			for(i=0;i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					if(animalList[i][j]==animal)
					{
						System.out.println("\tthe coordinates of  "+animalName+"\n"+i+"\n"+j);
						
					}
						
				}
			}
			
		}
		
		public void setanimalDistance(int m,int n)
		{
			int length,breadth;
			animalcount=-1;
			String animalName;
			for(i=0;i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					if(animalList[i][j]!=null)
					{
						if(i==m&&j==n)
						{}
						
						else{
							
							if(animalcount==-1)
							{
								
							animalcount++;
							}
							animalName=findAnimal(animalList[i][j]);
							breadth=j-n;
							length=i-m;
							name[animalcount]=animalName; 
							distance[animalcount]=Math.sqrt((length*length)+(breadth*breadth));
							
							animalcount++;
						}
					}
				}
							
			}
		}
		public double[] getanimalDistance()
		{
			return distance;
			
	      
		}
		public String[] getanimalName()
		{
			return name;
			
		}
		public int getanimalcount()
		{
			return animalcount;
		}
		public int getfighterLife()
		{
			return fighterlife;
		}
		
	public void animalFight(Animal animal1,Animal animal2)
	{
		int energy=10,animalStrength1,animalHunger1,animalStrength2,animalHunger2;
		animalStrength1=animal1.getanimalStrength();
		animalHunger1=animal1.getanimalHunger();
		animalStrength2=animal2.getanimalStrength();
		animalHunger2=animal2.getanimalHunger();
		String animalOne=findAnimal(animal1);
		String animalTwo=findAnimal(animal2);
		
		System.out.println("\t\tFIGHT STARTED\n");
		if(animal1.getanimalType()=="carnivorous")
		{
			if(animal2.getanimalType()=="carnivorous")
			{
				if(animalStrength1>animalStrength2)
				{
					animalStrength1=animalStrength1-animalStrength2;
					animalHunger1=animalHunger1+(animalStrength2/2);
					System.out.println("\t\tanimaOne is the winner\n");
					kill(animal2);
				}
				else
				{
					animalStrength2=animalStrength2-animalStrength1;
					animalHunger2=animalHunger2+(animalStrength1/2);
					System.out.println("\t\tanimalTwo is the winner\n");
					kill(animal1);
					fighterlife=0;
				}
			}
			if(animal2.getanimalType()=="herbivorous")
			{
				if(animalStrength1>animalStrength2)
				{
					animalStrength1=animalStrength1-animalStrength2;
					animalHunger1=animalHunger1-(animalStrength2/2);
					System.out.println("\nthe "+animalOne+" ate "+animalTwo+ "\n");
					kill(animal2);
					animalStrength1=animalStrength1+energy;
				}
				
				else
				{
					animalStrength1=0;
					animalStrength2=animalStrength2-animalStrength1;
					animalHunger1=animalHunger2+(animalStrength1/2);
					if(animalHunger1>100)
					{
						System.out.println("\nthe "+animalOne+" is dead due to hunger");
						kill(animal1);
						fighterlife=0;
					}
					else
					{
						animalStrength1=animalStrength1+energy;
					}
					System.out.println("\nthe "+animalTwo+" escaped from "+animalOne+ "\n");
					kill(animal2);
					animalStrength2=animalStrength2+energy;
				}
			}
		}
		if(animal1.getanimalType()=="herbivorous")
		{
			
			if(animal2.getanimalType()=="carnivorous")
			{
				if(animalStrength1>animalStrength2)
				{
					animalStrength1=animalStrength1-animalStrength2;
					animalHunger2=animalHunger2+(animalHunger1/2);
					System.out.println("\nthe "+animalOne+"  has defeated "+animalTwo+ "\n");
					kill(animal2);
				}
				else
				{
					animalStrength2=animalStrength2-animalStrength1;
					animalHunger2=animalHunger2-(animalStrength1/2);
					System.out.println("\nthe "+animalTwo+" ate "+animalOne+ "\n");
					kill(animal1);
					fighterlife=0;
				}
			}
				if(animal2.getanimalType()=="herbivorous")
			{
				System.out.println("\t\tboth are herbivorous\n");
				if(animalStrength1>animalStrength2)
				{
					animalStrength1=animalStrength1-animalStrength2;
					animalHunger2=animalHunger2+(animalHunger1/2);
					System.out.println("\nthe "+animalOne+" defeated  "+animalTwo+ "\n");
					kill(animal2);
				}
				else
				{
					animalStrength2=animalStrength2-animalStrength1;
					animalHunger1=animalHunger1+(animalHunger2/2);
					System.out.println("\nthe "+animalTwo+" defeated" +animalOne+ "\n");
					kill(animal1);
					fighterlife=0;
				}
			}
			
		}
	}

	public void kill(Animal animal)
	{
		String animalName=findAnimal(animal);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(animalList[i][j]==animal)
				{
					System.out.println("\tthe cordinates of the "+animalName+" has been removed from forest "+i+"\t"+j+ "\n");
				    animalList[i][j]=null;
				}
			}
			
		}
		
	}
	
	public String findAnimal(Animal animal)
		{
			if(animal instanceof Lion)
			{animalName="lion";}
			if(animal instanceof Tiger)
			{animalName="tiger";}
			if(animal instanceof Deer)
			{animalName="deer";}
		    if(animal instanceof Zebra)
			{animalName="zebra";}
		    if(animal instanceof Cheeta)
			{animalName="cheeta";}
		    if(animal instanceof Giraffe)
			{animalName="giraffe";}
		return animalName;
		}
	public int getFighterLife()
	{
		return fighterlife;
		
	}
}
				
					
		
		
			
					
					
			
	

		
		
				
				
					
					
				
				
				
					
					
					
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
					
	