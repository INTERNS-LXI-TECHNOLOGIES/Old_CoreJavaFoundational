package com.lxisoft.movie;
import java.util.Scanner;
public class MovieScriptController
{
	private String movieName,directorName;
	private MovieScriptView moviescriptview;
	private MovieScript moviescript=new MovieScript(movieName,directorName);
	
	public MovieScriptController()	
	{
		scriptview();
	}
	public void scriptview()
	{
		moviescriptview=new MovieScriptView();
		moviescriptview.askMovieName();
		Scanner input=new Scanner(System.in);
		movieName=input.nextLine();
		moviescriptview.askDirectorName();
		directorName=input.nextLine();
	}
}