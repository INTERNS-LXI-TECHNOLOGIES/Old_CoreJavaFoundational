
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
	
	int size_x , size_y;	
	
	int carnivore_count = 0 , herbivore_count = 0;
	
	int animal_tag = 0;
	
	Animal[] animals;
	
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
				animals[animal_tag] = new Carnivore();
				carnivore_count++;
			}
			else
			{
				animals[animal_tag] = new Herbivore();
				herbivore_count++;
			}
			
			animals[animal_tag].id = animal_tag;
			
			animal_tag++;
		}
			
		System.out.println("----Carnivore : " + ecosystemDetails(AnimalType.CARNIVORE));
		System.out.println("----Herbivore : " + ecosystemDetails(AnimalType.HERBIVORE));
		
	}
	
	
	public void initGame()
	{
		int randx = 0, randy = 0;
		
		for(int i = 0;i < animal_tag;i++)
		{
			randx = Rand.randNumber(size_x  , 1);
			randy = Rand.randNumber(size_y  , 1);
				 
			animals[i].walk(randx , randy);
		}	
		
		
		for(int i = 0;i < animal_tag;i++)
		{
			if(animals[i] instanceof Carnivore)
			{
				((Carnivore)animals[i]).printDetails();
			}
			else
			{
				((Herbivore)animals[i]).printDetails();
			}
		}
		
	}
	
	
	public void startGame()
	{
		int[] coords = new int[2];
		
		Animal prey;
		
		while(true)
		{
			// Animals of same herd move to close each other (x,y) points
			
			for(int i = 0;i < max_no_animals;i++)
			{
				if(animals[i] != null )
				{

					if( animals[i] instanceof Herbivore)
					{
						((Herbivore )animals[i]).closestHerd(animals , coords);
						animals[i].moveTo(coords);
						
						((Herbivore)animals[i]).printDetails();
							
						try{ Thread.sleep(100);}catch(Exception e){}
						
						
					}
					
				}
				
					coords[0] = 0;
					coords[1] = 0;
					
				
				
			}
		}

	}
	
	public void killAnimal(Animal a , int tag_no)
	{
		animals[tag_no] = null;
		
		if(a instanceof Carnivore)
		{
			
			carnivore_count--;
		}
		else
		{
			herbivore_count--;	
		}
	}
	
	public int ecosystemDetails(AnimalType type)
	{
		if(type == AnimalType.CARNIVORE) return this.carnivore_count;
		else if(type == AnimalType.HERBIVORE) return this.herbivore_count;
		else {  return this.carnivore_count + this.herbivore_count; }
	}

	public void surviver()
	{
		
	}
}