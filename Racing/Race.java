public class Race
{
	Garage g;

	Car[] cars;


public void	setGarage(Garage g)
	{
		this.g = g;
	}
	
public void	start()
{
	Car winner = this.g.cars[0];
	double big = this.g.cars[0].power;
	for(int i=0;i<g.no;i++)
	{
		if(big < this.g.cars[i].power)
		{
			big = this.g.cars[i].power;
			winner = this.g.cars[i];
		}
	}


   System.out.println(winner.brand + " is the winner!!");
}
	

}

