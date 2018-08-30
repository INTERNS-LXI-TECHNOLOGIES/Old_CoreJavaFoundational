package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.*;
import com.lxisoft.moviescript.cast.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Movie
{
	private String movieName;
	private String genre;
	private Director director;
	private Producer producer;
	private CameraMan cameraMan;
	private ScriptWriter scriptWriter;
	
	private ArrayList<Hero> hero;
	private ArrayList<Heroine> heroine;
	private ArrayList<SupportingActor> supportingActor;
	private ArrayList<Comedian> comedian; 
	private ArrayList<Villain> villain;
	
	public Movie()
	{
		hero=new ArrayList<Hero>();
		heroine=new ArrayList<Heroine>();
		supportingActor=new ArrayList<SupportingActor>();
		comedian=new ArrayList<Comedian>();
		villain=new ArrayList<Villain>();
		collect();
		scriptWriter.writeScript(hero,heroine,supportingActor,comedian,villain);
	}
	public void collect()
	{
		movieName=readData("Movie Name : ");
		genre=readData("Genre : ");
		director=new Director();
		director.setName(readData("Director : "));
		producer=new Producer();		
		producer.setName(readData("Producer : "));
		cameraMan=new CameraMan();
		cameraMan.setName(readData("Camera Man : "));
		scriptWriter=new ScriptWriter();
		scriptWriter.setName(readData("Script Writer : "));
		setList("Hero");
		setList("Heroine");
		setList("Comedian");
		setList("SupportingActor");
		setList("Villain");		
	}
	public String readData(String key)
	{
		System.out.print(key);
		Scanner in=new Scanner(System.in);
		return in.nextLine();
	}
	public void setList(String listName)
	{
		System.out.print("Enter number of "+listName+"s  : ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{			
			switch(listName)
			{
				case "Hero"		:fetchCastDetails(new Hero(),listName+" "+(i+1),hero);
								break;
				case "Heroine"	:fetchCastDetails(new Heroine(),listName+" "+(i+1),heroine);
								break;
				case "Comedian"	:fetchCastDetails(new Comedian(),listName+" "+(i+1),comedian);
								break;
				case "SupportingActor"	:fetchCastDetails(new SupportingActor(),listName+" "+(i+1),supportingActor);
										break;
				case "Villain"	:fetchCastDetails(new Villain(),listName,villain);
								break;
			}
		}
	}
	public void fetchCastDetails(Cast actor,String listName,List list)
	{
		System.out.print(listName+" : ");
		Scanner in=new Scanner(System.in);
		actor.setName(in.nextLine());
		System.out.print("Character Name :");
		actor.setCharacterName(in.nextLine());
		list.add(actor);		
	}
	
}