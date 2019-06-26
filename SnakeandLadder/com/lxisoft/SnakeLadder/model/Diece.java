package com.lxisoft.SnakeLadder.model;
import java.util.*;
public class Diece{

	private int[] sides;
	private String colour;

public void setSides(int[] sides){
	this.sides=sides;
}
public void setColour(String colour){
	this.colour=colour;
}
public int[] getSides(){
	return sides;
}
public String getColour(){
	return colour;
}
}