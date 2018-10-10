
/*
 * Class Forest
 *
 * 	->	Forest(int px , int py , int pmax_support_animals)  [ Creates an Forest with px , py as Coordinates And set Maximum number of animals allowed ]
 *
 * 	->	Forest(int px , py)	[ Creates an Forest with px , py as Coordinates ]
 *
 * 	->  int setCoordinates(int px , py)	 [ Set x and y Coordinates | Returns 1 on success and 0 on failure ]
 *
 * 	->	void setMaxAnimals(int pmax_support_animals)	[ Set the Maximum supported animals in Forest ]
 *
 * 	->	void insertAnimal(Animal animal)	[ Insert animal to this forest ]
 *
 * 	->	int removeAnimal(int pid)	[ Remove animal with id = pid  | Returns 1 on success and 0 on failure ]
 *
 * 	->	int count()		[ Returns the current total number of animals in this forest ]
 *
 * 	->	void printDetails()   [ Prints the Details about forest ]
 *
 */

public class Forest
{
	public int x = 0;
	public int y = 0;

	public int max_support_animals = 0;

	public int no_of_living;

	Animal[] animals = null;


	Forest(int px , int py , int pmax_support_animals)
	{
		this.x = px;
		this.y = py;
		this.max_support_animals = pmax_support_animals;
		this.no_of_living = pmax_support_animals;
		animals = new Animal[this.max_support_animals];
	}

	Forest(int px , int py)
	{
		if(px <= 0 || py <= 0)
		{
			System.err.println("Coordinates should > 0 ");
		}

		this.x = px;
		this.y = py;
	}

	public int setCoordinates(int px , int py)
	{
		if(px <= 0 || py <= 0)
		{
			ErrHandler.print("Coordinates should > 0 ");
			return 0;
		}

		this.x = px;
		this.y = py;

		return 1;
	}

	public void setMaxAnimals(int pmax_support_animals)
	{
		this.max_support_animals = pmax_support_animals;
		animals = new Animal[this.max_support_animals];
	}

	public int insertAnimal(Animal animal)
	{
		for(int i = 0;i < this.animals.length;i++)
		{
			if(animals[i] != null)
			{
				continue;
			}
			else
			{
				animals[i] = animal;

				return 1;
			}
		}

		return 0;
	}

	public int removeAnimal(int id)
	{
		if(id >= animals.length)
		{
			ErrHandler.print(animals[id].getClass().getName() + " " + id + "does not exist");
			return 0;
		}
		else
		{
			System.out.println("Animal " +  animals[id].id + " is dead");
			animals[id] = null;
			this.no_of_living--;
			return 1;
		}

	}

	public int count()
	{
		return this.no_of_living;
	}

	public void printDetails()
	{
		System.out.println("Maximum Support Animals: " + this.max_support_animals);
		System.out.println("[ X-> :" + this.x + " | Y-> : " + this.y);
	}



}
