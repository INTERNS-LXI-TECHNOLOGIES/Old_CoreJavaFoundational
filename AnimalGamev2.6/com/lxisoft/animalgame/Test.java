/*
Test class 
executes main function
creates an object of the forest class after importing forest package
forest.initForest() method is called and passed the number of animals to be created in the forest 
forest.printForest() method prints the current status of the forest with the positions of each animal in it
forest.getAliveCount() method is the getter method associated with aliveCount variable which stores the number of animals currently alive 
*/

package com.lxisoft.animalgame;
import com.lxisoft.animalgame.forest.Forest;
public final class Test
    {
     public static void main(String args[])
        {
             Forest forest=new Forest();
  
             forest.initForest(8,9,12,6);
			 
			 System.out.println("\nInitial Animal placements : \n");
			 forest.printForest();
			 
			 forest.initRoaming();
			 
			 System.out.println("\n\n\nSurvived Animal Placements : \n");
			 forest.printForest();
			 
			 System.out.println("Total     : 35 Animals & 1 Hunter");
			 System.out.print("Survived  : "+(forest.getAliveCount())+" Animals");
			 if(forest.hunterAlive())
				 System.out.println(" & Hunter");
			 else
				 System.out.println();
			 System.out.print("Dead      : "+(35-forest.getAliveCount())+" Animals");		
			 if(!forest.hunterAlive())
				 System.out.println(" & Hunter");
        }
    }