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
	public Forest(int lio,int deer,int tiger,int zebra,int rabbit){
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				a[i][j]=null;
			}
		}
		for(int i=0;i<lio;i++){
			L[i]=new Lion(i);
			 findLoc(L[i]);
		}
		for(int i=0;i<deer;i++){
			D[i]=new Deer(i);
			 findLoc(D[i]);
		}
		for(int i=0;i<rabbit;i++){
			R[i]=new Rabbit(i);
			 findLoc(R[i]);
		}
		for(int i=0;i<tiger;i++){
			T[i]=new Tiger(i);
			 findLoc(T[i]);
		}
		for(int i=0;i<zebra;i++){
			Z[i]=new Zebra(i);
			 findLoc(Z[i]);
		}
		outGrid();
		for(int i=0;i<lio;i++){
			canFight(L[i]);
		}
		for(int i=0;i<tiger;i++){
			canFight(T[i]);
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
	public void canFight(Animal c){
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{    
				if((check(c))&&(a[i][j]!=c)&&(Math.abs(c.getXloc()-i)<=c.getReach())&&(Math.abs(c.getYloc()-j)<=c.getReach())&&(a[i][j]!=null)){
					
					if(c.getStrength()>a[i][j].getStrength()){
						System.out.println(a[i][j].getName()+" vs "+c.getName()+"     "+c.getName()+"   Won");
					    a[i][j]=null;}
				else
					{System.out.println(a[i][j].getName()+" vs "+c.getName()+"     "+a[i][j].getName()+"  Won");
						a[c.getXloc()][c.getYloc()]=null;
					}
				}
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
	public void finalStatus(){
		sur=Math.abs(23-f);
		System.out.println("TOTAL INITIAL NUMBER OF ANIMALS 23");
		System.out.println("TOTAL NUMBER OF ANIMALS SURVIVED "+sur);
	}
	
}
