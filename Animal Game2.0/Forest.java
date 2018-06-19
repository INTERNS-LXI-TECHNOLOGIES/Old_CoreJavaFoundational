import java.io.*;
import java.util.*;
public class Forest
{
	public static Animal[][] grid=new Animal[5][5];
	Lion[] ln=new Lion[5];
	Rabbit[] rt=new Rabbit[5];
	int i,j;
	public Forest()
	{
		for(i=0;i<5;i++)
		{	
			for(j=0;j<5;j++)
			{
				grid[i][j]=null;
				
			}	
			
		}
			for (i=0;i<3;i++)
			{
				ln[i]=new Lion(i);
			}
			for (i=0;i<5;i++)
			{
				rt[i]=new Rabbit(i);
			}
			
		outputGrid();
	
		
	
	}	
	public void outputGrid()
	{
		
		for(int i=0;i<5;i++)
			{
				ln[i].roamcheck();
			}
		System.out.println("\n\t\t\t\t\t FINAL STATUS\t\t\t\t\n");
				
		outputGrid();
	}
}