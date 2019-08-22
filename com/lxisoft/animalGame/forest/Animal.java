package com.lxisoft.animalGame.forest;
import java.util.*;
import java.lang.*;
import com.lxisoft.animalGame.animal.*;

public class Animal
{
	
		ArrayList<Integer> rem=new ArrayList<Integer>();
		int next=-1;
		int count=1,strength,hungry;
		
		public Animal()
		{
			

		}
		
	public void setStrength(int strength)
	{
			this.strength=strength;
			
	}
	
	public int getStrength()
	{
		return this.strength;
	}
		
	public void setHungry(int hungry)
	{
		this.hungry=hungry;
	}
	
	public int getHungry()
	{
		return this.hungry;
	}
	/**
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
	}**/
	
	
	
	
	
}