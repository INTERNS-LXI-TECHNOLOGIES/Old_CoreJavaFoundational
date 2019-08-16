package com.lxisoft.intern.files;
public class Lion extends Animal implements Carnivores
{   
	public Lion(String name,int pow)
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
System.out.println("power = 9");
}
}
