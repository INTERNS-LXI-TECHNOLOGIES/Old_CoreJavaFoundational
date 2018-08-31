package com.lxisoft.animalgame.game;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Lion;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Tiger;
import  com.lxisoft.animalgame.game.forest.animal.herbivorous.Deer;
import   com.lxisoft.animalgame.game.forest.animal.herbivorous.Zebra;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Giraffe;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Cheeta;
import com.lxisoft.animalgame.game.forest.ForestSettings;
import java.util.*;

public class AnimalGame
{
	int animalcount,row,column,fighterlife;
	
	Animal animal,animalOne,animalTwo,animalObject1,animalObject2;
	
	double[] animalDistance;
	double smallestDistance;
	String[] names;
	String animalName;
	
	Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Deer deer=new Deer();
	Zebra zebra=new Zebra();
	Cheeta cheeta=new Cheeta();
	Giraffe giraffe=new Giraffe();
	
	
	ForestSettings forestdetail=new ForestSettings();
	Scanner scan=new Scanner(System.in);
	
	public void gameDetails()
	{
		forestdetail.setForest();
		lion.create();
		tiger.create();
		deer.create();
		zebra.create();
		giraffe.create();
		cheeta.create();
		System.out.println("\n");
        System.out.println("\t\t\t\t FOREST GRID");
		System.out.println("\n");
		
		forestdetail.setAnimalLocation(lion);
		forestdetail.setAnimalLocation(tiger);
		forestdetail.setAnimalLocation(deer);
		forestdetail.setAnimalLocation(zebra);
		forestdetail.setAnimalLocation(cheeta);
		forestdetail.setAnimalLocation(giraffe);
	

		forestdetail.setForestStatus();
		
		System.out.println("Choose your Fighter");
		System.out.println("1.Lion,2.Tiger,3.Zebra,4.Deer,5.Cheeta,6.Giraffe");
		animalcount=scan.nextInt();
		animalLocation(animalcount);
		
		fighterlife=forestdetail.getFighterLife();
		
		while(fighterlife==1&&forestdetail.getanimalcount()!=-1)
		{
			
			System.out.println("\n enter the coordinates of the fighter\n");
			row=scan.nextInt();
			column=scan.nextInt();
		
			animalObject1=setanimalFight(animalcount);			   

			
			animalDistance(row,column);
		
			if(forestdetail.getanimalcount()!=-1)
			{
				System.out.println("\n nearest animal is:="+animalName+"\n");
				System.out.println("\n nearest animalDistance is:="+smallestDistance+"\n");
				animalObject2=getAnimal(animalName);

				
				forestdetail.animalFight(animalObject1,animalObject2);
				fighterlife=forestdetail.getFighterLife();
				forestdetail.setForestStatus();
			}
		}
		
		if(fighterlife!=1)
		{
			System.out.println("\t OWWW....YOU ARE DEAD");
			System.out.println("\t GAME OVER");
		}
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
			{forestdetail.getanimalLocation(giraffe);}
		}
		
		
			public	void animalDistance(int a,int b)
			{
				forestdetail.setanimalDistance(a,b);
				animalDistance=forestdetail.getanimalDistance();
				names=forestdetail.getanimalName();
				if(forestdetail.getanimalcount()!=-1)
					{
						smallestDistance=animalDistance[0];
						animalName=names[0];
						for(int j=1;j<forestdetail.getanimalcount();j++)
						{
							if(smallestDistance<=animalDistance[j])
								{}
							else
							{
								smallestDistance=animalDistance[j];
								animalName=names[j];
							}
						}
					}
					else
					{
						System.out.println("\t\t\tCONGRATS YOU ARE THE WINNER");
					}
					for(int i=0;i<forestdetail.getanimalcount();i++)
					{
						System.out.println("\t\tName=" +names[i]);
						System.out.println("\t\tdistance="+animalDistance[i]);
					}
			}

		
	    public	Animal setanimalFight(int animalNo)
		{
			animalcount=animalNo;
			if(animalcount==1)
			{
				animalOne=lion;
			}
			if(animalcount==2)
			{
				animalOne=tiger;
			}
			if(animalcount==3)
			{
				animalOne=zebra;
			}
			if(animalcount==4)
			{
				animalOne=deer;
			}
			if(animalcount==5)
			{
				animalOne=cheeta;
			}
			if(animalcount==6)
			{
				animalOne=giraffe;
			}
			return animalOne;
		}
		 Animal getAnimal(String animalName)
		{
			if(animalName=="lion")
			{
				animal=lion;
			}
			if(animalName=="tiger")
			{
				animal=tiger;
			}
			if(animalName=="zebra")
			{
				animal=zebra;
			}
			if(animalName=="deer")
			{
				animal=deer;
			}
			if(animalName=="cheeta")
			{
				animal=cheeta;
			}
			if(animalName=="giraffe")
			{
				animal=giraffe;
			}
			return animal;
			
		}
	
}
			
		
		

		
		
		
			
