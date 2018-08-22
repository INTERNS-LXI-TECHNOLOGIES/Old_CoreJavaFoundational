package com.lxisoft.Animalgame.forest;

import com.lxisoft.Animalgame.forest.Forest;
import com.lxisoft.Animalgame.forest.Animal;
import java.util.*;

public class SetForest
{
	Scanner scan=new Scanner(System.in);
	Forest fore=new Forest();
	Animal[][] animalArray;
	int row,column,i,j;
	
	public void forestcontrol()
	{
			System.out.println("ENTER THE GRID SIZE::");
			row=scan.nextInt();
			column=scan.nextInt();
			fore.setForest(row,column);
	}
//public void setAnimallocation(Animal)
}
			