package com.lxisoft.SnakeNLadder.controller;
import com.lxisoft.SnakeNLadder.model.*;
import java.util.ArrayList;
public class StartGameController{
	BoardModel board = new BoardModel();
	public static ArrayList<BoardModel.Snake> snakes = new ArrayList<BoardModel.Snake>();
	public static ArrayList<BoardModel.Ladder> ladders = new ArrayList<BoardModel.Ladder>();
	public boolean removeColor(ArrayList<PlayerController.Color> colors,String color){
		for(int j=0;j<colors.size();j++){
			if(color.toUpperCase().equals(colors.get(j).toString())){
				colors.remove(j);
				return false;
			}
		}
		return true;
	}
	public String getPlayerColor(ArrayList<PlayerController.Color> colors,String color){
		for(int j=0;j<colors.size();j++){
			if(color.toUpperCase().equals(colors.get(j).toString())){
				return colors.get(j).getColor();
			}
		}
		return null;
	}
	public void createSNl(){
		int snakeCount = (int)(Math.random()*3)+4;
		int ladderCount = (int)(Math.random()*3)+4;
		for(int i=0;i<snakeCount;i++){
			boolean repeat = false;
			BoardModel.Snake snake = board.new Snake();
			do{
				snake.start = (int)(Math.random()*48)+50;
				snake.end = (int)(Math.random()*50);
				repeat = checking(snake.start,snake.end);
			}while(repeat);
			snakes.add(snake);
		}
		for(int i=0;i<ladderCount;i++){
			boolean repeat = false;
			BoardModel.Ladder ladder = board.new Ladder();
			do{
				ladder.start = (int)(Math.random()*45)+5;
				ladder.end =  (int)(Math.random()*50)+50;
				repeat = checking(ladder.start,ladder.end);
			}while(repeat);
			ladders.add(ladder);
		}
	}
	public boolean checking(int start,int end){
		int a = 0;
		for(int j=0;j<ladders.size();j++){
			if(ladders.get(j).start==start||ladders.get(j).end==end||ladders.get(j).start==end||ladders.get(j).end==start){
				a++;
			}
		}
		for(int j=0;j<snakes.size();j++){
			if(snakes.get(j).start==start||snakes.get(j).end==end||snakes.get(j).start==end||snakes.get(j).end==start){
				a++;
			}
		}
		if(a>0){
			return true;
		}
		return false;
	}
}