public class HerbivoreAnimal extends Animal implements Herbivore
{
	public void runAway(Animal a)
	{
		System.out.println("\t"+this.getID()+" ran away from "+a.getID());
		this.setStrength(this.getStrength()-(a.getStrength()/2));
		a.setStrength(a.getStrength()-(this.getStrength()/2));
	}
}