package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.type.*;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
public class Forest
{
	public static Animal[][] grid=new Animal[20][20];
	private Lion[] ln=new Lion[10];
	private Rabbit[] rt=new Rabbit[10];
	private Tiger[] tr=new Tiger[10];
	private Deer[] dr=new Deer[10];
	private Hunter[] hr=new Hunter[5];
	int i,j;

	public Forest(int lio,int rab,int tig,int der,int hun)
	{
		int total=lio+tig+der+rab;
		
	//initial array
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
		System.out.println("Total number of Animals:"+total+"\n"+hun+" Hunter present in the Forest");
	}	

	//output grid state 
	public void outputGrid()
	{
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				if(Forest.grid[i][j]!=null)
				{
					System.out.print("\t"+Forest.grid[i][j].getName()+"\t");
				}
				else
				{
					System.out.print("\t0\t");
				}
			}
			System.out.print("\n\n\n");
		}
	}
	//animal sleep state output
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
	//roam check state output
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
			System.out.println("\n\t\t\t\t*****SURVIVAL STATUS OF ANIMALS******\t\t\t\t\n");
			survivalStatus();
			//System.out.println("number of animals dead in fight:"+(count));
	} 
	//grass eat state output
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
	//luckstate output
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
	//hunting state output
	public void huntingState()
	{
	for(i=0;i<1;i++)
	{
		hr[i].hunting();
		hr[i].luck1();
	}
	}
	public void survivalStatus()
	{
		int count=0;
	for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				if(Forest.grid[i][j]!=null)
				{
					System.out.print("\t"+Forest.grid[i][j].getName()+"\t");
					count++;
				}
				else
				{
					System.out.print("\t0\t");
				}
				if(Forest.grid[i][j] instanceof Omnivorous)
				{
					count--;
				}
			}
			System.out.print("\n\n\n");
		}
		System.out.println("Survival status of animal:"+count);
	}
	
}