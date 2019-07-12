package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Player;
import com.lxisoft.SnakeLadder.model.Snake;
import com.lxisoft.SnakeLadder.model.Ladder;
import java.util.*;
public class PlayerView{

int pos;
int value=0;
int[][] cells = new int[10][10];
ArrayList<Player> players = new ArrayList<Player>();
Scanner in=new Scanner(System.in);
BoardView board = new BoardView();

	public void playGame(){

		
		boolean validate=false;
		System.out.println("Enter the number of players:");
		System.out.println("Remember the number of players must should be from 2 to 4");
		int b=in.nextInt();
		for(int i=1;i<=b;i++ ){
			Player player = new Player();
			System.out.println("Enter the name of the player"+i);
			//String name=in.next();
			player.setName(in.next());
			System.out.println("Enter the colour of the Token"+i);
			//String colour=in.next();
			player.setTokenColour(in.next());
			//validate=gameController.validation(name,colour);
			players.add(player);
			System.out.println(players.size());
		}
		System.out.println(" ");
		System.out.println("                        SNAKE AND LADDER GAME BEGINS");
		System.out.println(" ");	
		board.setSnake();
	board.setLadder();
		gameBoard();
		//setPlayerBoard();
		dieceThrow(players);
	}
	public void dieceThrow(ArrayList<Player> players){
		//BoardView board = new BoardView();
		//board.setLadder();
		//board.setSnake();
			
			do{
				// BoardView board = new BoardView();
				// board.setLadder();
				// board.setSnake();

				for(int i=0;i<players.size();i++){
					int n=((int)(Math.random()*6)+1);
			System.out.println("Enter any key to roll the diece");
			String key=in.next();
			// if(n==1){
			// 	int p=1;
			// 	players.get(i).setPosition(p);
			// 	System.out.println(players.get(i).getPosition());
			// }
			
			System.out.println("Diece value of "+players.get(i).getName()+"="+n);
			pos=players.get(i).getPosition()+n;
			players.get(i).setPosition(pos);
			System.out.println("player "+players.get(i).getName()+ " is now at position "+players.get(i).getPosition());
			gameBoard();
			//setPlayerBoard();
			for(int j=0;j<players.size();j++){
				if(players.get(j).getPosition()==100)
				 	value=1;
				}
			}
		}
			while(value==0);
    }
    public void gameBoard(){
    	int num=100;

			for(int i=0;i<10;i++){
				if(i%2==0){
					for(int j=0;j<10;j++){
						cells[i][j]=num;
						int flag=0;
						for(int p=0;p<board.snakes.size() && p<board.ladders.size();p++){
							
	       					if (cells[i][j]==board.snakes.get(p).getSnakeHead()){
	       					   	for(int q=0;q<players.size();q++){
									if(board.snakes.get(p).getSnakeHead()==players.get(q).getPosition()){
										players.get(q).setPosition(board.snakes.get(p).getSnakeTail());
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
	       					   	System.out.print(cells[i][j]+"{H"+p+"}"+"\t");	
	       						num--;
	       						flag=1;
	       					}
	       					else if(cells[i][j]==board.snakes.get(p).getSnakeTail()){
	       						for(int q=0;q<players.size();q++){
									if(board.snakes.get(p).getSnakeTail()==players.get(q).getPosition()){
								
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
								System.out.print(cells[i][j]+"{T"+p+"}"+"\t");
								num--;
								flag=1;
							}
	       					else if(cells[i][j]==board.ladders.get(p).getLadderTop()){
	       						for(int q=0;q<players.size();q++){
									if(board.ladders.get(p).getLadderTop()==players.get(q).getPosition()){
										
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
	       						System.out.print(cells[i][j]+"{U"+p+"}"+"\t");
	       						num--;
	       						flag=1;
	       					}
	       					else if(cells[i][j]==board.ladders.get(p).getLadderBottom()){
	       						for(int q=0;q<players.size();q++){
									if(board.ladders.get(p).getLadderBottom()==players.get(q).getPosition()){
										players.get(q).setPosition(board.ladders.get(p).getLadderTop());
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
	       						System.out.print(cells[i][j]+"{B"+p+"}"+"\t");
	       						num--;
	       						flag=1;
	       					}
	       					else
	       					{
	       					
	       					}
	       				}
	       				for(int p=0;p<players.size();p++){
							
	       					if (cells[i][j]==players.get(p).getPosition()){
	       					   
	       					   	System.out.print(cells[i][j]+"<"+players.get(p).getTokenColour()+">"+"\t");	
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
					//System.out.print("\n");
					num=num-10;	
				}
				else{
					int n=num+1;
					for(int j=0;j<10;j++){
						cells[i][j]=n;
						int key=0;
						for(int p=0;p<board.snakes.size() && p<board.ladders.size();p++){
							if(cells[i][j]==board.snakes.get(p).getSnakeTail()){
								for(int q=0;q<players.size();q++){
									if(board.snakes.get(p).getSnakeTail()==players.get(q).getPosition()){
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
								System.out.print(cells[i][j]+"{T"+p+"}"+"\t");
								n++;
								key=1;
							}
							else if(cells[i][j]==board.snakes.get(p).getSnakeHead()){
								for(int q=0;q<players.size();q++){
									if(board.snakes.get(p).getSnakeHead()==players.get(q).getPosition()){
										players.get(q).setPosition(board.snakes.get(p).getSnakeTail());
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
	       					   	System.out.print(cells[i][j]+"{H"+p+"}"+"\t");
	       						n++;
	       						key=1;
	       					}
							else if(cells[i][j]==board.ladders.get(p).getLadderBottom()){
								for(int q=0;q<players.size();q++){
									if(board.ladders.get(p).getLadderBottom()==players.get(q).getPosition()){
										players.get(q).setPosition(board.ladders.get(p).getLadderTop());
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
								System.out.print(cells[i][j]+"{B"+p+"}"+"\t");
								n++;
								key=1;
							}
							else if(cells[i][j]==board.ladders.get(p).getLadderTop()){
								for(int q=0;q<players.size();q++){
									if(board.ladders.get(p).getLadderTop()==players.get(q).getPosition()){
										System.out.print(cells[i][j]+"<"+players.get(q).getTokenColour()+">"+"\t");
									}
									else{
										
									}
								}
								System.out.print(cells[i][j]+"{U"+p+"}"+"\t");
								n++;
								key=1;
							}
							else
							{
			   					
			   				}
			   			}
			   			for(int p=0;p<players.size();p++){
							if(cells[i][j]==players.get(p).getPosition()){
								System.out.print(cells[i][j]+"<"+players.get(p).getTokenColour()+">"+"\t");
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