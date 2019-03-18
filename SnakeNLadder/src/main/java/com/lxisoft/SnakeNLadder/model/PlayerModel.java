package com.lxisoft.SnakeNLadder.model;
public class PlayerModel{
	private String name;
	private String color;
	private int pos;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setPos(int pos){
		this.pos = pos;
	}
	public int getPos(){
		return pos;
	}
}