package com.lxisoft.animalgame.game.forest;
import com.lxisoft.animalgame.game.AnimalGame;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.Carnivores;
import com.lxisoft.animalgame.game.forest.animals.herbivores.Herbivores;
import com.lxisoft.animalgame.game.forest.animals.carnivores.lion.Lion;
import com.lxisoft.animalgame.game.forest.animals.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.game.forest.animals.herbivores.elephant.Elephant;
import com.lxisoft.animalgame.game.forest.animals.herbivores.deer.Deer;
import java.util.*;
public class ForestSettings
{
	Scanner scan=new Scanner(System.in);
	Forest forest=new Forest();
	Animals[][] animalList;
	String preyName,preyType;
	int preyEnergy,preyHunger;
	int row,column,i,j;
	int playerX,playerY;
	int animalId=1;
	int xLoc,yLoc;
	public double[] distance=new double[10];
	public String[] opponentName=new String[10];
	public String[] opponentType=new String[10];
	public int[] opponentEnergy=new int[10];
	public int[] opponentHunger=new int[10];
	String animalName;
	int playerEnergy,playerHunger;
	String playerName,playerType;
	public Lion lion=new Lion();
	public Tiger tiger=new Tiger();
	public Elephant elephant=new Elephant();
	public Deer deer=new Deer();
	public void setForest()
	{
		System.out.print("Enter the size of the forest: ");
		row=scan.nextInt();
		column=scan.nextInt();
		forest.setForestArea(row,column);
	}

	public void setAnimalLocation(Animals animal)
	{
	
		do
		{
			i=(int)(Math.random()*row)+1;
			j=(int)(Math.random()*column)+1;
	
			animalList=forest.getForestArea();
		}
		while(animalList[i][j]!=null);
			animalList[i][j]=animal;
	}

	
	public void setForestStatus()
	{
		try
		{
			for(int i=1;i<=row;i++)
			{	
				System.out.print("\t\t");
				for (int j=1;j<=column;j++)
			    {
			    	if(animalList[i][j]!=null)
			    	{
			    		if(animalList[i][j] instanceof Lion)
			    		{
			    			System.out.print("\tLion\t");
			    		}

			    		if(animalList[i][j] instanceof Tiger)
			    		{
			    			System.out.print("\tTiger\t");
			    		}

			    		if(animalList[i][j] instanceof Elephant)
			    		{
			    			System.out.print("\tElephant");
			    		}

			    		if(animalList[i][j] instanceof Deer)
			    		{
			    			System.out.print("\tDeer\t");
			    		}
			    	}
					
					else
					{	

						System.out.print("\t*\t");
					}
					
				}

				System.out.println("\n\n\n");

			}
		}

		catch(NullPointerException e)
		{
			System.out.println("0");
		}
		
	}


	public void getHunterAnimalLocation(Animals animal)
	{	
		String animalName=locateAnimal(animal);
		boolean located=false;
		if(animalList[i][j]!=animal)
		{
			for(i=1;i<=row;i++)
			{  
				for(j=1;j<=column;j++)
				{
					
					if(animalList[i][j]==animal && located==false)
					{
						located=true;
						animalList[i][j]=animal;
						System.out.println( "\nLocation of "+animalName+" : ("+i+","+j+")"); 

					}
					
				}
			}
		}	
	}


	public String locateAnimal(Animals animal)
	{
		
		if(animal instanceof Lion)
		  {
		  	animalName= "Lion";
		  }

		   if(animal instanceof Tiger)
		  {
		  	animalName= "Tiger";
		  }

		    if(animal instanceof Elephant)
		  {
		  	animalName="Elephant";
		  }

		   if(animal instanceof Deer)
		  {
		  	animalName="Deer";
		  }
		  	return animalName;
			
	}


	public void findPreyDistance(int xLoc,int yLoc)
	{	
		for (int i=1;i<=row;i++)
		{
			for (int j=1;j<=column;j++) 
			{
				if(animalList[i][j]!=null) 
				{

				  if(animalList[i][j] instanceof Lion)
				  {
				  	preyName= "Lion";
					lion.setLionDetails();
					preyEnergy=lion.getEnergyLevel();
					preyHunger=lion.getHungerLevel();
					preyType=lion.animalType;
					//lionName=lion.getAnimalName();
					

				  }

				   if(animalList[i][j] instanceof Tiger)
				  {
				  	preyName= "Tiger";
				  	tiger.setTigerDetails();
					preyEnergy=tiger.getEnergyLevel();
					preyHunger=tiger.getHungerLevel();
					preyType=tiger.animalType;
				  }

				    if(animalList[i][j] instanceof Elephant)
				  {
				  	preyName="Elephant";
				  	elephant.setElephantDetails();
					preyEnergy=elephant.getEnergyLevel();
					preyHunger=elephant.getHungerLevel();
					preyType=elephant.animalType;
				  }

				   if(animalList[i][j] instanceof Deer)
				  {
				  	preyName="Deer";
				  	deer.setDeerDetails();
					preyEnergy=deer.getEnergyLevel();
					preyHunger=deer.getHungerLevel();
					preyType=deer.animalType;
				  }

					if(i==xLoc && j==yLoc)
					{

					}
					else
					{
						distance[animalId]=Math.sqrt((i-xLoc)*(i-xLoc)+(j-yLoc)*(j-yLoc));
						opponentName[i]=preyName;
						opponentType[i]=preyType;
						opponentEnergy[i]=preyEnergy;
						opponentHunger[i]=preyHunger;
						System.out.println("\nOpponent "+opponentName[i]+"\nDistance : "+distance[animalId]+"\nType : "+opponentType[i]+"\nEnergy : "+opponentEnergy[i]+"\nHunger : "+opponentHunger[i]);
						animalId+=1;
					}
				}
			}
		}

		double[] distanceArray={distance[1],distance[2],distance[3]};
		String[] opponentNameList={opponentName[1],opponentName[2],opponentName[3]};
		String[] opponentTypeList={opponentType[1],opponentType[2],opponentType[3]};
		int[] opponentEnergyList={opponentEnergy[1],opponentEnergy[2],opponentEnergy[3]};
		int[] opponentHungerList={opponentHunger[1],opponentHunger[2],opponentHunger[3]};
		double minimumDistance,tempDistance;
		String tempName,tempType,opponentPlayerName,opponentPlayerType;
		int tempEnergy,tempHunger,opponentPlayerEnergy,opponentPlayerHunger;
		for(int i=0;i<distanceArray.length;i++)
		{
			for(int j=i+1;j<distanceArray.length;j++)
			{
			
				if(distanceArray[i]>distanceArray[j]) 
				{
					tempDistance=distanceArray[i];
					distanceArray[i]=distanceArray[j];
					distanceArray[j]=tempDistance;

					tempName=opponentNameList[i];
					opponentNameList[i]=opponentNameList[j];
					opponentNameList[j]=tempName;

					tempType=opponentTypeList[i];
					opponentTypeList[i]=opponentTypeList[j];
					opponentTypeList[j]=tempType;

					tempEnergy=opponentEnergyList[i];
					opponentEnergyList[i]=opponentEnergyList[j];
					opponentEnergyList[j]=tempEnergy;

					tempHunger=opponentHungerList[i];
					opponentHungerList[i]=opponentHungerList[j];
					opponentHungerList[j]=tempHunger;

				}	
			}
		}
		minimumDistance=distanceArray[0];
		opponentPlayerName=opponentNameList[0];
		opponentPlayerType=opponentTypeList[0];
		opponentPlayerEnergy=opponentEnergyList[0];
		opponentPlayerHunger=opponentHungerList[0];

		System.out.println("\nNearest Prey is "+opponentPlayerName+"\nDistance to Hunt : "+minimumDistance+"\nPrey Type: "+opponentPlayerType+"\nPrey Energy: "+opponentPlayerEnergy+"\nPrey Hunger"+opponentPlayerHunger);
	}

	public double[] getDistance()
	{
		return distance;
	}

	public int getAnimalId()
	{
		return animalId;
	}

	public void getPlayerDetails(int chooseAnimal,int xLocation,int yLocation)
	 {
	 	playerX=xLocation;
		playerY=yLocation;
	 	
	 	if(chooseAnimal==1)
			{
				lion.setLionDetails();
				playerName=lion.getAnimalName();
				playerEnergy=lion.getEnergyLevel();
				playerHunger=lion.getHungerLevel();
				playerType=lion.animalType;
				System.out.println("\nAnimalName: "+playerName+"\nEnergyLevel: "+playerEnergy+"\nHungerLevel: "+playerHunger+"\nAnimalType: "+playerType+"\nPlayer Location: "+playerX+","+playerY);
			}

			else if (chooseAnimal==2) 
			{

				tiger.setTigerDetails();
				playerName=tiger.getAnimalName();
				playerEnergy=tiger.getEnergyLevel();
				playerHunger=tiger.getHungerLevel();
				playerType=tiger.animalType;
			
				System.out.println("\nAnimalName: "+playerName+"\nEnergyLevel: "+playerEnergy+"\nHungerLevel: "+playerHunger+"\nAnimalType: "+playerType+"\nPlayer Location: "+playerX+","+playerY);
				
			}
			
			else if (chooseAnimal==3) 
			{
				
				elephant.setElephantDetails();
				playerName=elephant.getAnimalName();
				playerEnergy=elephant.getEnergyLevel();
				playerHunger=elephant.getHungerLevel();
				playerType=elephant.animalType;
				System.out.println("AnimalName: "+playerName+"\nEnergyLevel: "+playerEnergy+"\nHungerLevel: "+playerHunger+"\nAnimalType: "+playerType+"\nPlayer Location: "+playerX+","+playerY);
				
			}

			else if (chooseAnimal==4) 
			{
				
				deer.setDeerDetails();
				playerName=deer.getAnimalName();
				playerEnergy=deer.getEnergyLevel();
				playerHunger=deer.getHungerLevel();
				playerType=deer.animalType;
				System.out.println("\nAnimalName: "+playerName+"\nEnergyLevel: "+playerEnergy+"\nHungryLevel: "+playerHunger+"\nAnimalType: "+playerType+"\nPlayer Location: "+playerX+","+playerY);
				
			}
	 }


	/*public void combat()
	{

		if (playerEnergy>0 && playerHunger>0) 
		{


			if(playerType=="Herbivores" && opponentPlayerType=="Herbivores")
			{


				if(playerEnergy>opponentPlayerEnergy)
				{

				}


				if(playerEnergy==opponentPlayerEnergy)
				{

				}


				if(playerEnergy<opponentPlayerEnergy)
				{

				}


			}



			if(playerType=="Herbivores" && opponentPlayerType=="Carnivores")
			{


				if(playerEnergy>opponentPlayerEnergy)
				{

				}


				if(playerEnergy==opponentPlayerEnergy)
				{

				}


				if(playerEnergy<opponentPlayerEnergy)
				{

				}


			}



			if(playerType=="Carnivores" && opponentPlayerType=="Herbivores")
			{


				if(playerEnergy>opponentPlayerEnergy)
				{

				}


				if(playerEnergy==opponentPlayerEnergy)
				{

				}


				if(playerEnergy<opponentPlayerEnergy)
				{

				}


			}



			if(playerType=="Carnivores" && opponentPlayerType=="Carnivores")
			{


				if(playerEnergy>opponentPlayerEnergy)
				{

				}


				if(playerEnergy==opponentPlayerEnergy)
				{

				}


				if(playerEnergy<opponentPlayerEnergy)
				{

				}


			}

		}

	}*/

}