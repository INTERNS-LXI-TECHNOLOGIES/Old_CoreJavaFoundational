package com.lxisoft.SnakeLadder.model;
public class Ladder{
	
	private int ladderTop;
	private int ladderBottom;
	private int ladderElement1;
	private int ladderElement2;

public void setLadderTop(int ladderTop){
	this.ladderTop=ladderTop;
}
public void setLadderBottom(int ladderBottom){
	this.ladderBottom=ladderBottom;
}
public int getLadderTop(){
	return ladderTop;
}
public int getLadderBottom(){
	return ladderBottom;
}
public void setLadderElement1(int ladderElement1){
	this.ladderElement1=ladderElement1;
}
public int getLadderElement1(){
	return ladderElement1;
}
public void setLadderElement2(int ladderElement2){
	this.ladderElement2=ladderElement2;
}
public int getLadderElement2(){
	return ladderElement2;
}
}