import java.io.*;
import java.util.Random;
public class Forest
{
	
		public static Animal[][] grid=new Animal[5][5];
		Lion[] ln=new Lion[5];
		Tiger[] tr=new Tiger[5];
		Rabbit[] rt=new Rabbit[5];
		Deer[] dr=new Deer[5];
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
			for(i=0;i<5;i++)
			{
				ln[i]=new Lion(i);
			}
			for(i=0;i<5;i++)
			{
				tr[i]=new Tiger(i);
			}
			for(i=0;i<5;i++)
			{
				rt[i]=new Rabbit(i);
			}	
			for(i=0;i<5;i++)
			{
				dr[i]=new Deer(i);
			}
		outputGrid();
		
		
		}	
	
		
		public void outputGrid()
		{
			int count=0;
			for(i=0;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
					if(grid[i][j]!=null)
					{
						System.out.print("\t"+grid[i][j].name+"\t"); 
					count++;
					}
					else
						System.out.print("\t0\t"); 
					
				}
				System.out.println("\n\n\n");
			}
		
				System.out.println("Number of Animals "+count);
			
		}
		public void finalOutput()
		{
			
			for(i=0;i<5;i++)
		    {
				ln[i].roamCheck();
			   
			}
			for(i=0;i<5;i++)
			{
				tr[i].roamCheck();
				
			
			}
			
			outputGrid();
			
		
		}
		public void animalsWon()
		{
			
		}
		
		
}	
		
	