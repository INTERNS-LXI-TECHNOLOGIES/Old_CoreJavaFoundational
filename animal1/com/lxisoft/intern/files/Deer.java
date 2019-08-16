package com.lxisoft.intern.files;
public class Deer extends Animal implements Herbivores

{   
	public Deer(String name,int pow)
	{
		this.name=name;
		this.power=pow;
	}

   public void eat()
{
  System.out.println("eats vegetables");
}
 
  public void fight()
{
  System.out.println("power = 5");
}
}
