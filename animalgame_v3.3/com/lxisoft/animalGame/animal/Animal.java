package com.lxisoft.animalGame.animal;
import java.util.Random;
public abstract class Animal{
	private String name;
	private int strength,hunger,reach,xloc,yloc,carnivorous,luck,bullet,accuracy;
	//public abstract eatGrass();
	//public abstract eatMeat();
	
	///Name setters and getters////
	public void setName(String name){
		this.name=name;
		
	}
	public String getName(){
		return name;
		
	}
	/*//Carnivorous setters and getters////
	public void setCarnivorus(int carnivorus){
		this.carnivorus=carnivorus;
	}
	public int getCarnivorus(){
		return carnivorus;
	}
	///Luck setters and getters////
	public void setLuck(String luck){
		this.luck=luck;
		
	}
	public String getLuck(){
		return luck;
		
	}*/
	///Strength Setters and getter///
	public void setStrength(int strength){
		this.strength=strength;
		
	}
	public int getStrength(){
		return strength;
		
	}
	///Hunger Setters and getters///
	public void setHunger(int hunger){
		this.hunger=hunger;
		
	}
	public int getHunger(){
		return hunger;
		
	}
	///Accuracy Setters and getters///
	public void setAccuracy(int accuracy){
		this.accuracy=accuracy;
		
	}
	public int getAccuracy(){
		return accuracy;
		
	}
	///Bullet Setters and getters///
	public void setBullet(int bullet){
		this.bullet=bullet;
		
	}
	public int getBullet(){
		return bullet;
		
	}
	///reach Setters and getter///
	public void setReach(int reach){
		this.reach=reach;
		
	}
	public int getReach(){
		return reach;
		
	}
	///xloc setters and getters////
	public void setXloc(int xloc){
		this.xloc=xloc;
		
	}
	public int getXloc(){
		return xloc;
		
	}
	///yloc setters and getters////
	public void setYloc(int yloc){
		this.yloc=yloc;
		
	}
	public int getYloc(){
		return yloc;
		
	}
	
		
		
		

	
}