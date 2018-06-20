public class HerbivoreAnimal extends Animals implements Herbivore
{
	public void runAway(Animals a)
	{
		System.out.println(this.getID()+" ran away from "+a.getID());
		this.setStrength(this.getStrength()-(a.getStrength()/2));
	}
}