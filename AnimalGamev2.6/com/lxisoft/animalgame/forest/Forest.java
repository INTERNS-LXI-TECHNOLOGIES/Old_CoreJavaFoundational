package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animals.*;
import com.lxisoft.animalgame.animalbehaviour.*;
import com.lxisoft.animalgame.hunter.Hunter;
import com.lxisoft.animalgame.clearscreen.Cls;
import java.io.IOException;
import java.util.*;

public final class Forest
    {
		 private static Animal[][] grid= new Animal[7][7];
		 private ArrayList<Object> participants= new ArrayList<Object>();
		 private static Hunter hunter=new Hunter();
		 private static int aliveCount=0;
	 
		 public static int getAliveCount()
			{
				return aliveCount;
			}
			
		 public Animal[][] getGrid()
			{
				 return grid;
			}
			
		 public static void setGridElement(int i,int j,Animal a)
			{
				 grid[i][j]=a;
			}
			
		 public static Animal getGridElement(int i,int j)
			{
				 return grid[i][j];
			}
			
		 public boolean hunterAlive()
			{
				 return hunter.isAlive();
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
								 case 'L': grid[tempX][tempY]=new Lion(i,r.nextInt(3)+7,r.nextInt(2)); participants.add(grid[tempX][tempY]); break;
								 case 'T': grid[tempX][tempY]=new Tiger(i,r.nextInt(3)+7,r.nextInt(2)); participants.add(grid[tempX][tempY]); break;
								 case 'D': grid[tempX][tempY]=new Deer(i,r.nextInt(3)+2,r.nextInt(2)); break;
								 case 'E': grid[tempX][tempY]=new Elephant(i,r.nextInt(1)+9,r.nextInt(2)); break;
							}
						 grid[tempX][tempY].setXLoc(tempX);
						 grid[tempX][tempY].setYLoc(tempY);
					}
			}
			
		 public void createHunter()
			{
				 Random r=new Random();
				 int tempX,tempY;
				 do
					{
						 tempX=r.nextInt(7);
						 tempY=r.nextInt(7);
					}while(grid[tempX][tempY]!=null);
				 hunter.setXLoc(tempX);
				 hunter.setYLoc(tempY);
				 participants.add(hunter);
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
				 createHunter();
			} 
		
		 public static void printGrid(Animal a,Animal b)
            {
				 try
					{
						 Thread.sleep(2000);
					}
				 catch(InterruptedException e)
					{}
				 Cls.clear();
				 int i=0,j=0;
				 System.out.println("\n\n\n");
	             for(Animal[] row : grid)
                    {
						 j=0;
		                 for(Animal animal : row)
                           {
								 if(i==hunter.getXLoc() && j==hunter.getYLoc() && hunter.isAlive())
									{
										 System.out.print("\t"+hunter+"  ");
									}
								 else if(animal!=null)
									{
										 if(animal.getID()==a.getID() || animal.getID()==b.getID())
											 System.out.print("\t<<"+animal+">> ");
										 else
											 System.out.print("\t"+animal+"  ");
									}
								 else	
									{
										 System.out.print("\t0\t");
									}
								 j++;
                            }
						 i++;
                         System.out.println("\n\n\n");
                    }
            } 
			
		 public static void printGrid()
            {
				 aliveCount=0;
				 int i=0,j=0;
				 System.out.println("\n\n\n");
	             for(Animal[] row : grid)
                    {
						 j=0;
		                 for(Animal animal : row)
                           {
								 if(i==hunter.getXLoc() && j==hunter.getYLoc() && hunter.isAlive())
									{
										 System.out.print("\t"+hunter+"  ");
									}
								 else if(animal!=null)
									{
										 System.out.print("\t"+animal+"  ");
										 aliveCount++;
									}
								 else	
									{
										 System.out.print("\t0\t");
									}
								 j++;
                            }
						 i++;
                         System.out.println("\n\n\n");
                    }
            }
  
		 public void initRoaming()
			{
				Random r=new Random();
				int choice;
				while(participants.size()!=0)
					{
						 choice=r.nextInt(participants.size());
						 if(participants.get(choice) instanceof Hunter)
							{			
								 try
									{
										 ((Hunter)(participants.get(choice))).initHunt();
									}
								 catch(InterruptedException e)
									{}
							}			
						 else if(((CarnivoreAnimal)(Animal)participants.get(choice)).canRoam())
							{
								 ((CarnivoreAnimal)(Animal)participants.get(choice)).checkNearby();
							}
						 participants.remove(choice);
					}
			}
    }