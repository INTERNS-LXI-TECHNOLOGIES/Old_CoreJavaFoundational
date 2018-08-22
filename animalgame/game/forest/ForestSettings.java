package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import java.util.*;

public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animal[][] animalList;
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
			j=(int)(Math.random()*row);
			
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
			for(int j=0;i<column;j++)
			{
				
				System.out.print(animalList[i][j]);
				System.out.print(" ");
				
			}
			System.out.println("\n");
			
		}	
		}
		catch(Exception e)
		{
			System.out.println("");
		}		
	}
}	
		
		
	
