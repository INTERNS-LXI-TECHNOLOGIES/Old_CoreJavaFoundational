package com.lxisoft.actors;
import java.util.Scanner;
public class HeroineController
{
	private String heroineName,heroineCharactorName;
	private HeroineView heroineview;
	private Heroine heroine=new Heroine(heroineName,heroineCharactorName);
	public HeroineController()
	{
		heroineDetails();
	}
	public void heroineDetails()
	{
		heroineview=new HeroineView();
		heroineview.askHeroineName();
		Scanner input=new Scanner(System.in);
		heroineName=input.nextLine();
		heroineview.askHeroineCharactorName();
		heroineCharactorName=input.nextLine();
	}
}