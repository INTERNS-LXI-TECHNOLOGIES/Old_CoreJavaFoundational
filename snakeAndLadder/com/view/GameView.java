package com.view;
import java.util.ArrayList;
import java.util.Scanner;

import com.controller.*;
import com.model.*;
public class GameView 
{
	BoardView bview=new BoardView();
	BoardController bc =new BoardController();
	PlayerController pc=new PlayerController(); 
	GameController gc=new GameController();
	DiceController dc=new DiceController();
	
	 Scanner scan = new Scanner(System.in);
	int a;
	public void startGame()
	{
		System.out.println("	Press 1 to Start Game");
		 a = scan.nextInt();
		if(a==1){
			selectPlyer();
		}
	}
	public void selectPlyer()
	{
	
		String name = null;
		String color = null;
		int position = 0;
	
		do{
			System.out.print("Enter the No.of Players: ");
			 a= scan.nextInt();
			if(a>4)
			{
				System.out.println("Only 4 Player Can Play \n'Try Again..'");
			}
		}
		while(a>4);
		for(int i=1;i<=a;i++)
		{
		pc.setPlayer(name,color);
		System.out.println("Enter the Player "+i+"  Name :");
		String n = scan.next();
	
		}
	
	}
	public void setDice()
	{
		int w =100;
	   bc.setSnakeAndLadder();
	   do {
		System.out.println("press '0' to throw Dice");
		int b=scan.nextInt();
		if(b==0)
		{
			
			System.out.print("!!!!!!"+a);
			for(int i=0;i<a;i++)
			{
			DiceController.roll();
			w = bc.playing(pc.players.get(i));
			if(w==true)
			{
				w=(pc.players.get(i).getName());
			}
			while(w==100);
		}
	}
	   }
	}
}

	 

