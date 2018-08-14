package com.lxisoft.actors;
//import com.lxisoft.movie.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class HeroController
{
	private String heroName,heroCharactorName;
	private HeroView heroview;
	private Hero hero;
	public HeroController()
	{
		heroDetails();
	}
	public void heroDetails()
	{
		try
		{
		FileWriter herofw=new FileWriter("C:/Users/Windows 10/Desktop/000-workspace/Team1/movieScript/com/lxisoft/file/Hero.txt");
		Scanner input=new Scanner(System.in);
		heroview=new HeroView();
		heroview.askHeroName();
		heroName=input.nextLine();
		herofw.write(heroName);
		String newLine=("\n");
		herofw.write(newLine);
		heroview.askHeroCharactorName();
		heroCharactorName=input.nextLine();
		herofw.write(heroCharactorName);
		herofw.close();
		hero=new Hero(heroName,heroCharactorName);
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}