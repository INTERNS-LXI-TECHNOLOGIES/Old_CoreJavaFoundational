package com.lxisoft.SnakeNLadder.model;
public class BoardModel{
	private int noOfSnakes;
	private int noOfLadder; 
	public void setNoOfSnake(int noOfSnakes){
		this.noOfSnakes = noOfSnakes;
	}
	public int getNoOfSnakes(){
		return noOfSnakes;
	}
	public void setNoOfLadder(int noOfLadder){
		this.noOfLadder = noOfLadder;
	}
	public int getNoOfLadder(){
		return noOfLadder;
	}
	public class Snake{
		public int start;
		public int end;
	}
	public class Ladder{
		public int start;
		public int end;
	}
}