public class Test
    {
     public static void main(String args[])
        {
             Forest f=new Forest();
  
             f.initForest(8,12,10,5);
			 
			 System.out.println("\nInitial Animal placements : \n");
			 f.whosAlive();
			 
			 f.initRoaming();
			 
			 System.out.println("\n\n\nSurvived Animal Placements : \n");
			 f.whosAlive();
			 
			 System.out.println("Total     : 35 Animals\nSurvived  : "+(f.getAliveCount())+"\nDead      : "+(35-f.getAliveCount()));			 
        }
    }