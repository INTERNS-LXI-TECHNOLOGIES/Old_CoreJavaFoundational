package com.lxisoft.animalgame.animaltype;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
abstract public class OminivorousAnimal extends Animal implements Ominivorous
{
	public void hunting()
	{
		
	
	
		for(int row=0;row<5;row++)
		{
			if((Math.abs(this.getXloc()-row)<=getArrow()))
			for(int column=0;column<5;column++)
			{
				
				if((Math.abs(this.getXloc()-row)<=getReach())&&(Math.abs(this.getYloc()-column)<=getReach()))
					if((Forest.grid[row][column]!=this)&&(Forest.grid[row][column]!=null))
						
					
					{
						System.out.println("\n"+getName()+" Hunting"+Forest.grid[row][column].getName()+" "+getName()+" finished the "+Forest.grid[row][column].getName());
							Forest.grid[row][column]=null;	
							//arrow--;
					 
					}
					
			}
			
		}
				
		
	}
}