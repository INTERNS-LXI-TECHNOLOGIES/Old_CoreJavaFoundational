package com.lxisoft.requirements;
import java.util.*;
public class Board
{


 int numbers[][]=new int[10][10];
//public ArrayList<Ladder> ladders=new ArrayList<Ladder>();
//public ArrayList<Snake> snakes=new ArrayList<Snake>();


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
			 


}
