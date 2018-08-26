package com.lxisoft.movieScript.actors;

public class Comedian{
	String comedianName,comedianCharacter;
	public Comedian(String comedianName,String comedianCharacter){
		this.comedianCharacter=comedianCharacter;
		this.comedianName = comedianName;
	}
	public String getComedianCharacter(){
		return comedianCharacter;
	}
	public String getComedianName(){
		return comedianName;
	}
}