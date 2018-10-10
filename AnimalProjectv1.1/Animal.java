public class Animal
{
	public int id;
	
	public int pos_x = 0;
	public int pos_y = 0;
	
	public int strength = 0;
	public int hunger_level = 0;
	
	Forest f = null;
	
	Animal(int pid)
	{
		if(pid < 0)
		{
			System.err.println("Error : Invalid id > 0");
		}
		
		this.id = pid;
	}
	

	public void setCoordinates(int px , int py)
	{
		this.pos_x = px;
		this.pos_y = py;
	}
	
	public void setStrength(int pstrength)
	{
		this.strength = pstrength;
	}
	
	public void setHungerLevel(int phunger_level)
	{
		this.hunger_level = phunger_level;
	}
	
	public void printDetails()
	{
		System.out.println("ID : " + this.id);
		System.out.println("[ X-> :" + this.pos_x + " | Y-> : " + this.pos_y);
		System.out.println("Hunger" + this.hunger_level + " | Strength : " + this.strength);
	}
	
	
}
