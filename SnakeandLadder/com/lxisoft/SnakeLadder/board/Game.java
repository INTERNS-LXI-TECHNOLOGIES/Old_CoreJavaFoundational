package com.lxisoft.SnakeLadder.board;
import com.lxisoft.SnakeLadder.game.Player;
import com.lxisoft.SnakeLadder.game.Diece;
import java.util.*;
import java.io.*;
public class Game{

int pos;
int value=0;
 
GamePlayer player=new GamePlayer();
Scanner in=new Scanner(System.in);

	public void display(){
		System.out.println("1.PlayGame\n2.ExitGame\n");
		System.out.println("Enter your choice:");
		int a=in.nextInt();
		switch(a){
			case 1:player.playGame();
			break;
			case 2:ExitGame();
			break;
			default:System.out.println("Not taken any choice");
		}
	}
	
	public void ExitGame(){
		System.out.println("Game over.........");
	}

}
  