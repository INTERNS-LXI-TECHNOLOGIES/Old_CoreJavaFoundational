package com.lxisoft.movie.view;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.Actor;
import com.lxisoft.movie.model.Movie;
/**
*This class is used as a model class for Tdd
*
*@author AryaVineesh
*
*@version v1.0
*
*Date Modified:17/06/2019
*/
public class Tdd
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	
	Actor hero;
	Actor heroine;
	Actor villian;
	Actor comedeian;
	Movie singamMovie;
	
	/**
	*this is the default constructor
	*/
	public Tdd()
	{
		enterMovieDetails();
	}
	
	public void enterMovieDetails()
	{
		System.out.println("\t\t\t\t\t MovieScript \t\t\t\t\t");
		System.out.println("Enter the name of the movie");
		Scanner sc=new Scanner(System.in);
		String movieName=sc.nextLine();
		System.out.println("Enter the name of the Director");
		String dirName=sc.nextLine();
		System.out.println("Enter the name of the script writer");
		String writerName=sc.nextLine();
		System.out.println("Enter the producer's name");
		String producerName=sc.nextLine();
		System.out.println("Enter the name of the hero");
		String heroName=sc.nextLine();
		System.out.println("Enter the name of the heroine");
		String heroineName=sc.nextLine();
		System.out.println("Enter the name of the villian");
		String villianName=sc.nextLine();
		System.out.println("Enter the name of the comedeian");
		String comedeianName=sc.nextLine();
		System.out.println("");
		singamMovie=new Movie();
		singamMovie.playMovie();
		
	}
	
	public static void main(String arg[])
	{
		Tdd tdd=new Tdd();
	}
}