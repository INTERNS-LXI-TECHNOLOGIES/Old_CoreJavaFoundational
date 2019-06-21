package com.lxisoft.movie.model;
import java.util.logging.*;
import com.lxisoft.movie.model.Actor;
import com.lxisoft.movie.model.*;
import com.lxisoft.movie.control.*;
import java.util.*;

/**
*This class is the model class for JuniorArtists
*
*@author Arya Vineesh
*
*@version 1.0
*
*Date Modified:21/06/2019
*/
public class JuniorArtists extends Actor implements Action
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(JuniorArtists.class.getName());
	
	/**
	*@Override
	*
	*/
	public void deliverDialogue()
	{
		System.out.println("\ndelivering dialogue\n");
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile("junior.csv");
		ArrayList<String> juniorDialogues=sfc.readFromFile("junior.csv");
		int i=(int)(Math.random()*juniorDialogues.size());
		System.out.println(getName()+":"+juniorDialogues.get(i));
	}

}