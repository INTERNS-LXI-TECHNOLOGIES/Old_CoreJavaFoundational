package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.Actor;
import com.lxisoft.movie.model.*;
import com.lxisoft.movie.control.*;
/**
*This class is used as a model class for Villain
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:22/06/2019
*/
public class Villain extends Actor implements Action
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Villain.class.getName());
	
	public void deliverDialogue()
	{
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile("villain.csv");
		ArrayList<String> villainDialogues=sfc.readFromFile("villain.csv");
		int i=(int)(Math.random()*villainDialogues.size());
		System.out.println(getName()+":"+villainDialogues.get(i));
	}
}