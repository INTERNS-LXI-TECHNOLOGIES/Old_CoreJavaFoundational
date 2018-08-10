package com.lxisoft.animalGame.game.forest;
public class Forest
{
	String forestName;
	int[][] forestArea=new int[50][50];
	
	
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
		forestArea[i][j]=0;
		    }
		}
	}
	
	public int[][] getForestArea()
	{
		return forestArea;
	}
	
	
	
}
