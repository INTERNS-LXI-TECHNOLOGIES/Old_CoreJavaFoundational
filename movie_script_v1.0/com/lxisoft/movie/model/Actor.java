package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for Actors
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:20/06/2019
*/
public class Actor 
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Actor.class.getName());
	
	public Actor()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*This is the original name of the Actor
	*/
	private String name;
	
	/**
	*This is the character name of the actor in movie
	*/
	private String characterName;
	
	/**
	*This field specifies the role of the actor
	*/
	private String role;
	
	/**
	*This method is used to set the name of the actor
	*
	*@param name - the name to be set
	*/
	public void setName(String name)
	{
		log.info("Actor class.............setName............start");
		this.name=name;
		log.info("Actor class.............setName............end");
	}
	
	/**
	*This method is used to get the name of the actor
	*
	*@return name
	*/
	public String getName()
	{
		log.info("Actor class.............getName............start/end");
		return name;
	}
	
	/**
	*This method is used to set the character name of the actor
	*
	*@param characterName - the character name to be set
	*/
	public void setCharacterName(String characterName)
	{
		log.info("Actor class.............setCharacterName............start");
		this.characterName=characterName;
		log.info("Actor class.............setCharacterName............end");
	}
	
	/**
	*This method is used to get the character name of the actor
	*
	*@return characterName
	*/
	public String getCharacterName()
	{
		log.info("Actor class.............getCharacterName............start/end");
		return characterName;
	}
	
	/**
	*This method is used to set the role of the actor
	*
	*@param role - the role to be set
	*/
	public void setRole(String role)
	{
		log.info("Actor class.............setRole............start");
		this.role=role;
		log.info("Actor class.............setRole............end");
	}
	
	/**
	*This method is used to get the role of the actor
	*
	*@param role - the role to be get
	*/
	public String getRole()
	{
		log.info("Actor class.............setRole............start/end");
		return role;
		
	}
	
}