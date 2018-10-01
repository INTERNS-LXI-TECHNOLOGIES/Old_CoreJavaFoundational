
/*

	static HerbivoreType randType() -> Returns a random type of animal [ Carnivore ]
	
	void printDetails() -> Prints the details of the animal
	
	Animal closestPrey(Animals[] animal) -> returns the closest Animal
	
	boolean isHungry() -> check if the animal is hungry
	
	void eatAnimal(Herbivore prey)

*/

enum CarnivoreType
{
	LION , TIGER
}

public class Carnivore extends Animal
{
	static int static_i = 0;
	CarnivoreType stype;
	
	Carnivore()
	{
		this.type = AnimalType.CARNIVORE;
		this.stype = randType();
		this.strength = 2000;
	}
	
	public static CarnivoreType randType()
	{
		int rand = Rand.randNumber(85 ,1);

		if( rand > 1 && rand < 40)
		{
			return CarnivoreType.LION	;
		}	
		else
		{
			return CarnivoreType.TIGER;
		}
	}
	
	public boolean isHungry()
	{
		if(this.hungry_level > 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Carnivore[] fight(Animal[] animals)
	{
		Carnivore[] car = new Carnivore[2];
		for(int i =0;i < animals.length;i++)
		{
			if(animals[i] != null && animals[i] instanceof Carnivore && animals[i].id != this.id)
			{
				if(this.strength < animals[i].strength)
				{
					car[0] = this;
					car[1] = ((Carnivore)animals[i]);
					
					return car;
				}
				else
				{
					car[0] = ((Carnivore)animals[i]);;
					car[1] = this;
					
					return car;
				}
				
			}
		}
		
		return null;
	}
	
	public Animal closestPrey(Animal[] animals )
	{
		for(int i = static_i;i<animals.length;i++)
		{
			if(animals[i] != null && animals[i] instanceof Herbivore)
			{
				static_i++;
				return animals[i];
			}
		}
		
		return null;
		
	}

	public void printDetails()
	{
		System.out.print("\n----------" + this.id + ":" + this.stype + ":");
		System.out.print("\t\t x:" + this.pos_x + " - y:" + this.pos_y);
		System.out.println("");
	}
	
	public void eatAnimal(Herbivore prey)
	{
	}
	
}
