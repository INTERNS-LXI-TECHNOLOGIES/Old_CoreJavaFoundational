package com.lxisoft.animalGame.forest;
import java.util.*;
import com.lxisoft.animalGame.animal.*;


public class Forest
{
	
	//Animal animal[0][]=new animal[0][5];
	//Animal animal[1][]=new animal[1][5];
	//Animal animal[2][]=new animal[2][5];	
	//Animal animal[3][]=new animal[3][5];	
	Animal animal[]=new Animal[5];

	public Forest()
	{
		


	}
	
	public void selectAnimal()
	{
		ArrayList<Integer> rem=new ArrayList<Integer>(); 
		
		int strength,hungry;
		
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		
		int animal1=random.nextInt(4);
		animal[animal1]=new Animal();
		
		System.out.print("Enter strength");
		strength=scan.nextInt();
		System.out.print("Enter hunger:");
		hungry=scan.nextInt();
		
		
		animal[animal1].setStrength(strength);
		animal[animal1].setHungry(hungry);
		
		displayAnimal(animal1);
		
		System.out.println("*********************");
		
		
			
		do
		{
			int animal2=random.nextInt(4);
			if(animal1==animal2 && !(rem.contains(animal1)))
			{
				rem.add(animal1);
				displayAnimal(animal1);
				displayAnimal(animal2);
				System.out.println("No fight");
			}
			if(!rem.contains(animal2))
			{
				rem.add(animal2);
			
				displayAnimal(animal1);
				System.out.println(""+getAnimalHungry(animal1));
				System.out.println(""+getAnimalStrength(animal1));
				
				displayAnimal(animal2);
				
				animal[animal2]=new Animal();
				
				strength=random.nextInt(10);
				hungry=random.nextInt(10);
				animal[animal2].setStrength(strength);
				animal[animal2].setHungry(hungry);
				
				
				fight(animal1,animal2);
			}
			
		}while(rem.size()<=4);
			
	}
	
	public void fight(int animal1,int animal2)
	{
		if(animal1==0)
		{
			//animal[0]=new Tiger();
		
			if(animal2==0)
			{
				
				//strength compare and decide whether to fight or not
				System.out.println("No fight");
			}
			else if(animal2==1)
			{
				System.out.println("No fight");
			}
				
			else if(animal2==2)
			{
				//animal[2]=new Rabbit();
				if(animal[animal1].getHungry()>5 && animal[animal2].getStrength()<8)
				
					System.out.println("You Won!");
					
				else if(animal[animal1].getHungry()<=5)
					System.out.println("Not Hungry");
				else if(animal[animal2].getStrength()>=8)
					System.out.println("Escaped");
			}
			else if(animal2==3)
			{
				//animal[3]=new Deer();
				if(animal[animal1].getHungry()>5 && animal[animal2].getStrength()<8)
				
					System.out.println("You Won!");
					
				else if(animal[animal1].getHungry()<=5)
					System.out.println("Not Hungry");
				else if(animal[animal2].getStrength()>=8)
					System.out.println("Escaped");	
			}
		}
		
		else if(animal1==1)
		{
			//animal[1]=new Lion();
			if(animal2==0)
			{
				
			//strength compare and decide whether to fight or not
				System.out.println("No fight");
			}
			else if(animal2==1)
			{
				System.out.println("No fight");
			}
				
			else if(animal2==2)
			{
				//animal[2]=new Rabbit();
				if(animal[animal1].getHungry()>5 && animal[animal2].getStrength()<8)
				
					System.out.println("You Won!");
					
				else if(animal[animal1].getHungry()<=5)
					System.out.println("Not Hungry");
				else if(animal[animal2].getStrength()>=8)
					System.out.println("Escaped");
			}
			else if(animal2==3)
			{
				//animal[3]=new Deer();
				if(animal[animal1].getHungry()>5 && animal[animal2].getStrength()<8)
				
					System.out.println("You Won!");
					
				else if(animal[animal1].getHungry()<=5)
					System.out.println("Not Hungry");
				else if(animal[animal2].getStrength()>=8)
					System.out.println("Escaped");
			}
		}
		
		else if(animal1==2)
		{
			//animal[2]=new Rabbit();
			if(animal2==0)
			{
				//animal[0]=new Tiger();
				//strength compare and decide whether to fight or not
				if(animal[animal2].getHungry()>5 && animal[animal1].getStrength()<8)
				{
					System.out.println("You Loose!");
					System.exit(0);
				}
				else if(animal[animal2].getHungry()<=5)
					System.out.println("You are safe!");
				else if(animal[animal1].getStrength()>=8)
					System.out.println("You escaped");
			}
			else if(animal2==1)
			{
				//animal[1]=new Lion();
				if(animal[animal2].getHungry()>5 && animal[animal1].getStrength()<8)
				{
					System.out.println("You Loose!");
						System.exit(0);
				}
				else if(animal[animal2].getHungry()<=5)
					System.out.println("You are safe");
				else if(animal[animal1].getStrength()>=8)
					System.out.println("You escaped");
			}
				
			else if(animal2==2)
			{
					System.out.println("No Fight");
			}
			else if(animal2==3)
			{
					System.out.println("No Fight");
			}
		}
		
		else if(animal1==3)
		{
			//animal[3]=new Deer();
			if(animal2==0)
			{
				//animal[0]=new Tiger();
				//strength compare and decide whether to fight or not
				if(animal[animal2].getHungry()>5 && animal[animal1].getStrength()<8)
				{
					System.out.println("You Loose!");
					System.exit(0);
				}
				else if(animal[animal2].getHungry()<=5)
					System.out.println("You are safe");
				else if(animal[animal1].getStrength()>=8)
					System.out.println("You escaped");
			}
			else if(animal2==1)
			{
				//animal[1]=new Lion();
				if(animal[animal2].getHungry()>5 && animal[animal1].getStrength()<8)
				{
					System.out.println("You Loose!");
					System.exit(0);	
				}
				else if(animal[animal2].getHungry()<=5)
					System.out.println("You are safe");
				else if(animal[animal1].getStrength()>=8)
					System.out.println("You escaped");
			}
				
			else if(animal2==2)
			{
					System.out.println("No Fight");
			}
			else if(animal2==3)
			{
					System.out.println("No Fight");
			}
		}
				
		/**
		*animal1 given a strength 
		*animal2 given randim strength
		*strength and hunger changed accordingly for animal1
		*animal1 meets another animal
		**/
		//animal.fight(animal1,animal2);
		
	}
	
	public void displayAnimal(int number)
	{	
	switch(number)
		{
			case 0: System.out.println("Tiger");
					break;
			case 1: System.out.println("Lion");
					break;
			case 2: System.out.println("Rabbit");
					break;					
			case 3: System.out.println("Deer");
					break;
		}
	}
	
	public int getAnimalStrength(int animalNo)
	{
		return animal[animalNo].getStrength();
	}
	public int getAnimalHungry(int animalNo)
	{
		return animal[animalNo].getHungry();
	}
		
	
}