import java.util.Random;

public class Animals
    {
         private String id;
		 private int strength;
		 private int xLoc;
		 private int yLoc;
 
		 private Random r=new Random();
 
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
			
		
    }