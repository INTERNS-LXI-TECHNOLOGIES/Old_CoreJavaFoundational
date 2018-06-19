import java.util.Random;

public class CarnivoreAnimal extends Animal implements Carnivore
{
	private int hunger;
	private int roam;
	private Random r=new Random();
	
	
	public void setHunger(int hunger)
    {
		if(hunger<2)
		     this.hunger=hunger;
		else
			 this.hunger=2;
    }
 
    public int getHunger()
	{
	    return hunger;
    }
	
	public void setRoam(int roam)
    {
	    this.roam=roam;
    }
	
	public int getRoam()
    {
	    return roam;
    }
	
	public void checkNearby()
        {
			if(this instanceof Carnivore)
			{
                for(int i=0;i<6;i++)
				{
                    for(int j=0;j<6;j++)
                       {
                            if(isAlive() && getGridMember(i,j)!=this && getGridMember(i,j)!=null && getGridMember(getXLoc(),getYLoc())!=null)
						    {
							     if((Math.abs(i-getXLoc()))<=getRoam() && (Math.abs(j-getYLoc()))<=getRoam())
								    {
										 if(canRoam())
											 combat(getGridMember(i,j));
								    }
						    }
				    }
				}
			}
		}
			
	public void combat(Animal a)
		{
			 System.out.println("\n"+getID()+"\t vs   "+a.getID());
			 if(getStrength()>a.getStrength())
				{
					 iWon(a);
				}
			 else if(getStrength()==a.getStrength())
				{
					 boolean bool=r.nextBoolean(); 
					 if(bool)
						{
							 a.iWon(this);
							 try
								{
								 ((CarnivoreAnimal)a).checkNearby();
								}
							 catch(Exception e)
							 {
								 
							 }
						}
					 else
						{
							 iWon(a);
						}
				}
			 else
				{
					 a.iWon(this);
					 try
						{
							 ((CarnivoreAnimal)a).checkNearby();
						}
					 catch(Exception e)
						{
						}
				}				 
		}

	public void eatMeat(Animal a)
	{
		System.out.println("\t"+getID()+"\tEating\t"+a.getID());
		this.setHunger(this.getHunger()+1);
		this.setStrength(this.getStrength()+a.getStrength());
	}
	
	public boolean canRoam()
	{
		boolean retVal=false;
        if(getHunger()<2 && getStrength()>5)
        {
            retVal =true;
        } 
		return retVal;            
	}
}