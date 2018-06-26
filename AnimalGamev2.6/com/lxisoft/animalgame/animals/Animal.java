package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.*;
import com.lxisoft.animalgame.exception.AnimalDeadException;

public abstract class Animal
    {
		 private boolean alive;
         private String id;
		 private int strength;
		 private int hunger;
		 private int xLoc;
		 private int yLoc;
		 
		 public Animal(int numID,int strength,int hunger)
			{
				 setAlive(true);
				 setID(this.getClass().getSimpleName()+" "+String.valueOf(numID)); 
				 setStrength(strength);
				 setHunger(hunger);
			}
		 
		 public void setAlive(boolean alive)
			{
				 this.alive=alive;
			}
		 
		 public boolean isAlive() throws AnimalDeadException
			{
				 if(alive)
					 return true;
				 else
					 throw new AnimalDeadException();
			}
 
		 public void setID(String id)
            {
	             this.id=id;
            }
 
         public String getID()
            {
	             return id;
            }
  
		 public void setHunger(int hunger)
			{
				 if(hunger<2)
					 this.hunger=hunger;
				 else
					 this.hunger=2;
			}
 
		 public int getHunger()
			{
				 return hunger;
			}
  
         public int getStrength()
            {
	             return strength;
            }
			
		 public void setStrength(int strength)
			{
				 this.strength=strength;
			}
 			
		 public int getXLoc()
			{
				 return xLoc;
			}
			
	     public void setXLoc(int xLoc)
			{
				 this.xLoc=xLoc;
			}
			
		 public int getYLoc()
			{
				 return yLoc;
			} 
			
		 public void setYLoc(int yLoc)
			{
				 this.yLoc=yLoc;
			}
		 
		 public abstract void defeated(Animal lost);
		
		 public void dead()
			{
				 setStrength(0);
				 setAlive(false);
			}
    }