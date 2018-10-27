package newanimalgame.com.lxisoft.animalgamev2.game.forest.animals;
import newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.Animal;
import newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.CarnivorousAnimal;

public class Lion extends CarnivorousAnimal
{
	public void Lion()
	{
		 setAnimalEnergyLevel((int)(Math.random()*50)+50);
	     setAnimalHungerLevel((int)(Math.random()*50)+50);
		 setAnimalName("Lion");
		 setAnimalType("Carnivorous");
	}
}

