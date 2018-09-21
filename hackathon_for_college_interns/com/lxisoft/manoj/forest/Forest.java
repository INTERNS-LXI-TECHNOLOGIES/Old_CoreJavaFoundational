package com.lxisoft.manoj.forest;
import com.lxisoft.manoj.forest.animals.*;
import java.util.*;



public class Forest 
{
	private List<Animal> animals=null;
	private Animal winnerAnimal;
	Lion lion=new Lion();
	Rabbit rabbit=new Rabbit();
	

	public Boolean startGame() 
	{
		Boolean status=true;
		return status;
		//implement code here
	}
	
	public void meetanimals(Animal a,Animal b)//@Todo implment method if necessary
	{
		
		//some conditions to check greater energy level
		//assume a is winner
		winnerAnimal=a;
		
	}
	public Animal getWinner() //@Todo implment method if necessary
	{
		return this.winnerAnimal;
	}
		public void game() 
	{
		Animal winner;
		animals=new ArrayList<Animal>();
		lion.setName("Lion");
		rabbit.setName("Rabbit");
		animals.add(lion);
		animals.add(rabbit);
		if(startGame()==true)
		{
		System.out.println("The game has started");
		meetanimals(animals.get(0),animals.get(1));
		winner=getWinner();
		System.out.println("The winner is "+winner.getName());
		}
	}
	
}

