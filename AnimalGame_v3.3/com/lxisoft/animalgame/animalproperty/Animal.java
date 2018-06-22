package com.lxisoft.animalgame.animalproperty;
import com.lxisoft.animalgame.types.HerbivoreOperation;
import com.lxisoft.animalgame.types.CarnivoreOperations;
import com.lxisoft.animalgame.types.Herbivores;
import com.lxisoft.animalgame.types.Carnivores;
public class Animal{

	private int strength,ded;
	private int hunger;
	private int roaming;
	private int locx,locy;
	private char name;
	private String Fname;
	
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
	public void setName(char c)
	{
		name = c;
	}
	public void setFName(String s)
	{
		Fname = s;
	}
	
	//get values
	public String getname1()
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
	public char getName()
	{
		return name;
	}

	//OTHER OPERATIONS
	//hunger
	public boolean isHungry()
	{
		if(getHunger()>5)
			return true;
		else 
			return false;
	}
	//if the animal can walk
	public boolean isStrong()
	{
		if(getStrength()<3)
			return true;
		else
			return false;
	}
	//finding the stronger
	boolean battle(Animal a,Animal b)
	{
		
		if((a.getStrength() >= b.getStrength()))
			return true;
		else
			return false;
	}
	//X limit check
	boolean checkXLimit(Animal a)
	{
		if((a.getLocationX()-a.getRoaming())<0)
			return true;
		else 
			return false;
	}	
	//Y limit check
	boolean checkYLimit(Animal a)
	{
		if((a.getLocationY()-a.getRoaming())<0)
			return true;
		else 
			return false;
	}	
	//set value for k
	int setK(Animal a)
	{
		if(checkXLimit(a))
			return 0;
		else
			return (a.getLocationX()-a.getRoaming());
	}
	// set value for l
	int setL(Animal a)
	{
		if(checkYLimit(a))
			return 0;
		else
			return (a.getLocationY()-a.getRoaming());
	}
	//set x limit 
	int endPointX(Animal test)
	{
		if((test.getLocationX()+test.getRoaming())>10)
			return 10;
		else
			return (test.getLocationX()+test.getRoaming());
	}
	//set y limit
	int endPointY(Animal test)
	{
		if((test.getLocationY()+test.getRoaming())>10)
			return 10;
		else
			return (test.getLocationY()+test.getRoaming());
	}
	//fighting of animals in range
	public Animal[][] fightOff(Animal a,Animal [][] b)
	{
		int k,l,flag=0;
		Animal test,test2;
		test = a;
		for(k = setK(test);k<endPointX(test);k++)
		{
			for(l = setL(test);l<endPointY(test);l++)
			{
				//if(b[k][l]!=null)
				try
				{
					flag = 0;
					test2 = b[k][l];
					System.out.println(test.Fname+" FIGHTS "+test2.Fname);
					if(test.getStrength()>= test2.getStrength())
					{	
						if(test2 instanceof Herbivores)
							if(!((HerbivoreOperation)test2).escape())
							{
								((CarnivoreOperations)test).eatMeat(test2);
								flag = 1;
							}
							else
							{
								System.out.println("\t"+test2.Fname+" ESCAPES WITH LUCK");
							}
						else //if(test2 instanceof Carnivores)
						{	
							((CarnivoreOperations)test).kills(test2);
							flag=1;
						}
						if(flag == 1)
						{
							b[k][l]=null;
						}
					}
					else
					{
						System.out.println("\t"+test2.Fname+" ESCAPES ");
					}
				}catch(Exception e){}	
			}
		}
		return b;
	}	
}