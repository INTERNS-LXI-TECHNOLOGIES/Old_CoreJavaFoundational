package com.lxisoft.moviescript.actors;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class HeroineController
{
	private Heroine heroine;
	private HeroineView heroineview;
	private String heroineName,heroineCharaName;
	public HeroineController()
	{
		heroineDetail();
	}
	public void heroineDetail()
	{
		try
		{
		File heroinefile=new File("./com/lxisoft/moviescript/file/heroine.txt");
		FileWriter fwheroine=new FileWriter(heroinefile); 
		Scanner input=new Scanner(System.in);
		heroineview=new HeroineView();
		heroineview.askHeroineName();
		heroineName=input.nextLine();
		fwheroine.write(heroineName);
		String newLine=("\n");
		fwheroine.write(newLine);
		heroineview.askHeroineCharaName();
		heroineCharaName=input.nextLine();
		fwheroine.write(heroineCharaName);
		fwheroine.close();
		heroine=new Heroine();
		heroine.setHeroineName(heroineName);
		heroine.setHeroineCharaName(heroineCharaName);
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}