package com.lxisoft.animalgame.animaltype;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.forest.*;
import com.lxisoft.animalgame.exception.*;

import java.io.*;
import java.util.*;
public class CarnivorousAnimal extends Animal implements Carnivorous
{
public void fight() throws MyException
{
	
		for(int row=0;row<5;row++)
		{
			for(int column=0;column<5;column++)
			{
				if(Forest.grid[row][column]!=null)
					throw new MyException();
				if((Forest.grid[row][column]!=this)&&(Math.abs(this.getXloc()-row)<=getReach())&&(Math.abs(this.getYloc()-column)<=getReach()))
				{
					
					if(this.getStrength()>Forest.grid[row][column].getStrength())
					{
						System.out.println("\n"+Forest.grid[row][column].getName()+" vs "+this.getName()+" "+this.getName()+" won "+Forest.grid[row][column].getName()+" loss");
										if(Forest.grid[row][column] instanceof Herbivorous)
					  Forest.grid[row][column]=null;
					}
					else
					{
						System.out.println("\n"+Forest.grid[row][column].getName()+" vs "+this.getName()+" "+Forest.grid[row][column].getName()+" won "+this.getName()+" loss");
					
						Forest.grid[this.getXloc()][this.getYloc()]=null;

					}
				}
				
			}
		}
		
	}
	
	public void meatEat()
	{
		Random ran=new Random();
	
		
			if(getHunger()>5)
			{
				roamCheck();
			}
		
		
	}
	public void roamCheck()
	{
		Random ran=new Random();
		
		
			if(getStrength()>5)
			{
			//throw new MyException();
				fight();
				
			}
		}
	
	}
	
}