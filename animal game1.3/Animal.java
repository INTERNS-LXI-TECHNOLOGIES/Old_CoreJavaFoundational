public class Animal{
	int strength;
	int hunger;
	int positionx=(int)(Math.random() * 10);
	int positiony=(int)(Math.random() * 10);
	int x;
	int y;
	public void setStrength(int a)
	{

		this.strength=a;
	}
	
	public void setHunger(int b)
	{
		this.hunger=b;
	}

	
	public int getStrength()
	{
		return strength;
	}
	
	public int getHunger()
	{
		return hunger;
	}
	
}
