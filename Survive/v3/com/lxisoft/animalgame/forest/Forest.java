package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animaltype.*;
import com.lxisoft.animalgame.exception.*;

import java.io.*;
public class Forest
{
	public static Animal[][] grid=new Animal[30][30];
	private static Lion[] ln=new Lion[10];
	private static Tiger[] tr=new Tiger[10];
	private static Rabbit[] rt=new Rabbit[10];
	private static Deer[] dr=new Deer[10];
	public static Hunter[] hr=new Hunter[5];
	
	public Forest(int lio,int tig,int rab,int der,int hun) throws MyException
	{
		for(int row=0;row<5;row++)
		{
			for(int column=0;column<5;column++)
			{
				grid[row][column]=null;
			}
		}
		for(int li=0;li<lio;li++)
		{
			ln[li]=new Lion(li);
		}
		for(int ti=0;ti<tig;ti++)
		{
			tr[ti]=new Tiger(ti);
		}
		for(int ra=0;ra<rab;ra++)
		{
			rt[ra]=new Rabbit(ra);
		}
		for(int de=0;de<der;de++)
		{
			dr[de]=new Deer(de);
		}
		for(int hu=0;hu<hun;hu++)
		{
			hr[hu]=new Hunter(hu);
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
						System.out.print("\t"+grid[row][column].getName()+"\t"); 
					count++;
					}
					else
						//System.out.println("position of null%d"+grid[this.getXloc()][this.getYloc()]);
						System.out.print("\t0\t"); 
					
				}
				System.out.println("\n\n\n");
			}
				System.out.println("Hunter");
				System.out.println("Number of Animals "+((count)-2));
			
		}
	public void finalOutput()
	{
			
		for(int li=0;li<6;li++)
		{
			
			ln[li].meatEat();
			
			   
		}
		for(int ti=0;ti<5;ti++)
		{
			
			tr[ti].meatEat();	
			
		}
			System.out.println("\n\n\n\n");
			outputGrid();
	}
	public void animalEat()
	{	
		for(int ra=0;ra<4;ra++)
		{
			rt[ra].grassEat();
			
		}
		for(int de=0;de<3;de++)
		{
			dr[de].grassEat();
			
		}
		
	}
	public void luckRun()
	{
		for(int ra=0;ra<4;ra++)
		{
			rt[ra].luck();
		}
		for(int de=0;de<3;de++)
		{
			dr[de].luck();
		}
	}
	public void animalSleep()
	{
		for(int li=0;li<6;li++)
		{
			ln[li].sleep();
		}
		for(int ti=0;ti<5;ti++)
		{
			tr[ti].sleep();
		}
		for(int ra=0;ra<4;ra++)
		{
			rt[ra].sleep();
		}
		for(int de=0;de<3;de++)
		{
			dr[de].sleep();
		}
		for(int hu=0;hu<1;hu++)
		{
			hr[hu].sleep();
		}
	}
	public void huntingOutput()
	{
		
		for(int hu=0;hu<1;hu++)
		{
			hr[hu].hunting();
			
		}
	}
			
	
}