package com.lxisoft.movie.view;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.*;
import com.lxisoft.movie.control.*;
/**
*This class is used as a view class for Movie
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:21/06/2019
*/
public class MovieView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MovieView.class.getName());
	
	public MovieView()
	{
		log.setLevel(Level.WARNING);
	}
	
	Actor hero;
	Actor heroine;
	Actor villain;
	Actor comedeian;
	MovieControl movieControl;
	Movie kgf=new Movie();
	Director director;
	ScriptWriter writer;
	JuniorArtists artists;
	
	public void printStatement(String name)
	{
		System.out.println("Enter the name of the "+name+" :");
	}
	public void enterMovieDetails()
	{
		System.out.println("\t\t\t\t\t MovieScript \t\t\t\t\t");
		printStatement("movie");
		Scanner sc=new Scanner(System.in);
		
		kgf.setMovieName(sc.nextLine());
		
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
		
		printStatement("Junior Artists");
		artists=new JuniorArtists();
		artists.setName(sc.nextLine());
		
		ArrayList<Actor> actors=new ArrayList<Actor>();
		actors.add(hero);
		actors.add(heroine);
		actors.add(comedeian);
		actors.add(villain);
		actors.add(artists);
		kgf.setActor(actors);
		
		movieControl=new MovieControl();
		movieControl.playMovie(kgf,director,writer);
		
	}
	
}