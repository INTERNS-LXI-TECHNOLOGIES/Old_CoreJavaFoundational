package com.lxisoft.movieScript.actors;

import java.io.*;


public class Heroin{
	private String HeroinName,HeroinCharacter;
	public Heroin(String HeroinName,String HeroinCharacter){
		this.HeroinName = HeroinName;
		this.HeroinCharacter = HeroinCharacter;
	}
	
	public String getHeroinName(){
		return HeroinName;
	}
	
	public String getHeroinCharacter(){
		return HeroinCharacter;
	}
}