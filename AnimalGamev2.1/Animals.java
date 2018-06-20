import java.util.Random;

public class Animals
    {
         private String id;
         private int hunger;
		 private int strength;
		 private int xLoc;
		 private int yLoc;
		 private int roam;
		 private boolean carnivore;
 
		 private Random r=new Random();
 
		 public void setID(String id)
            {
	             this.id=id;
            }
 
         public String getID()
            {
	             return id;
            }
 
		 public void setHunger(int max)
            {
	             hunger=r.nextInt(max);
            }
 
         public int getHunger()
		    {
	             return hunger;
            }
 
         public void changeHunger(int newHunger)
            {
	             this.hunger+=newHunger;
            }
 
         public void setStrength(int min,int max)
            {
	         strength=r.nextInt(max-min)+min;
            }
 
 
         public void changeStrength(int newStrength)
            {
	             this.strength=newStrength;
            }
 
         public int getStrength()
            {
	             return strength;
            }
 
         public void setRoam(int roam)
            {
	             this.roam=roam;
            }
		 public int getRoam()
            {
	             return roam;
            }
 
         public void setCarnivore(boolean carnivore)
            {
	             this.carnivore=carnivore;
            } 
 
         public boolean getCarnivore()
            {
	             return carnivore;
            }
			
	     public void setXLoc(int yLoc)
			{
				 this.xLoc=yLoc;
			}
			
		 public void setYLoc(int yLoc)
			{
				 this.yLoc=yLoc;
			}
			
		 public int getXLoc()
			{
				 return xLoc;
			}
			
		 public int getYLoc()
			{
				 return yLoc;
			} 
 
		 
	}