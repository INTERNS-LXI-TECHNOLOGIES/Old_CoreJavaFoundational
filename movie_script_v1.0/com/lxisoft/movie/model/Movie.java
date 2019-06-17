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
*Date Modified:17/06/2019
*/
public class Movie
{
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(Movie.class.getName());
	
	private String movieName;
	
	public void playMovie()
	{
		System.out.println("\t\t\t\t LTF ENTERTAINMENTS PRESENTS \t\t\t\t");
		//System.out.println(movieName);
		//System.out.println("Directed by "+);
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile("hero.csv");
		ArrayList<String> contents=sfc.readFromFile("hero.csv");
		int range=contents.size();
		System.out.println(range);
		int i,x=5;
		do
		{
			i=(int)(Math.random()*range);
			System.out.println("hero :"+contents.get(i));
		}while((x--)>0);
		
	}
	
	
}