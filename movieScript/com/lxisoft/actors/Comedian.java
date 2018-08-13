package com.lxisoft.actors;
public class Comedian
{
private  String comedianName,comedianCharactorName;
public Comedian(String comedianName,String comedianCharactorName)
{
	this.comedianName=comedianName;
	this.comedianCharactorName=comedianCharactorName;
}
public String getComedianName()
{
	return comedianName;
}
public String getComedianCharactorName()
{
	return comedianCharactorName;
}
}