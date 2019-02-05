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
	public String hunt(String hunter,String animalTwo){
		return hunter+" Hunts "+animalTwo;
	}
	public String eat(String animalOne,String animalTwo){
		return"0";
	}
	public String sound(){
		return "Yeahh!!";
	}
}