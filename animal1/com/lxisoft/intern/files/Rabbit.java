package com.lxisoft.intern.files;
public class Rabbit extends Animal implements Herbivores
{   
      public Rabbit(String name,int pow)
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
          System.out.println("power = 2");
	}

}
