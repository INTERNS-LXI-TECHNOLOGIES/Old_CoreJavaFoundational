package com.lxisoft.moviescript.movie;
import java.util.Scanner;
public class MovieScriptController
{
	private MovieScript movscr;
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
		movview.askDireName();
		directorName=input.nextLine();
		movview.askProdName();
		producerName=input.nextLine();
		movscr=new MovieScript(movieName,directorName,producerName);
		
	}
}