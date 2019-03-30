import java.util.Random;
import java.util.*;
public class Animal
{
	private String name;
	private int strengthLevel;
	private int hungerLevel;
	private int locationX;
	private int locationY;
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setStrengthLevel(int strengthLevel)
	{
		this.strengthLevel=strengthLevel;

	}
	public void setHungerLevel(int hungerLevel)
	{
		this.hungerLevel=hungerLevel;

	}
	public void setLocationX(int locationX)
	{
		this.locationX=locationX;
	}
	public void setLocationY(int locationY)
	{
		this.locationY=locationY;
	}
	public String getName()
	{
		return this.name;
	}
	public int getStrengthLevel()
	{
		return this.strengthLevel;
	}
	public int getHungerLevel()
	{
		return this.hungerLevel;
	}
	public int getLocationX()
	{
		return this.locationX;
	}
	public int getLocationY()
	{
		return this.locationY;
	}

	public boolean fight(Animal animals)
	{
				

				if((animals.getLocationX()-locationX<=5) && (animals.getLocationY()-locationY<=5))
				{
					System.out.println(animals.getName()+" "+"Fights With"+" "+name);

				if((animals.getStrengthLevel()>strengthLevel)&&(animals.getHungerLevel()>hungerLevel))
				{
					
					System.out.println(animals.getName()+"  "+"Wins !");
					System.out.println(name+"  "+" loose!"+"\n--------------");
					animals.setStrengthLevel(animals.getStrengthLevel() - 10);
					this.setHungerLevel(this.getHungerLevel() + 5);	
					return true;


			    }
				else 
				{
					System.out.println(name+"  "+"Wins !");
					System.out.println(animals.getName()+"  "+" loose !"+"\n--------------");
					animals.setStrengthLevel(animals.getStrengthLevel() - 10);
					this.setHungerLevel(this.getHungerLevel() + 5);	
					return false;
			    }
			  }
		

		return false;
			
	}

	public boolean eat(Animal animals)
	{
			if((animals.getLocationX()-locationX<=5) && (animals.getLocationY()-locationY<=5))
			{
			System.out.println(this.getName()+" try to eat " + animals.getName() );

			if(this.getStrengthLevel()>animals.getStrengthLevel()&&this.getHungerLevel()>animals.getHungerLevel()) {

					System.out.println(this.name+" ate "+animals.getName()+"\n----------");
				return true;
			}
			else {
				System.out.println(animals.getName()+" "+" Escape from "+" "+this.name+"\n-----------");
				animals.setStrengthLevel(animals.getStrengthLevel() - 10);
				this.setHungerLevel(this.getHungerLevel() + 5);				
				return false;
			}
		  }
		
     return true;
     	}
	public void meet(Animal animals)
	{
		if((animals.getLocationX()-locationX<=5)&&(animals.getLocationY()-locationY<=5))
			{
				if(this.getHungerLevel()>animals.getHungerLevel())
				{
					System.out.println(this.name+" 'I am HUngry !'\n Searching for Grass\n Are you coming..."+animals.getName());
				}
			}


	}

		
	

}

