import java.util.Random;

public class Forest
    {
	 private Animals[][] grid= new Animals[6][6];
	 private Animals status=new Animals();
     private Lion[] l=new Lion[10];
     private Tiger[] t=new Tiger[10];
     private Deer[] d= new Deer[10];
     private Elephant[] e=new Elephant[10];
     private int deadCount=0;
	 private Random r=new Random();


     public void initForest(int lio,int tig,int der,int ele)
        {
	     for(int i=0;i<6;i++)
         for(int j=0;j<6;j++)
            {
	             grid[i][j]=null;
            }
   
         for(int i=0;i<lio;i++)
		 {
			 l[i]= new Lion(i);
			 setLoc(l[i]);
		 }
		 
    
         for(int i=0;i<tig;i++)
            {
			 t[i]= new Tiger(i);
			 setLoc(t[i]);
		    }
  
         for(int i=0;i<der;i++)
            {
			 d[i]= new Deer(i);
			 setLoc(d[i]);
		    }
 
         for(int i=0;i<ele;i++)
            {
			 e[i]= new Elephant(i);
			 setLoc(e[i]);
		    }
        } 
		
	 public void setLoc(Animals a)
            {
	             do
                    {
                         a.setXLoc(r.nextInt(6));
                         a.setYLoc(r.nextInt(6));
                    }while(grid[a.getXLoc()][a.getYLoc()]!=null);
                 grid[a.getXLoc()][a.getYLoc()]=a;
            }
 
     public void setDeadCount(int newDeadCount)
        {
	         this.deadCount+=newDeadCount;
        }
 
     public int getDeadCount()
        {
	         return deadCount;
        }
		
	 public void whosAlive()
            {
	             for(int i=0;i<6;i++)
                    {
		                 for(int j=0;j<6;j++)
                           {
	                             if(grid[i][j]!=null)
	                                 System.out.print("\t"+grid[i][j].getID()+"  ");
                                 else
	                                 System.out.print("\t0\t");
                            }
                         System.out.println("\n\n\n");
                    }
            }
  
     public void initRoaming()
        {
	         
			 for(int i=0;i<6;i++)
                 for(int j=0;j<6;j++)
                    {
                         if(grid[i][j]!=null && grid[i][j].getCarnivore())
		                    {
	                             canRoam(grid[i][j]);
		                    }
	                }
        }
		
	 public void canRoam(Animals a)
            {
                 if(a.getHunger()<2 && a.getStrength()>5)
                    {
                         checkNearby(a);
                    } 
            }
		
	 public void checkNearby(Animals a)
            {
                 for(int i=0;i<6;i++)
                     for(int j=0;j<6;j++)
                        {
                             if(grid[i][j]!=a && grid[i][j]!=null && grid[a.getXLoc()][a.getYLoc()]!=null)
							    {
								     if(((Math.abs(i-a.getXLoc()))<=a.getRoam())&&((Math.abs(j-a.getXLoc()))<=a.getRoam()))
									    {
										     combat(a,grid[i][j]);
									    }
							    }
					    }
			}
			
	 public void combat(Animals a,Animals b)
			{
				 System.out.print("\n\n"+a.getID()+" vs "+b.getID()+"\t");
				 if(a.getStrength()>b.getStrength())
					{
						 defeated(a,b);
					}
				 else if(a.getStrength()==b.getStrength())
					{
						 boolean bool=r.nextBoolean(); 
						 if(bool)
							{
								 defeated(b,a);
								 canRoam(b);
							}
						 else
							{
								 defeated(a,b);
							}
					}
				 else
					{
						 defeated(b,a);
						 canRoam(b);
					}
				 
			}
			
	 public void defeated(Animals won,Animals lost)
			{
				 won.changeStrength(lost.getStrength()/2);
				 if(!lost.getCarnivore() && won.getCarnivore())
					{
					     won.changeHunger(1);
					}
				 System.out.print("\t"+lost.getID()+" Dead");
				 grid[lost.getXLoc()][lost.getYLoc()]=null;
				 deadCount++;
			}
		
    }