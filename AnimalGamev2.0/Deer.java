import java.util.Random;

public class Deer extends Animals
{
 Deer(int numID)
 {
  Random r =new Random();
  id="Deer "+String.valueOf(numID);
  carnivore =false;
  strength =r.nextInt(3)+3;
  do
  {
   xLoc=findLoc();
   yLoc=findLoc();
  }while(Forest.grid[xLoc][yLoc]!=null);
  Forest.grid[xLoc][yLoc]=this;  
 }
}