package com.lxisoft.animalgame.type;
import com.lxisoft.animalgame.forest.*;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.exception.*;
import java.io.*;
import java.util.*;
public class Carnivorousanimal extends Animal implements Carnivorous
{
	public  void fight()// throws Exception1
	{   
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				try
					{
				if(Forest.grid[i][j]==null)
						
					throw new Exception1();
					

				if((Forest.grid[i][j]!=this)&&(Math.abs(this.getX()-i)<=getreach())&&(Math.abs(this.getY()-j)<=getreach()))
				{  
					if(this.getstrength()>Forest.grid[i][j].getstrength())
					{
						System.out.println("\n"+Forest.grid[i][j].getname()+" vs "+this.getname()+" "+this.getname()+" WON "+Forest.grid[i][j].getname()+"\tLoss");
						Forest.grid[i][j]=null;				
					}
				else 
				{
					System.out.println("\n"+Forest.grid[i][j].getname()+" vs "+this.getname()+" "+Forest.grid[i][j].getname()+" WON"+this.getname()+"\tLoss");
					Forest.grid[this.getX()][this.getY()]=null;
				}
				}
					}	
			catch(Exception1 e1)
					{
						System.out.println(e1);
					}					
					
			}
		}
	}
	public void meateat() 
	{
		Random ran=new Random();
		sethunger(ran.nextInt(10));
		if(gethunger()>6)
		{
			roamcheck();
		}
	}
	public void roamcheck () //throws Exception1
	{
		Random ran=new Random();
		setstrength(ran.nextInt(10));
		if(getstrength()>5)
		{
			fight();	
		}
	}
}