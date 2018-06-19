import java.io.*;
import java.util.*;
public class Carnivorousanimal extends Animal implements Carnivorous
{
	public  void fight()
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((Forest.grid[i][j]!=this)&&(Math.abs(this.xloc-i)<=reach)&&(Math.abs(this.yloc-j)<=reach)&&(Forest.grid[i][j]!=null))
				{
					if(this.strength>Forest.grid[i][j].strength)
					{
						System.out.println(Forest.grid[i][j].name+" vs "+this.name+" "+this.name+" WON ");
						Forest.grid[i][j]=null;
					
					}
					else 
					{
						System.out.println(Forest.grid[i][j].name+" vs "+this.name+" "+Forest.grid[i][j].name+" WON");
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
			
		}
	}

}