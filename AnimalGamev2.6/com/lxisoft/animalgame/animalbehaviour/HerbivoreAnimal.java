package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.Animal;
import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.animalbehaviour.Herbivore;
import java.util.Random;
public class HerbivoreAnimal extends Animal implements Herbivore 
	{
		 public HerbivoreAnimal(int numID,int strength,int hunger)
			{
				 super(numID,strength,hunger);
			}
		 
		 public void runAway(Animal opponent)
			{
				 Forest.setGridElement(getXLoc(),getYLoc(),null);
				 changeLocation(opponent);
				 System.out.println("\t"+this.getID()+" ran away from "+opponent.getID());
			}
			
		 public void changeLocation(Animal opponent)
			{
				 Random r=new Random();
				 CarnivoreAnimal animal=(CarnivoreAnimal)(opponent);
				 int minX=(animal.getXLoc()-animal.getRoam());
				 int maxX=(animal.getXLoc()+animal.getRoam());
				 int minY=(animal.getYLoc()-animal.getRoam());
				 int maxY=(animal.getYLoc()+animal.getRoam());
				 int tempX,tempY;
				 do
					{
						 tempX= r.nextInt(7);
						 tempY= r.nextInt(7);
					}while((tempX>minX)&&(tempX<maxX)&&(tempY>minY)&&(tempY<maxY)&&(Forest.getGridElement(tempX,tempY)!=null));
				 Forest.setGridElement(tempX,tempY,this);
			}
			
		 public void defeated(Animal lost)
			{
				 setStrength(lost.getStrength()/2);
				 runAway(lost);
				 lost.setStrength(lost.getStrength()-(getStrength()/2));
			}
	}