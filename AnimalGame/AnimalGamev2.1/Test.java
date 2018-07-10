public class Test
    {
     public static void main(String args[])
        {
             Forest f=new Forest();
  
             f.initForest(6,6,7,6);
			 
			 System.out.println("\nInitial Animal placements : \n");
			 f.whosAlive();
			 
			 f.initRoaming();
			 
			 System.out.println("\n\n\nSurvived Animal Placements : \n");
			 f.whosAlive();
			 
			 System.out.println("Total     : 25 Animals\nSurvived  : "+(25-f.getDeadCount())+"\nDead      : "+f.getDeadCount());
  
			 
        }
     }