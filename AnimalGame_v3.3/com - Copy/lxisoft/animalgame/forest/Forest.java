package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animalproperty.Animal;
import com.lxisoft.animalgame.animals.Lion;
import com.lxisoft.animalgame.animals.Tiger;
import com.lxisoft.animalgame.animals.Deer;
import com.lxisoft.animalgame.animals.Zebra;
import com.lxisoft.animalgame.types.Carnivores;
import com.lxisoft.animalgame.types.Herbivores;
import java.util.Random;
import java.util.ArrayList;
public class Forest 
{
	int m,ded=0,alive=0;
	private Animal[][] animalPositions = new Animal[10][10];
	private ArrayList<Lion> L = new ArrayList<Lion>();
	private ArrayList<Tiger> T = new ArrayList<Tiger>();
	private ArrayList<Deer> D = new ArrayList<Deer>();
	private ArrayList<Zebra> Z = new ArrayList<Zebra>();
	Random rand = new Random();
	public Forest(int i,int j,int k,int l)
	{
		
		for(m=0; m<l; m++)
		{
			L.add(new Lion(rand.nextInt(10),rand.nextInt(10), 5));
			alive++;
		}
		
		for(m=0; m<j; m++)
		{
			T.add(new Tiger(rand.nextInt(10),rand.nextInt(10), 4));
			alive++;
		}
		
		for(m=0; m<k; m++)
		{
			D.add(new Deer(rand.nextInt(10),rand.nextInt(10), 2));
			alive++;
		}
		
		for(m=0; m<l; m++)
		{
			Z.add(new Zebra(rand.nextInt(10),rand.nextInt(10), 3));
			alive++;
		}
	
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
				animalPositions[i][j]=null;
			
	}
	void AnimalPlacement(Animal a) 
	{	int x,y;		
		do
		{
			x=rand.nextInt(10);
			y=rand.nextInt(10);
		}
		while(animalPositions[x][y]!=null);
		animalPositions[x][y]=a;
		a.setLocation(x,y);
	}
	public Animal[][] AnimalPos()
	{
		for(m=1;m<L.size();m++) 
			AnimalPlacement(L.get(m));
		for(m=1;m<D.size();m++) 
			AnimalPlacement(D.get(m));
		for(m=1;m<T.size();m++) 
			AnimalPlacement(T.get(m));
		for(m=1;m<Z.size();m++) 
			AnimalPlacement(Z.get(m));
		return animalPositions;	
	}
	public Animal[][] fight(Animal[][] a)
	{	
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(a[i][j] instanceof Carnivores && a[i][j].isHungry() && a[i][j].isStrong())
					a = a[i][j].fightOff(a[i][j],a);
			}
		}
		return a;
	}
	public void AnimalPresence(Animal[][] Location)
	{	int x=0;
		for(int i=0;i<10;i++) 
		{
			for(int j=0;j<10;j++)
				if(Location[i][j]!=null)
				{
					System.out.print(Location[i][j].getname1()+"\t ");
					x++;
				}
				else 
					System.out.print("0\t ");
			System.out.println();
		}
		System.out.println("\n\n");
	}	
}