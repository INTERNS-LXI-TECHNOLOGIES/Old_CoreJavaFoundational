package com.lxisoft.controller;
public class Player
{
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void selectColour()
	{
		System.out.println("select colour of the coin");
	}
}