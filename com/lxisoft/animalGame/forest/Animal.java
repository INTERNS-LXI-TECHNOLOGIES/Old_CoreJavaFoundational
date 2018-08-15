package com.lxisoft.animalGame.forest;
import java.util.*;
import java.lang.*;

public class Animal
{
		ArrayList<Integer> rem=new ArrayList<Integer>();
		int next=-1;
		int count=1;
		public Animal()
		{
			rem.add(-1);
		}
		
	
	
	public void fight(int firstAnimal,int secondAnimal)
	{
		
		Random random=new Random();
		displayAnimal(firstAnimal);
		displayAnimal(secondAnimal);
		if(firstAnimal==0)
		{
		
			if(secondAnimal==0)
			{
				System.out.println("No fight\n");
				rem.add(0);
				
				
				while(rem.contains(next))
				{	
					next=random.nextInt(4);
				}
				
						fight(0,next);
				
			}
			else if(secondAnimal==1)
			{
				System.out.println("No fight\n");
				rem.add(1);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(0,next);
				
			}
			else if(secondAnimal==2)
			{
				System.out.println("Fight");
				System.out.println("Tiger Wins\n");
				rem.add(2);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
			
				fight(0,next);
						
			}
			else if(secondAnimal==3)
			{
				System.out.println("Fight");
				System.out.println("Tiger Wins\n");
				rem.add(3);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(0,next);
			}
			
		}
		
		else if(firstAnimal==1)
		{
			if(secondAnimal==0)
			{
				System.out.println("No fight\n");
				rem.add(0);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(1,next);
				
			}
			else if(secondAnimal==1)
			{
				System.out.println("No fight\n");
				rem.add(1);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(1,next);
				
			}
			else if(secondAnimal==2)
			{
				System.out.println("Fight");
				System.out.println("Lion Wins\n");
				rem.add(2);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(1,next);
				
			}
			else if(secondAnimal==3)
			{
				System.out.println("Fight");
				System.out.println("Lion Wins\n");
				rem.add(3);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(1,next);
				
			}
		}
		
		else if(firstAnimal==2)
		{
			if(secondAnimal==0)
			{
				System.out.println("Fight");
				System.out.println("Rabbit loses\n");
				System.exit(0);
				
			}
			else if(secondAnimal==1)
			{
				System.out.println("Fight");
				System.out.println("Rabbit loses\n");
				System.exit(0);
			}
			else if(secondAnimal==2)
			{
				System.out.println("No fight\n");
				rem.add(2);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
			
					fight(2,next);
				
			}
			else if(secondAnimal==3)
			{
				System.out.println("No fight\n");
				rem.add(3);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(2,next);
				
			}
		}
		if(secondAnimal==0)
			{
				System.out.println("Fight");
				System.out.println("Deer loses\n");
				System.exit(0);
			}
			else if(secondAnimal==1)
			{
				System.out.println("Fight");
				System.out.println("Deer loses\n");
				System.exit(0);
			}
			else if(secondAnimal==2)
			{
				System.out.println("No fight\n");
				rem.add(2);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
			
					fight(3,next);
				
			}
			else if(secondAnimal==3)
			{
				System.out.println("No fight\n");
				rem.add(3);
				
				
				while(rem.contains(next))
				{
					next=random.nextInt(4);
				}
				
					fight(3,next);
				
			}
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
	
	
	
}