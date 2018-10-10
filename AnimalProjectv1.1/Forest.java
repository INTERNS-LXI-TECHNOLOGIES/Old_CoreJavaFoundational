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
