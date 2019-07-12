package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Cell;
import com.lxisoft.SnakeLadder.model.Snake;
import com.lxisoft.SnakeLadder.model.Ladder;
import com.lxisoft.SnakeLadder.model.Player;
import com.lxisoft.SnakeLadder.model.Diece;
import java.util.*;
public class BoardView{                                       


int n;
int m=1;
int[][] cells = new int[10][10];
int num=100;
ArrayList<Snake> snakes=new ArrayList<Snake>();
ArrayList<Ladder> ladders=new ArrayList<Ladder>();
ArrayList<Integer> snakeElements=new ArrayList<Integer>();
ArrayList<Integer> ladderElements=new ArrayList<Integer>();


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
		int rand1=0;
		int rand2=0;
		int k=4;
		//Snake s = new Snake();
		 
		System.out.println("value="+k);
		//s.setSnakeHead(0);
		//s.setSnakeTail(0);
		//snakes.add(s);
		for(int p=0;p<k;p++){

			//Snake snake=new Snake();
			Snake s = new Snake();
			num=100;
			int x=(int)(Math.random()*((75-51)+1))+51;
			int	y=(int)(Math.random()*((25-3)+1))+3;
			 if(x!=rand1 && y!=rand2){
			 	rand1=x;
			 	rand2=y;
				// snake.setSnakeElement1(rand1);
				// snakes.add(snake);
				// System.out.println(snake.getSnakeElement1());
				// snake.setSnakeElement2(rand2);
				// snakes.add(snake);
				// System.out.println(snake.getSnakeElement2());
				int H=(x>y)?x:y;
				int T=(x<y)?x:y;
				if(H!=T){
					System.out.println("H="+H);
					System.out.println("T="+T);
					
					for(int i=0;i<snakes.size();i++){
						System.out.println("Enter");
						if(snakes.get(i).getSnakeHead()!=H){
							
							if(snakes.get(i).getSnakeTail()!=T){
								//System.out.println("H is................."+B);
								//System.out.println("H in 2 loop="+H);
								//System.out.println("T in 2 loop="+T);
								s.setSnakeHead(H);
								s.setSnakeTail(T);
							}
						}

					}
				snakes.add(s);

				// s.setSnakeHead(H);
				// s.setSnakeTail(T);
				// snakes.add(s);
				}
				System.out.println("HEAD is "+snakes.get(p).getSnakeHead());
				System.out.println("TAIL is "+snakes.get(p).getSnakeTail());
			}

			}
	}
    public void setLadder(){
    	int rand1=0;
		int rand2=0;
		int k=4;
		System.out.println("value="+k);
		for(int p=0;p<k;p++){

			//Ladder ladder=new Ladder();
			Ladder l= new Ladder();
			num=100;
			int x=(int)(Math.random()*((97-76)+1))+76;
			int	y=(int)(Math.random()*((50-26)+1))+26;
			if(x!=rand1 && y!=rand2){
			rand1=x;
			rand2=y;
			// ladder.setLadderElement1(rand1);
			// ladderElements.add(rand1);
			// ladder.setLadderElement2(rand2);
			// ladderElements.add(rand2);
			int U=(x>y)?x:y;
			int B=(x<y)?x:y;
				if(U!=B){
					System.out.println("U="+U);
					System.out.println("B="+B);
					//l.setLadderTop(U);
					//l.setLadderBottom(B);
					//ladders.add(l);
					for(int i=0;i<snakes.size();i++){
						System.out.println("getSnakeHead="+snakes.get(i).getSnakeHead());
						System.out.println("getSnakeTail="+snakes.get(i).getSnakeTail());
						if(U!=snakes.get(i).getSnakeHead()){
							for(int j=0;j<snakes.size();j++){
							if(B!=snakes.get(j).getSnakeTail()){
								System.out.println("B is................."+B);
								
							}
						}
							l.setLadderBottom(B);
								l.setLadderTop(U);
						}
						// else if(snakes.get(i).getSnakeTail()!=B){
						// 	System.out.println("B is................."+B);
						// 	l.setLadderBottom(B);
						// }
						// else{

						// }

					}
				ladders.add(l);
				}
			System.out.println("TOP is "+ladders.get(p).getLadderTop());
			System.out.println("BOTTOM is "+ladders.get(p).getLadderBottom());
			}	
			//System.out.println(ladder.getLadderElement2());

			}
	    }
	}
    
	
	
