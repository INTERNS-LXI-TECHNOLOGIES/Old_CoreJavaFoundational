
/*

	static HerbivoreType randType() -> Returns a random type of animal [ Carnivore ]
	
	void printDetails() -> Prints the details of the animal
	
	Animal closestPrey(Animals[] animal , int[] coords) -> returns the closest Animal
	
	boolean isHungry() -> check if the animal is hungry
	
	void eatAnimal(Herbivore prey)

*/

enum CarnivoreType
{
	LION , TIGER
}

public class Carnivore extends Animal
{
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
	
	public Animal closestPrey(Animal[] animal , int[] coords)
	{
		return animal[0];
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