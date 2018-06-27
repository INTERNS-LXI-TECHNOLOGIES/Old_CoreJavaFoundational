package com.lxisoft.animalgame.forest;
//import com.lxisoft.animalgame.exception.*;
import com.lxisoft.animalgame.type.*;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
public class Forest
{
	public static Animal[][] grid=new Animal[5][5];
	Lion[] ln=new Lion[5];
	Rabbit[] rt=new Rabbit[5];
	Tiger[] tr=new Tiger[5];
	Deer[] dr=new Deer[5];
	int i,j;
	public Forest()
	{ //initial array
		for(i=0;i<5;i++)
		{	
			for(j=0;j<5;j++)
			{
				grid[i][j]=null;
			}	
		}
		//animal spacing
		for (i=0;i<3;i++)
			{
				ln[i]=new Lion(i);
			}
		for (i=0;i<4;i++)
			{
				rt[i]=new Rabbit(i);
			}
		for (i=0;i<3;i++)
			{
				tr[i]=new Tiger(i);
			}
		for (i=0;i<4;i++)
			{
				dr[i]=new Deer(i);
			}
		//}
	/*catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("arraye");
			}	*/	
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
					System.out.print("\t"+grid[i][j].getname()+"\t");
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
		
		public void roamcheckState()
	{
		
			
				for(int i=0;i<3;i++)
					{
						ln[i].meateat();
					}
					
				for(int i=0;i<3;i++)
					{	
						tr[i].meateat();
					}
			System.out.println("\n\t\t\t\t\t SURVIVAL STATUS OF ANIMALS\t\t\t\t\n");
			outputGrid();
	}

	public void grasseatState() 
	{
		try
			{
			for(int i=0;i<4;i++)
				{
					rt[i].grasseat();
				}
			for(int i=0;i<4;i++)
				{
					dr[i].grasseat();
				}
					
			}
			catch(NullPointerException e)
			{
				System.out.println("Null grasseat");
			}
}
public void luckState() 
	{
			for(int i=0;i<4;i++)
				{
					rt[i].luck();
				}
			for(int i=0;i<4;i++)
				{
					dr[i].luck();
				}

			
}
public void aniamlsleepatate()
{
	for(i=0;i<4;i++)
	{
		rt[i].animalsleep();
	}
	for(i=0;i<4;i++)
	{
		dr[i].animalsleep();
	}
	for(i=0;i<3;i++)
	{
		ln[i].animalsleep();
	}
	for(i=0;i<3;i++)
	{
		tr[i].animalsleep();
	}
}

}