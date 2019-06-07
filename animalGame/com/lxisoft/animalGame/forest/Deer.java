 package com.lxisoft.animalGame.forest;

public class Deer extends Animal implements Herbivorous
{
	public void eat()
	{   
	  System.out.println("deer grass eat");
	}	
	public void luck()
	{
		int l=(int)(Math.random()*30);
		if(l<=50)
		{
            System.out.println("deer escape");		
		}
		else
        {
		  System.out.println("deer traped");
	    }	
	}
}
