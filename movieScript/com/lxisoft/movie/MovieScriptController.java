package com.lxisoft.movie;
import java.util.Scanner;

public class MovieScriptController
{
	private String movieName,directorName,producerName;
	private MovieScriptView moviescriptview=new MovieScriptView();
	private MovieScript moviescript=new MovieScript(movieName,directorName,producerName);
	//private Scene scene;
	
	
	public MovieScriptController()	
	{
		scriptview();
	}
	public void scriptview()
	{
		moviescriptview.askMovieName();
		Scanner input=new Scanner(System.in);
		movieName=input.nextLine();
		moviescriptview.askDirectorName();
		directorName=input.nextLine();
		moviescriptview.askProducerName();
		producerName=input.nextLine();
	}
}