package com.lxisoft.animalgame;
import com.lxisoft.animalgame.forest.Forest;
public class Test
    {
     public static void main(String args[])
        {
             Forest forest=new Forest();
  
             forest.initForest(8,9,12,6);
			 
			 System.out.println("\nInitial Animal placements : \n");
			 forest.whosAlive();
			 
			 forest.initRoaming();
			 
			 System.out.println("\n\n\nSurvived Animal Placements : \n");
			 forest.whosAlive();
			 
			 System.out.println("Total     : 35 Animals\nSurvived  : "+(forest.getAliveCount())+"\nDead      : "+(35-forest.getAliveCount()));			 
        }
    }