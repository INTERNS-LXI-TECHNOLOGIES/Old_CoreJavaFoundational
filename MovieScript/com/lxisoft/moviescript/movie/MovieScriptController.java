package com.lxisoft.moviescript.movie;
import java.util.Scanner;
public class MovieScriptController
{
	private MovieScript movscr=new MovieScript();
	private MovieScriptView movview;
	private String movieName,directorName,producerName;
	public MovieScriptController()
	{
		scriptView();
	}
	public void scriptView()
	{
		movview=new MovieScriptView();
		movview.askMovieName();
		Scanner input=new Scanner(System.in);
		movieName=input.nextLine();
		movscr.setMovieName(movieName);
		movview.askDireName();
		directorName=input.nextLine();
		movscr.setDirectorName(directorName);
		movview.askProdName();
		producerName=input.nextLine();
		movscr.setProducerName(producerName);
	}
	public void printDetail()
	{
		//movscr=new MovieScript();
		movview.displayDetail(movscr.getDirectorName(),movscr.getProducerName());
	}
	public void printMovieName()
	{
		//movscr=new MovieScript();
		movview.displayMovieName(movscr.getMovieName());
	}
		
}