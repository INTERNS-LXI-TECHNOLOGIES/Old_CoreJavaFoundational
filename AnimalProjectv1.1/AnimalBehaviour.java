/*
 * Class AnimalBehaviour
 *
 * -> Thread [ Iterate Over animals in Forest f and calls huntPrey on Carnivore and closestHerd on Herbivore ]
 *
 */

public class  AnimalBehaviour extends Thread
{
	Forest f = null;

	 AnimalBehaviour(Forest pf)
	{
		this.f = pf;
	}

	public void run()
	{
		try
		{
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			while(true)
			{
				if(this.f.count() == 1)
				{
					Thread.currentThread().interrupt();
				}

				for(int i = 0;i<this.f.max_support_animals;i++)
				{
					int j = Rand.randNumber(0 , this.f.max_support_animals);

					if(this.f.animals[j] != null)
					{
						this.f.animals[j].printDetails();
						this.sleep(800);

						if(this.f.animals[j] instanceof Carnivore)
						{
							this.f.animals[j].hunger_level++;
						}

						if(this.f.animals[j] instanceof Carnivore )
						{
							if(this.f.animals[j].hunger_level > 5)
							{
								if(((Carnivore)this.f.animals[j]).huntPrey(this.f) != 0)
								{
									this.f.animals[j].hunger_level -= 10;
									this.f.animals[j].strength++;
								}
								else
								{
									System.out.println("Herbivore animals are all dead");
								}
							}

						}

						else
						{
							((Herbivore)this.f.animals[j]).closestHerd(this.f);
						}
					}
				}

			}
		}
		catch(Exception e)
		{
			ErrHandler.print(e.getMessage());
		}
	}
}
