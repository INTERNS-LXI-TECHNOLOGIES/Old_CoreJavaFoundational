package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Player;
import java.util.*;
import java.io.*;
public class GameView{

ArrayList<Player> players = new ArrayList<Player>();
//GameController gameController = new GameController();
BoardView boardView=new BoardView();
static Scanner in=new Scanner(System.in);
	// public void gameRule(){
	// 	System.out.println("SNAKE AND LADDER GAME");
	// 	System.out.println("game rule");
	// 	System.out.println("Remember only a maximum of 4 members can play the game");
	// }
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

		Player player = new Player();
		boolean validate=false;
		System.out.println("Enter the number of players:");
		System.out.println("Remember the number of players must should be from 2 to 4");
		int b=in.nextInt();
		//for(int i=1;i<=b;i++)
		int p=1;
		while(p<=b){
			System.out.println("Enter the name of the player"+p);
			System.out.println(p);
			System.out.println(b);
			//String name=in.next();
			player.setName(in.next());
			System.out.println("Enter the colour of the Token"+p);
			//String colour=in.next();
			player.setTokenColour(in.next());
			//validate=gameController.validation(name,colour);
			players.add(player);
			p++;
		}	
	
	boardView.startGame();
}
	public void ExitGame(){
		System.out.println("Game over.........");
	}
}
 