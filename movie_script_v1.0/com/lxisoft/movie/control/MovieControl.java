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
*Date Modified:20/06/2019
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
		System.out.println("\t\t\t\tMovie Name:"+kgf.getMovieName());
		System.out.println("\t\t\t\tDirected by: "+director.getName());
		System.out.println("\t\t\t\tWritten by: "+writer.getName());
		
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
		int i,j,x=0;
		do
		{
			i=(int)(Math.random()*range);
			System.out.println("\t\t\t\tSCENE "+(x+1)+"\t\t\t\t\n"+sceneIntro.get(i));
			callDelay();
			System.out.println("hero :"+heroDialogues.get(i));
			callDelay();
			// j=(int)(Math.random()*range2);
			System.out.println("heroine :"+heroineDialogues.get(i));
			callDelay();
			System.out.println("comedeian :"+comedeianDialogues.get(i));
			callDelay();
			System.out.println("villain :"+villainDialogues.get(i));
			callDelay();
			System.out.println("junior artist :"+juniorDialogues.get(i));
			callDelay();
			
		}while((x++)<5);
		
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