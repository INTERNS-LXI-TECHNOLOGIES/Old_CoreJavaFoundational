package com.lxisoft.SnakeLadder.view;
import com.lxisoft.SnakeLadder.model.Player;
import com.lxisoft.SnakeLadder.model.Diece;
import java.util.*;
import java.io.*;
public class GameView{

int pos;
int value=0;
 
PlayerView view=new PlayerView();
Scanner in=new Scanner(System.in);

	public void display(){
		System.out.println("1.PlayGame\n2.ExitGame\n");
		System.out.println("Enter your choice:");
		int a=in.nextInt();
		switch(a){
			case 1:view.playGame();
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
  