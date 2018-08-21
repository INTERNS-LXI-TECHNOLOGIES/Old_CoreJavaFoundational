package com.lxisoft.animalgame.forest;

import com.lxisoft.animalgame.forest.animals.Animal;
import java.util.*;

public class Forest
{
	
	Animal[][] forestGrid = new Animal[8][8];
	
	
	public void setforestGrid(int row,int column)
	{
		
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<column;j++)
			{
				
				forestGrid[i][j]=null;
				
			}
			
		}
		
	}

	public Animal[][] getforestGrid()
	{
		return forestGrid;
			
	}
	
	
}

	
	
		
	 