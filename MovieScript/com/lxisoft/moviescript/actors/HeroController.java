package com.lxisoft.moviescript.actors;
import java.util.Scanner;
public class HeroController
{
	private Hero hero;
	private HeroView heroview;
	private String heroName;
	public HeroController()
	{
		heroDetail();
	}
	public void heroDetail()
	{
		Scanner input=new Scanner(System.in);
		heroview=new HeroView();
		heroview.askName();
		heroName=input.nextLine();
		hero=new Hero();
		hero.setHeroName(heroName);
	}
}