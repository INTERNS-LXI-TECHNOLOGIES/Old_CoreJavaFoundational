package com.lxisoft.moviescript.movie;
import java.util.Scanner;
public class MovieScriptView
{
	public void askMovieName()
	{
		System.out.println("\t\t\t\t********Movie Script******");
		System.out.println("Enter the Movie Name:");
	}
	public void askDireName()
	{
		System.out.println("Enter the Director Name");
	}
	public void askProdName()
	{
		System.out.println("Enter the Producer Name");
	}
	public void displayDetail(String directorName,String producerName)
	{
		System.out.println("\nDirected by:"+directorName);
		System.out.println("\nProduced by:"+producerName);
	}
	public void displayMovieName(String movieName)
	{
		System.out.println("\n\t\t\t"+movieName);
	}
}