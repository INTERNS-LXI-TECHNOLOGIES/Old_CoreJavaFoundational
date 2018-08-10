package com.lxisoft.moviescript.actors;
import java.util.Scanner;
public class HeroineController
{
	private Heroine heroine;
	private HeroineView heroineview;
	private String heroineName;
	public HeroineController()
	{
		heroineDetail();
	}
	public void heroineDetail()
	{
		Scanner input=new Scanner(System.in);
		heroineview=new HeroineView();
		heroineview.askName();
		heroineName=input.nextLine();
		heroine=new Heroine();
		heroine.setHeroineName(heroineName);
	}
}