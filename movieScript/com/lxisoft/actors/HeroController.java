package com.lxisoft.actors;
//import com.lxisoft.movie.*;
import java.util.Scanner;
public class HeroController
{
	private String heroName,charactorName;
	private HeroView heroview;
	private Hero hero=new Hero(heroName,charactorName);
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
		heroview.askCharactorName();
		charactorName=input.nextLine();
	}
}