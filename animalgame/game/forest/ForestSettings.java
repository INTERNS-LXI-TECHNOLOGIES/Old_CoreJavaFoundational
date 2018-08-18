package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import java.util.*;
public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animals[][] animalList;
	int row,column;

	public void setForest()
	{
		System.out.print("Enter the size of the forest: ");
		row=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(row,column);
	}

	public void setAnimalLocation(Animals animal)
	{
		int i,j;
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
