package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.lion.Lion;
import com.lxisoft.animalgame.game.forest.animals.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.game.forest.animals.herbivores.elephant.Elephant;
import com.lxisoft.animalgame.game.forest.animals.herbivores.deer.Deer;
import java.util.*;
public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
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
		try
		{
			for(i=1;i<=row;i++)
			{
				for (j=1;j<=column;j++)
			    {
			    	if(animalList[i][j]!=null)
			    	{
			    		if(animalList[i][j] instanceof Lion)
			    		{
			    			System.out.print("Lion");
			    		}

			    		if(animalList[i][j] instanceof Tiger)
			    		{
			    			System.out.print("Tiger");
			    		}

			    		if(animalList[i][j] instanceof Elephant)
			    		{
			    			System.out.print("Elephant");
			    		}

			    		if(animalList[i][j] instanceof Deer)
			    		{
			    			System.out.print("Deer");
			    		}
			    	}
					
					else
					{
						System.out.print("null");
					}
					System.out.print("\t");
				}
				System.out.println("\n");
			}
		}

		catch(NullPointerException e)
		{
			System.out.println("0");
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
			try
			{
				for (i=1;i<=row;i++)
				{
					for(j=1;j<=column;j++)
					{
						if(animalList[i][j]!=null)
							if(animalList[i][j] instanceof Lion)
							{
								System.out.println("Chosen Animal: Lion");
								System.out.println("Location: ("+i+","+j+")");
							}
					}
				}
				
			}

			catch(Exception lionLocation)
			{
				System.out.println("Invalid loaction");
			}
			break;


			case 2:
			try
			{
				for (i=1;i<=row;i++)
				{
					for(j=1;j<=column;j++)
					{
						if(animalList[i][j]!=null)
							if(animalList[i][j] instanceof Tiger)
							{
								System.out.println("Chosen Animal: Tiger");
								System.out.println("Location: ("+i+","+j+")");
							}
					}
				}
				
			}

			catch(Exception loc)
			{
				System.out.println("Invalid loaction");
			}
			break;


			case 3:
			try
			{
				for (i=1;i<=row;i++)
				{
					for(j=1;j<=column;j++)
					{
						if(animalList[i][j]!=null)
							if(animalList[i][j] instanceof Elephant)
							{
								System.out.println("Chosen Animal: Elephant");
								System.out.println("Location: ("+i+","+j+")");
							}
					}
				}
				
			}

			catch(Exception tigerLocation)
			{
				System.out.println("Invalid loaction");
			}
			break;


			case 4:
			try
			{
				for (i=1;i<=row;i++)
				{
					for(j=1;j<=column;j++)
					{
						if(animalList[i][j]!=null)
							if(animalList[i][j] instanceof Deer)
							{
								System.out.println("Chosen Animal: Deer");
								System.out.println("Location: ("+i+","+j+")");
							}
					}
				}
				
			}

			catch(Exception loc)
			{
				System.out.println("Invalid loaction");
			}
			break;


			default:
				System.out.println("Invalid Choice");
			break;		
		}
	}
}