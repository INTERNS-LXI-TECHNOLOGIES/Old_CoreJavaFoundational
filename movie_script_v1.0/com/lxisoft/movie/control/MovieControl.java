package com.lxisoft.movie.control;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.*;
/**
*This class is used as a control class for Movie
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:21/06/2019
*/
public class MovieControl 
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MovieControl.class.getName());
	
	public MovieControl()
	{
		log.setLevel(Level.WARNING);
	}
	
	public void playMovie(Movie kgf,Director director,ScriptWriter writer)
	{
		
		System.out.println("\t\t\t\t LTF ENTERTAINMENTS PRESENTS \t\t\t\t");
		System.out.println("\t\t\t\t	Movie Name:"+kgf.getMovieName());
		System.out.println("\t\t\t\t	Directed by: "+director.getName());
		System.out.println("\t\t\t\t	Written by: "+writer.getName());
		findActor(kgf);
		// ScriptFileControl sfc=new ScriptFileControl();
		// sfc.createFile("hero.csv");
		// sfc.createFile("heroine.csv");
		// sfc.createFile("villain.csv");
		// sfc.createFile("comedeian.csv");
		// ArrayList<String> heroDialogues=sfc.readFromFile("hero.csv");
		// ArrayList<String> heroineDialogues=sfc.readFromFile("heroine.csv");
		// ArrayList<String> villainDialogues=sfc.readFromFile("villain.csv");
		// ArrayList<String> comedeianDialogues=sfc.readFromFile("comedeian.csv");
		// ArrayList<String> sceneIntro=sfc.readFromFile("scene.csv");
		// ArrayList<String> juniorDialogues=sfc.readFromFile("junior.csv");
		// int range=heroDialogues.size();
		// int range2=heroineDialogues.size();
		// System.out.println(range);
		// int i,j,x=0;
		// do
		// {
			// i=(int)(Math.random()*range);
			// System.out.println("\t\t\t\tSCENE "+(x+1)+"\t\t\t\t\n"+sceneIntro.get(i));
			// callDelay();
			// System.out.println("hero :"+heroDialogues.get(i));
			// callDelay();
			// j=(int)(Math.random()*range2);
			// System.out.println("heroine :"+heroineDialogues.get(i));
			// callDelay();
			// System.out.println("comedeian :"+comedeianDialogues.get(i));
			// callDelay();
			// System.out.println("villain :"+villainDialogues.get(i));
			// callDelay();
			// System.out.println("junior artist :"+juniorDialogues.get(i));
			// callDelay();
			
		// }while((x++)<5);
		
	}
	
	public void display(String name)
	{
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile(name);
		ArrayList<String> dialogues=sfc.readFromFile(name);
	}
	
	public void findActor(Movie kgf)
	{
		log.info("MovieControl class..........findActor..........start");
		ArrayList<Actor> actors=kgf.getActor();
		for(int i=0;i<actors.size();i++)
		{
			System.out.println(actors.get(i));
			int j=(int)(Math.random()*actors.size());
			Actor actor=actors.get(j);
			if(actor instanceof Hero)
			{
				((Hero)actor).deliverDialogue();
				callDelay();
			}
			if(actor instanceof Heroine)
			{
				((Heroine)actor).deliverDialogue();
				callDelay();
			}
			if(actor instanceof Villain)
			{
				((Villain)actor).deliverDialogue();
				callDelay();
			}
			if(actor instanceof Comedeian)
			{
				((Comedeian)actor).deliverDialogue();
				callDelay();
			}
			if(actor instanceof JuniorArtists)
			{
				((JuniorArtists)actor).deliverDialogue();
				callDelay();
			}
		}
		log.info("MovieControl class..........findActor..........end");
	}
	
	public void callDelay()
	{
		try
		{
			System.out.println();
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
	}
}