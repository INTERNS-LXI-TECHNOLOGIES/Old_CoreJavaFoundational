package com.lxisoft.arun.forest.animals;
public class Rabit extends Animal implements Herbivore 
{
	
	public Rabit(String name,int strength)
	{
		super(name,strength);
	}
	
	public void runAway()
	{
		System.out.println("Rabbit escaped");
	}




}