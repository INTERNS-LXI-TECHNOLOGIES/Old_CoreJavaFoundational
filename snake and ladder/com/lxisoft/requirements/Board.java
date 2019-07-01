package com.lxisoft.requirements;
import java.util.*;
public class Board
{


 int numbers[][]=new int[10][10];
//public ArrayList<Ladder> ladders=new ArrayList<Ladder>();
public ArrayList<Snake> snakes=new ArrayList<Snake>();

Random r = new Random();

public void createBoard()
{


              int x = 101;
			int  n=10;
			 
			 for(int i=0;i<10;i++)
			 {
			 for(int j=0;j<10;j++)
			 {
			 if(n%2==0)
			 {
			 x--;
			 numbers[i][j]=x;
			 }
			 
			 else
			 {
			 numbers[i][j]=x;
			 x++;
			 }
			 }
			 x=x-10;
			 n--;
			 }
			 
		for(int i=0;i<10;i++)
			 {
			 for(int j=0;j<10;j++)
			 {
       System.out.print(numbers[i][j]+"\t");

}

System.out.println("\n");

}


        
}			 
			 
public void placeSnakes()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("\n");
    int x=r.nextInt(98-36)+36;
    int y=r.nextInt(64-7)+7;
	snakes.add(new Snake());
	snakes.get(i).setHead(x);
	snakes.get(i).setTail(y);
	System.out.println("H"+(i+1)+" : "+snakes.get(i).getHead());
	System.out.println("T"+(i+1)+" : "+snakes.get(i).getTail());
	}
	
	
}

/*public int setRandomValue()
{
	int value=0;
	Random r=new Random();
	value=r.nextInt(*/
	

}
