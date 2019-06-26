package com.lxisoft.SnakeLadder.model;
import java.util.*;
public class Player{

	private String name;
	private String tokenColour;

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
}