package com.lxisoft.actors;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class HeroineController
{
	private String heroineName,heroineCharactorName;
	private HeroineView heroineview;
	private Heroine heroine;
	public HeroineController()
	{
		heroineDetails();
	}
	public void heroineDetails()
	{
		try
		{
		File heroinefile=new File("./com/lxisoft/file/Heroine.txt");
		FileWriter heroinefw=new FileWriter(heroinefile);
		Scanner input=new Scanner(System.in);
		heroineview=new HeroineView();
		heroineview.askHeroineName();
		heroineName=input.nextLine();
		heroinefw.write(heroineName);
		String newLine=("\n");
		heroinefw.write(newLine);
		heroineview.askHeroineCharactorName();
		heroineCharactorName=input.nextLine();
		heroinefw.write(heroineCharactorName);
		heroinefw.close();
		heroine=new Heroine(heroineName,heroineCharactorName);
	    }
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}