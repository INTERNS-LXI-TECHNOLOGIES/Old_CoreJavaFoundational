package com.lxisoft.SnakeNLadder.view;
import java.util.*;
import com.lxisoft.SnakeNLadder.model.*;
import com.lxisoft.SnakeNLadder.controller.*;
public class StartGameView{
	BoardController boardController = new BoardController();
	PlayerController playerController = new PlayerController();
	StartGameController startGameController = new StartGameController();
	public StartGameView(){
		startGame();
	}
	static Scanner scan = new Scanner(System.in);
	public void startGame(){
		System.out.println("	Press 1 to Start Game");
		int a = scan.nextInt();
		if(a==1){
			playerSelection();
		}
	}
	public void playerSelection(){
		int a;
		String name;
		String color;
		String playerColor;
		do{
			System.out.print("No.Of Players Not More Than 4: ");
			a = scan.nextInt();
			if(a>4){
				System.out.println("Only 4 Player Can Play Try Again");
			}
		}while(a>4);
		playerController.playerCreation(a);
		ArrayList<PlayerController.Color> colors = null;
		for(int i=0;i<a;i++){
			System.out.print("Enter Player Name :");
			name = scan.next();
			colors = new ArrayList<PlayerController.Color>();
			colors = playerController.getColors();
			boolean cont = true;
			do{
			System.out.println("\n	Select Color");
			for(int j=0;j<colors.size();j++){
				System.out.print(colors.get(j).getColor()+colors.get(j).toString()+" \033[0m");
			}
			color = scan.next();
			playerColor = startGameController.getPlayerColor(colors,color);
			cont = startGameController.removeColor(colors,color);
			if(cont == true){
				System.out.println("Entered Color Not Available Try Again");
			}
			}while(cont);
			playerController.setPlayerDetails(i,name,playerColor);
		}
		startingGame(a);
	}
	public void startingGame(int players){
		startGameController.createSNl();
		int i = 0;
		boolean win = false;
		while(win == false){
		System.out.println(playerController.players.get(i).getName()+"'s Turn");
		System.out.println("Press 5 To Roll Dice");
		int a = scan.nextInt();
		if(a==5){
			win = boardController.playing(playerController.players.get(i));
			if(win==true){
				winner(playerController.players.get(i).getName());
			}
		}
		if(i==players-1){
			i=0;
		}
		else{
			i++;
		}
		}
	}
	public void winner(String winner){
		boardController.boardView();
		System.out.println("	***"+winner+" Wins***");
	}
}