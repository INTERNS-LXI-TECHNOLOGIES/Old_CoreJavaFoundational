package com.lxisoft.intern.files;
public class Tiger extends Animal implements Carnivores
{ 
	public Tiger(String name,int pow)
	{
		this.name=name;
		this.power=pow;
	}
 	
	public void eat()
	  {
           System.out.println("eats flesh");
	  }

	public void fight()
	  {
 	   System.out.println("power = 7");
	  }
}
