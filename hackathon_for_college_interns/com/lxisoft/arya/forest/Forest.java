package com.lxisoft.arya.forest;
import com.lxisoft.arya.forest.animals.Animal;
import com.lxisoft.arya.forest.animals.Lion;
import com.lxisoft.arya.forest.animals.Rabbit;
import java.util.*;
public class Forest 
{
	
	private List<Animal> animals=new ArrayList<Animal>();
	private Animal lion,rabbit;
	private Animal winner;
	public Forest()
	{
		lion=new Lion();
		rabbit=new Rabbit();
		animals.add(lion);
		animals.add(rabbit);
	}
	//implement code here
	public Boolean startGame() 
	{
		return true;
		
	}
	
	//@Todo implment method if necessary
	public void meetAnimals(Animal a,Animal b)
	{
		
	}
	//@Todo implment method if necessary
	public Animal getWinner()
	{
		return winner;
	}	
}