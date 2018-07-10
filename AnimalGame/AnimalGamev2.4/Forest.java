import java.util.Random;

public class Forest
    {
		 private Animal[][] grid= new Animal[7][7];
		 public static int aliveCount=0;
		 private Random r=new Random();
	 
		 public int getAliveCount()
			{
				return aliveCount;
			}
	 
		 public void initForest(int lio,int tig,int der,int ele)
			{
				 int x=r.nextInt(7);
				 int y=r.nextInt(7);
	     
				 for(int i=0;i<7;i++)
					for(int j=0;j<7;j++)
						{
							 grid[i][j]=null;
						}
		 
				 for(int i=0;i<lio;i++)
					{
						 while(grid[x][y]!=null)
							{
								 x=r.nextInt(7);
								 y=r.nextInt(7);
							}
						 grid[x][y]=new Lion(i,r.nextInt(3)+7,r.nextInt(2));
						 grid[x][y].setXLoc(x);
						 grid[x][y].setYLoc(y);
					}
		 
				 for(int i=0;i<tig;i++)
					{
						 while(grid[x][y]!=null)
							{
								 x=r.nextInt(7);
								 y=r.nextInt(7);
							}
						 grid[x][y]=new Tiger(i,r.nextInt(3)+7,r.nextInt(2));
						 grid[x][y].setXLoc(x);
						 grid[x][y].setYLoc(y);
					}
		 
				 for(int i=0;i<der;i++)
					{
						 while(grid[x][y]!=null)
							{
								 x=r.nextInt(7);
								 y=r.nextInt(7);
							}
						 grid[x][y]=new Deer(i,r.nextInt(3)+2,r.nextInt(2));
						 grid[x][y].setXLoc(x);
						 grid[x][y].setYLoc(y);
					}
		 
				 for(int i=0;i<ele;i++)
		 {
			 while(grid[x][y]!=null)
			 {
				 x=r.nextInt(7);
				 y=r.nextInt(7);
			 }
			 grid[x][y]=new Elephant(i,r.nextInt(1)+9,r.nextInt(2));
			 grid[x][y].setXLoc(x);
			 grid[x][y].setYLoc(y);
		 }
        } 
		
	 public void whosAlive()
            {
				 aliveCount=0;
	             for(int i=0;i<7;i++)
                    {
		                 for(int j=0;j<7;j++)
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
	         
			 for(int i=0;i<7;i++)
                 for(int j=0;j<7;j++)
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