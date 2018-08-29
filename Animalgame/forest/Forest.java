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
	String forestStatus;
	Lion[] lion = new Lion[10];
	Rabbit[] rabbit=new Rabbit[10];
	Tiger[] tiger=new Tiger[10];
	Deer[] deer=new Deer[10]; 
    private int row,column;
	Animal[][] forestArea=new Animal[100][100];
	
	 public void setForest(int row,int column)
		{
			this.row=row;
			this.column=column;
			forestCreate();
			printForest();
			createAnimal();
			printForest();
	
		
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
			forestStatus="Empty Forest";
		}
		public void printForest()
		{
		System.out.println(forestStatus);
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
		public  int getRandomIntegerBetweenRange(int min, int max)
			{
				 int x = (int)(Math.random()*((max-min)+1))+min;
                 return x;
			}
	
		public void createAnimal()
		{
			

			int k=getRandomIntegerBetweenRange(2,4);
			for(int i=0;i<=k;i++)
			{
				lion[i]=new Lion();
				lion[i].setName("Lion "+(i+1));
				insertAnimals(lion[i]);
			}
			int p=getRandomIntegerBetweenRange(2,4);
			for(int i=0;i<=p;i++)
			{
				tiger[i]=new Tiger();
				tiger[i].setName("Tiger"+(i+1));
				insertAnimals(tiger[i]);
			}
			int q=getRandomIntegerBetweenRange(2,4);
			for(int i=0;i<=q;i++)
			{
				deer[i]=new Deer();
				deer[i].setName("Deer"+(i+1));
				insertAnimals(deer[i]);
			}
			int r=getRandomIntegerBetweenRange(2,4);	
			for(int i=0;i<=q;i++)
			{
				rabbit[i]=new Rabbit();
				rabbit[i].setName("Rabbit"+(i+1));
				insertAnimals(rabbit[i]);
			}
			forestStatus=":::::::::::::::::::: Forest ::::::::::::::::::::";
		}
	
		public  void insertAnimals(Animal a)
		{
		int i=(int)(Math.random()*4);
		int j=(int)(Math.random()*4);
		while(forestArea[i][j]==null)
			{
				forestArea[i][j]=a;
			}
		}
	
	
			
	
		
	}
	
	
