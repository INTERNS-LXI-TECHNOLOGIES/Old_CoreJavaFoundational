package com.lxisoft.movie;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MovieScriptController
{
	private String movieName,directorName,producerName;
	private MovieScriptView moviescriptview=new MovieScriptView();
	private MovieScript moviescript;
	//private Scene scene;
	
	
	public MovieScriptController()	
	{
		scriptview();
	}
	public void scriptview()
	{
		try
		{
		File script=new File("C:/Users/Windows 10/Desktop/000-workspace/Team1/movieScript/com/lxisoft/file/MovieScript.txt");
		FileWriter scriptfw=new FileWriter(script);
		Scanner input=new Scanner(System.in);
		moviescriptview.askMovieName();
		movieName=input.nextLine();
		scriptfw.write(movieName);
		String newLine=("\n");
		herofw.write(newLine);
		moviescriptview.askDirectorName();
		directorName=input.nextLine();
		scriptfw.write(directorName);
		herofw.write(newLine);
		moviescriptview.askProducerName();
		producerName=input.nextLine();
		scriptfw.write(producerName);
		//scriptfw.write(newLine);
		scriptfw.close();
		moviescript=new MovieScript(movieName,directorName,producerName);
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}