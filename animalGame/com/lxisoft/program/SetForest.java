package com.lxisoft.program;
import java.util.*;


public class SetForest
{
	private int row,column;
	Animal[][] animalGrid=new Animal[40][40];

	public void forestDimension()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter GRID size");
		row=in.nextInt();
		column=in.nextInt();
		createForest(row,column);
	}
	public void createForest(int row,int column)
	{

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				animalGrid[i][j]=null;

			}
		}
	}
}