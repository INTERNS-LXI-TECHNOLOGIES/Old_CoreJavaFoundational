package com.lxisoft.varsha.forest;
import com.lxisoft.varsha.forest.animals;
import java.util.*;
import com.lxisoft.varsha.forest.animals.LionVar;
import com.lxisoft.varsha.forest.animals.RabbitVar;

public class ForestVar 
{
	private List<AnimalVar> animals=null;
	 LionVar lion = new Lion();
	 RabbitVar rabbit = new Rabbit();
	 
	
	public Boolean startGame() 
	{
		
		//implement code here
	}
	
	public void playGame()
	{
		ArrayList<Animals> animals = new ArrayList<>();
		animals.add(0,lion);
		animals.add(1,rabbit);
		System.out.println("Game started..");
		meetanimals(animals.get(0),animals.get(1));
		getWinner();
	}
	
	public void meetanimals(Animal a,Animal b)
	{
		Animal a,b;
		String animalA=animals.get(0);
		String animalB=animals.get(1);
		System.out.println(animalA+" met "+animalB);
		int energyLevel1=a.getEnergyLevel();
		int energyLevel2=b.getEnergyLevel();
		
	}//@Todo implment method if necessary
	
	public Animal getWinner()
	{
		if(energyLevel1 > energyLevel2)
		{
			System.out.println("Fight between " + animalA + " and " + animalB);
			System.out.println("WINNER - "+animalA);
			System.out.println("LOSER - "+animalB);
			
		}
		else if(energyLevel < energyLevel2)
		{
			System.out.println(animalB + "ran away from  " + animalA);
			System.out.println("WINNER - "+animalB);
			System.out.println("LOSER - "+animalA);
		}
		
		else
		{
			System.out.println("no fight");
		}
		
	}	//@Todo implment method if necessary
}