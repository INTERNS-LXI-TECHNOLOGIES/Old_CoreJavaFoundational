package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.interfaces.*;
import java.io.*;
import java.util.*;
public abstract class Animal{
private int hungry,strength,carnivorus,reach,xloc,yloc,luck;
private String name;
//defining setters and getters function ;
    public void setName(String name){
		this.name=name;
	}
	public void setStrength(int strength){
		this.strength=strength;
	}
	public void setReach(int reach){
		this.reach=reach;
	}
	public void setHungry(int hungry){
		this.hungry=hungry;
	}
	public void setCarnivorus(int carnivorus){
		this.carnivorus=carnivorus;
	}
	public void setXloc(int xloc){
		this.xloc=xloc;
	}
	public void setYloc(int yloc){
		this.yloc=yloc;
	}
	public void setLuck(int luck){
		this.luck=luck;
	}
	public int getLuck(){
		return luck;
	}
	public int getXloc(){
		return xloc;
	}
	public int getYloc(){
		return yloc;
	}
	public String getName(){
		return name;
	}
	public int getStrength(){
		return strength;
	}
	public int getReach(){
		return reach;
	} 
    public int getHungry(){
		return hungry;
	}	
	public int getCarnivorus(){
		return carnivorus;
	}
	public abstract boolean breathlevel();

}
