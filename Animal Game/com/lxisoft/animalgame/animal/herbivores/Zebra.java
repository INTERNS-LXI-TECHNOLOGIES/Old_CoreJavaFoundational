package com.lxisoft.animalgame.animal.herbivores;
import com.lxisoft.animalgame.animal.*;
public class Zebra extends Animal implements Herbivores{
	public int luck(){
		return luck;
	}
	public String eat(String animalOne,String animalTwo){
		return "0";
	}
}