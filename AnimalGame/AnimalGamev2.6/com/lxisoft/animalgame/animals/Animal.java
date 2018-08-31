package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.animalbehaviour.*;
import com.lxisoft.animalgame.forest.Forest;
import java.io.*;
import javax.sound.sampled.*;

public abstract class Animal
    {
         private String id;
		 private int strength;
		 private int hunger;
		 private int xLoc;
		 private int yLoc;
		 private String soundPath="./com/lxisoft/animalgame/sounds/"+this.getClass().getSimpleName()+".wav";
		 
		 public void makeSound()
			{
				 try
					{
						 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundPath).getAbsoluteFile());
						 Clip clip = AudioSystem.getClip();
						 clip.open(audioInputStream);
						 clip.start();
					}
				 catch(Exception e)
					{
						 System.out.println(e);
					}
			}
		 
		 public Animal(int numID,int strength,int hunger)
			{
				 setID(this.getClass().getSimpleName()+" "+numID); 
				 setStrength(strength);
				 setHunger(hunger);
			}
 
		 public void setID(String id)
            {
	             this.id=id;
            }
 
         public String getID()
            {
	             return id;
            }
		 public String toString()
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
				 this.strength=0;
				 
				 if(strength>=0)
					 this.strength=strength;
				 if(strength>10)
					 this.strength=10;
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
				 Forest.setGridElement(getXLoc(),getYLoc(),null);
			}
    }