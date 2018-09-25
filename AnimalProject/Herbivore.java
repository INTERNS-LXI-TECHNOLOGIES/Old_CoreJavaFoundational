
/*

	static HerbivoreType randType() -> Returns a random type of animal [ Herbivore ]
	
	void closestHerd(Animal[] animal , int[] coords) -> finds the closest animal of same type
	
	void printDetails() -> Prints the details of the animal

*/


enum HerbivoreType
{
		ZEBRA , BUFFALO , RHINO , ELEPHANT
}

public class Herbivore extends Animal
{
	HerbivoreType stype;
	
	int weight , height;
	
	Herbivore()
	{
		this.type = AnimalType.HERBIVORE;
		this.stype = Herbivore.randType();
		this.strength = 1000;
	}
	
	public static HerbivoreType randType()
	{
		int rand = Rand.randNumber(85 ,1);

		if( rand > 1 && rand < 20)
		{
			return HerbivoreType.BUFFALO	;
		}	
		else if(rand > 20 && rand <= 40)
		{
			return HerbivoreType.RHINO;
		}
		else if(rand % 3 == 0)
		{
			return HerbivoreType.ELEPHANT;
		}
		else
		{
			return HerbivoreType.ZEBRA;
		}
	}
	
	public void closestHerd(Animal[] animals , int[] coords)
	{
		int x1 = 10,y1 = 10;
		
		for(int i = 0;i < animals.length;i++)
		{
			if(animals[i] instanceof Herbivore)
		
			if(this.stype == HerbivoreType.ZEBRA)
			{
				coords[0] = x1;
				coords[1] = y1;
			}
			else if(this.stype == HerbivoreType.ELEPHANT)
			{
				coords[0] = 20;
				coords[1] = 20;
			}
			else if(this.stype == HerbivoreType.RHINO)
			{
			}
			else if(this.stype == HerbivoreType.BUFFALO)
			{
			}
		}
	}
	
	public void printDetails()
	{
		System.out.print("\n--------"+this.id + ":"+this.stype + ":");
		System.out.print("\t\tx:" + this.pos_x + " - y:" + this.pos_y);
		System.out.println("");
	}
}