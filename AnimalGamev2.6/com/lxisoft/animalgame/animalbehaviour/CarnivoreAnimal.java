package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.*;
import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.animalbehaviour.Carnivore;
import java.util.*;

public class CarnivoreAnimal extends Animal implements Carnivore
	{
		 private int roam;
		 private ArrayList<Animal> nearby= new ArrayList<Animal>();
		 
		 public CarnivoreAnimal(int numID,int strength,int hunger)
			{
				 super(numID,strength,hunger);
			}
	
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
			
		 public void setNearby()
			{
				 int roam=getRoam();
			     for(int i=(getXLoc()-roam);i<=(getXLoc()+roam);i++)
					{
				 		 for(int j=(getYLoc()-roam);j<=(getYLoc()+roam);j++)
							{
								if(i>=0 && j>=0 && i<7 && j<7 && Forest.getGridElement(i,j)!=null && Forest.getGridElement(i,j)!=this)
									{
										 nearby.add(Forest.getGridElement(i,j));
									}
							}
					}
			}
	
		 public void checkNearby()
			{
				 int i;
				 Random r=new Random();
				 setNearby();
				 while(nearby.size()!=0 && canRoam())
					{
						 i=r.nextInt(nearby.size());
						 if(nearby.get(i) instanceof Carnivore)
							{
								 if((Math.random()*10) <3) 		//30% chance to fight with a carnivore
									 combat(nearby.get(i));
							}
						 else
							{
								 combat(nearby.get(i));
							}
						 nearby.remove(i);
					}
			}
			
		 public void combat(Animal a)
			{
				 Random r=new Random();
				 Forest.printGrid(this,a);
				 System.out.println("\n"+getID()+"\t vs   "+a.getID());
				 if(getStrength()>a.getStrength())
					{
						 int luckFact=r.nextInt(10);
						 if(luckFact==5)
							{
								 System.out.print("\tLuckily");
								 a.defeated(this);
							}
						 else
							{
								defeated(a);
							}
					}
				 else if(getStrength()==a.getStrength())
					{
						 if(a.getHunger()<getHunger())
							{
								 a.defeated(this);
							}
						 else
							{
								 defeated(a);
							}
					}
				 else
					{
						 a.defeated(this);
					}				 
			}
			
		 public void defeated(Animal lost)
			{
				 setStrength(lost.getStrength()/2);
				 if(lost instanceof Herbivore)
					{
						 eatMeat(lost);
					}
				 else
					{
						 System.out.println("\t"+getID()+"\t defeated "+lost.getID());
					}
				 lost.dead();
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