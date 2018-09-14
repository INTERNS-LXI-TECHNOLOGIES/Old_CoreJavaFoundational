package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.animal.Animal;
import java.util.*;
public class ForestControl
{
	Forest forest=new Forest();
	Animal[][] animalArray;
	String[] name=new String[10];
	int raw,column,animalCount;
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
		animalCount=-1; 
		String animalName;
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
}