package com.lxisoft.animalgame.game;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.carnivores.lion.Lion;
import com.lxisoft.animalgame.game.forest.animals.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.game.forest.animals.herbivores.elephant.Elephant;
import com.lxisoft.animalgame.game.forest.animals.herbivores.deer.Deer;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.ForestSettings;
import com.lxisoft.animalgame.game.forest.animals.Animals;
public class AnimalGame
{
	Animals animal;
	int chooseAnimal;
	public Lion lion=new Lion();
	public Tiger tiger=new Tiger();
	public Elephant elephant=new Elephant();
	public Deer deer=new Deer();
	String animalName;
	ForestSettings forestDetail=new ForestSettings();
	Scanner scan=new Scanner(System.in);
	public void gameDetails()
	{
		forestDetail.setForest();
		forestDetail.setAnimalLocation(lion);
		forestDetail.setAnimalLocation(tiger);
		forestDetail.setAnimalLocation(elephant);
		forestDetail.setAnimalLocation(deer);
		System.out.println("\n\n\t\t******************************************************************");
		System.out.println("\t\t*\t\t   Initial Animal Grid View \t\t         *");
		System.out.println("\t\t******************************************************************\n\n");
		forestDetail.setForestStatus();
		System.out.println("1)Lion\t\t2)Tiger\n3)Elephant\t4)Deer");
		System.out.print("\nChoose Animal to play: ");
		chooseAnimal=scan.nextInt();
		animalLocation(chooseAnimal);
		forestDetail.locateAnimal(animal);
		forestDetail.getAnimalLocation(animal);
		forestDetail.showLocation();
	}

	void animalLocation(int chooseAnimal)
	 {
		
		if(chooseAnimal==1)
		{forestDetail.getAnimalLocation(lion);}
		if(chooseAnimal==2)
		{forestDetail.getAnimalLocation(tiger);}
		if(chooseAnimal==3)
		{forestDetail.getAnimalLocation(elephant);}
		if(chooseAnimal==4)
		{forestDetail.getAnimalLocation(deer);}
		
	 }

	public void startGame()
	{
		System.out.print("\nDo you want to Play ? (Y/N)");
		String play=scan.next();
		if (play.equals("Y") || play.equals("y")) 
		{
			
		}
	}
	
}