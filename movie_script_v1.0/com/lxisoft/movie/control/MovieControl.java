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
*Date Modified:22/06/2019
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
	}
	
	public void findActor(Movie kgf)
	{
		log.info("MovieControl class..........findActor..........start");
		ArrayList<Actor> actors=kgf.getActor();
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile("scene.csv");
		ArrayList<String> sceneIntro=sfc.readFromFile("scene.csv");
		for(int k=0;k<5;k++)
		{
			System.out.println("\t\t\t\tSCENE "+(k+1)+"\t\t\t\t\n"+sceneIntro.get(k));
			callDelay();
			for(int i=0;i<5;i++)
			{
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