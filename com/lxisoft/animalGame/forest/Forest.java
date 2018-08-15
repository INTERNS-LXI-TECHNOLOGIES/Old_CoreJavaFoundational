package com.lxisoft.animalGame.forest;
import java.util.Random;
import com.lxisoft.animalGame.animal.*;
import com.lxisoft.animalGame.forest.*;

public class Forest
{
	Animal animal=new Animal();
	public Forest()
	{
		Animal tiger=new Tiger();
		Animal lion=new Lion();
		Animal rabbit=new Rabbit();
		Animal deer =new Deer();


	}
	
	public void selectAnimal()
	{
		Random random=new Random();
		int animal1=random.nextInt(4);
		int animal2=random.nextInt(4);
		
		animal.fight(animal1,animal2);
		
	}
	
	
		
	
}