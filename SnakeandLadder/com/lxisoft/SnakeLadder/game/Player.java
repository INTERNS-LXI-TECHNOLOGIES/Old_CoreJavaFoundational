package com.lxisoft.SnakeLadder.game;
import java.util.*;
public class Player{

	private String name;
	private String tokenColour;
	private int position;

public void setName(String name){
	this.name=name;
}
public void setTokenColour(String tokenColour){
	this.tokenColour=tokenColour;
}
public String getName(){
	return name;
}
public String getTokenColour(){
	return tokenColour;
}
public void setPosition(int position){
	this.position=position;
}
public int getPosition(){
	return position;
}
public String toString(){
	return name;
}

}