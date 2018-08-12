package com.lxisoft.animalgame.forest;
//import com.lxisoft.animalgame.forest.animals.Animals;
import java.util.*;
import java.io.*;
public class Forest
{
	int i,j;
	public void forestLocation()

	{
		int row=3;
		int column=3;
		
		String[][] location=new String[row][column];
		for(i=0;i<row;i++)
        for(j=0;j<column;j++)
		location[i][j]="-";
		for(i=0;i<row;i++)
		{

			for(j=0;j<column;j++)
			{

				System.out.print(location[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
			
	}
}