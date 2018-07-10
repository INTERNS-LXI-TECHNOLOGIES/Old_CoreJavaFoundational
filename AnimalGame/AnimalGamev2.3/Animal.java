import java.util.Random;

public class Animal
    {
         private String id;
		 private boolean alive;
		 private int strength;
		 private int xLoc;
		 private int yLoc;
		 private Animal[][] grid=new Animal[7][7];
 
		 private Random r=new Random();
		 
		 public void setAlive(boolean alive)
		 {
			 this.alive=alive;
		 }
		 
		 public boolean isAlive()
		 {
			 return alive;
		 }
 
		 public void setID(String id)
            {
	             this.id=id;
            }
 
         public String getID()
            {
	             return id;
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
			
	     public void setXLoc(int yLoc)
			{
				 this.xLoc=yLoc;
			}
			
		 public int getYLoc()
			{
				 return yLoc;
			} 
			
		 public void setYLoc(int yLoc)
			{
				 this.yLoc=yLoc;
			}
			
		 public void iWon(Animal lost)
			{
			 setStrength(lost.getStrength()/2);
			 if(!(lost instanceof Carnivore))
				{
				     ((CarnivoreAnimal)this).eatMeat(lost);
					 lost.setAlive(false);
				}
			 else if(this instanceof Herbivore)
				{
					 ((HerbivoreAnimal)this).runAway(lost);
					 lost.setStrength(lost.getStrength()-getStrength());
				}
			 else
			    {
					System.out.println("\t"+getID()+"\tdefeated "+lost.getID());
					lost.setAlive(false);
				}
			}
			
		 public void setGrid(Animal grid[][])
			{
				 this.grid=grid;
			}
			
		 public Animal[][] getGrid()
		 {
			 return grid;
		 }
			
		 public Animal getGridMember(int i,int j)
		 {
			 return grid[i][j];
		 }
		
    }