public class Rhino extends Animal implements Herbivore
{
	Rhino(int pid)
	{
		super(pid);
	}

	public int closestHerd(Forest pf)
	{
		int x , y , i;
		
		x = this.pos_x;
		y = this.pos_y;
		
		int h , b , distance;
		
		int shortest = 0;
		
		Animal closest = null;
		
		
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
					closest = pf.animals[i];
				}
				else
				{
					if(distance < shortest)
					{
						shortest = distance;
						closest = pf.animals[i];
					}
				}
				
			}
		}
		
		if(closest != null)
		{
			System.out.println("Rhino " + this.id + " Moving to " + (closest.pos_x + 1) + ":" + (closest.pos_y + 1));
		
			this.setCoordinates((closest.pos_x + 1) , (closest.pos_y + 1));
			
			return 1;
		
		}		
		
		return 0;
	
	}
	
	public void printDetails()
	{
		super.printDetails();
		System.out.println("Rhino\n");
	}
}
