package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.forest.animal.Animal;
import java.util.*;
public class Forest
{
	public void animalGrid()
	{
		Tiger tiger=new Tiger();
		Lion lion=new Lion();
		
		Rabbit rabbit=new Rabbit();
		Goat goat=new Goat();
		
	
		Animal[][] animal=new Animal[4][2];
	


		for(int row=0; row<4;row++)
	   {
			for(int column=0; column<2; column++)
				{
				
					animal[row][column]=null;
				
					System.out.print(animal[row][column]);
					System.out.print("\t");
				}
			System.out.println("\n");
		}
	
		
	}
}
