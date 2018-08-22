package com.lxisoft.moviescript.actors;
import com.lxisoft.moviescript.movie.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
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
	public void printHeroDetail()
	{
		int lineNo=1;
		String line="";
		try
		{
			FileReader frho=new FileReader("./com/lxisoft/moviescript/file/hero.txt");
			BufferedReader br=new BufferedReader(frho);
			if(lineNo==1)
			{
				line=br.readLine();
				System.out.println("\n\t\t\t"+line+"\tin");
			}
			else
				br.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}	
}