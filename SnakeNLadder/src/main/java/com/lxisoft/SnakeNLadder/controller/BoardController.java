package com.lxisoft.SnakeNLadder.controller;
import com.lxisoft.SnakeNLadder.view.*;
import com.lxisoft.SnakeNLadder.model.*;
import java.io.*;
public class BoardController{
	BoardView boardView = new BoardView();
	PlayerController pc = new PlayerController();
	StartGameController sgc = new StartGameController();
	public boolean playing(PlayerModel player){
		int dice = boardView.rollDiceView();
		/*try{
		new ProcessBuilder("cmd ","/c"," cls").inheritIO().start().waitFor();
		}catch(Exception e){
			
		}*/
		if(player.getPos()==0){
			System.out.println("Get 1 To Enter The Game");
		}
		System.out.println("Dice : "+dice);
		int temp = 0;
			for(int i=0;i<sgc.snakes.size();i++){
				if(player.getPos()+dice==sgc.snakes.get(i).start){
					player.setPos(sgc.snakes.get(i).end);
					temp++;
				}
			}
			for(int i=0;i<sgc.ladders.size();i++){
				if(player.getPos()+dice==sgc.ladders.get(i).start){
					player.setPos(sgc.ladders.get(i).end);
					temp++;
				}
			}
			if(temp==0){
				if(dice==1&&player.getPos()==0){
					player.setPos(1);
				}
				else if(player.getPos()+dice<100&&player.getPos()>0){
					player.setPos(player.getPos()+dice);
				}
				else if(player.getPos()+dice==100){
					player.setPos(player.getPos()+dice);
					return true;
				}
			}
			for(int i=0;i<pc.players.size();i++){
				if(pc.players.get(i)!=player&&pc.players.get(i).getPos()==player.getPos()&&pc.players.get(i).getPos()!=0){
					pc.players.get(i).setPos(1);
				}
			}
		boardView.boardView(pc.players);
		return false;
	}
	public void boardView(){
		boardView.boardView(pc.players);
	}

}