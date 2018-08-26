package com.lxisoft.movieScript.actors;

import com.lxisoft.movieScript.movieScript.*;

public class HeroController{
	public void heroDetails(int num1){
		 String heroCharacter,heroName;
		 MovieScript ms = new MovieScript();
		 for(int i=0;i<num1;i++)
		 {
		   System.out.println("----------Please enter the Hero details----------\n\n");
		   System.out.println("ENTER THE NAME OF THE HERO\n");
		   heroName = System.console().readLine();
		   System.out.println("ASSIGN THE CHARATER \n");
		   heroCharacter = System.console().readLine();
		   Hero hero = new Hero(heroName,heroCharacter);
		   ms.addHero(hero);
		 }
	}
}