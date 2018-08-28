package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.*;
import com.lxisoft.moviescript.cast.*;
import java.util.ArrayList;
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
	}
	public void collect()
	{
		System.out.print("Movie Name : ");
		Scanner in=new Scanner(System.in);
		movieName=in.nextLine();
		System.out.print("Genre : ");
		genre=in.nextLine();
		System.out.print("Director : ");
		director=new Director();
		director.setName(in.nextLine());
		System.out.print("Producer : ");
		producer=new Producer();		
		producer.setName(in.nextLine());
		System.out.print("cameraMan : ");
		cameraMan=new CameraMan();
		cameraMan.setName(in.nextLine());
		System.out.print("ScriptWriter : ");
		scriptWriter=new ScriptWriter();
		scriptWriter.setName(in.nextLine());
		setList("Hero");
		setList("Heroine");
		setList("Comedian");
		setList("SupportingActor");
		setList("Villain");		
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
				case "Hero"		:Hero h=new Hero();
								System.out.print(listName+" "+(i+1)+": ");
								h.setName(in.nextLine());
								System.out.print("Character Name :");
								h.setCharacterName(in.nextLine());
								hero.add(h);
								break;
				case "Heroine"	:Heroine hn=new Heroine();
								System.out.print(listName+" "+(i+1)+": ");
								hn.setName(in.nextLine());
								System.out.print("Character Name :");
								hn.setCharacterName(in.nextLine());
								heroine.add(hn);
								break;
				case "Comedian"	:Comedian c=new Comedian();
								System.out.print(listName+" "+(i+1)+": ");
								c.setName(in.nextLine());
								System.out.print("Character Name :");
								c.setCharacterName(in.nextLine());
								comedian.add(c);
								break;
				case "SupportingActor"	:SupportingActor sa=new SupportingActor();
								System.out.print(listName+" "+(i+1)+": ");
								sa.setName(in.nextLine());
								System.out.print("Character Name :");
								sa.setCharacterName(in.nextLine());
								supportingActor.add(sa);
								break;
				case "Villain"	:Villain v=new Villain();
								System.out.print(listName+" "+(i+1)+": ");
								v.setName(in.nextLine());
								System.out.print("Character Name :");
								v.setCharacterName(in.nextLine());
								villain.add(v);
								break;
			}
		}
	}
	
}