package com.lxisoft.movie;
public class MovieScript
{
private String movieName,directorName,producerName;
public MovieScript(String movieName,String directorName,String producerName)
{
this.movieName=movieName;
this.directorName=directorName;	
this.producerName=producerName;
}
public String getMovieName()
{
	return movieName;
}
public String getDirectorName()
{
	return directorName;
}
public String getProducerName()
{
	return producerName;
}
}