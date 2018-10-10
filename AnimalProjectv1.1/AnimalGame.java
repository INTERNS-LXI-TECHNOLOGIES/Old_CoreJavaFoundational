
public class AnimalGame
{
	Forest f;

	AnimalGame(int px , int py , int pno_of_animals)
	{
		f = new Forest(px,py,pno_of_animals);
	}

	public int createAnimals(int phcount , int pccount)
	{
		int i;
		int x , y;

		x = Rand.randNumber(0 , this.f.x);
		y = Rand.randNumber(0 , this.f.y);

		for(i =0; i < f.max_support_animals;i++)
		{
			if(i < phcount)
			{
				if(Rand.randNumber(1,2) > 1)
				{
					this.f.animals[i] = new Zebra(i);
				}
				else
				{
					this.f.animals[i] = new Rhino(i);
				}
			}
			else
			{
				if(Rand.randNumber(1,2) > 1)
				{
					this.f.animals[i] = new Lion(i);
				}
				else
				{
					this.f.animals[i] = new Tiger(i);
				}
			}

			this.f.animals[i].setCoordinates(x,y);
			this.f.animals[i].setStrength(Rand.randNumber(100,900));
			this.f.animals[i].setHungerLevel(Rand.randNumber(100,200));
		}

		return i;
	}


	public void startGame()
	{
		AnimalBehaviour behaviour = new AnimalBehaviour(this.f);

		behaviour.start();

		AnimalFight fight = new AnimalFight(this.f);

		fight.start();

	}

	public void printDetails()
	{
		for(int i = 0;i<this.f.max_support_animals;i++)
		{
			this.f.animals[i].printDetails();
		}
	}
}
