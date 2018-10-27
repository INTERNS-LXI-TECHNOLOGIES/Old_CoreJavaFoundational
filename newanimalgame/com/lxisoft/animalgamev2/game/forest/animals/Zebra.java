package newanimalgame.com.lxisoft.animalgamev2.game.forest.animals;
import newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.Animal;
import newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.HerbivorousAnimal;

public class Zebra extends HerbivorousAnimal
{
	public void Zebra()
	{
		setAnimalEnergyLevel((int)(Math.random()*50)+50);
		setAnimalHungerLevel((int)(Math.random()*50)+50);
		setAnimalName("Zebra");
		setAnimalType("Herbivorous");
		
	}  
}