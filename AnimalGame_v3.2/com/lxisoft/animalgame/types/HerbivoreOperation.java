package com.lxisoft.animalgame.types;
import java.util.Random;
import com.lxisoft.animalgame.animalproperty.Animal;
public class HerbivoreOperation extends Animal implements Herbivores
{
	public boolean escape()
	{
		Random r = new Random();
		int luck = r.nextInt(10);
		if(luck == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}