public class CarnivoreAnimal extends Animals implements Carnivore
{
	private int hunger;
	private int roam;
	
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

	public void eatMeat(Animals a)
	{
		System.out.println(getID()+" Eating "+a.getID());
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