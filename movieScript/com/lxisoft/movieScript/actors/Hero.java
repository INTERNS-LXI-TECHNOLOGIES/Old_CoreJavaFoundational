package com.lxisoft.movieScript.actors;

public class Hero{
	private String heroName,heroCharacter;
	public Hero(String heroName,String heroCharacter){
		this.heroName = heroName;
		this.heroCharacter = heroCharacter;
	}
	
	public String getHeroName(){
		return heroName;
	}
	
	public String getHeroCharacter(){
		return heroCharacter;
	} 
}