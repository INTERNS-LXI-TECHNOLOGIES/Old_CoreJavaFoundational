package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import java.util.*;
import java.io.*;
public class Forest
{
	Animals[][] forestArea=new Animals[100][100];

	public void setForestArea(int row, int column)
	{
		for (int i=1;i<=row;i++)
		{
			for (int j=1;j<=column;j++)
			{
				forestArea[i][j]=null;
			}	
		}
	}

	public Animals[][] getForestArea()
	{
		return forestArea;
	}

}

