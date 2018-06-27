package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animals.*;
import com.lxisoft.animalgame.animalbehaviour.*;
import com.lxisoft.animalgame.exception.AnimalDeadException;
import java.util.Random;

public final class Forest
    {
		 private Animal[][] grid= new Animal[7][7];
		 private int aliveCount=0;
	 
		 public int getAliveCount()
			{
				return aliveCount;
			}
			
		 public void passNearby(Animal a)
			{
				 int roam=((CarnivoreAnimal)a).getRoam();
			     for(int i=(a.getXLoc()-roam);i<=(a.getXLoc()+roam);i++)
					{
				 		 for(int j=(a.getYLoc()-roam);j<=(a.getYLoc()+roam);j++)
							{	
								 try
									{
										 if(i>=0 && j>=0 && i<7 && j<7 && grid[i][j]!=null && grid[i][j].isAlive() && grid[i][j]!=a)
											{
												 ((CarnivoreAnimal)a).setNearby(grid[i][j]);
												 grid[i][j]=null;
											}
									}
								 catch(AnimalDeadException e)
									{
										 //ignore the exception
									}
							}
					}
			}
		 
		 public void whosNearby(Animal a)
			{			
				 int i=0;
				 Animal nearby=((CarnivoreAnimal)a).getNearby(i++);
				 int roam=((CarnivoreAnimal)a).getRoam();
				 while(nearby!=null)
					{	
						 int j=0;
						 while(grid[nearby.getXLoc()][nearby.getYLoc()]!=null)
							{
								 if(nearby instanceof Herbivore)
									{
									 ((HerbivoreAnimal)nearby).changeLocation();
									 j++;
									}
								 if(j>3)
									{
									 ((HerbivoreAnimal)nearby).changeLocation(((HerbivoreAnimal)nearby).getOldX(), ((HerbivoreAnimal)nearby).getOldY());
									 break;
									}
							}
						 grid[nearby.getXLoc()][nearby.getYLoc()]=nearby;
					 	 nearby=((CarnivoreAnimal)a).getNearby(i++);
					}
			}			
			
		 public void createAnimal(char animal,int count)
			{
				 Random r=new Random();
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
								 case 'L': grid[tempX][tempY]=new Lion(i,r.nextInt(3)+7,r.nextInt(2));  break;
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
				 for(Animal[] row : grid)
					{
						for(Animal animal : row)
						{
							 row=null;
						}
					}	
				 createAnimal('L',lio);
				 createAnimal('T',tig);
				 createAnimal('D',der);
				 createAnimal('E',ele);
			} 
		
		 public void printForest()
            {
				 aliveCount=0;
	             for(Animal[] row : grid)
                    {
		                 for(Animal animal : row)
                           {
	                             try
									{
										 if(animal!=null && animal.isAlive())
											{
												 System.out.print("\t"+animal.getID()+"  ");
												 aliveCount++;
											}
										 else
											{
												 System.out.print("\t0\t");
											}
									}
                                 catch(AnimalDeadException e)
									{
										 System.out.print("\t0\t");
									}
                            }
                         System.out.println("\n\n\n");
                    }
            } 
  
		 public void initRoaming()
			{
	         	 for(Animal[] row : grid)
					{
					 for(Animal animal : row)
						{
							 if(animal!=null && animal instanceof Carnivore)
								{
									 if(((CarnivoreAnimal)animal).canRoam())
										{
											 passNearby(animal);
											 ((CarnivoreAnimal)animal).checkNearby();
											 whosNearby(animal);
										}
								}
						}
					}
			}
    }