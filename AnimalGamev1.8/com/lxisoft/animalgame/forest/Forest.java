package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.interfaces.*;
import com.lxisoft.animalgame.exceptions.*;
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
	Random r=new Random();
	private int f=0,sur=0;
	//constructor(forest);initiallizing all the objects.
	public Forest() throws DeadException{
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
		outGrid();
		for(int i=0;i<4;i++){
			canFight(L[i]);
		}
		for(int i=0;i<6;i++){
			canFight(T[i]);
		}
		for(int i=0;i<zebra;i++){
			canFight(Z[i]);
		}
		for(int i=0;i<5;i++){
			canFight(R[i]);
		}
		for(int i=0;i<deer;i++){
			canFight(D[i]);
		}
		
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
		
	}while(a[b.getXloc()][b.getYloc()]!=null);
	a[b.getXloc()][b.getYloc()]=b;
    }
	//checking whether an animal can fight with other animals.
	public void canFight(Animal c)throws DeadException{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{    try{if(a[i][j]==null)
						throw new DeadException();
				if((check(c))&&(a[i][j]!=c)&&(Math.abs(c.getXloc()-i)<=c.getReach())&&(c instanceof Carnivorus)&&(Math.abs(c.getYloc()-j)<=c.getReach())){
					
					if((c.getStrength()>a[i][j].getStrength())&&(a[i][j] instanceof Herbivorus)&&(a[i][j].getLuck()<3)&&(c.breathlevel())){
						
						fightcast1(c,a[i][j]);
						
						}
				    else if(a[i][j] instanceof Herbivorus &&(a[i][j].getLuck()>2))
					{  
						runawaycast(c,a[i][j]);
					}
				    else{
						figthcast2(c,a[i][j]);
						a[c.getXloc()][c.getYloc()]=null;
				    }
			}}catch(DeadException e){}
			}
		}
		
	}
	public void fightcast1(Animal c,Animal a){
		if(c instanceof Lion){
						((Lion)c).fight(a,c);//casting
		                ((Lion)c).eats(a,c);//casting
					    a=null;}
						if(c instanceof Tiger){
						((Tiger)c).fight(a,c);//casting
		                ((Tiger)c).eats(c,a);//casting
					    a=null;}
	}
	
	public void runawaycast(Animal c,Animal a){
		if(c instanceof Lion){
					((Lion)c).fight(a,c);//casting
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
						((Tiger)c).fight(a,c);//casting
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
	}
	
	public void figthcast2(Animal c,Animal a){
		if(c instanceof Lion){
							((Lion)c).fight(a,c);//casting
		                     ((Lion)c).eats(c,a);//casting
					         }
		if(c instanceof Tiger){
						      ((Tiger)c).fight(a,c);//casting
		                      ((Tiger)c).eats(c,a);//casting
					          }
	}
	//printing the current status of the forest.
	public void outGrid()
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
		sur=Math.abs((15+z+d)-f);
		System.out.println("TOTAL INITIAL NUMBER OF ANIMALS "+(15+z+d));
		System.out.println("TOTAL NUMBER OF ANIMALS SURVIVED "+sur);
	}
	
	
}
