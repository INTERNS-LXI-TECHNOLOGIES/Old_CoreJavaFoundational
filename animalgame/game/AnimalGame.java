package com.lxisoft.animalgame.game;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.carnivores.Carnivores;
import com.lxisoft.animalgame.game.forest.animals.herbivores.Herbivores;
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
	public int chooseAnimal;
	int xLoc,yLoc;
	int row,column;
	double[] distance;
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
		

	}

	public void startGame()
	{

		System.out.print("\nAre you ready to hunt ? (Y/N)");
		String play=scan.next();
		if (play.equals("Y") || play.equals("y")) 
		{
			System.out.println("1)Lion\t\t2)Tiger\n3)Elephant\t4)Deer");
			System.out.print("\nChoose Animal to play: ");
			chooseAnimal=scan.nextInt();
			animalLocation(chooseAnimal);
			forestDetail.locateAnimal(animal);
			forestDetail.getHunterAnimalLocation(animal);
			row=scan.nextInt();
			column=scan.nextInt();
			distance(row,column);
			
			if(chooseAnimal==1)
			{
				System.out.println(lion.animalType);
				lion.setLionDetails();
				lion.getLionDetails();
			}

			else if (chooseAnimal==2) 
			{
				System.out.println(tiger.animalType);
				tiger.setTigerDetails();
				tiger.getTigerDetails();
			}
			
			else if (chooseAnimal==3) 
			{
				System.out.println(elephant.animalType);
				elephant.setElephantDetails();
				elephant.getElephantDetails();
			}

			else if (chooseAnimal==4) 
			{
				System.out.println(deer.animalType);
				deer.setDeerDetails();
				deer.getDeerDetails();
			}
			
			
			
			
		//System.out.println(tiger.animalType);
		//System.out.println(elephant.animalType);
		//System.out.println(deer.animalType);
		}
		
	}

	void animalLocation(int chooseAnimal)
	 {
		
		if(chooseAnimal==1)
		{forestDetail.getHunterAnimalLocation(lion);}
		if(chooseAnimal==2)
		{forestDetail.getHunterAnimalLocation(tiger);}
		if(chooseAnimal==3)
		{forestDetail.getHunterAnimalLocation(elephant);}
		if(chooseAnimal==4)
		{forestDetail.getHunterAnimalLocation(deer);}
		
	 }

	 public void distance(int rowDistance,int columnDistance)
	 {
	 	forestDetail.findPreyDistance(rowDistance,columnDistance);
	 	distance=forestDetail.getDistance();

	 	for(int i=1;i<=forestDetail.getAnimalId();i++)
	 	{

	 	}
	 }

	
	
}