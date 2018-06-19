import java.io.*;
import java.util.Random;

public class Animal
{
	String name;
	int strength;
	int reach;
	int hunger;
	Random ran=new Random();
	int xloc,yloc;
	public void findloc()
	{
		do
		{
			xloc=ran.nextInt(5);
			yloc=ran.nextInt(5);
		}
		while(Forest.grid[xloc][yloc]!=null);
		
		Forest.grid[xloc][yloc]=this;
	}
}