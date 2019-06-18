package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for ScriptWriter
*
*@author AryaVineesh
*
*@version v1.0
*
*Date Modified:18/06/2019
*/
public class ScriptWriter
{
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(ScriptWriter.class.getName());
	
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
	
	public void setMovieScript(MovieScript movieScript)
	{
		this.movieScript=movieScript;
	}
	
	
	public MovieScript getMovieScript()
	{
		return movieScript;
	}
}