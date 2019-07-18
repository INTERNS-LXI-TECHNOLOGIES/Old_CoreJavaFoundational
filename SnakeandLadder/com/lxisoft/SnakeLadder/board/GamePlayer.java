package com.lxisoft.SnakeLadder.board;
import com.lxisoft.SnakeLadder.game.Player;
import com.lxisoft.SnakeLadder.game.Snake;
import com.lxisoft.SnakeLadder.game.Ladder;
import java.util.*;
public class GamePlayer{

int pos;
int value=0;
int[][] cells = new int[10][10];
ArrayList<Player> players = new ArrayList<Player>();
Scanner in=new Scanner(System.in);
Board board = new Board();

	public void playGame(){
 
		
		boolean validate=false;
		System.out.println("Enter the number of players:");
		System.out.println("Remember the number of players must should be from 2 to 4");
		int b=in.nextInt();
		for(int i=1;i<=b;i++ ){
			Player player = new Player();
			System.out.println("Enter the name of the player"+i);
			player.setName(in.next());
			System.out.println("Enter the colour of the Token"+i);
			player.setTokenColour(in.next());
			players.add(player);
			System.out.println(players.size());
		}
		System.out.println(" ");	
		board.setSnake();
		board.setLadder();
		System.out.println("                        SNAKE AND LADDER GAME BEGINS");
		System.out.println(" ");
		gameBoard();
		dieceThrow(players);
	}
	public void dieceThrow(ArrayList<Player> players){
			
			do{

				for(int i=0;i<players.size();i++){
					int n=((int)(Math.random()*6)+1);
			System.out.println("Enter any key to roll the diece");
			String key=in.next();
			
			System.out.println("Diece value of "+players.get(i).getName()+"="+n);
			pos=players.get(i).getPosition()+n;
		for(int j=0;j<board.snakes.size()&&j<board.ladders.size();j++){
			if(pos==board.snakes.get(j).getSnakeHead()){
				pos=board.snakes.get(j).getSnakeTail();
			}
			else if(pos==board.ladders.get(j).getLadderBottom()){
				pos=board.ladders.get(j).getLadderTop();
			}
			else{

			}
		}
			if(pos<=100){
			players.get(i).setPosition(pos);
		}
			System.out.println("player "+players.get(i).getName()+ " is now at position "+players.get(i).getPosition());
			gameBoard();
			for(int j=0;j<players.size();j++){
				if(players.get(j).getPosition()==100)
				 	{value=1;
				 		System.out.println("Player "+players.get(j).getTokenColour()+" has **WON**");
				 	break;}
				}
			}
		}
			while(value==0);
    }
    public int checkPlayer(int number){

    					
						int flag=0;
       					for(int p=0;p<players.size();p++){
       						if(number==players.get(p).getPosition()){
       							System.out.print("<"+players.get(p).getTokenColour()+">"+"\t");flag=1;
       						}
       						else{

       						}
       					}
       					
       				return flag;       					
					
    }
    public int checkSnakePosition(int number){

    	
						int flag=0;
       					for(int p=0;p<board.snakes.size();p++){
       						if(number==board.snakes.get(p).getSnakeHead()){
       							System.out.print("{H"+p+"}"+"\t");flag=1;
       						}
       						else if(number==board.snakes.get(p).getSnakeTail()){
       							System.out.print("{T"+p+"}"+"\t");flag=1;
       						}
       					}
       					return flag;
       				}
       					
       					
					
    public int checkLadderPosition(int number){
    	
						int flag=0;
       					for(int p=0;p<board.ladders.size();p++){
       						if(number==board.ladders.get(p).getLadderTop()){
       							System.out.print("[U"+p+"]"+"\t");flag=1;
       						}
       						else if(number==board.ladders.get(p).getLadderBottom()){
       							System.out.print("[B"+p+"]"+"\t");flag=1;
       						}
       					}
       					return flag;
       					
    }
    public void gameBoard(){
    	int num=100;
    	int flag1=0;
    	int flag2=0,flag3=0;
    	for(int i=0;i<10;i++){

				if(i%2==0){
				for(int j=0;j<10;j++){
		
					cells[i][j]=num;

					flag1=checkPlayer(cells[i][j]);
			    	if(flag1==0){
			    		flag2=checkSnakePosition(cells[i][j]);
			 
			    		if(flag2==0){
			    			flag3=checkLadderPosition(cells[i][j]);
			   
			    		}
			    		else{

			    		}
			    	}
			    	else{
			    		
			    	}
			    	if((flag1==0)&&(flag2==0)&&(flag3==0))
       					System.out.print(cells[i][j]+"\t");
       					num--;
      
					}
				num=num-10;	
				} 
				else{
					int n=num+1;
					for(int j=0;j<10;j++){
						cells[i][j]=n;
		   				flag1=checkPlayer(cells[i][j]);
				    	if(flag1==0){
				    		flag2=checkSnakePosition(cells[i][j]);

				    		if(flag2==0){
				    			flag3=checkLadderPosition(cells[i][j]);
			
				    		}
				    		else{
				    			
				    		}
				    	}
				    	else{
				    		
				    	}
				     if((flag1==0)&&(flag2==0)&&(flag3==0))
				    	System.out.print(cells[i][j]+"\t");
		   				n++;
					
				}
				}
			System.out.print("\n");
		}
    }
}