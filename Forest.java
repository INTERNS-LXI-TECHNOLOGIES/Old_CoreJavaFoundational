import java.util.Random;

public class Forest
    {
	 private Animal[][] grid= new Animal[6][6];
	 private Animal status=new Animal();
     private Lion[] l=new Lion[10];
     private Tiger[] t=new Tiger[10];
     private Deer[] d= new Deer[10];
     private Elephant[] e=new Elephant[10];
     public static int aliveCount=0;
	 private Random r=new Random();
	 
	 public int getAliveCount()
	 {
		 return aliveCount;
	 }
	 
     public void initForest(int lio,int tig,int der,int ele)
        {
	     for(int i=0;i<6;i++)
         for(int j=0;j<6;j++)
            {
	             grid[i][j]=null;
            }
   
         for(int i=0;i<lio;i++)
		 {
			 l[i]= new Lion(i,r.nextInt(3)+7,r.nextInt(2));
			 setLoc(l[i]);
		 }
		 
    
         for(int i=0;i<tig;i++)
            {
			 t[i]= new Tiger(i,r.nextInt(3)+5,r.nextInt(2));
			 setLoc(t[i]);
		    }
  
         for(int i=0;i<der;i++)
            {
			 d[i]= new Deer(i,r.nextInt(3)+2);
			 setLoc(d[i]);
		    }
 
         for(int i=0;i<ele;i++)
            {
			 e[i]= new Elephant(i,r.nextInt(1)+9);
			 setLoc(e[i]);
		    }
        } 
		
	 public void setLoc(Animal a)
            {
	             do
                    {
                         a.setXLoc(r.nextInt(6));
                         a.setYLoc(r.nextInt(6));
                    }while(grid[a.getXLoc()][a.getYLoc()]!=null);
                 grid[a.getXLoc()][a.getYLoc()]=a;
            }
		
	 public void whosAlive()
            {
				 aliveCount=0;
	             for(int i=0;i<6;i++)
                    {
		                 for(int j=0;j<6;j++)
                           {
	                             if(grid[i][j]!=null && grid[i][j].isAlive())
									{
										 System.out.print("\t"+grid[i][j].getID()+"  ");
										 aliveCount++;
									}
                                 else
									{
										System.out.print("\t0\t");
									}
                            }
                         System.out.println("\n\n\n");
                    }
            }
  
     public void initRoaming()
        {
	         
			 for(int i=0;i<6;i++)
                 for(int j=0;j<6;j++)
                    {
                         if(grid[i][j]!=null && grid[i][j] instanceof Carnivore)
		                    {
								 if(((CarnivoreAnimal)grid[i][j]).canRoam())
									{
										grid[i][j].setGrid(grid);
										((CarnivoreAnimal)grid[i][j]).checkNearby();
										grid=grid[i][j].getGrid();
									}
		                    }
	                }
        }
		
	 
			
	 
			
	 
		
    }