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
		System.out.print("Enter number of heroes : ");
		int n;
		n=in.nextInt();
		in.nextLine();
		hero=new ArrayList<Hero>();
		for(int i=0;i<n;i++)
		{
			Hero h=new Hero();
			System.out.print("Hero "+(i+1)+" : ");
			h.setName(in.nextLine());
			hero.add(h);
		}
		System.out.print("Enter number of heroines : ");
		n=in.nextInt();
		in.nextLine();
		heroine=new ArrayList<Heroine>();
		for(int i=0;i<n;i++)
		{
			Heroine h=new Heroine();
			System.out.print("Heroine "+(i+1)+" : ");
			h.setName(in.nextLine());
			heroine.add(h);
		}
		System.out.print("Enter number of supporting actors : ");
		n=in.nextInt();
		in.nextLine();
		supportingActor=new ArrayList<SupportingActor>();
		for(int i=0;i<n;i++)
		{
			SupportingActor sa=new SupportingActor();
			System.out.print("Supporting Actor : "+(i+1)+" : ");
			sa.setName(in.nextLine());
			supportingActor.add(sa);
		}
		System.out.print("Enter number of comedians : ");
		n=in.nextInt();
		in.nextLine();
		comedian=new ArrayList<Comedian>();
		for(int i=0;i<n;i++)
		{
			Comedian c=new Comedian();
			System.out.print(" "+(i+1)+" : ");
			c.setName(in.nextLine());
			comedian.add(c);
		}
		System.out.print("Enter number of villians : ");
		n=in.nextInt();
		in.nextLine();
		villain=new ArrayList<Villain>();
		for(int i=0;i<n;i++)
		{
			Villain v=new Villain();
			System.out.print("Heroine "+(i+1)+" : ");
			v.setName(in.nextLine());
			villain.add(v);
		}
	}
	
}