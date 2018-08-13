package com.lxisoft.actors;
import java.util.Scanner;
public class HeroinController
{
	private String heroinName,heroinCharactorName;
	private HeroinView heroinview;
	private Heroin heroin=new Heroin(heroinName,heroinCharactorName);
	public HeroinController()
	{
		heroinDetails();
	}
	public void heroinDetails()
	{
		heroinview=new HeroinView();
		heroinview.askHeroinName();
		Scanner input=new Scanner(System.in);
		heroinName=input.nextLine();
		heroinview.askHeroinCharactorName();
		heroinCharactorName=input.nextLine();
	}
}