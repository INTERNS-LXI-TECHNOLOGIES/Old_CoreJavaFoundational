package com.lxisoft.animalGame.game.forest;
import java.util.*;
import com.lxisoft.animalGame.game.forest.Forest;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import com.lxisoft.animalGame.game.animal.carnivorous.Tiger;
import com.lxisoft.animalGame.game.animal.herbivores.Rabbit;
import com.lxisoft.animalGame.game.animal.herbivores.Deer;

import java.util.Scanner;
public class SetForest
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	public Animal[][] animalArray;
	String name;
	int count;
	//double small;
	String animalName[]=new String[10];
	public int m,n,i,j;
	double distance[]=new double[10];
	public void forestControl()
	{
		
		forest.setForestName("GAME");
		System.out.println("START "+forest.getForestName());
		
		System.out.println("ENTER THE FOREST AREA");
		m=scan.nextInt();
		n=scan.nextInt();
		forest.setForestArea(m,n);
		
	}
	
	public void animalLocation(Animal animal)
	{
		do
		{
		i=(int)(Math.random()*m);
		j=(int)(Math.random()*n);
		animalArray=forest.getForestArea();
		}
		while(animalArray[i][j]!=null);
		animalArray[i][j]=animal;
	}

	

	
	public void displayForest()
	{
		try
		{
			for (int i=0;i<m;i++)
			{
				//System.out.print("\t");
				for(int j=0;j<n;j++)
				{
						if(animalArray[i][j] != null)
						{
							if(animalArray[i][j] instanceof Lion)
							{
									System.out.print("LION");
							}
							if(animalArray[i][j] instanceof Tiger)
							{
									System.out.print("TIGER");
							}
							if(animalArray[i][j] instanceof Rabbit)
							{
									System.out.print("RABBIT");
							}
							if(animalArray[i][j] instanceof Deer)
							{
									System.out.print("DEER");
							}
				//System.out.print(animalArray[i][j]+"\t");
						}	
						else
						{
								System.out.print("null");
						}
							System.out.print("\t");
				}
					
					System.out.print("\n");
			}
		}
		catch(NullPointerException e)
		{
			System.out.print("0");
		}
	}		
		public void forestStatus()
		{
		for (int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(animalArray[i][j]+"\t");
			
				}
			System.out.print("\n");
			}
		}
		
		public String nameArray(Animal animal)
		{
			
			if(animal instanceof Lion)
			{
				name= "LION";
			}
			if(animal instanceof Tiger)
			{
				name= "TIGER";
			}
		
			if(animal instanceof Rabbit)
			{
				name= "RABBIT";
			}
			if(animal instanceof Deer)
			{
				name= "DEER";
			}
			return name;
		}
		
		
		public void animalDistance(int p,int q)
		{
			int height,length;
			count=1;
			for (int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
					
				{
					
						if(animalArray[i][j]!=null)
						{

							 animalName[count]=nameArray(animalArray[i][j]);
							height=i-p;
							length=j-q;
							distance[count]=Math.sqrt((height*height)+(length*length));
							System.out.println("DISTANCE OF "+count+  animalName[count]+"\t" +distance[count]);
							//System.out.print(animalArray[i][j]);
							count=count+1;
						}
			
				}
			}
			
		}
		
		
		
		public double shortestDistance()
		{
			for(i=1;i<count;i++)
			{
				System.out.println("distance of "+count+" "+distance[i]);
			}
			int num=1;
			double small=distance[1];
			for(num=2;num<count;num++)
			{
				if(distance[num]<small)
				{
					small=distance[num];
					num=count+1;
					
				}
				/*else
				{
					small=distance[num+1];
					//System.out.println(small);
				}*/
		
			}
			System.out.println("NEAREST IS " +small);
			return small;
			
		}

		
		
}