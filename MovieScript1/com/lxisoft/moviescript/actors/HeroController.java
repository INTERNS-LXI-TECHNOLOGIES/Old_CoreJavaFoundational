package com.lxisoft.moviescript.actors;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
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
		try
		{
		File herofile=new File("./com/lxisoft/moviescript/file/hero.txt");
		FileWriter fwhero=new FileWriter(herofile); 
		Scanner input=new Scanner(System.in);
		heroview=new HeroView();
		heroview.askHeroName();
		heroName=input.nextLine();
		fwhero.write(heroName);
		String newLine=("\n");
		fwhero.write(newLine);
		heroview.askHeroCharaName();
		heroCharaName=input.nextLine();
		fwhero.write(heroCharaName);
		fwhero.close();
		hero=new Hero();
		hero.setHeroName(heroName);
		hero.setHeroCharaName(heroCharaName);
		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
	}
}