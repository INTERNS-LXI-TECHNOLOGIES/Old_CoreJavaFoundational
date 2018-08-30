package com.lxisoft.movie;
import com.lxisoft.cast.*;
import com.lxisoft.crewmembers.*;
import com.lxisoft.person.*;
import com.lxisoft.clear.*;
import java.io.*;
import java.util.*;

public class Movie
{
	private String movieName;
	private Director director;
	private Producer producer;
	private Cameraman cameraman;
	private ScriptWriter scriptWriter;
	
	private Hero hero;
	private Heroine heroine;
	private Comedian comedian;
	private Villain villain;
	private SupportingActor supportingActor;
	private String supportingActorName,heroName,heroineName,comedianName,VillainName;
	
	
	public Movie() throws Exception

	{
		collectData();
	}
	public void collectData() throws Exception
	{
		File movie=new File("./com/lxisoft/movie/movie.txt");
		FileWriter moviefw=new FileWriter(movie);
		System.out.println("Movie Name:");
		Scanner sc=new Scanner(System.in);
		movieName=sc.nextLine();
		moviefw.write("<<<<**********MOVIE**********>>>>\n");
		moviefw.write("\n\t\t"+movieName+"\n\n");
		
		System.out.println("Director:");
		director=new Director();
		director.setName(sc.nextLine());
		moviefw.write("Director:"+director.getName()+"\n");
		
		System.out.println("Producer:");
		producer=new Producer();
		producer.setName(sc.nextLine());
		moviefw.write("Producer:"+producer.getName()+"\n");
		
		System.out.println("Cameraman:");
		cameraman=new Cameraman();
		cameraman.setName(sc.nextLine());
		moviefw.write("Cameraman:"+cameraman.getName()+"\n");
		
		System.out.println("Script Writer:");
		scriptWriter=new ScriptWriter();
		scriptWriter.setName(sc.nextLine());
		moviefw.write("ScriptWriter:"+scriptWriter.getName()+"\n");
		
		moviefw.close();
		addCastData();
		addDialogue();
		cls();
		dataView();
	}
	public void addCastData() throws Exception
	{
		hero=new Hero();	
		heroine= new Heroine();
		comedian = new Comedian();
		villain = new Villain();
		supportingActor=new SupportingActor();
	}
	public void addDialogue() throws Exception
	{
		hero.addHeroDialogue();
		heroine.addHeroineDialogue();
		comedian.addComedianDialogue();
		villain.addVillainDialogue();
		supportingActor.addSupportingActorDialogue();
	}
	public void dataView() throws Exception
	{
		String movie;
		FileReader fr= new FileReader("./com/lxisoft/movie/movie.txt");
		BufferedReader br= new BufferedReader(fr);
		while((movie=br.readLine()) != null)
		{
			System.out.println(movie);
		}
		fr.close();
		
		actorDataView();
		scene();
		
	}
	public void actorDataView() throws Exception
	{
		hero.heroDataView();
		heroine.heroineDataView();
		comedian.comedianDataView();
		supportingActor.supportingActorDataView();
	}
	public void scene() throws Exception
	{
		System.out.println("**************************\n");
		hero.viewHeroDialogue();
		heroine.viewHeroineDialogue();
		villain.viewVillainDialogue();
		comedian.viewComedianDialogue();
		supportingActor.viewSupportingActorDialogue();
		
	}

	
	
	
	public void cls()
	{
		Cls clrscr=new Cls();
		try
		{
			clrscr.cls();
		}
		catch (IOException e)
		{
			
		}
		catch (InterruptedException e)
		{
			
		}
	}	
}