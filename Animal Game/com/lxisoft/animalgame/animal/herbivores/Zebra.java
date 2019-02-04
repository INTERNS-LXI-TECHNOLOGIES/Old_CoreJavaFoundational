package com.lxisoft.animalgame.animal.herbivores;
import com.lxisoft.animalgame.animal.*;
public class Zebra extends Animal implements Herbivore{
	int luck = (int)(Math.random()*100);
	public int luck(){
		return luck;
	}
	public String eat(String animalOne,String animalTwo){
		return "0";
	}
}