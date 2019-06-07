package com.lxisoft.animalGame.forest;

public class Rabbit extends Animal implements Herbivorous
{
   public void eat()
   {
	    System.out.println("rabbit grass eat");                                 
   }
   public void luck()
   {
	  int l=(int)(Math.random()*100);
	   
	  if(l<=50)
	  {
		  System.out.println("rabbit escape");
	  }	
      else
      {
		  System.out.println("rabbit traped");
	  }		  
   }   

	

}