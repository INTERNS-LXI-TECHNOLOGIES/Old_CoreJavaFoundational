package com.lxisoft.forestv4.forest.animals.herbivores;
import com.lxisoft.forestv4.forest.animals.Animal;
import java.util.ArrayList;
public class Deer extends Animal implements Herbivore
{
	public void checkLuck()
	{
		if(luckFactor>=75)
			{
				System.out.println(luckFactor);
			System.out.println("Escaped from the location");
			}
	}
	
}