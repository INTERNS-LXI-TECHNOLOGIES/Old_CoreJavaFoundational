package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Cell;
import com.lxisoft.SnakeLadder.model.Snake;
import com.lxisoft.SnakeLadder.model.Ladder;
import java.util.*;
public class BoardView{                                       


int n;
int m=1;
int[][] cells = new int[10][10];
int num=100;
ArrayList<Snake> snakes=new ArrayList<Snake>();
ArrayList<Ladder> ladders=new ArrayList<Ladder>();

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
		//  setSnake();
		//  setLadder();
		//  for(int i=0;i<snakes.size();i++){
		// 	if(snakes.get(n).getSnakeHead()!=ladders.get(m).getLadderTop()&&snakes.get(n).getSnakeTail()!=ladders.get(m).getLadderBottom()){
		// // 			System.out.println("snakeHead "+snakes.get(n).getSnakeHead());
		// // 			System.out.println("laddertop "+ladders.get(m).getLadderTop());
		// // 			System.out.println("snaketail "+snakes.get(n).getSnakeTail());
		// // 			System.out.println("ladderbottom "+ladders.get(m).getLadderBottom());
		// // 			System.out.println("yepp");

		// // 		}

		// 	}
		}

	public void setSnake(){
		int rand1=0;
		int rand2=0;
		int k=(int)((Math.random()*3)+1);
		System.out.println("value="+k);
		for(int p=0;p<k;p++){

			Snake s = new Snake();
			num=100;
			int x=(int)((Math.random()*100)+1);
			int	y=(int)((Math.random()*100)+1);
			if(x!=rand1 && y!=rand2){
				rand1=x;
				rand2=y;
				int H=(x>y)?x:y;
				int T=(x<y)?x:y;
				if(H!=T){
				s.setSnakeHead(H);
				s.setSnakeTail(T);
				snakes.add(s);
				}
				System.out.println("HEAD is "+snakes.get(p).getSnakeHead());
				System.out.println("TAIL is "+snakes.get(p).getSnakeTail());
			}
	    }
	}
    public void setLadder(){
    	int rand1=0;
		int rand2=0;
		int k=(int)((Math.random()*3)+1);
		System.out.println("value="+k);
		for(int p=0;p<k;p++){

			Ladder l= new Ladder();
			num=100;
			int x=(int)((Math.random()*100)+1);
			int	y=(int)((Math.random()*100)+1);
			if(x!=rand1 && y!=rand2){
			rand1=x;
			rand2=y;
			int U=(x>y)?x:y;
			int B=(x<y)?x:y;
				if(U!=B){
				l.setLadderTop(U);
				l.setLadderBottom(B);
				ladders.add(l);
				}
			System.out.println("TOP is "+ladders.get(p).getLadderTop());
			System.out.println("BOTTOM is "+ladders.get(p).getLadderBottom());
				}
	    }
    }
	public void setSnakePosition(){
		setSnake();
	
			num=100;

			for(int i=0;i<10;i++){
				if(i%2==0){
					for(int j=0;j<10;j++){
						cells[i][j]=num;
						int flag=0;
						for(int p=0;p<snakes.size();p++){
							
	       					if (snakes.get(p).getSnakeHead()==cells[i][j]){
	       					   System.out.print(cells[i][j]+"{H"+p+"}"+"\t");
	       						num--;
	       						flag=1;
	       					}
	       					else if(snakes.get(p).getSnakeTail()==cells[i][j]){
								System.out.print(cells[i][j]+"{T"+p+"}"+"\t");
								num--;
								flag=1;
							}
	       					else 
	       					{
	       					//System.out.print(cells[i][j]+"\t");
	       					//num--;
	       					}
	       				}
	       				if(flag==0){
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
						int key=0;
						for(int p=0;p<snakes.size();p++){
							if(snakes.get(p).getSnakeTail()==cells[i][j]){
								System.out.print(cells[i][j]+"{T"+p+"}"+"\t");
								n++;
								key=1;
							}
							else if (snakes.get(p).getSnakeHead()==cells[i][j]){
	       					   System.out.print(cells[i][j]+"{H"+p+"}"+"\t");
	       						n++;
	       						key=1;
	       					}
							else
							{
			   					// System.out.print("*"+cells[i][j]+"\t");
			   					// n++;
			   				}
			   			}
			   			if(key==0){
			   			System.out.print(cells[i][j]+"\t");
			   			n++;
			   		}
					}
				}
			System.out.print("\n");
		}
}
public void setLadderPosition(){
		setLadder();
	
			num=100;

			for(int i=0;i<10;i++){
				if(i%2==0){
					for(int j=0;j<10;j++){
						cells[i][j]=num;
						int flag=0;
						for(int p=0;p<ladders.size();p++){
							
	       					if (ladders.get(p).getLadderTop()==cells[i][j]){
	       					   System.out.print(cells[i][j]+"{U"+p+"}"+"\t");
	       						num--;
	       						flag=1;
	       					}
	       					else if(ladders.get(p).getLadderBottom()==cells[i][j]){
								System.out.print(cells[i][j]+"{B"+p+"}"+"\t");
								num--;
								flag=1;
							}
	       					else 
	       					{
	       					//System.out.print(cells[i][j]+"\t");
	       					//num--;
	       					}
	       				}
	       				if(flag==0){
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
						int key=0;
						for(int p=0;p<snakes.size();p++){
							if(ladders.get(p).getLadderBottom()==cells[i][j]){
								System.out.print(cells[i][j]+"{B"+p+"}"+"\t");
								n++;
								key=1;
							}
							else if (ladders.get(p).getLadderTop()==cells[i][j]){
	       					   System.out.print(cells[i][j]+"{U"+p+"}"+"\t");
	       						n++;
	       						key=1;
	       					}
							else
							{
			   					// System.out.print("*"+cells[i][j]+"\t");
			   					// n++;
			   				}
			   			}
			   			if(key==0){
			   			System.out.print(cells[i][j]+"\t");
			   			n++;
			   		}
					}
				}
			System.out.print("\n");
		}
}
}