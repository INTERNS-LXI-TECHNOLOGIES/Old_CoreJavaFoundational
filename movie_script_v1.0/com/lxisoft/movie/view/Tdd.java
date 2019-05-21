package com.lxisoft.movie.view;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for Tdd
*
*@author AryaVineesh
*
*@version v1.0
*
*Date Modified:21/05/2019
*/
public class Tdd
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	
	/**
	*this is the default constructor
	*/
	public Tdd()
	{
		enterMovieDetails();
	}
	
	public void enterMovieDetails()
	{
		System.out.println("\t\t\t\t\t MovieScript \t\t\t\t\t");
		System.out.println("Enter the name of the movie");
		System.out.println();
	}
	
	public static void main(String arg[])
	{
		Tdd tdd=new Tdd();
	}
}