package com.lxisoft.animalgame.animaltype;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.forest.*;
//import com.lxisoft.animalgame.exception.*;

import java.io.*;
import java.util.*;
abstract public class CarnivorousAnimal extends Animal implements Carnivorous
{
public void fight()// throws MyException
{
	
	
		for(int row=0;row<5;row++)
		{
			
			for(int column=0;column<5;column++)
			{
				//if()
				//{	
				if((Forest.grid[row][column]!=this)&&(Math.abs(this.getXloc()-row)<=getReach())&&(Math.abs(this.getYloc()-column)<=getReach())&&(Forest.grid[row][column]!=null))
				{
					if((this instanceof Carnivorous)&&(Forest.grid[row][column] instanceof Herbivorous))
				
					if((this.getStrength()>Forest.grid[row][column].getStrength()))
					{
						System.out.println("\n<<Strength of "+Forest.grid[row][column].getName()+" is "+Forest.grid[row][column].getStrength()+"\n\n"+"Strength of "+this.getName()+" is "+this.getStrength());
						System.out.println("\n"+Forest.grid[row][column].getName()+" Luck is "+Forest.grid[row][column].getLuck());	
						System.out.println("\n"+this.getName()+" vs "+Forest.grid[row][column].getName());
						
							if(Forest.grid[row][column].getLuck()<5)
							{
						    
							System.out.println("\n"+this.getName()+" won  "+Forest.grid[row][column].getName()+" loss>>");
							Forest.grid[row][column]=null;
							}
							else
							{
								System.out.println("\n"+Forest.grid[row][column].getName()+" Run away due to Luck>>");
							}
						
						
					}
					}
					}
					/*else{
						System.out.println("It is not Carnivorous");
					}*/
				
			//}
				
			}
		}
		
	
	
	public void meatEat()// throws MyException
	{
		Random ran=new Random();
	
		
			if(getHunger()<5)
			{
				roamCheck();
				
			}
		
		
	}
	public void roamCheck() //throws MyException
	{
				
		Random ran=new Random();
		
		
			if(getStrength()>5)
			{

				fight();
				
			}
	}
	
	
	
}