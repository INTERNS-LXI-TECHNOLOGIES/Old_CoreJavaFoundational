package com.lxisoft.Animalgame.forest;

import com.lxisoft.Animalgame.forest.Animal;
import com.lxisoft.Animalgame.forest.SetForest;
import java.util.*;

public class Forest
{
	private int row,column;
	Animal[][] forestArea=new Animal[100][100];
	public void setForest(int row,int column)
	{
		this.row=row;
		this.column=column;
		forestCreate();
		
	}
	public void forestCreate()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				forestArea[i][j]=null;
			}
		}
		printAnimals();
	}
	public void printAnimals()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(forestArea[i][j]);
				System.out.print("	");
			}
			System.out.println("\n");
		}
	}
		/*
	public Animals[][] getForest()
	{
		return forestArea;
	}*/
	}
	
