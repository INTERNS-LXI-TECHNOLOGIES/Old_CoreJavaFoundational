package com.lxisoft.animalGame.forest;
import com.lxisoft.animalGame.animal.*;
import com.lxisoft.animalGame.supporting_class.*;
import java.io.*;
import java.util.Random;
public class Forest
{
		Random ran=new Random();
		public static Animal[][] grid=new Animal[10][10];
		public static Zebra[] z=new Zebra[10];
		public static Rabbit[] r=new Rabbit[10];
		public static Tiger[] t=new Tiger[10];
		public static Hunter[] h=new Hunter[10];
		public static Animal n;
		public HerbiAnimal h=new HerbiAnimal();
		int flag=0,xloc,yloc;
public Forest(int zebra_count,int tiger_count,int rabbit_count,int hunter_count)
{
///Animal grid presetter///
	for(int i=0;i<7;i++){
	for(int j=0;j<7;j++)
	{ 
	grid[i][j]=null;
	}
	}
///Animal grid setter///
	for(int i=0;i<zebra_count;i++)
	{
	z[i]=new Zebra(i);
	findloc(z[i]);	
	}
	for(int i=0;i<rabbit_count;i++)
	{
	r[i]=new Rabbit(i);
	findloc(r[i]);
	}
	for(int i=0;i<tiger_count;i++)
	{
	t[i]=new Tiger(i);
	findloc(t[i]);
	}
	for(int i=0;i<hunter_count;i++)
	{
	h[i]=new Hunter(i);
	findloc(h[i]);
	}

	
///inputed animal grid caller///
outputGrid();


///instance provider///
	for(int i=0;i<7;i++)
	{
	instanceFinder(z[i]);
	instanceFinder(r[i]);
	instanceFinder(t[i]);
	instanceFinder(h[i]);
	}
}

///Roam checker///
	public boolean roamCheck(Animal b)
		{
			if ((b.getStrength()>5) && (b.getHunger()>5))
			{
			return true;
			}
			else
			return false;
		}
	
///Grid location setter///
	public void findloc(Animal a)
		{
			do{
			a.setXloc(ran.nextInt(7));
			a.setYloc(ran.nextInt(7));
			}
			while(grid[a.getXloc()][a.getYloc()]!=null);
			grid[a.getXloc()][a.getYloc()]=a;
		}
///instance finder for animals///
	public void instanceFinder(Animal d)
		{
			if(d instanceof CarniAnimal)
			fight(d);
			else
			h.eatGrass(d);
		}
			
	
///fight function///	
		
	public void fight(Animal ani)
		{
			for(int i=0;i<7;i++)
			{
				for(int j=0;j<7;j++)
				{	
					if((roamCheck(ani)&&grid[i][j]!=ani)&&(Math.abs(ani.getXloc()-i)<=ani.getReach())&&(Math.abs(ani.getYloc()-j)<=ani.getReach())&&(grid[i][j]!=null)&&grid[ani.getXloc()][ani.getYloc()]!=null){
					if(ani.getStrength()>grid[i][j].getStrength())
					{
					System.out.println(grid[i][j].getName()+" vs "+ani.getName()+" "+ani.getName()+" survived");
					grid[i][j]=null;
					}
					else{
					System.out.println(grid[i][j].getName()+" vs "+ani.getName()+"  "+grid[i][j].getName()+" survived");
					grid[ani.getXloc()][ani.getYloc()]=null;
					}
				}
			}
			}
		}
	
///orinter function///
	public void outputGrid()
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(this.grid[i][j]!=null)
				{System.out.print("\t"+this.grid[i][j].getName()+"  ");
				flag++;}
				
			else 
			System.out.print("\t0\t");
		}
		System.out.println("\n\n\n");
		
		}
	
	}
///Survival counter///	
	public void animalSurvived()
	{
		int survived=Math.abs(15-flag);
		System.out.println("Total Animal count is : 15\n Hunters present is 1\n");
		System.out.println("Animal Survived is :"+survived);
	}

}

	
