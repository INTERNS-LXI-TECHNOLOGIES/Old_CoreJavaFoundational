package com.lxisoft.animalgame.game;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Lion;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Tiger;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Deer;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Zebra;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Giraff;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Cheeta;
import com.lxisoft.animalgame.game.forest.ForestSettings;
import java.util.*;

public class AnimalGame
{
	int animalcount;
	String animalName;
	Animal animal;
	Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Deer deer=new Deer();
	Zebra zebra=new Zebra();
	Cheeta cheeta=new Cheeta();
	Giraff giraff=new Giraff();
	
	ForestSettings forestdetail=new ForestSettings();
	Scanner scan=new Scanner(System.in);
	
	public void gameDetails()
	{
		forestdetail.setForest();
		lion.create();
		tiger.create();
		deer.create();
		zebra.create();
		giraff.create();
		cheeta.create();
		System.out.println("\n");
        System.out.println("\t\t\t\t FOREST GRID");
		System.out.println("\n");
		
		forestdetail.setAnimalLocation(lion);
		forestdetail.setAnimalLocation(tiger);
		forestdetail.setAnimalLocation(deer);
		forestdetail.setAnimalLocation(zebra);
		forestdetail.setAnimalLocation(cheeta);
		forestdetail.setAnimalLocation(giraff);

		

		
		forestdetail.setForestStatus();
		
		System.out.println("Choose your Fighter");
		System.out.println("1.Lion,2.Tiger,3.Zebra,4.Deer,5.Cheeta,6.Giraff");
		animalcount=scan.nextInt();
		animalLocation(animalcount);
		
		
		
		
		
	}
	
		public void animalLocation(int animalcount)
		{
			if(animalcount==1)
			{forestdetail.getanimalLocation(lion);}
		    if(animalcount==2)
			{forestdetail.getanimalLocation(tiger);}
		    if(animalcount==3)
			{forestdetail.getanimalLocation(zebra);}
		    if(animalcount==4)
			{forestdetail.getanimalLocation(deer);}
		    if(animalcount==5)
			{forestdetail.getanimalLocation(cheeta);}
		    if(animalcount==6)
			{forestdetail.getanimalLocation(giraff);}
		
			
		
			
		
		}
		
}