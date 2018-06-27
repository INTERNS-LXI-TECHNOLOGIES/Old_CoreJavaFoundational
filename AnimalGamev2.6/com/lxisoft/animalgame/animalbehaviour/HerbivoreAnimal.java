package com.lxisoft.animalgame.animalbehaviour;
import com.lxisoft.animalgame.animals.Animal;
import com.lxisoft.animalgame.animalbehaviour.Herbivore;
import java.util.Random;
public class HerbivoreAnimal extends Animal implements Herbivore 
	{
		 private int oldX;
		 private int oldY;
		 
		 public HerbivoreAnimal(int numID,int strength,int hunger)
			{
				 super(numID,strength,hunger);
			}
			
		 public int getOldX()
			{
				return oldX;
			}
			
		 public int getOldY()
			{
				return oldY;
			}
		 
		 
		 public void runAway(Animal a)
			{
				 oldX=getXLoc();
				 oldY=getYLoc();
				 changeLocation();
				 System.out.println("\t"+this.getID()+" ran away from "+a.getID());
			}
			
		 public void changeLocation()
			{
				 int east=7-getXLoc(),west=getXLoc(),south=7-getYLoc(),north=getYLoc();
				 
				 runDirection(east,west,south,north);
			}
			
		 public void changeLocation(int x,int y)
			{
				 setXLoc(x);
				 setYLoc(y);
			}
			
		 public void runDirection(int east,int west,int south,int north)
		 {
			 int bigOnX=(east>west)?east:west;
			 int bigOnY=(south>north)?south:north;
			 Random r=new Random();
			
			if(bigOnX==east)
				{
					 setXLoc(r.nextInt(7-getXLoc())+getXLoc()); //random between max animal grid size (7) and current x location
				}
			 else
				{
					 setXLoc(r.nextInt(getXLoc())); //random between 0 and current x location					
				}
			 
			 if(bigOnY==south)
				{
					 setYLoc(r.nextInt(7-getYLoc())+getYLoc()); //random between max animal grid size (7) and current y location
				}
			 else
				{
					 setYLoc(r.nextInt(getYLoc())); //random between 0 and current y location
				}
		 }
			
		 public void defeated(Animal lost)
			{
				 setStrength(lost.getStrength()/2);
				 runAway(lost);
				 lost.setStrength(lost.getStrength()-(getStrength()/2));
			}
	}