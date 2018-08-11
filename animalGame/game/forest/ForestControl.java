package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.animal.Animal;
import java.util.*;
public class ForestControl
{
	Scanner scan=new  Scanner(System.in);
	Forest forest=new Forest();
	Animal[][] animalArray;
	int n1,n2,i,j;
   void setForest()
	{
		System.out.println("Enter the size of forest");
		n1=scan.nextInt();
		n2=scan.nextInt();
		forest.setForestArea(n1,n2);

	}
	
	public void setAnimalLocation(Animal animal)
	{
		i=(int)(Math.random()*n1);
		j=(int)(Math.random()*n2);
		animalArray=forest.getForestArea();
		animalArray[i][j]=animal;
		
	}
	
	
	
}