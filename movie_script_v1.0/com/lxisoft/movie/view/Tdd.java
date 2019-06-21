package com.lxisoft.movie.view;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.movie.model.*;
/**
*This class is used as a model class for Tdd
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:21/06/2019
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
		log.setLevel(Level.WARNING);
		selectCategory();
		
	}
	
	public void selectCategory()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t\t Movie \t\t\t\t");
		System.out.println("1.play movie\n2.Edit Script");
		System.out.println("Enter your choice:\n");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:	MovieView view=new MovieView();
					view.enterMovieDetails();
					break;
			case 2:selectCrudOperation();
					
		}
	}
	
	public void selectCrudOperation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create New Script\n2.Read Script\n3.Update Script\n4.Delete Script\n");
		System.out.println("Enter your choice:\n");
		int choice=sc.nextInt();
		
	}
	
	/**
	*this is the main method
	*
	*@param arg[]
	*/
	public static void main(String arg[])
	{
		Tdd tdd=new Tdd();
		
	}
}