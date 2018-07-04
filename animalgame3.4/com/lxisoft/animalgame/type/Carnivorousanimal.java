package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.forest.*;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
abstract public class Carnivorousanimal extends Animal implements Carnivorous
{
	//animal fighting condition
	public  void fight()
	{  
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if((Forest.grid[i][j]!=this)&&(Math.abs(this.getX()-i)<=getReach())&&(Math.abs(this.getY()-j)<=getReach())&&(Forest.grid[i][j]!=null))
				{
					if(this instanceof Carnivorous)
					{
					if((this.getStrength())>(Forest.grid[i][j].getStrength()))
					{
						System.out.println("\n"+this.getName()+" vs "+Forest.grid[i][j].getName()+"  "+this.getName()+"\t WON "+Forest.grid[i][j].getName()+"\t Loss");
						if(Forest.grid[i][j].getLuck()>5)
						{
							System.out.println("\n"+Forest.grid[i][j].getName()+"\t Run away due to luck");
						}
						else
						{
						Forest.grid[i][j]=null;
						}						
					}
				else 
				{
					System.out.println("\n"+Forest.grid[i][j].getName()+" vs "+this.getName()+"  "+Forest.grid[i][j].getName()+"\t WON"+this.getName()+"\t Loss");
					if((Forest.grid[this.getX()][this.getY()]!=null)&&(Forest.grid[this.getX()][this.getY()].getLuck()>5))
					{
						System.out.println("\n"+Forest.grid[this.getX()][this.getY()].getName()+"\t Run away due to luck");
					}
					else
					{
					Forest.grid[this.getX()][this.getY()]=null;
					
					}
				}
					}
				}
			}
			
		}
		
	}
	//meat eat condition
	public void meateat() 
	{
		if(getHunger()>6)
		{
			roamcheck();
		}
	}
	public void roamcheck ()
	{
		if(getStrength()>5)
		{
			fight();
			//count++;
			//System.out.println("number of animals dead in fight:"+c);	
		
		}
	}
}