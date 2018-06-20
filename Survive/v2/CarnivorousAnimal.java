import java.io.*;
import java.util.*;
public class CarnivorousAnimal extends Animal implements Carnivorous
{
public void fight()
	{
		for(int row=0;row<5;row++)
		{
			for(int column=0;column<5;column++)
			{
				
				if((Forest.grid[row][column]!=this)&&(Math.abs(this.xloc-row)<=reach)&&(Math.abs(this.yloc-column)<=reach)&&(Forest.grid[row][column]!=null))
				{
					
					if(this.strength>Forest.grid[row][column].strength)
					{
						System.out.println("\n"+Forest.grid[row][column].name+" vs "+this.name+" "+this.name+" won "+Forest.grid[row][column].name+" loss");
										
					  Forest.grid[row][column]=null;
					}
					else
					{
						System.out.println("\n"+Forest.grid[row][column].name+" vs "+this.name+" "+Forest.grid[row][column].name+" won "+this.name+" loss");
					
						Forest.grid[this.xloc][this.yloc]=null;

					}
				}
				
			}
		}
		
	}
	
	public void meatEat()
	{
		Random ran=new Random();
	
		
			for(hunger=ran.nextInt(10);hunger>5;hunger--)
			{
				roamCheck();
			}
		
		
	}
	public void roamCheck()
	{
		Random ran=new Random();
		
		
			for(strength=ran.nextInt(10);strength>5;strength--)
			{
			
				fight();
				
			}
		
		
	}
}