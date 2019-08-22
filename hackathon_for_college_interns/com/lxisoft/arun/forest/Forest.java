package com.lxisoft.arun.forest;
import com.lxisoft.arun.forest.animals.*;
import java.util.*;


public class Forest
{
	Animal lion,rabbit;
	 
	private ArrayList<Animal> animals=new ArrayList<Animal>();
	
	
	public void startGame() 
	{
		Random random=new Random();
		lion=new Lion("Lion",random.nextInt(10));
		rabbit=new Rabit("Rabbit",random.nextInt(10));
		
		animals.add(lion);
		animals.add(rabbit);
		
		
	
		meetanimals(lion,rabbit);
		
	
	}
	
	public void meetanimals(Animal a,Animal b)
	{
		if(a.getEnergylevel()<6)
		{
			Animal winner=lion.fight(b);
		}
	
	}
	public Animal getWinner()
	{
		return lion;
	}		
}