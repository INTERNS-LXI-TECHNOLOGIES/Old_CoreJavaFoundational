package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.forest.*;

import java.io.*;
import java.util.*;
abstract public class Omnivorousanimal extends Animal implements Omnivorous
{
	
	//hunting condition
	public void hunting()
	{
	int arrow=getArrow();
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)

			{
				if((Math.abs(this.getX()-i)<=getReach())&&(Math.abs(this.getY()-j)<=getReach())&&(Forest.grid[i][j]!=this)&&(Forest.grid[i][j]!=null))
				{  
					if((getStrength()>5)&&(arrow>0))
					{
						System.out.println("\n"+getName()+" hunting "+Forest.grid[i][j].getName());
						arrow--;
						if(Forest.grid[i][j].getLuck()>5)
						{
							System.out.println("\n"+Forest.grid[i][j].getName()+"\t Run away due to luck");
								//int arrow=getArrow();
					    }
						else
						{
						System.out.println("\n"+Forest.grid[i][j].getName()+"\tdead");
						Forest.grid[i][j]=null;
						}
                    }
				}
			}
		}
		
	}
	//animal attacking hunter
	public void animalattack()
	{
	int arrow=getArrow();
	int strength=getStrength();
			for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)

			{
				if((Math.abs(this.getX()-i)<=getReach())&&(Math.abs(this.getY()-j)<=getReach())&&(Forest.grid[i][j]!=this)&&(Forest.grid[i][j]!=null))
				{  
					if((arrow<0)&&(strength<4))
					{
						System.out.println("\n"+Forest.grid[i][j].getName()+"attacks"+getName()+"  "+getName()+" dead");
						Forest.grid[this.getX()][this.getY()]=null;
					}
				
				}
			}
		}	
	}
	
}