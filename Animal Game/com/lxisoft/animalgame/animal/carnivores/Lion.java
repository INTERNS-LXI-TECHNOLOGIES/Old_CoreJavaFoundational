package com.lxisoft.animalgame.animal.carnivores;
import com.lxisoft.animalgame.animal.*;
public class Lion extends Animal implements Carnivores{
	public String kills(String animalOne ,String animalTwo){
		return animalOne+" Kills "+animalTwo;
	}
	public String eat(String animalOne,String animalTwo){
		return animalOne+" Eats "+animalTwo;
	}
	public String hunt(String animalOne,String animalTwo){
		return animalOne+" Hunts "+animalTwo;
	}
}