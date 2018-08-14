import java.io.*;
import java.util.Random;
import java.util.*;
public class Animal
{
	String name;
	int strength;
	int reach;
	int hunger;
	boolean carnivorous;
	
	Random ran=new Random();
	
	int xloc,yloc;
	public void findloc()
	{
		do{
			xloc=ran.nextInt(5);
			yloc=ran.nextInt(5);
		}while(Forest.grid[xloc][yloc]!=null);
	Forest.grid[xloc][yloc]=this;
	}
	
	
	public void fight()
	{
	
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((Forest.grid[i][j]!=this)&&(Math.abs(this.xloc-i)<=reach)&&(Math.abs(this.yloc-j)<=reach)&&(Forest.grid[i][j]!=null))
				{
					
					if(this.strength>Forest.grid[i][j].strength)
					{
						System.out.println(Forest.grid[i][j].name+" vs "+this.name+" "+this.name+" won");
						Forest.grid[i][j]=null;
						
					}
					else
					{
						System.out.println(Forest.grid[i][j].name+" vs "+this.name+" "+Forest.grid[i][j].name+" won");
						Forest.grid[this.xloc][this.yloc]=null;
					}
				}
			}
		}
	
				
	}
	
	
}