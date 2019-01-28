package com.lxisoft.animalgame.animal;
public class Animal{
	private int hunger;
	private int anger;
	private String name;
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
	public int strength(){
		setAnger((int)(Math.random()*100));
		setHunger((int)(Math.random()*100));
		return getAnger()+getHunger();
	}
}