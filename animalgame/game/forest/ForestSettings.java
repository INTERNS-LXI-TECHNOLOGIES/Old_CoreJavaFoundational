package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animals.Animals;

import java.util.*;
public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animals[][] animalList;
	int row,column,i,j;

	public void setForest()
	{
		System.out.print("Enter the size of the forest: ");
		row=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(row,column);
	}

	public void setAnimalLocation(Animals animal)
	{
	
		do
		{
			/*i=row;
			j=column;*/
			i=(int)(Math.random()*row)+1;
			j=(int)(Math.random()*column)+1;
	
			animalList=forest.getForestArea();
		}
		while(animalList[i][j]!=null);
			animalList[i][j]=animal;
	}

	public void setForestStatus()
	{
		for(int i=1;i<=row;i++)
		{
			for (int j=1;j<=column;j++)
		    {
				System.out.print(animalList[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}

}