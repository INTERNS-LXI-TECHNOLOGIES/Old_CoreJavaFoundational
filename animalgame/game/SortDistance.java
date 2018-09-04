package com.lxisoft.animalgame.game;

import com.lxisoft.animalgame.game.Game;
import com.lxisoft.animalgame.forest.SetForest;
import java.util.Arrays;


public class SortDistance 
 {
	SetForest setforest = new SetForest();
	public void sortDistance()
	{
	double d1=space[0];
	double d2=space[1];
	double d3=space[2];
	double d4=space[3];
	double d5=space[4];
	
   {
   double[] distArray = {d1,d2,d3,d4,d5};
   double temp;
   for (int i = 1; i < distArray.length; i++)
	{
    for (int j = i; j > 0; j--) 
		{
			if (distArray[j] < distArray [j - 1])
				{
				temp = distArray[j];
				distArray[j] = distArray[j - 1];
				distArray[j - 1] = temp;
				}
		}
	}
		for (int i = 0; i < distArray.length; i++) 
		{
		 System.out.println("Sorted distance array::" +distArray[i]);
		}
		
  }
}
 }