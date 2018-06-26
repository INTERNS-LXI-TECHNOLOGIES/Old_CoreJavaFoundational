package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.*;
import com.lxisoft.animalgame.animalbehaviour.Carnivore;
import java.util.Random;
import java.util.*;

public class CarnivoreAnimal extends Animal implements Carnivore
	{
		 private int roam;
		 private ArrayList<Animal> nearby= new ArrayList<Animal>();
	
		 public void setRoam(int roam)
			{
				 this.roam=roam;
			}
	
		 public int getRoam()
			{
				 return roam;
			}
			
		 public void setNearby(Animal nearby)
			{
				 if(nearby!=null && nearby!=this)
					{
						this.nearby.add(nearby);
					}
			}
			
		 public Animal getNearby(int i)
			{
				 if(i<nearby.size() && i>=0)
					 return nearby.get(i);
				 else
					 return null;
			}
			
		 public boolean canRoam()
			{
				 boolean retVal=false;
				 if(getHunger()<2 && getStrength()>5)
					{
						 retVal =true;
					} 
				 return retVal;            
			}
	
		 public void checkNearby()
			{
				  for(int i=(nearby.size()-1);i>=0;i--)
					{
						 if(canRoam())
							{
								combat(nearby.get(i));
							}
					}
			}
		 public void combat(Animal a)
			{
				 Random r=new Random();
				 System.out.println("\n"+getID()+"\t vs   "+a.getID());
				 if(getStrength()>a.getStrength())
					{
						 int luckFact=r.nextInt(10);
						 if(luckFact==5)
							{
								 System.out.print("\tLuckily");
								 a.iWon(this);
								 iLost();
							}
						 else
							{
								iWon(a);
								a.iLost(); 
							}
					}
				 else if(getStrength()==a.getStrength())
					{
						 if(a.getHunger()>getHunger())
							{
								 a.iWon(this);
								 iLost();
							}
						 else
							{
								 iWon(a);
								 a.iLost();
							}
					}
				 else
					{
						 a.iWon(this);
						 iLost();
					}				 
			}
			
		 public void iWon(Animal lost)
			{
				super.iWon(lost);
				if(lost instanceof Herbivore)
					{
						 eatMeat(lost);
					}
				 else
					{
						 System.out.println("\t"+getID()+"\t defeated "+lost.getID());
					}
					
			}
	
		 public void eatMeat(Animal a)
			{
				 System.out.println("\t"+getID()+"\tEating\t"+a.getID());
				 if(a instanceof Elephant)
					 this.setHunger(2);
				 else
					 this.setHunger(this.getHunger()+1);
				 this.setStrength(this.getStrength()+a.getStrength());
			}
	}