package com.lxisoft.animalGamev2.game;
import java.util.*;
import com.lxisoft.animalGamev2.animals.*;
import  com.lxisoft.animalGamev2.forest.*;
public class AnimalGame
{
	ForestControl forestControl=new ForestControl();
	int fighteLife=1,chosenAnimalId;
	public void game()
	{	Scanner scan=new Scanner(System.in);
		String space;
		forestControl.setForest();
		forestControl.animalCreation();
		forestControl.placeingAnimals();
		forestControl.getForeststatus();
		System.out.println("-------------------------!!!!!!!!!!!!!!!!!!!!!!!Welcome to jungle!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!-------------------");
		space=scan.nextLine();
		System.out.println("Let's just walk through the forest");
		space=scan.nextLine();
		System.out.println("\t\t\t\tLion-\tLion the king of beasts\n");
		space=scan.nextLine();
		System.out.println("\t\t\t\tTiger-\tA Tiger does not shout its tigritude, it acts\n");
		space=scan.nextLine();
		System.out.println("\t\t\t\tAthulya-\tThe animal born to define the word 'Fear'\n ");
		space=scan.nextLine();
		System.out.println("\t\t\t\tElephant-\tNature's greatest masterpiece, an Elephant\n");
		space=scan.nextLine();
		System.out.println("\t\t\t\tRabbit-\tFights with  brain not with size\n");
		space=scan.nextLine();
		System.out.println("\t\t\t\tDeer-\tCatch me if you can\n");
		space=scan.nextLine();
		System.out.println("\tNow select your fighter\n");
		System.out.println("...........................let's Rockkkkkkkkk");
		System.out.println("(1-Tiger,2-Lion,3-Rabbit,4-Deer,5-Elephant,6-Athulya)");
		chosenAnimalId=scan.nextInt();
		
		System.out.println("Totally there are "+forestControl.noOfAnimals(chosenAnimalId)+" no of same animal ");
	}
	public void animalFight( CarnivorousAnimal animal1,HerbivorousAnimal  animal2)
	 {  
	 int energy=15,energyLevel1,hungryLevel1,energyLevel2,hungryLevel2;
	 energyLevel1=animal1.getEnergyLevel();
	 hungryLevel1=animal1.getHungryLevel();
	 energyLevel2=animal2.getEnergyLevel();
	 hungryLevel2= animal2.getHungryLevel();
	 String animalOne=forestControl.findAnimal(animal1);
	 String animalTwo=forestControl.findAnimal(animal2);

	    System.out.println( "fighting" );
		if(animal1.getanimaltype()=="Carnivorous")
		{
			
		
		 if(animal2.getanimaltype()=="Carnivorous")
		 {
			 if(energyLevel1> energyLevel2)
			 {
	
				  energyLevel1=energyLevel1- energyLevel2; 
				  hungryLevel1= hungryLevel1+( energyLevel2/2);
				  System.out.println( "The  "+animalOne+" has beaten "+animalTwo);
				  kill(animal2);
				
			 }
			 else
			 {
				 energyLevel2=energyLevel2-energyLevel1; 
				 hungryLevel2= hungryLevel2+(energyLevel1/2);
				   System.out.println( "The  "+animalTwo+" has beaten "+animalOne);
				 kill(animal1);
				 fighteLife=0;
			 }
		 }
		
		 if(animal2.getanimaltype()=="Herbivorous")
		 {
			
			
			 if(energyLevel1> energyLevel2)
			 {
				 energyLevel1=energyLevel1- energyLevel2;
				 hungryLevel1= hungryLevel1-( energyLevel2/2);
				  System.out.println( "The  "+animalOne+" has eaten the "+animalTwo);
				 kill(animal2);
				 energyLevel1=energyLevel1+energy;
			 }
		 
		 else
		 { 
			energyLevel1=0;
			  energyLevel2= energyLevel2-energyLevel1; 
			  hungryLevel1=hungryLevel2+(energyLevel1/2);
			 if(hungryLevel1>100)
			 {
				 System.out.println( "The animal "+animalOne+" is dead due to increase in Hunger level."); 
					
				 kill(animal1);
				 fighteLife=0;
			 }
			 else
			 {
				  energyLevel1=energyLevel1+energy;
			 }
			  System.out.println( "The animal "+animalTwo+" has escaped from "+animalOne); 
			   kill(animal2);
			  energyLevel2= energyLevel2+energy;
		 }
		}
	 }
	 	if(animal1.getanimaltype()=="Herbivorous")
		 {
			
		
		 if(animal2.getanimaltype()=="Carnivorous")
		 {
			 if(energyLevel1> energyLevel2)
			 {
	
				 energyLevel1=energyLevel1- energyLevel2;
                 hungryLevel2= hungryLevel2+(energyLevel1/2);				 
				  System.out.println( "The  "+animalOne+" has beaten  "+animalTwo);
				kill(animal2);
				
			 }
			 else
			 {
				 energyLevel2=energyLevel2-energyLevel1; 
				 hungryLevel2= hungryLevel2+(energyLevel1/2);
				   System.out.println( "The  "+animalOne+" has been eaten by the "+animalTwo);
				 kill(animal1);
				 fighteLife=0;
			 }
		 }
		
		 if(animal2.getanimaltype()=="Herbivorous")
		 {
			// System.out.println( "No fighting both are Herbivorous ");
			  if(energyLevel1> energyLevel2)
			 {
	
				 energyLevel1=energyLevel1- energyLevel2;
                 hungryLevel2= hungryLevel2+(energyLevel1/2);				 
				  System.out.println( "The  "+animalTwo+" has ran away from  "+animalOne);
				kill(animal2);
				
			 }
			 else
			 {
				 energyLevel2=energyLevel2-energyLevel1; 
				 hungryLevel2= hungryLevel2+(energyLevel1/2);
				   System.out.println( "The  "+animalOne+" has lower energy than "+animalTwo);
				 kill(animal1);
				 fighteLife=0;
			 }
			
			
		 }
	 }
	 }
	 public void kill(Animal animal)
	 {	String animalName= forestControl.findAnimal(animal);
		 
		 	for(int i=0;i<forestControl.raw;i++)
		{  
			for(int j=0;j<forestControl.column;j++)
			{
				if( forestControl.animalArray[i][j]==animal)
				{
				System.out.println( "The cordinates of the "+animalName+" which has been removed from forst is "+i+"\t"+j); 
				forestControl.animalArray[i][j]=null;
				}
			}
			
		}
	 }
}