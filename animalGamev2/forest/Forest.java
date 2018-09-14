package com.lxisoft.animalGamev2.forest;
import com.lxisoft.animalGamev2.animals.Animal;

public class Forest
{
	private String forestName;
	private Animal[][] forestArea=new Animal[50][50];
	
	
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
	
	
	
}
