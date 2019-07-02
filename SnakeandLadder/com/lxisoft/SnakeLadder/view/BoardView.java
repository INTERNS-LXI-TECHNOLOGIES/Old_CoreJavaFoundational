package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Cell;
import java.util.*;
public class BoardView{                                       


int n;
int m=1;
int[][] cells = new int[10][10];
int num;
//ArrayList<Snake> snakes=new ArrayList<Snake>();
//ArrayList<Ladder> ladder=new ArrayList<Ladder>();

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

	public void setSnake(){
		int k=(int)((Math.random()*3)+1);
		System.out.println("value="+k);
		for(int p=0;p<k;p++){
			num=100;
		int x=(int)((Math.random()*100)+1);
		int	y=(int)((Math.random()*100)+1);
		System.out.println(x);
		System.out.println(y);
		int H=(x>y)?x:y;
		System.out.println(H);
		int T=(x<y)?x:y;
		System.out.println(T);
		for(int i=0;i<10;i++){
				if(i%2==0){
				for(int j=0;j<10;j++){
					cells[i][j]=num;
					
       					if (H==cells[i][j]){
       					   System.out.print(cells[i][j]+"{H"+p+"}"+"\t");
       					num--;
       					}
       					else if(T==cells[i][j]){
							System.out.print(cells[i][j]+"{T"+p+"}"+"\t");
						num--;
						}
       					else 
       					{
       					System.out.print(cells[i][j]+"\t");
       				num--;
       				}
					}
				num=num-10;	
			}
				else{
					int n=num+1;
					for(int j=0;j<10;j++){
						cells[i][j]=n;
						//int T=(x<y)?x:y;
						if(T==cells[i][j]){
							System.out.print(cells[i][j]+"{T"+p+"}"+"\t");
							n++;
						}
						else if (H==cells[i][j]){
       					   System.out.print(cells[i][j]+"{H"+p+"}"+"\t");
       					n++;
       					}
						else
						{
		   				System.out.print(cells[i][j]+"\t");
		   				n++;
		   				}
		   			
					}
				}
			System.out.print("\n");
		}
	}
}
	public void setLadder(){
		int k=(int)((Math.random()*3)+1);
		System.out.println("value="+k);
		for(int p=0;p<k;p++){
			num=100;
		int x=(int)((Math.random()*100)+1);
		int	y=(int)((Math.random()*100)+1);
		System.out.println(x);
		System.out.println(y);
		int H=(x>y)?x:y;
		System.out.println(H);
		int T=(x<y)?x:y;
		System.out.println(T);
		for(int i=0;i<10;i++){
				if(i%2==0){
				for(int j=0;j<10;j++){
					cells[i][j]=num;
					
       					if (H==cells[i][j]){
       					   System.out.print(cells[i][j]+"{U"+p+"}"+"\t");
       					num--;
       					}
       					else if(T==cells[i][j]){
							System.out.print(cells[i][j]+"{B"+p+"}"+"\t");
						num--;
						}
       					else 
       					{
       					System.out.print(cells[i][j]+"\t");
       				num--;
       				}
					}
				num=num-10;	
			}
				else{
					int n=num+1;
					for(int j=0;j<10;j++){
						cells[i][j]=n;
						//int T=(x<y)?x:y;
						if(T==cells[i][j]){
							System.out.print(cells[i][j]+"{U"+p+"}"+"\t");
							n++;
						}
						else if (H==cells[i][j]){
       					   System.out.print(cells[i][j]+"{B"+p+"}"+"\t");
       					n++;
       					}
						else
						{
		   				System.out.print(cells[i][j]+"\t");
		   				n++;
		   				}
		   			
					}
				}
			System.out.print("\n");
		}
	}
}
}
		