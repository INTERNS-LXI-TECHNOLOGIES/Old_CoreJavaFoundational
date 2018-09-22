package com.lxisoft.animalGamev2.forest;
import com.lxisoft.animalGamev2.animals.*;
import java.util.*;

public class Forest
{
	private String forestName;
	private Animal[][] forestArea=new Animal[50][50];
	public ArrayList<Lion> lions=new ArrayList<Lion>();
	public ArrayList<Tiger> tigers=new ArrayList<Tiger>();
	public ArrayList<Athulya> athulyas=new ArrayList<Athulya>();
	public ArrayList<Deer> deers=new ArrayList<Deer>();
	public ArrayList<Rabbit> rabbits=new ArrayList<Rabbit>();
	public ArrayList<Elephant> elephants=new ArrayList<Elephant>();
	Lion lion;
	Tiger tiger;
	Rabbit rabbit;
	Deer deer;
	Elephant elephant;
	Athulya athulya;
	
	
	public void setForestName(String name)
	{
		this.forestName=name;
	}
	
	public String getForestName()
	{
		return this.forestName;
	}
	
	
	
	
	public void setForestArea(int n1,int n2)
	{
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
		     forestArea[i][j]=null;
		    }
		}
	}
	
	public Animal[][] getForestArea()
	{
		return forestArea;
	}
	
	
	public void lionCreation(int noOflion)
	{
		for (int i=0;i<noOflion;i++)
		{   lion=new Lion();
			lions.add(lion);
			lions.get(i).setAnimalId(i);
		}
	}
	public void tigerCreation(int noOftiger)
	{
		for (int i=0;i<noOftiger;i++)
		{	tiger=new Tiger();
			tigers.add(tiger);
			tigers.get(i).setAnimalId(i);
		}
	}
	public void athulyaCreation(int noOfathulya)
	{
		for (int i=0;i<noOfathulya;i++)
		{
			athulya=new Athulya();
			athulyas.add(athulya);
			athulyas.get(i).setAnimalId(i);
		}
	}
	public void deerCreation(int noOfdeer)
	{
		for (int i=0;i<noOfdeer;i++)
		{	deer=new Deer();
			deers.add(deer);
			deers.get(i).setAnimalId(i);
			System.out.println(deers.get(i).getAnimalId());
		}
	}
	public void elephantCreation(int noOfelephant)
	{
		for (int i=0;i<noOfelephant;i++)
		{	elephant=new Elephant();
			elephants.add(elephant);
			elephants.get(i).setAnimalId(i);
		}
	}
	public void rabbitCreation(int noOfrabbit)
	{
		for (int i=0;i<noOfrabbit;i++)
		{   rabbit=new Rabbit();
			rabbits.add(rabbit);
			rabbits.get(i).setAnimalId(i);
		}
	}

	
	
}
