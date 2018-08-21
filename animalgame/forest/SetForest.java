package com.lxisoft.animalgame.forest;

import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.forest.animals.Animal;
import java.util.*;

public class SetForest
{
	Scanner scan = new Scanner(System.in);
	Forest forest = new Forest();
	Animal[][] animalArr;
	int row,column,i,j;
	
	
	public void forestControl()
	{
		
		System.out.println("Enter the grid size::");
		row = scan.nextInt();
		column = scan.nextInt();
		forest.setforestGrid(row,column);
	}
	
	public void animalLocation(Animal animal)
	{
		do
		{
		i=(int)(Math.random()*row);
		j=(int)(Math.random()*column);
		animalArr = forest.getforestGrid();
		}
		
		while(animalArr[i][j]!=null);
		animalArr[i][j]=animal;
	}
		
	public void forestInfo()
	{
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(animalArr[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}
	
}