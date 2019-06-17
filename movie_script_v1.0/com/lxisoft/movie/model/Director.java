package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for Director
*
*@author AryaVineesh
*
*@version v1.0
*
*Date Modified:17/06/2019
*/
public class Director
{
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(Director.class.getName());
	
	/**
	*This is used as the name of the Director
	*/
	private String name;
	
	/**
	*This method is used to set the name of the Director
	*
	*@param name - the name to be set
	*/
	public void setName(String name)
	{
		log.info("Director class.............setName............start");
		this.name=name;
		log.info("Director class.............setName............end");
	}
	
	/**
	*This method is to get the name of the Director
	*
	*@return name
	*/
	public String getName()
	{
		log.info("Director class.............getName............start/end");
		return name;
	}
}