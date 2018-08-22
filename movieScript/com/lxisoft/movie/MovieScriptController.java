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
		File script=new File("./com/lxisoft/file/MovieScript.txt");
		FileWriter scriptfw=new FileWriter(script);
		Scanner input=new Scanner(System.in);
		moviescriptview.askMovieName();
		movieName=input.nextLine();
		scriptfw.write("**********MOVIE SCRIPT**********\n");
		scriptfw.write(movieName);
		String newLine=("\n");
		scriptfw.write(newLine);
		moviescriptview.askDirectorName();
		directorName=input.nextLine();
		scriptfw.write("DIRECTOR:\n");
		scriptfw.write(directorName);
		scriptfw.write(newLine);
		moviescriptview.askProducerName();
		producerName=input.nextLine();
		scriptfw.write("PRODUCER:\n");
		scriptfw.write(producerName);
		//scriptfw.write(newLine);
		scriptfw.close();
		moviescript=new MovieScript(movieName,directorName,producerName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}