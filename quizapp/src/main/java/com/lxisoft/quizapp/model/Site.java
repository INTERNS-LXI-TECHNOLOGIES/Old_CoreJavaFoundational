package com.lxisoft.quizapp.model;

import com.lxisoft.quizapp.repository.annotation.*;

public class Site {

	@PrimaryKey
	@Type(value="int")
	private int id;

	@Type(value="varchar")
	private String name;

	@Type(value="text")	
	private String about;

	@Type(value="text")
	private String help;

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAbout()
	{
		return this.about;
	}

	public void setAbout(String about)
	{
		this.about = about;
	}

	public String getHelp()
	{
		return this.help;
	}

	public void setHelp(String help)
	{
		this.help = help;
	}


}