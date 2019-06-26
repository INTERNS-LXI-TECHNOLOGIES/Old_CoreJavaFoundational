package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Cell;
import java.util.*;
public class BoardView{                                       


int n;
int m=1;
int[][] cells = new int[10][10];
int num=100;
	public void startGame(){

			for(int i=0;i<10;i++){
				if(i%2==0){
				for(int j=0;j<10;j++){
					
					cells[i][j]=num;
				
       					System.out.print(cells[i][j]+"\t");
       					num--;
       					
					}
				num=num-10;	
				}
				else{
					int n=num+1;
					for(int j=0;j<10;j++){
						cells[i][j]=n;
		   				System.out.print(cells[i][j]+"\t");
		   				n++;
					}
				}
				
			System.out.print("\n");

			}
		}
	}
	


	
		