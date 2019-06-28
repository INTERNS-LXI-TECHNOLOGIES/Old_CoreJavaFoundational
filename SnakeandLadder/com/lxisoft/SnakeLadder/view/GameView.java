package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Player;
import com.lxisoft.SnakeLadder.model.Diece;
import java.util.*;
import java.io.*;
public class GameView{

ArrayList<Player> players = new ArrayList<Player>();
ArrayList<Diece> dieceValues=new ArrayList<Diece>();
//GameController gameController = new GameController();
BoardView boardView=new BoardView(); 

Scanner in=new Scanner(System.in);
	// public void gameRule(){
	// 	System.out.println("SNAKE AND LADDER GAME");
	// 	System.out.println("game rule");
	// 	System.out.println("Remember only a maximum of 4 members can play the game");
	// }
	public GameView(){
		for(int i=0;i<=0;i++){
			for(int j=0;j<=0;j++){
				location[i][j]!=null;
			}
		}
	}
	public void display(){
		System.out.println("1.PlayGame\n2.ExitGame\n");
		System.out.println("Enter your choice:");
		int a=in.nextInt();
		switch(a){
			case 1:playGame();
			break;
			case 2:ExitGame();
			break;
			default:System.out.println("Not taken any choice");
		}
	}
	
	public void playGame(){

		
		boolean validate=false;
		System.out.println("Enter the number of players:");
		System.out.println("Remember the number of players must should be from 2 to 4");
		int b=in.nextInt();
		for(int i=1;i<=b;i++){
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
	System.out.println("                        SNAKE AND LADDER GAME BEGINS");
	System.out.println(" ");	
	boardView.startGame();
	dieceThrow(players);
}
	public void dieceThrow(ArrayList<Player> players){
		for(int i=0;i<players.size();i++){
			Diece diece=new Diece();
			int n=((int)(Math.random()*6)+1);
			diece.setDieceValue(n);
			dieceValues.add(diece);
			System.out.println("Enter any key to roll the diece");
			String key=in.next();
			int dieVal=dieceValues.get(i).getDieceValue();
			if(dieceValues.get(i).dieceValue()==6){
				position(players);
			}

			System.out.println(players.get(i).getName()+"="+dieceValues.get(i).getDieceValue());
		}
// 		for(int j=0;j<players.size();j++){
// //logic for moving the token to be written here
	}
	public void position(ArrayList<Player> players){
		for(int i=0;i<=10;i++){
			for(int j=0;j<=10;j++){
				j+getDieceValue();
				players.setPosition(location[i][j]);
				System.out.println(players.getPosition());
			}
		}
	}
// 			}
	public void setSnake(){

	}
	public void setLadder(){

	}


	public void ExitGame(){
		System.out.println("Game over.........");
	}

}
  