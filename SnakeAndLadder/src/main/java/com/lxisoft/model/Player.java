package com.lxisoft.model;

import javafx.scene.paint.*;

public class Player {

	private int id;

	private String name;

	private int score;
	
	private Color color;

	private int type = 1;

    private int current_pos = 1;


	public int getType()
	{
		return this.type;
	}

	public void setType(int type)
	{
		this.type = type;
	}


	public int getCurrentPos()
	{
		return this.current_pos;
	}

	public void setCurrentPos(int current_pos)
	{
		this.current_pos = current_pos;
    }
    
    public int getScore()
	{
		return this.score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}
	

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Color getColor()
	{
		return this.color;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public boolean equals(Player p) {

		if(this.getId() == p.getId()) {

			return true;
		}

		return false;
	}



}
