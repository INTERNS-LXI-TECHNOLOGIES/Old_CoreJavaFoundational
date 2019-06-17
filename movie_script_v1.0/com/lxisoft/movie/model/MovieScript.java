package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.Scene;
import com.lxisoft.movie.model.Dialogue;
/**
*This class is used as a model class for MovieScript
*
*@author AryaVineesh
*
*@version v1.0
*
*Date Modified:17/06/2019
*/
public class MovieScript
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MovieScript.class.getName());
	
	/**
	*This is a reference to the arraylist of scenes
	*/
	private ArrayList<Scene> scenes;
	
	/**
	*This is a reference to the arraylist of dialogues
	*/
	private ArrayList<Dialogue> dialogues;
	
	/**
	*This method is used to set the arraylist of scenes
	*
	*@param scenes - the list of scenes to be set
	*/
	public void setScenes(ArrayList<Scene> scenes)
	{
		log.info("MovieScript class.............setScenes............start");
		this.scenes=scenes;
		log.info("MovieScript class.............setScenes............end");
	}
	
	/**
	*This method is used to get the arraylist of scenes
	*
	*@return scenes - the list of scenes to be get
	*/
	public ArrayList<Scene> getScenes()
	{
		log.info("MovieScript class.............getScenes............start/end");
		return scenes;
	}
	
	/**
	*This method is used to set the arraylist of dialogues
	*
	*@param dialogues - the list of dialogues to be set
	*/
	public void setDialogue(ArrayList<Dialogue> dialogues)
	{
		log.info("MovieScript class.............setDialogue............start");
		this.dialogues=dialogues;
		log.info("MovieScript class.............setDialogue............end");
	}
	
	/**
	*This method is used to get the arraylist of dialogues
	*
	*@return dialogues - the list of dialogues to be get
	*/
	public ArrayList<Dialogue> getDialogue()
	{
		log.info("MovieScript class.............getDialogue............start/end");
		return dialogues;
	}
}