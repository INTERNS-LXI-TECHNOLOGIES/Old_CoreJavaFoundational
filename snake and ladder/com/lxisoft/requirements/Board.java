package com.lxisoft.requirements;
import java.util.*;
public class Board
{

//public ArrayList<Cell> cells=new ArrayList<Cell>();
 int numbers[][]=new int[10][10];
public ArrayList<Ladder> ladders=new ArrayList<Ladder>();
public ArrayList<Snake> snakes=new ArrayList<Snake>();


public void createBoard()
{

int x = 100;

for(int i = 0; i < numbers.length; i++){

   for(int j = 0; j < numbers[0].length; j++){

       numbers[i][j] = x;

       x--;

   }

}
for(int row=0;row<numbers.length;row++){

for(int col=0;col<numbers[row].length;col++){

System.out.print(numbers[row][col]+"\t");

}

System.out.println("\n");

}

}




}