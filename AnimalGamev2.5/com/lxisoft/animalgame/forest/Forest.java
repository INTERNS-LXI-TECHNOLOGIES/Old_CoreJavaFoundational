package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animals.*;
import com.lxisoft.animalgame.animalbehaviour.*;
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
			
		 public void createAnimal(char animal,int count)
		 {
			 int tempX,tempY;
			 for(int i=0;i<count;i++)
				{
					 do
						{
							 tempX=r.nextInt(7);
							 tempY=r.nextInt(7);
						}while(grid[tempX][tempY]!=null);
						
					 switch(animal)
						{
							case 'L': grid[tempX][tempY]=new Lion(i,r.nextInt(3)+7,r.nextInt(2)); break;
							case 'T': grid[tempX][tempY]=new Tiger(i,r.nextInt(3)+7,r.nextInt(2)); break;
							case 'D': grid[tempX][tempY]=new Deer(i,r.nextInt(3)+2,r.nextInt(2)); break;
							case 'E': grid[tempX][tempY]=new Elephant(i,r.nextInt(1)+9,r.nextInt(2)); break;
						}
					 grid[tempX][tempY].setXLoc(tempX);
					 grid[tempX][tempY].setYLoc(tempY);
				}
		 }
	 
		 public void initForest(int lio,int tig,int der,int ele)
			{	     
				 for(int i=0;i<7;i++)
					{
						for(int j=0;j<7;j++)
						{
							 grid[i][j]=null;
						}
					}	
				 createAnimal('L',lio);
				 createAnimal('T',tig);
				 createAnimal('D',der);
				 createAnimal('E',ele);
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
					{
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
    }