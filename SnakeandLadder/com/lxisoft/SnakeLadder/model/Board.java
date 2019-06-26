package com.lxisoft.SnakeLadder.model;
import java.util.*;
public class Board{

	private ArrayList<Snake> snake;
	private ArrayList<Ladder> ladder;
	private ArrayList<Cell> cell;

public void setSnake(ArrayList<Snake> snake){
	this.snake=snake;
}
public void setLadder(ArrayList<Ladder> ladder){
	this.ladder=ladder;
}
public void setCell(ArrayList<Cell> cell){
	this.cell=cell;
}
public ArrayList<Snake> getSnake(){
	return snake;
}
public ArrayList<Ladder> getLadder(){
	return ladder;
}
public ArrayList<Cell> getCell(){
	return cell;
}
}