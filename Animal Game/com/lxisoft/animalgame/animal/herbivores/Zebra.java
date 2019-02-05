package com.lxisoft.animalgame.animal.herbivores;
import com.lxisoft.animalgame.animal.*;
public class Zebra extends Animal implements Herbivore{
	public int luck(){
		return (int)(Math.random()*100);
	}
	public String eat(String animal){
		return " ";
	}
	public String sound(){
		return " ";
	}
}