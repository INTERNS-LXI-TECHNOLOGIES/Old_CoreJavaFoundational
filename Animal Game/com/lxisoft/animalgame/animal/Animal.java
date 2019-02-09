package com.lxisoft.animalgame.animal;
public abstract class Animal{
	private int hunger = (int)(Math.random()*100);
	private int strength = (int)(Math.random()*100);
	private String name;
	private int locationX;
	private int locationY;
	private int speed;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setHunger(int hunger){
		this.hunger = hunger;
	}
	public int getHunger(){
		return hunger;
	}
	public void setLocationX(int locationX){
		this.locationX = locationX;
	}
	public int getLocationX(){
		return locationX;
	}
	public void setLocationY(int locationY){
		this.locationY =locationY;
	}
	public int getLocationY(){
		return locationY;
	}
	public void setStrength(int strength){
		this.strength = strength;
	}
	public int getStrength(){
		return strength;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed(){
		return speed;
	}
	public abstract String eat(String animal);
	public abstract String sound();
}