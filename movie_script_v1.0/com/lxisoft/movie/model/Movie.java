package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.control.ScriptFileControl;
/**
*This class is used as a model class for Movie
*
*@author AryaVineesh
*
*@version v1.0
*
*Date Modified:18/06/2019
*/
public class Movie
{
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(Movie.class.getName());
	
	private String movieName;
	
	private Director director;
	
	
	
	private ScriptWriter writer;
	
	private Actor actors;
	
	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}
	
	public String getMovieName()
	{
		return movieName;
	}
	
	public void playMovie()
	{
		System.out.println("\t\t\t\t LTF ENTERTAINMENTS PRESENTS \t\t\t\t");
		//System.out.println(movieName);
		//System.out.println("Directed by "+);
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile("hero.csv");
		sfc.createFile("heroine.csv");
		sfc.createFile("villain.csv");
		sfc.createFile("comedeian.csv");
		ArrayList<String> heroDialogues=sfc.readFromFile("hero.csv");
		ArrayList<String> heroineDialogues=sfc.readFromFile("heroine.csv");
		ArrayList<String> villainDialogues=sfc.readFromFile("villain.csv");
		ArrayList<String> comedeianDialogues=sfc.readFromFile("comedeian.csv");
		ArrayList<String> sceneIntro=sfc.readFromFile("scene.csv");
		ArrayList<String> juniorDialogues=sfc.readFromFile("junior.csv");
		int range=heroDialogues.size();
		int range2=heroineDialogues.size();
		System.out.println(range);
		int i,j,x=5;
		do
		{
			i=(int)(Math.random()*range);
			System.out.println("\t\t\t\tSCENE\t\t\t\t\n"+sceneIntro.get(i));
			System.out.println("hero :"+heroDialogues.get(i));
			// j=(int)(Math.random()*range2);
			System.out.println("heroine :"+heroineDialogues.get(i));
			System.out.println("comedeian :"+comedeianDialogues.get(i));
			System.out.println("villain :"+villainDialogues.get(i));
			System.out.println("junior artist :"+juniorDialogues.get(i));
			
		}while((x--)>0);
		
	}
	
	
}