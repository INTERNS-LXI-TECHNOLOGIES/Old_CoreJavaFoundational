package com.lxisoft.animalgame.animal;
public abstract class Animal{
	private int hunger;
	private int strength;
	private String name;
	private int locationX;
	private int locationY;
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
		this.locationY = locationY;
	}
	public int getLocationY(){
		return locationY;
	}
	public Animal(){
		setStrength((int)(Math.random()*100));
		setHunger((int)(Math.random()*100));
		x();
		y();
	}
	public void setStrength(int strength){
		this.strength = strength;
	}
	public int getStrength(){
		return strength;
	}
	public int x(){
		setLocationX((int)(Math.random()*50));
		return getLocationX();
	}
	public int y(){
		setLocationY((int)(Math.random()*50));
		return getLocationY();
	}
}