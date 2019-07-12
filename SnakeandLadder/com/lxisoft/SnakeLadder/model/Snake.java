package com.lxisoft.SnakeLadder.model;
import java.util.*;
public class Snake{

	private int snakeHead;
	private int snakeTail;
	private int snakeElement1;
	private int snakeElement2;

public void setSnakeHead(int snakeHead){
	this.snakeHead=snakeHead;
} 
public void setSnakeTail(int snakeTail){
	this.snakeTail=snakeTail;
}
public int getSnakeHead(){
	return snakeHead;
}
public int getSnakeTail(){
	return snakeTail;
}
public void setSnakeElement1(int snakeElement1){
	this.snakeElement1=snakeElement1;
}
public int getSnakeElement1(){
	return snakeElement1;
}
public void setSnakeElement2(int snakeElement2){
	this.snakeElement2=snakeElement2;
}
public int getSnakeElement2(){
	return snakeElement2;
}
}