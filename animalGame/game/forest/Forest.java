package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.animal.Animal;
import java.util.*;
public class Forest
{
private String forestName;
public Animal[][] forestArea = new Animal[10][10];

public void setForestName(String forestName)
{
	this.forestName=forestName;
		
}
public String getForestName()
{
	return forestName;
}


public void setForestArea(int m,int n)
{
	for (int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
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