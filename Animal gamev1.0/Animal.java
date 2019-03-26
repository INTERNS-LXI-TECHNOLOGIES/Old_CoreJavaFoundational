import java.util.Random;
public class Animal
{
	private String name;
	private int strengthLevel;
	private int position;
	private int hungerLevel;
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
	public void setPosition(int position)
	{
		this.position=position;
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
	public int getPosition()
	{
		return this.position;
	}

	public boolean fight(Animal animal)
	{
		if(this instanceof Carnivore)
		{
			System.out.println(animal.getName()+" "+"Fights With"+" "+name);

			if(animal instanceof Carnivore)
			{

				if((animal.getStrengthLevel()>strengthLevel)&&(animal.getHungerLevel()>hungerLevel))
				{
					
					System.out.println(animal.getName()+"  "+"Wins !");
					System.out.println(name+"  "+" loose!"+"\n--------------");
					return false;

			    }
				else 
				{
					System.out.println(name+"  "+"Wins !");
					System.out.println(animal.getName()+"  "+" loose !"+"\n--------------");
					return true;
			    }
			}

		}

		return false;
			
	}

	public boolean eat(Animal animal)
	{
		if(animal instanceof Herbivore)
		{
			System.out.println(this.getName()+" try to eat " + animal.getName() );

			if(this.getStrengthLevel()>animal.getStrengthLevel()&&this.getHungerLevel()>animal.getHungerLevel()) {

					System.out.println(this.name+" ate "+animal.getName()+"\n----------");
				return true;
			}
			else {
				System.out.println(animal.getName()+" "+" Escape from "+" "+this.name+"\n-----------");
				animal.setStrengthLevel(animal.getStrengthLevel() - 10);
				this.setHungerLevel(this.getHungerLevel() + 5);				
				return false;
			}
		}
     return true;
	}

		
	

}

