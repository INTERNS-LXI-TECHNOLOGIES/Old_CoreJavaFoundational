import java.util.Random;

public class Lion extends Animals
{
 Lion(int numID)
 {
  Random r=new Random();
  id="Lion "+String.valueOf(numID);
  roam=2;
  carnivore =true;
  strength =r.nextInt(3)+7;
  hunger =r.nextInt(2);
  do
  {
   xLoc=findLoc();
   yLoc=findLoc();
  }while(Forest.grid[xLoc][yLoc]!=null);
  Forest.grid[xLoc][yLoc]=this;
 }
}