public class Animal{
	private int strength;
	private int hunger;
	private boolean isAlive=true;
	public void setIsAlive(boolean a)
	{
		this.isAlive=a;
	}
	
	public boolean getIsAlive()
	{
		return isAlive;
	}
	
	public void eat()
	{
		System.out.println("eating");
	}
	public void sound()
	{
		System.out.println("making sound");
	}
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
