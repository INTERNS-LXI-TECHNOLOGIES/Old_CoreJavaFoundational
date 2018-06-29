package com.lxisoft.animalgame.hunter;
import com.lxisoft.animalgame.animals.Animal;
import com.lxisoft.animalgame.animals.Elephant;
import com.lxisoft.animalgame.animalbehaviour.Carnivore;
import com.lxisoft.animalgame.exception.*;
import java.util.Random;
public final class Hunter
	{
		 private boolean alive;
		 private int arrows;
		 private int xLoc;
		 private int yLoc;
		 String[] animals= {"Lion" ,"Tiger" , "Deer", "Elephant"};
		 
		 public Hunter()
			{
				 alive=true;
				 Random r= new Random();
				 arrows=(r.nextInt(4)+1);
			}
			
		 public int getXLoc()
			{
				 return xLoc;
			}
			
	     public void setXLoc(int xLoc)
			{
				 this.xLoc=xLoc;
			}
			
		 public int getYLoc()
			{
				 return yLoc;
			} 
			
		 public void setYLoc(int yLoc)
			{
				 this.yLoc=yLoc;
			}
			
	     public boolean isAlive()
			{
				 return alive;
			}
			
		 public void initHunt(Animal [][] grid)
			{
				 System.out.println("\n\nNow its Hunting time");
				 Random r= new Random();
				 int choice=(int)(r.nextInt(3));
				 String choose=animals[choice];
				 System.out.println("\nHunter looking for a "+choose);
				 Animal prey=findNearest(grid,choose);
				 System.out.println("\nHunter aims "+prey.getID());
				 try
					{
						 hunt(prey);
					}
				 catch(AnimalFarException e)
					{
						 System.out.println("\n"+prey.getID()+" is too far away");
					}
			}
			
		 public void hunt(Animal prey) throws AnimalFarException
			{
				 Random r= new Random();
				 int distance=Math.abs(prey.getXLoc()-getXLoc())+Math.abs(prey.getYLoc()-getYLoc());
				 do
					{
						 if(distance>5)
							{
								 throw new AnimalFarException();
							}
						 System.out.println("\n"+prey.getID()+" is "+distance+" blocks far from hunter.\tHunter has "+arrows+" arrows left, strength of  "+prey.getID()+" is "+prey.getStrength());
						 if(r.nextInt(10)<7) //70% chance for arrow to strike
							{
								 System.out.println("Arrow Hit");
								 prey.setStrength(prey.getStrength()-2);
							}
						 else
								 System.out.println("Arrow Missed");
						 arrows--;
						 if(prey instanceof Carnivore || prey instanceof Elephant)
							 distance--;
						 else
							 distance++;
					}while(distance>0 && arrows>0 && prey.getStrength()>0);
					
				 if(prey.getStrength()==0)
					{
						 System.out.println("\nHunter killed "+prey.getID()+"\n\n");
						 prey.dead();
					}
					
				 else if(distance==0 && arrows==0)
					{
						 if(prey instanceof Carnivore || prey instanceof Elephant)
							{
								 System.out.println("\n"+prey.getID()+" killed the Hunter\n\n");
								 alive=false;
							}
						 else
							 System.out.println("\n"+prey.getID()+" escaped from the Hunter\n\n");
					}
					
				 else if(distance>0 && arrows<=0)
					{
						 System.out.println("\nNo arrows left, Hunter aborted the plan\n\n");
					}
					
				 else if(distance==0 && arrows>0)
					{
						 System.out.println("\n"+prey.getID()+" got too close, Hunter fled the area\n\n");
					}
			}
			
		 public Animal findNearest(Animal [][] grid,String choose)
			{
				 int smallDistance=99,distance;
				 Animal nearest=null;
				 for(int i=0;i<7;i++)
					{
						 for(int j=0;j<7;j++)
							{
								try
									{
										 if(grid[i][j]!=null && grid[i][j].isAlive() && grid[i][j].getClass().getSimpleName().equals(choose))
											{
												 distance=Math.abs(grid[i][j].getXLoc()-getXLoc())+Math.abs(grid[i][j].getYLoc()-getYLoc());
										 
												 if(distance<smallDistance)
													{
														 smallDistance=distance;
														 nearest=grid[i][j];
													}
											}
									}
								 catch(AnimalDeadException e)
									{
									}
					
							}
					}
				 return nearest;
			}
	}