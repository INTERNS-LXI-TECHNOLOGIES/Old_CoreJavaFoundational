package com.lxisoft.animalgame.animal;
public class Animal{
	private int hunger;
	private int anger;
	private int location;
	private String name;
	int x;
	int y;
	public void setLocation(int location){
		this.location = location;
	}
	public int getLocation(){
		return location;
	}
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
	public void setAnger(int anger){
		this.anger = anger;
	}
	public int getAnger(){
		return anger;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
	public int strength(){
		setAnger((int)(Math.random()*100));
		setHunger((int)(Math.random()*100));
		return getAnger()+getHunger();
	}
	public int location(){
		setLocation((int)(Math.random()*3));
		return getLocation();
	}
	public int x(){
		setX((int)(Math.random()*50));
		return getX();
	}
	public int y(){
		setY((int)(Math.random()*50));
		return getY();
	}
}