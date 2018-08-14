package com.lxisoft.moviescript.actors;
import java.util.Scanner;
public class HeroController
{
	private Hero hero;
	private HeroView heroview;
	private String heroName,heroCharaName;
	public HeroController()
	{
		heroDetail();
	}
	public void heroDetail()
	{
		Scanner input=new Scanner(System.in);
		heroview=new HeroView();
		heroview.askHeroName();
		heroName=input.nextLine();
		heroview.askHeroCharaName();
		heroCharaName=input.nextLine();
		hero=new Hero();
		hero.setHeroName(heroName);
		hero.setHeroCharaName(heroCharaName);
	}
}