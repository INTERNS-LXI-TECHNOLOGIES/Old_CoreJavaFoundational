package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.men.Hunter;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.interfaces.*;
import com.lxisoft.animalgame.exceptions.*;
import com.lxisoft.animalgame.clear.*;
import java.io.IOException;
import java.io.*;
import java.util.*;
public class Forest{
	int xloc,yloc;
	private static Animal[][] a=new Animal[20][20];
	private static Zebra[] Z=new Zebra[20];
	private static Tiger[] T=new Tiger[20];
	private static Lion[] L=new Lion[20];
	private static Deer[] D=new Deer[20];
	private static Rabbit[] R= new Rabbit[20];
    Hunter h=new Hunter();
	Random r=new Random();
	private int f=0,hun=0,count,co;
	//constructor(forest);initiallizing all the objects.
	public Forest() throws DeadException{
		count=0;co=0;
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				a[i][j]=null;
			}
		}
		for(int i=0;i<4;i++){
			L[i]=new Lion(i);
			 findLoc(L[i]);
		}
		
		for(int i=0;i<5;i++){
			R[i]=new Rabbit(i);
			 findLoc(R[i]);
		}
		for(int i=0;i<6;i++){
			T[i]=new Tiger(i);
			 findLoc(T[i]);
		}
		findLoc(h);
	}
	//Constructor overloading happens here.
	public Forest(int zebra,int deer)throws DeadException{
	    this();
		for(int i=0;i<zebra;i++){
			Z[i]=new Zebra(i);
			 findLoc(Z[i]);
		}
		for(int i=0;i<deer;i++){
			D[i]=new Deer(i);
			 findLoc(D[i]);
		}
		for(int i=0;i<4;i++){
			canFight(L[i]);
		}
		for(int i=0;i<6;i++){
			canFight(T[i]);
		}
		canFight(h);
		
	  }
	 //checking whether an Animal can Roam or not.
	public boolean check(Animal c){
		if((c.getStrength()>5)&&(c.getHungry()>5)&&(a[c.getXloc()][c.getYloc()]!=null)){
			return true;
		}
		return false;
	}
	 public void findLoc(Animal b){
    do{  
		b.setXloc(r.nextInt(7));
		b.setYloc(r.nextInt(7));
		
	}while((a[b.getXloc()][b.getYloc()]!=null)&&(a[b.getXloc()][b.getYloc()]!=b));
	a[b.getXloc()][b.getYloc()]=b;
    }
	
	public void nearBy(Animal c,Animal h){
	int minx=c.getXloc()-c.getReach();
	int miny=c.getYloc()-c.getReach();
	int maxx=c.getXloc()+c.getReach();
	int maxy=c.getYloc()+c.getReach();
	do{
		h.setXloc(r.nextInt(7));
		h.setYloc(r.nextInt(7));
	}while(h.getXloc()>minx && h.getXloc()<maxx && h.getYloc()>miny && h.getYloc()<maxy && (a[h.getXloc()][h.getYloc()]!=null)&&(a[h.getXloc()][h.getYloc()]!=h));
	a[h.getXloc()][h.getYloc()]=h;
}
   public void show(Animal c,Animal a){
	   
	   a.setName("<<"+a.getName()+">>");
	   c.setName("<<"+c.getName()+">>");
   }
   public void reverse(Animal c,Animal a){
	   a.setName(a.getName());
   }
	//checking whether an animal can fight with other animals.
	public void canFight(Animal c)throws DeadException{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{    try{if(a[i][j]==null)
						throw new DeadException();
				if((check(c))&&(a[i][j]!=c)&&(Math.abs(c.getXloc()-i)<=c.getReach())&&(c instanceof Carnivorus)&&(Math.abs(c.getYloc()-j)<=c.getReach())){
					
					if((c.getStrength()>a[i][j].getStrength())&&(a[i][j].getLuck()<2)&&(c.breathlevel())&&(c.getName()!="HUNTER")){
						String prev1=a[i][j].getName();
	                    String prev2=c.getName();
						fightcast1(c,a[i][j]);
						show(c,a[i][j]);
						outGrid();
						try{
							Thread.sleep(5000);
						}catch(Exception e){}
						cls();
						a[i][j].setName(prev1);
						c.setName(prev2);
						a[i][j]=null;
						}
					else if((c.getName()=="HUNTER")&&(c.getStrength()>a[i][j].getStrength())&&(a[i][j].getLuck()<2)&&(c.getnoOfarrows()>0)){
						String prev1=a[i][j].getName();
	                    String prev2=c.getName();
						HunterCast1(c,a[i][j]);
						count=c.getnoOfarrows();
						co=count-1;
						c.setnoOfarrows(co);
						System.out.println("No: of Arrows left"+c.getnoOfarrows());
						show(c,a[i][j]);
						outGrid();
						try{
							Thread.sleep(5000);
						}catch(Exception e){}
						cls();
						a[i][j].setName(prev1);
						c.setName(prev2);
						a[i][j]=null;	
						}
					else if((c.getName()=="HUNTER")&&(c.getStrength()<a[i][j].getStrength())&&(a[i][j].getLuck()<2)&&(c.getnoOfarrows()==0)){
						String prev1=a[i][j].getName();
	                    String prev2=c.getName();
						HunterCast2(c,a[i][j]);
						show(c,a[i][j]);
						outGrid();
						try{
							Thread.sleep(5000);
						}catch(Exception e){}
						cls();
						a[i][j].setName(prev1);
						c.setName(prev2);
						a[c.getXloc()][c.getYloc()]=null;					
						}
				    else if(a[i][j] instanceof Herbivorus &&(a[i][j].getLuck()>2))
					{  
						String prev1=a[i][j].getName();
	                    String prev2=c.getName();
						runawaycast(c,a[i][j]);
						show(c,a[i][j]);
						outGrid();
						try{
							Thread.sleep(5000);
						}catch(Exception e){}
						cls();
						a[i][j].setName(prev1);
						c.setName(prev2);
						nearBy(c,a[i][j]);
						a[i][j]=null;
					}
				    else{ 
						String prev1=a[i][j].getName();
	                    String prev2=c.getName();
						figthcast2(c,a[i][j]);
						show(c,a[i][j]);
						outGrid();
						try{
							Thread.sleep(5000);
						}catch(Exception e){}
						cls();
						a[i][j].setName(prev1);
						c.setName(prev2);
					a[c.getXloc()][c.getYloc()]=null;
						
					}
					
					
				    }
			}catch(DeadException e){}
			}
			}
		}
	public void HunterCast1(Animal c,Animal a){
		if(c instanceof Hunter){
			            ((Hunter)c).fight(c,a);//casting
		                ((Hunter)c).killed(c,a);//casting
		}
		
	}
	public void HunterCast2(Animal c,Animal a){
		if(c instanceof Hunter){
			            ((Hunter)c).fight(c,a);//casting
		                ((Hunter)c).killed(a,c);//casting
						hun=hun+1;
		}
		
	}
	public void fightcast1(Animal c,Animal a){
		if(c instanceof Lion){
			if(a instanceof Hunter){
				hun=hun+1;
			}
			            ((Lion)c).fight(c,a);//casting
		                ((Lion)c).eats(c,a);//casting
						}
		if(c instanceof Tiger){
						((Tiger)c).fight(c,a);//casting
		                ((Tiger)c).eats(c,a);//casting
					    }
		
	}
	
	public void runawaycast(Animal c,Animal a){
		if(c instanceof Lion){
					((Lion)c).fight(c,a);//casting
					
					if(a instanceof Deer){
						((Deer)a).runaway(a);//casting
					}
					if(a instanceof Zebra){
						((Zebra)a).runaway(a);//casting
					}
					if(a instanceof Rabbit){
						((Rabbit)a).runaway(a);//casting
					}
                        }					
		if(c instanceof Tiger){
						((Tiger)c).fight(c,a);//casting
						
					if(a instanceof Deer){
						((Deer)a).runaway(a);//casting
					}
					if(a instanceof Zebra){
						((Zebra)a).runaway(a);//casting
					}
					if(a instanceof Rabbit){
						((Rabbit)a).runaway(a);//casting
					}
						}
		if(c instanceof Hunter){
						((Hunter)c).fight(c,a);//casting
						
					if(a instanceof Deer){
						((Deer)a).runaway(a);//casting
					}
					if(a instanceof Zebra){
						((Zebra)a).runaway(a);//casting
					}
					if(a instanceof Rabbit){
						((Rabbit)a).runaway(a);//casting
					}
					count=c.getnoOfarrows();
						co=count-1;
						c.setnoOfarrows(co);
						System.out.println("No: of Arrows left"+c.getnoOfarrows());
						}
						
	}
	
	public void figthcast2(Animal c,Animal a){
		if(c instanceof Lion){
			if(a instanceof Hunter){
				if(a.getnoOfarrows()!=0){
				((Lion)c).fight(c,a);//casting
				((Hunter)a).killed(a,c);//casting
				count=a.getnoOfarrows();
						co=count-1;
						c.setnoOfarrows(co);
				System.out.println("No: of Arrows left"+c.getnoOfarrows());}
				else{
					System.out.println("Lion was killed due to its low Strength");
				}
			}
			if(a instanceof Deer || a instanceof Rabbit || a instanceof Zebra){
							 ((Lion)c).fight(c,a);//casting
		                     ((Lion)c).killed(a,c);//casting
					         }
		}
		if(c instanceof Tiger){
			
						      if(a instanceof Hunter){
								  if(a.getnoOfarrows()!=0){
				((Tiger)c).fight(c,a);//casting
				((Hunter)a).killed(a,c);//casting
				count=a.getnoOfarrows();
						co=count-1;
						c.setnoOfarrows(co);
								  System.out.println("No: of Arrows left"+c.getnoOfarrows());}
								  else{
									  System.out.println("Tiger was killed due to its low Strength");
								  }
			}
			if(a instanceof Deer || a instanceof Rabbit || a instanceof Zebra){
							 ((Tiger)c).fight(c,a);//casting
		                     ((Tiger)c).killed(a,c);//casting
					         }
					          }
	}
	//printing the current status of the forest.
	public void outGrid()
	{   
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				if(a[i][j]!=null){
					System.out.print("\t"+a[i][j].getName()+"  ");
				}
				else{
					System.out.print("\t0\t");
				}
			}
			System.out.println("\n\n\n");
		}
	}
	public void finaloutGrid()
	{   
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				if(a[i][j]!=null){
					System.out.print("\t"+a[i][j].getName()+"  ");
					f++;
				}
				else{
					System.out.print("\t0\t");
				}
			}
			System.out.println("\n\n\n");
		}
	}
	
	//shows the final status of the number of animals in the forest in words.	
	public void finalStatus(int z,int d){
		System.out.println("TOTAL INITIAL NUMBER OF ANIMALS "+" "+(16+z+d));
		System.out.println("TOTAL NUMBER OF ANIMALS SURVIVED "+" "+f);
		if(hun==0){
			System.out.println(h);
		}
		if(hun>0){
			System.out.println("*****HUNTER DETAILS*****\n");
			System.out.println("**** + HUNTER HAS BEEN KILLED + ****");
		}
	}
	public void cls()
	{
		Cls clrscr=new Cls();
		try
		{
			clrscr.cls();
		}
		catch (IOException e)
		{
			
		}
		catch (InterruptedException e)
		{
			
		}
	}
}
