package com.lxisoft.animalgame.animal.herbivores;
import com.lxisoft.animalgame.animal.*;
public class Zebra extends Animal implements Herbivore{
	public int luck(){
		return (int)(Math.random()*100);
	}
	public String eat(String animalOne,String animalTwo){
		return "0";
	}
}