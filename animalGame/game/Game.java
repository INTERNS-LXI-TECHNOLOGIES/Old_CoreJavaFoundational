package com.lxisoft.animalGame.game;
import java.util.Scanner;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.forest.Forest;
import com.lxisoft.animalGame.game.forest.SetForest;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import com.lxisoft.animalGame.game.animal.carnivorous.Tiger;
import com.lxisoft.animalGame.game.animal.herbivores.Rabbit;
import com.lxisoft.animalGame.game.animal.herbivores.Deer;
public class Game
{
	SetForest setForest=new SetForest();
	Scanner scan=new Scanner(System.in);
	Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Rabbit rabbit=new Rabbit();
	Deer deer=new Deer();
	Animal fighter;
	

	public void animalGame()
	{
		setForest.forestControl();
		setForest.animalLocation(lion);
		setForest.animalLocation(tiger);
		setForest.animalLocation(rabbit);
		setForest.animalLocation(deer);
		
		setForest.displayForest(); 
		animalCreation();
		
		chooseAnimal();
		setForest.animalDistance(3,3);
		setForest.shortestDistance();
		fight(fighter,lion);
	}
	
	public void animalCreation()
	{
		lion.create();
		tiger.create();
		rabbit.create();
		deer.create();
	}
	
	public void chooseAnimal()
	{
		System.out.print("CHOOSE YOUR FIGHTER !!!! \n 1.LION \n 2.TIGER \n 3.RABBIT \n 4.DEER\n\n");
		int choice=scan.nextInt();
		if(choice==1)
		{
			fighter=lion;
		}
		if(choice==2)
		{
			fighter=tiger;
		}
		if(choice==3)
		{
			fighter=rabbit;
		}
		if(choice==4)
		{
			fighter=deer;
		}
		
	}
	
	public void fight(Animal animal1,Animal animal2)
	{
	
		if(animal1.getAnimalType()=="CARNIVOROUS")
		{
			if(animal2.getAnimalType()=="CARNIVOROUS")
			{
				//System.out.print("\n\nNO FIGHT!!");
				
				int energyLevel1=animal1.getEnergyLevel();
				//hungerLevel1=animal1.getHungerLevel();
				int energyLevel2=animal2.getEnergyLevel();
				//hungerLevel2=animal2.getHungerLevel();
				if(energyLevel1 > energyLevel2)
				{
					System.out.print("\n\n NO FIGHT!!  YOU WON!!");
				}
				else
				{
						System.out.print("\n\n NO FIGHT!! YOU LOSE!!");
				}
			}
			
			if(animal2.getAnimalType()=="HERBIVORES")
			{
				int energyLevel1=animal1.getEnergyLevel();
				//int hungerLevel1=animal1.getHungerLevel();
				int energyLevel2=animal2.getEnergyLevel();
				//int hungerLevel2=animal2.getHungerLevel();
				if(energyLevel1 > energyLevel2)
				{
					System.out.print("\n\nYOU WON!!!");
				}
				else
				{
						System.out.print("SORRY!!YOU LOSE!!");
				}
			}
		}
		
		if(animal1.getAnimalType()=="HERBIVORES")
		{
			if(animal2.getAnimalType()=="HERBIVORES")
			{
				//System.out.print("\n\nNO FIGHT!!");
				
				int energyLevel1=animal1.getEnergyLevel();
				//hungerLevel1=animal1.getHungerLevel();
				int energyLevel2=animal2.getEnergyLevel();
				//hungerLevel2=animal2.getHungerLevel();
				if(energyLevel1 > energyLevel2)
				{
					System.out.print("\n\n NO FIGHT !! YOU WON!!!");
				}
				else
				{
						System.out.print("\n\n NO FIGHT!! YOU LOSE!!");
				}
			}
			
			if(animal2.getAnimalType()=="CARNIVOROUS")
			{
				int energyLevel1=animal1.getEnergyLevel();
				//hungerLevel1=animal1.getHungerLevel();
				int energyLevel2=animal2.getEnergyLevel();
				//hungerLevel2=animal2.getHungerLevel();
				if(energyLevel1 > energyLevel2)
				{
					System.out.print("\n\nYOU WON!!!");
				}
				else
				{
						System.out.print("\n\n SORRY!! YOU LOSE!!");
				}
			}
		}
	}
		
	
}