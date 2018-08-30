package com.lxisoft.animalGame.game.forest;
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
	Animal[][] animalArray;
	int m,n,i,j;
	double distance;
	public void ForestControl()
	{
		
		forest.setForestName("GAME");
		System.out.println("START "+forest.getForestName());
		
		System.out.println("ENTER THE FOREST AREA");
		m=scan.nextInt();
		n=scan.nextInt();
		forest.setForestArea(m,n);
		
	}
	
	public void AnimalLocation(Animal animal)
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
		//try
		//{
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
		public void ForestStatus()
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
		
		
		public void animalDistance(int p,int q)
		{
			int height,length;
			for (int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
						if(animalArray[i][j]!=null)
						{
							height=i-p;
							length=j-q;
							distance=Math.sqrt((height*height)+(length*length));
							System.out.print(distance);
							System.out.print(animalArray[i][j]);
							
						}
			
				}

			}
			
		}
		
}