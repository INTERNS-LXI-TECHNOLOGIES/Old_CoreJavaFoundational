public class Lion extends Animal implements Carnivore
{
	Lion(int pid)
	{
		super(pid);
	}

	public int fight(Forest pf)
	{

		for(int i =0;i<pf.max_support_animals;i++)
		{
			if(pf.animals[i] != null && pf.animals[i] instanceof Carnivore)
			{
				if(pf.animals[i].id != this.id)
				{
			
					System.out.println(this.getClass().getName()  + " " + this.id + " fights " + pf.animals[i].getClass().getName() + " " + pf.animals[i].id + "\n");

					if(pf.animals[i].strength > this.strength)
					{
						pf.removeAnimal(pf.animals[i].id);
					}
					else
					{
						pf.removeAnimal(this.id);
					}

					return 1;
				}
			}
		}

		return 0;
	}

	public int huntPrey(Forest pf)
	{

		int x , y , i;

		x = this.pos_x;
		y = this.pos_y;

		int h , b , distance;

		int shortest = 0;

		Animal prey = null;


		for(i = 0; i < pf.max_support_animals;i++)
		{
			if(pf.animals[i] != null && pf.animals[i] instanceof Herbivore)
			{
				h = x - pf.animals[i].pos_x;
				b = y - pf.animals[i].pos_y;

				distance = (h*h) - (b*b);

				if(shortest == 0)
				{
					shortest = distance;
					prey = pf.animals[i];
				}
				else
				{
					if(distance < shortest)
					{
						shortest = distance;
						prey = pf.animals[i];
					}
				}

			}
		}

		if(prey != null)
		{
			System.out.println("Lion " + this.id + " Hunting " + prey.id);

			pf.removeAnimal(prey.id);

			return 1;

		}



		return 0;
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Lion\n");
	}
}
