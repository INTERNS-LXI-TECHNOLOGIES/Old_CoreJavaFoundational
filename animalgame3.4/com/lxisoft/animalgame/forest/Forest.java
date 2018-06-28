package com.lxisoft.animalgame.forest;
//import com.lxisoft.animalgame.hunter.*;
import com.lxisoft.animalgame.type.*;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
public class Forest
{
	public static Animal[][] grid=new Animal[20][20];
	Lion[] ln=new Lion[10];
	Rabbit[] rt=new Rabbit[10];
	Tiger[] tr=new Tiger[10];
	Deer[] dr=new Deer[10];
	Hunter[] hr=new Hunter[5];
	int i,j;
	public Forest(int lio,int rab,int tig,int der,int hun)
	{ //initial array
		for(i=0;i<6;i++)
		{	
			for(j=0;j<6;j++)
			{
				grid[i][j]=null;
			}	
		}
		//animal spacing
		for (i=0;i<lio;i++)
			{
				ln[i]=new Lion(i);
			}
		for (i=0;i<rab;i++)
			{
				rt[i]=new Rabbit(i);
			}
		for (i=0;i<tig;i++)
			{
				tr[i]=new Tiger(i);
			}
		for (i=0;i<der;i++)
			{
				dr[i]=new Deer(i);
			}
		for(i=0;i<hun;i++)
			{
				hr[i]=new Hunter(i);
			}
		outputGrid();
	}	
	public void outputGrid()
	{
		int count=0;
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				if(grid[i][j]!=null)
				{
					System.out.print("\t"+grid[i][j].getName()+"\t");
					count++;
				}
				else
				{
					System.out.print("\t0\t");
				}
			}
			System.out.print("\n\n\n");
		}
		System.out.println("Number of Animals:"+((count)-1));
	}
	public void animalsleepState()
	{
		for(i=0;i<5;i++)
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
		for(i=0;i<1;i++)
		{
			hr[i].animalsleep();
		}
		
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
		for(int i=0;i<5;i++)
			{
				rt[i].grasseat();
			}
		for(int i=0;i<4;i++)
			{
				dr[i].grasseat();
			}
	}
	public void luckState() 
	{
		for(int i=0;i<5;i++)
			{
				rt[i].luck();
			}
		for(int i=0;i<4;i++)
			{
				dr[i].luck();
			}
	}
	
	public void huntingState()
	{
	for(i=0;i<1;i++)
	{
		hr[i].hunting();
	}
	}

}