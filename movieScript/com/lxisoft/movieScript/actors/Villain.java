package com.lxisoft.movieScript.actors;

public class Villain{
	String villainName, villainCharater;
	
	public Villain(String villainCharater,String villainName){
		this.villainCharater = villainCharater;
		this.villainName = villainName;
	}
	
	public String getVillainCharater(){
		return villainCharater;
	}
	
	public String getVillainName(){
		return villainName;
	}
	
}