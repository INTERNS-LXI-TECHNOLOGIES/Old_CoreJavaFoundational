package com.lxisoft.animalgame.animal.omnivore;
import com.lxisoft.animalgame.animal.*;
public class Hunter extends Animal implements Omnivore{
	private int bullets = 3;
	public void setBullets(int bullets){
		this.bullets = bullets;
	}
	public int getBullets(){
		return bullets;
	}
	public int luck(){
		return (int)(Math.random()*100);
	}
	public String hunt(String animal){
		return " Hunts "+animal;
	}
	public String eat(String animal){
		return " ";
	}
	public String sound(){
		return "Yeahh!!";
	}
}