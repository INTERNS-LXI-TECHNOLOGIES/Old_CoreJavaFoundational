
package com.lxisoft.quizapp.model;

import com.lxisoft.quizapp.repository.annotation.*;

public class User {

	@PrimaryKey
	@AutoIncrement
	@Type(value="int")
    private int id;
	
	@Type(value="varchar")
	private String name;
	
	@Unique
	@Type(value="varchar")
	private String email;

	@Unique
	@Type(value="varchar")
    private String username;

	@Type(value="varchar")
    private String password;

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

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

    public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
    }
    

    public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}



}