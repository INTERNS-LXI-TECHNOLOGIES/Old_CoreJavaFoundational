package com.lxisoft.animalgame.animal;
public abstract class Animal{
	private int hunger;
	private int anger;
	private String name;
	private int x;
	private int y;
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
	public Animal(){
		strength();
		x();
		y();
	}
	public void strength(){
		setAnger((int)(Math.random()*100));
		setHunger((int)(Math.random()*100));
	}
	public int getStrength(){
		return getAnger()+getHunger();
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