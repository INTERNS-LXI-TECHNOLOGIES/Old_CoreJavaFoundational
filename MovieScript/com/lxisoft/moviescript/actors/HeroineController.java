package com.lxisoft.moviescript.actors;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
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
		//fwheroine.write("HEROINE :\t");
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
	public void printHeroineDetail()
	{
		int lineNo=1;
		String line="";
		try
		{
			FileReader frhine=new FileReader("./com/lxisoft/moviescript/file/heroine.txt");
			BufferedReader br=new BufferedReader(frhine);
			if(lineNo==1)
			{
				line=br.readLine();
				System.out.println("HEROINE: "+line);
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