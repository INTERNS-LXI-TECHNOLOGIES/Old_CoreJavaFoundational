package com.lxisoft.movieScript.moviescripter;
import java.io.*;
import java.util.*;
public class MovieScripter_view
{	Scanner sc;
	MovieScripter_controller controller;
	public MovieScripter_view()throws Exception
	{	sc=new Scanner(System.in);
		controller=new MovieScripter_controller();
		System.out.println("Enter the director:");
		controller.scriptWriter("Director",sc.nextLine());
		System.out.println("Enter the producer:");
		controller.scriptWriter("Producer",sc.nextLine());
		System.out.println("Enter the first person & type:");
		
		controller.scriptWriter(sc.nextLine()+"_"+sc.nextLine());
		controller.scriptPrinter();
		}
}