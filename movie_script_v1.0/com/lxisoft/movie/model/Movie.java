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
*@version 1.0
*
*Date Modified:21/06/2019
*/
public class Movie
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Movie.class.getName());
	
	public Movie()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*The name of the movie
	*/
	private String movieName;
	
	/**
	*Reference Director class to get the information of the director
	*/
	private Director director;
	
	/**
	*Reference ScriptWriter class to get the information of the writer
	*/
	private ScriptWriter writer;
	
	/**
	*Reference Actor class to get the information of the actors
	*/
	private ArrayList<Actor> actors;
	
	/**
	*this method is used to set the name of the movie
	*
	*@param movieName - the name of the movie to set
	*
	*/
	public void setMovieName(String movieName)
	{
		log.info("Movie class..........setMovieName..........start");
		this.movieName=movieName;
		log.info("Movie class..........setMovieName..........end");
	}
	
	/**
	*this method will return the name of the movie
	*
	*@return movieName
	*
	*/
	public String getMovieName()
	{
		log.info("Movie class..........getMovieName..........start/end");
		return movieName;
	}
	
	/**
	*thismethod is used to set the Director of the movie
	*
	*@param director - the director of the movie to set
	*
	*/
	public void setDirector(Director director)
	{
		log.info("Movie class..........setDirector..........start");
		this.director=director;
		log.info("Movie class..........setDirector..........end");
	}
	
	/**
	*this method will return the director of the movie
	*
	*@return director
	*
	*/
	public Director getDirector()
	{
		log.info("Movie class..........getDirector..........start/end");
		return director;
	}
	
	/**
	*This method is used to set an arraylist of Actors
	*
	*@param actors - the list of actors to be set
	*
	*/
	public void setActor(ArrayList<Actor> actors)
	{
		log.info("Movie class..........setActor..........start");
		this.actors=actors;
		log.info("Movie class..........setActor..........end");
	}
	
	/**
	*This method will return an arraylist of actors
	*
	*@return actors
	*
	*/
	public ArrayList<Actor> getActor()
	{
		log.info("Movie class..........getActor..........start/end");
		return actors;
	}
	
	
	
	
}