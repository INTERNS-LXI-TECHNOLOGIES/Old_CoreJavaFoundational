package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.forest.*;

import java.io.*;
import java.util.*;
abstract public class Omnivorousanimal extends Animal implements Omnivorous
{
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
						Forest.grid[i][j]=null;
					}
				
				}
			}
		}
		arrow--;
	}
	
}