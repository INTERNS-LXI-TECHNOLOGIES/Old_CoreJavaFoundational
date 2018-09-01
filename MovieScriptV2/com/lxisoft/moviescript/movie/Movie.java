package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.person.*;
import java.util.Scanner;
public class Movie
{
	Actor actor;
	NonActor nonactor;
	String movieName;
	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public Movie() throws Exception
	{
		System.out.println("Enter the Movie Name");
		Scanner input=new Scanner(System.in);
		setMovieName(input.nextLine());
		dataWriter();
		dataView();
	}
	public void dataWriter() throws Exception
	{
		actor=new Actor();
		nonactor=new NonActor();
	}
	public void dataView() throws Exception
	{
		System.out.println("\t\t\t"+getMovieName()+"\n");
		actor.actorDataView();
		nonactor.nonactorDataView();
	}
}