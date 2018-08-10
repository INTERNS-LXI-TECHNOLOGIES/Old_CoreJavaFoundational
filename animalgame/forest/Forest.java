package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.forest.animals.Animal;
import java.util.*;

public class Forest
{
	public void animalGrid()
	{
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Deer deer = new Deer();
		Rabbit rabbit = new Rabbit();
		String[][] animal = new String[4][2];
		for(int row=0;row<4;row++)
		{
			for(int column=0;column<2;column++)
			{
			animal[row][column]=null;
			System.out.print(animal[row][column]);
			System.out.print("\t");
			}
			System.out.println("\n");
		}
		
	}
}