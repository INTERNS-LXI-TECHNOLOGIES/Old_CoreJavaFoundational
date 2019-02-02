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
			int option=selectHeroPrintMenu();
	    	Animal hero=selectHero(option);
	
		
		}
		public void forestCreate()
		{
			for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=column;j++)
				{
					forestArea[i][j]=null;
				}
			}
			forestStatus="::::::::::::::;Empty Forest::::::::::::::::";
		}
		public void printForest()
		{
		System.out.println(forestStatus);
			for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=column;j++)
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
			for(int i=1;i<=k;i++)
			{
				lion[i]=new Lion();
				lion[i].setName("Lion "+(i+1));
				insertAnimals(lion[i]);
			}
			int p=getRandomIntegerBetweenRange(2,4);
			for(int i=1;i<=p;i++)
			{
				tiger[i]=new Tiger();
				tiger[i].setName("Tiger"+(i+1));
				insertAnimals(tiger[i]);
			}
			int q=getRandomIntegerBetweenRange(2,4);
			for(int i=1;i<=q;i++)
			{
				deer[i]=new Deer();
				deer[i].setName("Deer"+i);
				insertAnimals(deer[i]);
			}
			int r=getRandomIntegerBetweenRange(2,4);	
			for(int i=1;i<=q;i++)
			{
				rabbit[i]=new Rabbit();
				rabbit[i].setName("Rabbit"+i);
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
	
		public int selectHeroPrintMenu()
		{
			int option;
			Scanner op=new Scanner(System.in);
			System.out.println("SELECT YOUR HERO:");
			int opt=1;
		    for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=column;j++)
				{
					if(forestArea[i][j]!=null)
					{
				    System.out.print(opt+".");
					System.out.println(forestArea[i][j]);
					}
					opt=opt+1;
				}
				
				
			}
			System.out.println("Option:");
				option=op.nextInt();
				return option;
			
			//int row=i;
			//int column=j;
		  
				
		}
		public Animal selectHero(int x)
		{
		int ki=0;
		for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=column;j++)
				{
					ki++;
					if(ki==x)
					{
						//System.out.println("*****************");
						Animal hero=forestArea[i][j];
						System.out.println("selected"+hero);
						return hero;
					}
				}
			}return null;
		}
		
			//for(int frow=0;frow<=row;row++)
			//{
				//for(int fcolumn=0;fcolumn<=column;column++)
				//{
					//return Animal[frow][
			/*if (x==1)
			{
				return i=0,j=0;
			}
			if(x==2)
			{
				return i=0,j=1;
			}
			if(x==3)
			{
				return i=0,j=3;
			}
			*/
		
	
	
}