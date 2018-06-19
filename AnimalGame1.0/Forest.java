import java.io.*;
import java.util.Random;
public class Forest
{	
	public static Animal[][] grid=new Animal[7][7];
	Lion ln[]=new Lion[10];
	Tiger tr[]=new Tiger[10];
	Rabbit rt[]=new Rabbit[10];
	Deer dr[]=new Deer[10];
	int i,j;
	public  Forest()
	{
		for(i=0;i<7;i++)
		{	
			for(j=0;j<7;j++)
			{
				grid[i][j]=null;
				
			}	
			
		}
			for (i=0;i<7;i++)
			{
				ln[i]=new Lion(i);
			}
			for (i=0;i<7;i++)
			{
				tr[i]= new Tiger(i);
			}
			for (i=0;i<7;i++)
			{
				rt[i]=new Rabbit(i);
			}
			for (i=0;i<7;i++)
			{
				dr[i]=new Deer(i);
			}
			
		outputGrid();
	
		
	
	}	
	public void outputGrid()
	{
		int count=0;
		for(i=0;i<7;i++)
		{
			for(j=0;j<7;j++)
			{
				if(grid[i][j]!=null)
				{
					System.out.print("\t"+grid[i][j].name+"\t");
				count++;
				}
				else
				{
					System.out.print("\t0\t");
				}
			}
			System.out.print("\n\n\n");
				
		}
		System.out.println("Number of Animals:"+count);
	}
	public void finalState()
	{
		for( int i=0;i<7;i++)
			{
			tr[i].roamcheck();
			}
		
		for(int i=0;i<7;i++)
			{
				ln[i].roamcheck();
			}
		System.out.println("\n\t\t\t\t\t FINAL STATUS\t\t\t\t\n");
				
		outputGrid();
	}
}