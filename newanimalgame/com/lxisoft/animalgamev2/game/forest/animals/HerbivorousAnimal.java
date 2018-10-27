package newanimalgame.com.lxisoft.animalgamev2.game.forest.animals;
import  newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.Animal;
import  newanimalgame.com.lxisoft.animalgamev2.game.forest.animals.Herbivore;

public class HerbivorousAnimal extends Animal implements Herbivore

{
	public void eat()
	{
		System.out.println("eat grass");
	}
}
