package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.forest.Forest;
import com.lxisoft.animalGame.game.animal.Animal;

import java.util.Scanner;
public class SetForest
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animal[][] animalArray;
	int m,n,i,j;
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
		i=(int)(Math.random()*m);
		j=(int)(Math.random()*n);
		animalArray=forest.getForestArea();
		animalArray[i][j]=animal;
	}

	
	public void ForestStatus()
	{
		for (int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(animalArray[i][j]);
			
			}
		}
	}
}