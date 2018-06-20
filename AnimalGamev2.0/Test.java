import java.util.Random;
class Test
{
 public static void main(String args[])
 {
  Forest f=new Forest();
  int surviveCount=0;
  f.assign(6,6,7,6);
  surviveCount=25-Forest.deadCount;
  
  System.out.println("\n\n\nSurvived Animal Placements : \n");
  for(int i=0;i<6;i++)
  {
   for(int j=0;j<6;j++)
   {
	if(Forest.grid[i][j]!=null)
	  System.out.print("\t"+Forest.grid[i][j].id+"  ");
    else
	  System.out.print("\t0\t");
   }
   System.out.println("\n\n\n");
  }   
  System.out.println("Total     : 25 Animals\nSurvived  : "+surviveCount+"\nDead      : "+Forest.deadCount);
 }
}