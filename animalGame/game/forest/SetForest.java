package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.forest.Forest;

import java.util.Scanner;
public class SetForest
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forset();
	Animal[][] animalArray;
	int m,n,i,j;
	void ForestControl()
	{
		System.out.println("ENTER THE FOREST AREA");
		m=scan.nextInt();
		n=scan.nextInt();
		forest.setForestArea(m,n);
		
	}
	
	public void setAnimalLocation(Animal animal)
	{
		i=(int)(Math.random()*m);
		j=(int)(Math.random()*n);
		animalArray=forest.getAnimalLocation();
		animalArray[i][j]=animal;
	}
}