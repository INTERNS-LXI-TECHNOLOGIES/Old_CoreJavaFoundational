package com.lxisoft.animalgame.animal.omnivore;
import com.lxisoft.animalgame.animal.*;
public class Hunter extends Animal implements Omnivore{
	public String hunt(String hunter,String animalTwo){
		return hunter+" Hunts "+animalTwo;
	}
	public String eat(String animalOne,String animalTwo){
		return"0";
	}
}