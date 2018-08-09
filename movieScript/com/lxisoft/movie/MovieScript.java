package com.lxisoft.movie;
public class MovieScript
{
private String movieName,directorName;
public MovieScript(String movieName,String directorName)
{
this.movieName=movieName;
this.directorName=directorName;	
}
public String getMovieName()
{
	return movieName;
}
public String getDirectorName()
{
	return directorName;
}
}