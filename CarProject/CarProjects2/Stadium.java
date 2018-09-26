public class Stadium
{
	String name;
	
	int length;
	
	Garage g;
	
	Stadium(String name , int len)
	{
		this.length = len;
	}
	
	public void setGarage(Garage garage)
	{
		this.g = garage;
	}
}