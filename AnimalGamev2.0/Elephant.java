import java.util.Random;

public class Elephant extends Animals
{
 Elephant(int numID)
 {
  Random r =new Random();
  id="Elephant "+String.valueOf(numID);
  carnivore =false;
  strength  =r.nextInt(2)+9;
  do
  {
   xLoc=findLoc();
   yLoc=findLoc();
  }while(Forest.grid[xLoc][yLoc]!=null);
  Forest.grid[xLoc][yLoc]=this;
 }
}
