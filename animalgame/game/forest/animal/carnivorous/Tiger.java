package com.lxisoft.animalgame.game.forest.animal.carnivorous;
import com.lxisoft.animalgame.game.forest.animal.Animal;

 public class Tiger extends Animal
 {
	 public void create()
	 {
		 int animalStrength,animalHunger;
		 animalStrength=(int)(Math.random()*50)+80;
		 setanimalStrength(animalStrength);
		 System.out.println("energy level of tiger is:"+getanimalStrength());
		 animalHunger=(int)(Math.random()*50)+60;
		 setanimalHunger(animalHunger);
		 System.out.println("hunger level of tiger is:"+getanimalHunger());
		 setanimalType("carnivorous");
	 }
		 
		 
 }