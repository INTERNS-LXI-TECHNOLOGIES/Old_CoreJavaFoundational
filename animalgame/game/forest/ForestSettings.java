package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import java.util.*;
public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	/*Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Elephant elephant=new Elephant();
	Deer deer=new Deer();*/
	Animals[][] animalList;
	int row,column,i,j;

	public void setForest()
	{
		System.out.print("Enter the size of the forest: ");
		row=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(row,column);
	}

	public void setAnimalLocation(Animals animal)
	{
	
		do
		{
			i=(int)(Math.random()*row)+1;
			j=(int)(Math.random()*column)+1;
	
			animalList=forest.getForestArea();
		}
		while(animalList[i][j]!=null);
			animalList[i][j]=animal;
	}

	public void setForestStatus()
	{
		for(i=1;i<=row;i++)
		{
			for (j=1;j<=column;j++)
		    {
				System.out.print(animalList[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}



	public void locateAnimal()
	{
		System.out.println("1)Lion\t\t2)Tiger\n3)Elephant\t4)Deer");
		System.out.print("Choose Animal to play: ");
		int chooseAnimal=scan.nextInt();
		switch(chooseAnimal)
		{
			case 1:
				for (i=1;i<=row;i++)
				{
					for(j=1;j<=column;j++)
					{
						if(animalList[i][j]!=null)
						System.out.println("("+i+","+j+")");
					}
				}
				System.out.println("Chosen Animal: Lion");
			break;
		}
	}
}