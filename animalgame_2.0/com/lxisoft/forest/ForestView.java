package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.*;
public class ForestView
{
	int rowCol[]=new int[2];	
	public String askName()
	{
		System.out.print("Enter Forest name: ");
		Scanner scan=new Scanner(System.in);
		return scan.nextLine();
	}

	public void printName(String name)
	{
		System.out.println("---------------Welcome to "+name+" Forest------------------");
	}

	public int[] setSize()
	{
		Scanner scan=new Scanner(System.in);
		//int[] rowCol=new int[2];
		System.out.println("Enter the no of rows : ");
		rowCol[0]=scan.nextInt();
		System.out.println("Enter the no of column : ");
		rowCol[1]=scan.nextInt();
		return rowCol;
	}


	public void printSize(int[] rowCol)
	{
		System.out.println("Row Size: "+rowCol[0]+"\nColumn Size: "+rowCol[1]);
	}

	

	public void getAnimalGrid(Forest[][] grid)
	{
		for (int i=0;i<rowCol[0];i++)
		{
			for (int j=0;j<rowCol[1];j++)
			{
			System.out.print("\t"+grid[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
	}
}