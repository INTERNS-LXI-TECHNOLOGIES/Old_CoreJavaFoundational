package com.lxisoft.Animalgame.forest;

import com.lxisoft.Animalgame.forest.Tiger;
import com.lxisoft.Animalgame.forest.Lion;
import com.lxisoft.Animalgame.forest.Deer;
import com.lxisoft.Animalgame.forest.Rabbit;
import com.lxisoft.Animalgame.forest.Animal;
import com.lxisoft.Animalgame.forest.SetForest;
import java.util.*;
import java.lang.Math.*;

public class Forest
{
	Lion[] lion = new Lion[3];
	Rabbit[] rabbit=new Rabbit[3];
	Tiger[] tiger=new Tiger[3];
	Deer[] deer=new Deer[3]; 
    private int row,column;
	Animal[][] forestArea=new Animal[100][100];
	
	public void setForest(int row,int column)
	{
		this.row=row;
		this.column=column;
		forestCreate();
		createAnimal();
	
		
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
        printForest();	
	}
	public void printForest()
	{
		System.out.println("**Forest**");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(forestArea[i][j]);
				System.out.print("	");
			}
			System.out.println("\n");
		}
		
		createAnimal();	
		printoo();
		}
	
	public void createAnimal()
	{
		
		int k=(int)(Math.random()*3);
		//System.out.println("test1");
		for(int i=0;i<=k;i++)
		{
			lion[i]=new Lion();
			
			insertAnimals(lion[i]);
			
			
		}
		//printoo();
		
	}
	
	public  void insertAnimals(Animal a)
	{
		//System.out.println("test1");
		int i=(int)(Math.random()*3);
		int j=(int)(Math.random()*3);
		while(forestArea[i][j]==null)
		{
			//System.out.println("test123423");
			forestArea[i][j]=a;
		}
	   
	/* do
		{
			System.out.println("test1234");
	    forestArea[i][j]=a;
		}
		while(forestArea[i][j]!=null);*/
		
		//printoo();
	}
	public void printoo()
	{
	
	System.out.println("OUTPUT");
	
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
	
	
}