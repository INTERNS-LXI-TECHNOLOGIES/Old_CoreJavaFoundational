package com.lxisoft.animalgame.game;

import com.lxisoft.animalgame.game.Game;
import com.lxisoft.animalgame.forest.SetForest;
import java.util.Arrays;


public class SortDistance 
{
	double result;
	SetForest setforest = new SetForest();
  public void sortDistance()
  {
   double[] distArray = {setforest.space[0],setforest.space[1],setforest.space[2],setforest.space[3],setforest.space[4]};
   Arrays.sort(distArray);
   for (int i = 0; i < distArray.length; i++) 
   {
    distArray[i] = result;
   }
}
}
