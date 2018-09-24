
/*

	void spawnAnimals() -> Create new Animals in the forest
	
	void initGame() ->  Start to move the animals to (x,y) coordinates < size_x , size_y
	
	void startGame() -> 
	
	void killAnimal(Animal a) -> Removes Animal a from animals[] array
	
	void surviver() - > Prints the Details of the last remaiing animal
	
	int ecosystemDetails(AnimalType type)

*/

enum AnimalType
{
	HERBIVORE , CARNIVORE
}

public class Forest
{
	int max_no_animals = 30;   				
	
	static int animal_tag_no;
	
	int size_x , size_y;	
	
	int carnivore = 0 , herbivore = 0;
	
	Animal animals[];
	
	Forest(int sx , int sy)
	{
		animals = new Animal[max_no_animals];
		this.size_x = sx;
		this.size_y = sy;
	}
	
	
	
	public void spawnAnimals()
	{
		int rand = 0;
		
		for(int i = 0;i<max_no_animals;i++)
		{
			rand = Rand.randNumber(85,65);
			
			if((rand%6) == 0)
			{
				animals[animal_tag_no] = new Carnivore();
				carnivore++;
			}
			else
			{
				animals[animal_tag_no] = new Herbivore();
				herbivore++;
			}
			
			animal_tag_no++;
		}
		
		System.out.println("----Carnivore : " + ecosystemDetails(AnimalType.CARNIVORE));
		System.out.println("----Herbivore : " + ecosystemDetails(AnimalType.HERBIVORE));
	}
	
	
	public void initGame()
	{
		int randx = 0, randy = 0;
		
		for(int i = 0;i < animals.length;i++)
		{
			randx = Rand.randNumber(size_x  , 1);
			randy = Rand.randNumber(size_y  , 1);
				 
			animals[i].walk(randx , randy);
		}	
	}
	
	
	public void startGame()
	{
		killAnimal(animals[0]);	
		
	}
	
	public void killAnimal(Animal a)
	{
		if(a instanceof Animal)
		{
			carnivore--;
		}
		else
		{
			herbivore++;	
		}
	}
	
	public int ecosystemDetails(AnimalType type)
	{
		if(type == AnimalType.CARNIVORE) return this.carnivore;
		else if(type == AnimalType.HERBIVORE) return this.herbivore;
		else {  return this.carnivore + this.herbivore; }
	}

	public void surviver()
	{
		
	}
}