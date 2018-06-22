public class CarnivoreOperations extends Animal implements Carnivores
{
	public void eatMeat(Animal a)
	{
		System.out.println("\t"+Fname+" EATS "+a.Fname);
		setHunger(getHunger()+(a.getStrength()/2));
		setStrength(getStrength()+2);
	}
	public void kills(Animal a)
	{
		System.out.println("\t"+Fname+" KILLS "+a.Fname);
		setHunger(a.getStrength()-1);
	}
}