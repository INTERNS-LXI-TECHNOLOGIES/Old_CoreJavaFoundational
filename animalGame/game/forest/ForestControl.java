package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.animal.Animal;
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
				
	
}