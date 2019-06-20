package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for ScriptWriter
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:20/06/2019
*/
public class ScriptWriter
{
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(ScriptWriter.class.getName());
	
	public ScriptWriter()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*This is used to represent the name of the script writer 
	*/
	private String name;
	
	/**
	*This is the reference to the Movie Script
	*/
	private MovieScript movieScript;
	
	/**
	*This method is used to set the name of the script writer
	*
	*@param name - the name to be set
	*/
	public void setName(String name)
	{
		log.info("ScriptWriter class.............setName............start");
		this.name=name;
		log.info("ScriptWriter class.............setName............end");
	}
	
	/**
	*This method is to get the name of the script writer
	*
	*@return name
	*/
	public String getName()
	{
		log.info("ScriptWriter class.............getName............start/end");
		return name;
	}
	
	/**
	*this method is used to set the movieScript
	*
	*@param movieScript - the movie script to set
	*
	*/
	public void setMovieScript(MovieScript movieScript)
	{
		log.info("ScriptWriter class.............setMovieScript............start");
		this.movieScript=movieScript;
		log.info("ScriptWriter class.............setMovieScript............end");
	}
	
	/**
	*this method will return the movie script
	*
	*@return movieScript
	*
	*/
	public MovieScript getMovieScript()
	{
		log.info("ScriptWriter class.............getMovieScript............start/end");
		return movieScript;
	}
}