package com.lxisoft.movie.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.Actor;
import com.lxisoft.movie.model.*;
import com.lxisoft.movie.control.*;
/**
*This class is used as a model class for Comedeian
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:22/06/2019
*/
public class Comedeian extends Actor implements Action
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Comedeian.class.getName());
	
	/**
	*@Override
	*
	*/
	public void deliverDialogue()
	{
		ScriptFileControl sfc=new ScriptFileControl();
		sfc.createFile("comedeian.csv");
		ArrayList<String>comedeianDialogues=sfc.readFromFile("comedeian.csv");
		int i=(int)(Math.random()*comedeianDialogues.size());
		System.out.println(getName()+":"+comedeianDialogues.get(i));
	}

}