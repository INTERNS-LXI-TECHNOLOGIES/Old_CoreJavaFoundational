import java.io.*;
import java.util.*;
public class Carnivorousanimal extends Animal implements Carnivorous
{
	public  void fight()
	{
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				
				if((Forest.grid[i][j]!=this)&&(Math.abs(this.xloc-i)<=reach)&&(Math.abs(this.yloc-j)<=reach)&&(Forest.grid[i][j]!=null))
				{
					if(this.strength>Forest.grid[i][j].strength)
					{
						System.out.println("\n"+Forest.grid[i][j].name+" vs "+this.name+" "+this.name+" WON "+Forest.grid[i][j].name+"\tLoss");
						Forest.grid[i][j]=null;				
					
					}
					else 
					{
					System.out.println("\n"+Forest.grid[i][j].name+" vs "+this.name+" "+Forest.grid[i][j].name+" WON"+this.name+"\tLoss");
					Forest.grid[this.xloc][this.yloc]=null;
					}
				}
				
			}
		}
		
	}
	public void meateat()
	{
		
		
			for(hunger=ran.nextInt(10);(hunger>6);hunger--)
			{
				roamcheck();
			}
		
	}
	public void roamcheck()
	{
		
		
			for(strength=ran.nextInt(10);(strength>5);strength--)
			{
			
				fight();	
			}
		
	}

}