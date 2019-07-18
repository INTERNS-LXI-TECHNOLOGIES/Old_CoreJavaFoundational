package com.lxisoft.SnakeLadder.board;
import com.lxisoft.SnakeLadder.game.Snake;
import com.lxisoft.SnakeLadder.game.Ladder;
import com.lxisoft.SnakeLadder.game.Player;
import com.lxisoft.SnakeLadder.game.Diece;
import java.util.*;
public class Board{                                       


int n;
int[][] cells = new int[10][10];
int num=100;
ArrayList<Snake> snakes=new ArrayList<Snake>();
ArrayList<Ladder> ladders=new ArrayList<Ladder>();



		public void setBoard(){

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
		
		int k=4;
		 
		System.out.println("Svalue="+k);
		for(int p=0;p<5;p++){
			int x;
			int y;
			int mx;						
			do{
			mx=0;
			x=(int)(Math.random()*((97-76)+1))+76;
			y=(int)(Math.random()*((50-26)+1))+26;
			for(int j=0;j<snakes.size();j++){
				if((x==snakes.get(j).getSnakeHead())||(y==snakes.get(j).getSnakeTail())){
					mx=1;break;
				}				
			}
		}while(mx==1);
			
			if(mx==0){
				Snake s = new Snake();
				s.setSnakeHead(x);
				s.setSnakeTail(y);
				snakes.add(s); 
		     }
				
				System.out.println("HEAD is "+snakes.get(p).getSnakeHead());
				System.out.println("TAIL is "+snakes.get(p).getSnakeTail());
			

			}
	}
    public void setLadder(){
    	int k=4;
		 
		System.out.println("Lvalue="+k);
		for(int q=0;q<5;q++){
			int a;
			int b;
			int mz;						
			do{
			mz=0;
			a=(int)(Math.random()*((75-51)+1))+51;
			b=(int)(Math.random()*((25-3)+1))+3;
			for(int t=0;t<ladders.size();t++){
				if((a==ladders.get(t).getLadderTop())||(b==ladders.get(t).getLadderBottom())){
					mz=1;break;
				}				
			}
		}while(mz==1);
			
			if(mz==0){
				Ladder l = new Ladder();
				l.setLadderTop(a);
				l.setLadderBottom(b);
				ladders.add(l); 
		     }
				
				System.out.println("TOP is "+ladders.get(q).getLadderTop());
				System.out.println("BOTTOM is "+ladders.get(q).getLadderBottom());
			

			}
	}
}
    
	
	
