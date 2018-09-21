package com.lxisoft.arthadh.forest;
import com.lxisoft.arthadh.forest.animals.*;

public class ForestArt
{

	private ArrayList<AnimalArt> animals=null;
	LionArt lion=new LionArt();
	RabbitArt rabbit=new RabbitArt();
	private AnimalArt winner;

	public Boolean startGame() 
	{
		boolean play=true;
		return play;
		//implement code here
	}
	
	public void meetAnimals(AnimalArt a,AnimalArt b)
	{
		//AnimalArt a,b;
		int lionEnergyLevel=a.getEnergyLevel();
		int rabbitEnergyLevel=b.getEnergyLevel();
		AnimalArt animal1,animal2;
		a.setName(name);
		b.setName(name);
		animal1=a.getName();
		animal2=b.getName();
		if(lionEnergyLevel>rabbitEnergyLevel)
		{
			winner=animal1;
			
			System.out.println("WINNER:"+winner);
		}
		else if(rabbitEnergyLevel>lionEnergyLevel)
		{
			winner=animal2;
			System.out.println("WINNER:"+winner);
		}
		else
		{
			System.out.println(animal1+"&"+animal2+"are Tired");
		}
	}
	//@Todo implment method if necessary
	
	public void startFight()
	{
		startGame();
		if(play==true)
		{
			animals=new ArrayList<AnimalArt>();
			animals.add(lion);
			animals.add(rabbit);
			meetAnimals(animals.get(0),animals.get(1));
		}
		
	}

	public AnimalArt getWinner()
	{
		return this.winner;
	} //@Todo implment method if necessary
}
