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
		

		if((animal.getStrengthLevel()>strengthLevel)&&(animal.getHungerLevel()>hungerLevel))
		{
			System.out.println(animal.getName()+" "+"Fights With"+" "+name);
			System.out.println(animal.getName()+"  "+"Wins !");
			System.out.println(name+"  "+" Dead !"+"\n--------------");
			return false;

	    }
		else if((strengthLevel>animal.getStrengthLevel())&&(hungerLevel>animal.getHungerLevel()))
		{
			System.out.println(animal.getName()+" "+"Fights With"+" "+name);
			System.out.println(name+"  "+"Wins !");
			System.out.println(animal.getName()+"  "+" Dead !"+"\n--------------");
			return true;
	    }
		return false;
		

			
	}

		
	

}

