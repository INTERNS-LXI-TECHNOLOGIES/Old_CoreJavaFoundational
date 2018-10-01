import java.util.*;

public class Race
{
	Stadium st;
	
	Car cars[];
	
	static int no_of_reg_cars = 0;
	
	Race(Stadium stadium)
	{
		this.cars = new Car[5];
		this.st = stadium;
	}
	
	public void registerCar(int c)
	{
		this.cars[no_of_reg_cars] = this.st.g.getCar(c);
		no_of_reg_cars++;
	}
	
	public void start()
	{
		Random random = new Random();
		
		int n = 0;
		
		Boolean won = false;

		for(int i =0;i < this.st.length;i++)
		{
			for(int j =0;j < no_of_reg_cars;j++)
			{
				n = random.ints(0 , 10).limit(1).findFirst().getAsInt();
	
				this.cars[j].distance += n;
				
				if(this.cars[j].distance >= this.st.length)
				{
					won = true;
					break;
				}
			}
			
			if(won == true)
			{
				break;
			}
		}
	}
	
	public void result()
	{
		Car winner = this.cars[0];
		
		int j;
		
		int big;
		
		for(int i = 0;i < no_of_reg_cars;i++)
		{
			this.cars[i].printDetails();
		}
		
		big = this.cars[0].distance;
		
		for(int i = 0; i < no_of_reg_cars;i++)
		{
			if(big < this.cars[i].distance)
			{
				big = this.cars[i].distance;
				winner = this.cars[i];
			}
		}
		
		System.out.println("--------------------------------------Winner-------------------------------");
		winner.printDetails();
	}
	

}