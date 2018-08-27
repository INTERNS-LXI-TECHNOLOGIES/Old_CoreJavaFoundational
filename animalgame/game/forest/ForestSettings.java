package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Lion;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Tiger;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Deer;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Zebra;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Giraff;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Cheeta;
import java.util.*;

public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animal[][] animalList;
	String animalName;
	
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
				    if(animalList[i][j] instanceof Giraff)
				   {
					   System.out.print("Giraff");
				   }
				}
				else
				{
					System.out.print("null");
				}
			}
				System.out.println("\n");
				

		}  
		     System.out.println("Welcome to the game");
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
						System.out.println("the coordinates of  "+animalName+"\n"+i+"\n"+j);
						
					}
						
				}
			}
			
		}
		public String findAnimal(Animal animal)
		{
			if(animal instanceof Lion)
			{animalName="Lion";}
			if(animal instanceof Tiger)
			{animalName="Tiger";}
			if(animal instanceof Deer)
			{animalName="Deer";}
		    if(animal instanceof Zebra)
			{animalName="Zebra";}
		    if(animal instanceof Cheeta)
			{animalName="Cheeta";}
		    if(animal instanceof Giraff)
			{animalName="Giraff";}
		return animalName;
		}
}
		
		
	
		
		
	
