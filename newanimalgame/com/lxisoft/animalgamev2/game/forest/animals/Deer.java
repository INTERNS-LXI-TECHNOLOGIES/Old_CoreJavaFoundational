package newanimalgame.com.lxisoft.animalgamev2.game.forest.animals;
import newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.Animal;
import newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.HerbivorousAnimal;

public class Deer extends HerbivorousAnimal
{
	public void Deer()
	{
		setAnimalEnergyLevel((int)(Math.random()*50)+50);
		setAnimalHungerLevel((int)(Math.random()*50)+50);
		setAnimalName("Deer");
		setAnimalType("Herbivorous");
	}
}