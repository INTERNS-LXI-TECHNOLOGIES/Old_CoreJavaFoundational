
public class Animal{

	private int strength;
	private int hunger;
	private int roaming;
	private int locx,locy;
	private char Type;
	char name;
	String Fname;
	
	//set values
	public void setStrength(int x)
	{
		strength = x;
	}
	public void setHunger(int x)
	{
		hunger = x;
	}
	public void setRoaming(int x)
	{
		roaming = x;
	}
	public void setLocation(int x, int y)
	{
		locx = x;
		locy = y;
	}
	public void  setType(char c)
	{
		Type = c;
	}
	public void setName(char c)
	{
		name = c;
	}
	
	//get values
	String name1()
	{
		return Fname;
	}
	public int getStrength()
	{
		return strength;
	}
	public int getHunger()
	{
		return hunger;
	}
	public int getRoaming()
	{
		return roaming;
	}
	public int getLocationX()
	{
		return locx;
	}
	public int getLocationY()
	{
		return locy;
	}
	public char  getType()
	{
		return Type;
	}
	public char getName()
	{
		return name;
	}	
}

