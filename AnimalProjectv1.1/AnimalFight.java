public class AnimalFight extends Thread
{
	Forest f = null;

	AnimalFight(Forest pf)
	{
		this.f = pf;
	}

	public void run()
	{
		try
		{
				Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			while(true)
			{
				if(this.f.count() == 1)
				{
										Thread.currentThread().interrupt();
					System.exit(0);
				}
				this.sleep(100);

				for(int i = 0;i < this.f.max_support_animals;i++)
				{
					if(this.f.animals[i] != null)
					{
						if(this.f.animals[i] instanceof Carnivore)
						{
							if(((Carnivore)this.f.animals[i]).fight(this.f) == 0)
							{

							}
						}
					}
				}

			}
		}
		catch(Exception e)
		{
		}
	}

}
