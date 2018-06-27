package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.forest.*;
import com.lxisoft.animalgame.animal.*;
//import com.lxisoft.animalgame.exception.*;
import java.io.*;
import java.util.*;
abstract public class Carnivorousanimal extends Animal implements Carnivorous
{
	public  void fight()
	{   
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)

			{
				if((Forest.grid[i][j]!=this)&&(Math.abs(this.getX()-i)<=getreach())&&(Math.abs(this.getY()-j)<=getreach())&&(Forest.grid[i][j]!=null))
				{  
					if(this.getstrength()>Forest.grid[i][j].getstrength())
					{
						System.out.println("\n"+Forest.grid[i][j].getname()+" vs "+this.getname()+" "+this.getname()+" WON "+Forest.grid[i][j].getname()+" Loss");
						Forest.grid[i][j]=null;				
					}
				else 
				{
					System.out.println("\n"+Forest.grid[i][j].getname()+" vs "+this.getname()+" "+Forest.grid[i][j].getname()+" WON"+this.getname()+"Loss");
					Forest.grid[this.getX()][this.getY()]=null;
				}
				}
			}
		}
	}
	public void meateat() 
	{
		
		if(gethunger()>6)
		{
			roamcheck();
		}
	}
	public void roamcheck ()
	{
		
		if(getstrength()>5)
		{
			fight();	
		}
	}
}