import java.util.Random;

public class Animals
{
 int hunger;
 int strength;
 int xLoc;
 int yLoc;
 int roam;
 boolean carnivore;
 String id;
 
 
 int findLoc()
 {
  Random r= new Random();
  return(r.nextInt(6));
 }
 
 void canRoam()
 {
   if(hunger<2 && strength>5 && carnivore)
   {
    checkNearby();
   } 
 }  
 
 void checkNearby()
 {
  for(int i=0;i<6;i++)
   for(int j=0;j<6;j++)
   {
    if(i!=xLoc && j!=yLoc && Forest.grid[i][j]!=null && Forest.grid[xLoc][yLoc]!=null)
	{
	 if(((Math.abs(i-xLoc))<=roam)&&((Math.abs(j-yLoc))<=roam))
	  {
	   combat(Forest.grid[i][j]);
	  }
	}
   }
 }
 
 
 void combat(Animals a)
 {
  System.out.print("\n\n"+id+" vs "+a.id+"\t");
  if(strength>a.strength)
  {
   strength-=(a.strength/2);
   if(!a.carnivore && carnivore)
   {
    hunger++;
   }
   System.out.print("\t"+a.id+" Dead");
   Forest.grid[a.xLoc][a.yLoc]=null;
  }
  else if(strength==a.strength)
  {
   Random random = new Random();
   boolean bool=random.nextBoolean(); 
   if(bool)
   {
    a.strength-=(strength/2);
    if(!carnivore && a.carnivore)
    {
     a.hunger++;
    }
    System.out.print("\t"+id+" Dead");
    Forest.grid[xLoc][yLoc]=null;
	a.canRoam();
   }
   if(!bool)
    {
	 strength-=(a.strength/2);
     if(!a.carnivore && carnivore)
     {
      hunger++;
     }
     System.out.print("\t"+a.id+" Dead");
     Forest.grid[a.xLoc][a.yLoc]=null;
    }
  }
  else
  {
   a.strength-=(strength/2);
   if(!carnivore && a.carnivore)
   {
    a.hunger++;
   }
   System.out.print("\t"+id+" Dead");
   Forest.grid[xLoc][yLoc]=null;
   a.canRoam();   
  }
  Forest.deadCount++;
 }
}