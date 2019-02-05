package com.lxisoft.animalgame.animal.carnivores;
import com.lxisoft.animalgame.animal.*;
public class Bear extends Animal implements Carnivore{
	public String kills(String animal){
		return " Kills "+animal;
	}
	public String eat(String animal){
		return " Eats "+animal;
	}
	public String sound(){
		return "oorrrrw...";
	}
}