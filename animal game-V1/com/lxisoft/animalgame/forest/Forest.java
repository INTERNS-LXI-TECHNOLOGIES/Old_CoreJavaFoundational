package com.lxisoft.animalgame.forest;
import java.util.*;
import com.lxisoft.animalgame.forest.animal.Animal;
import com.lxisoft.animalgame.forest.animal.carnivores.lion.Lion;
import com.lxisoft.animalgame.forest.animal.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.forest.animal.herbivores.rabbit.Rabbit;
import com.lxisoft.animalgame.forest.animal.herbivores.zeebra.Zeebra;
public class Forest
{
	Animal[][] forestGrid=new Animal[10][10];
	Scanner sc=new Scanner(System.in);
	Animal[] lions=new Lion[5];
	Animal[] tigers=new Tiger[5];
	Animal[] rabbits=new Rabbit[5];
	Animal[] zeebras=new Zeebra[5];
	
	public void createGrid()
	{
		System.out.println("Enter the dimentions of the forest grid:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				forestGrid[i][j]=null;
				System.out.print("\t"+forestGrid[i][j]);	
			}
			System.out.println(" ");
		}
	}
	
}