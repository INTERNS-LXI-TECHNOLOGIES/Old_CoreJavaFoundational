import java.util.Random;

public class Tiger extends Animals
{
 Tiger(int numID)
 {
  Random r =new Random();
  id="Tiger "+String.valueOf(numID);
  roam=3;
  carnivore =true;
  strength =r.nextInt(3)+6;;
  hunger =r.nextInt(2);
  do
  {
   xLoc=findLoc();
   yLoc=findLoc();
  }while(Forest.grid[xLoc][yLoc]!=null);
  Forest.grid[xLoc][yLoc]=this;
 } 
}