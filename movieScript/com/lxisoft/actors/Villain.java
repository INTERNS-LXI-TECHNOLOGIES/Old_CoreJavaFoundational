package com.lxisoft.actors;
public class Villain
{
private  String villainName,villainCharactorName;
public Villain(String villainName,String villainCharactorName)
{
	this.villainName=villainName;
	this.villainCharactorName=villainCharactorName;
}
public String getVillainName()
{
	return villainName;
}
public String getVillainCharactorName()
{
	return villainCharactorName;
}
}