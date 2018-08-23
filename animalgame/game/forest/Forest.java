package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import java.util.*;

public class Forest
{
	Animal[][] forestArea=new Animal[10][10];

		public void setForestArea(int row,int column)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
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