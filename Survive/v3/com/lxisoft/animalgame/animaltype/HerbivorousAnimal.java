package com.lxisoft.animalgame.animaltype;
import com.lxisoft.animalgame.animal.*;
import java.io.*;
import java.util.*;
public class HerbivorousAnimal extends Animal implements Herbivorous
{
	public void grassEat()
	{
		if(getHunger()<5)
		{
			System.out.println("\n"+this.getName()+"\tEating grass ");
		}
	}
}