package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for Singer
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:20/06/2019
*/
public class Singer
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Singer.class.getName());
	
	/**
	*this is the name of the singer
	*/
	private String name;
	
	/**
	*this is the method used to set the name of the singer
	*
	*@param name - the name to set
	*
	*/
	public void setName(String name)
	{
		log.info("Singer class..........setName..........start");
		this.name=name;
		log.info("Singer class..........setName..........end");
	}
	
	/**
	*this method is to return the name of the singer
	*
	*@return name
	*
	*/
	public String getName()
	{
		log.info("Singer class..........getName..........start/end");
		return name;
	}
}