package com.lxisoft.movie;
import com.lxisoft.cast.*;
import com.lxisoft.crewmembers.*;
import com.lxisoft.person.*;
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
	
	public Movie() throws Exception
	
	{
		collectData();
	}
	public void collectData() throws Exception
	{
		String newLine="\n";
		File movie=new File("./com/lxisoft/movie/movie.txt");
		FileWriter moviefw=new FileWriter(movie);
		System.out.println("Movie Name:");
		Scanner sc=new Scanner(System.in);
		movieName=sc.nextLine();
		moviefw.write(movieName);
		System.out.println("Director:");
		director=new Director();
		director.setName(sc.nextLine());
		moviefw.write(director.getName());
		moviefw.write(newLine);
		System.out.println("Producer:");
		producer=new Producer();
		producer.setName(sc.nextLine());
		moviefw.write(producer.getName());
		moviefw.write(newLine);
		System.out.println("Cameraman:");
		cameraman=new Cameraman();
		cameraman.setName(sc.nextLine());
		moviefw.write(cameraman.getName());
		moviefw.write(newLine);
		System.out.println("Script Writer:");
		scriptWriter=new ScriptWriter();
		scriptWriter.setName(sc.nextLine());
		moviefw.write(scriptWriter.getName());
		
		moviefw.close();
		addCastData();
	}
	public void addCastData()throws Exception
	{
		hero=new Hero();
		heroine= new Heroine();
		comedian = new Comedian();
		villain = new Villain();
		supportingActor=new SupportingActor();
	}
}