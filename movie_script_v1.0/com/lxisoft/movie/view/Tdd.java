package com.lxisoft.movie.view;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.*;
/**
*This class is used as a model class for Tdd
*
*@author AryaVineesh
*
*@version v1.0
*
*Date Modified:18/06/2019
*/
public class Tdd
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	
	Actor hero;
	Actor heroine;
	Actor villain;
	Actor comedeian;
	Movie singamMovie;
	Director director;
	ScriptWriter writer;
	/**
	*this is the default constructor
	*/
	public Tdd()
	{
		enterMovieDetails();
	}
	
	
	public void printStatement(String name)
	{
		System.out.println("Enter the name of the "+name+" :");
	}
	public void enterMovieDetails()
	{
		System.out.println("\t\t\t\t\t MovieScript \t\t\t\t\t");
		printStatement("movie");
		Scanner sc=new Scanner(System.in);
		singamMovie=new Movie();
		singamMovie.setMovieName(sc.nextLine());
		
		printStatement("Director");
		director=new Director();
		director.setName(sc.nextLine());
		
		printStatement("script writer");
		writer=new ScriptWriter();
		writer.setName(sc.nextLine());
		
		printStatement("Hero");
		hero=new Hero();
		hero.setName(sc.nextLine());
		
		printStatement("Heroine");
		heroine=new Heroine();
		heroine.setName(sc.nextLine());
		
		printStatement("Villain");
		villain=new Villain();
		villain.setName(sc.nextLine());
		
		printStatement("Comedeian");
		comedeian=new Comedeian();
		comedeian.setName(sc.nextLine());
		
		
		singamMovie.playMovie();
		
	}
	
	public static void main(String arg[])
	{
		Tdd tdd=new Tdd();
	}
}