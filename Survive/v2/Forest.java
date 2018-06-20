import java.io.*;
public class Forest
{
	public static Animal[][] grid=new Animal[5][5];
	Lion[] ln=new Lion[5];
	Tiger[] tr=new Tiger[6];
	Rabbit[] rt=new Rabbit[5];
	Deer[] dr=new Deer[4];
	public Forest()
	{
		for(int row=0;row<5;row++)
		{
			for(int column=0;column<5;column++)
			{
				grid[row][column]=null;
			}
		}
		for(int li=0;li<5;li++)
		{
			ln[li]=new Lion(li);
		}
		for(int ti=0;ti<6;ti++)
		{
			tr[ti]=new Tiger(ti);
		}
		for(int ra=0;ra<5;ra++)
		{
			rt[ra]=new Rabbit(ra);
		}
		for(int de=0;de<4;de++)
		{
			dr[de]=new Deer(de);
		}
		
		outputGrid();
	}
	public void outputGrid()
		{
			int count=0;
			for(int row=0;row<5;row++)
			{
				for(int column=0;column<5;column++)
				{
					if(grid[row][column]!=null)
					{
						System.out.print("\t"+grid[row][column].name+"\t"); 
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
			
		for(int li=0;li<5;li++)
		{
			
			ln[li].roamCheck();
			   
		}
		for(int ti=0;ti<6;ti++)
		{
			
			tr[ti].roamCheck();	
			
		}
			System.out.println("\n\n\n\n");
			outputGrid();
	}
	public void finalOutput1()
	{	
		for(int ra=0;ra<5;ra++)
		{
			rt[ra].grassEat();
		}
		for(int de=0;de<4;de++)
		{
			dr[de].grassEat();
		}
		
	}
			
	
}