import java.io.*;
import java.util.*;
public class Animal{
int hungry,strength,carnivorus,reach,xloc,yloc;
String name;
public int findRandom(){
	 Random random = new Random();
	 return random.nextInt(7);
    }
public void findLoc(){
    do{     
		xloc=findRandom();
		yloc=findRandom();
		
	}while(Forest.a[xloc][yloc]!=null);
	Forest.a[xloc][yloc]=this;
    }
public void fight(){
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if((Forest.a[i][j]!=this)&&(Math.abs(this.xloc-i)<=this.reach)&&(Math.abs(this.yloc-j)<=this.reach)&&(Forest.a[i][j]!=null)&&(this.carnivorus==1)){
					if(this.strength>Forest.a[i][j].strength){
						System.out.println(Forest.a[i][j].name+" vs "+this.name+"     "+this.name+"   Won");
						Forest.a[i][j]=null;
					}
					else{
						System.out.println(Forest.a[i][j].name+" vs "+this.name+"     "+Forest.a[i][j].name+"  Won");
						Forest.a[this.xloc][this.yloc]=null;
					}
				}
			}
		}
		
	}

}
