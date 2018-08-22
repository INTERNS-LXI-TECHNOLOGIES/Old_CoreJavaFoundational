package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Lion;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Tiger;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Deer;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Zebra;
import java.util.*;

public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animal[][] animalList;
	
	int row,column,i,j;
	
	public void setForest()
	{
		System.out.print("Enter the size of the forest:");
		row=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(row,column);
	}
	
	public void setAnimalLocation(Animal animal)
	{
		do
		{
			i=(int)(Math.random()*row);
			j=(int)(Math.random()*row);
			
			animalList=forest.getForestArea();
		}
		while(animalList[i][j]!=null);
			animalList[i][j]=animal;
	}
	
	public void setForestStatus()
	{
		try{
		for(int i=0;i<row;i++)
		{
			System.out.print("\t\t\t");
			for(int j=0;i<column;j++)
			{
				System.out.print("\t");
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
				   
				   if(animalList[i][j] instanceof Deer)
				   {
					   System.out.print("Deer");
				   }
				   
				   if(animalList[i][j] instanceof Zebra)
				   {
					   System.out.print("Zebra");
				   }
				}
				else
				{
					System.out.print("null");
				}
			}
				System.out.println("\n");

		}  
		System.out.println("\n");
		}
		catch(NullPointerException e)
		{
			System.out.println("0");
		}		

}
}	
		
		
	
