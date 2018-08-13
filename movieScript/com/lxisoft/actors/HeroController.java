package com.lxisoft.actors;
//import com.lxisoft.movie.*;
import java.util.Scanner;
public class HeroController
{
	private String heroName,heroCharactorName;
	private HeroView heroview;
	private Hero hero=new Hero(heroName,heroCharactorName);
	public HeroController()
	{
		heroDetails();
	}
	public void heroDetails()
	{
		heroview=new HeroView();
		heroview.askHeroName();
		Scanner input=new Scanner(System.in);
		heroName=input.nextLine();
		heroview.askHeroCharactorName();
		heroCharactorName=input.nextLine();
	}
}