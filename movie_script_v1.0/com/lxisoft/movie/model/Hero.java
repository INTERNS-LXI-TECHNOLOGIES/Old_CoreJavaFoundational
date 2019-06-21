package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.Actor;
import com.lxisoft.movie.model.*;
import com.lxisoft.movie.control.*;

/**
*This class is used as a model class for Hero
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:21/06/2019
*/
public class Hero extends Actor implements Action
{
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(Hero.class.getName());
	
	/**
	*@Override
	*
	*/
	public void deliverDialogue()
	{
		System.out.println("\ndelivering dialogue\n");
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile("hero.csv");
		ArrayList<String> heroDialogues=sfc.readFromFile("hero.csv");
		int i=(int)(Math.random()*heroDialogues.size());
		System.out.println(getName()+":"+heroDialogues.get(i));
	}
}