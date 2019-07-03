package com.controller;
import java.util.ArrayList;
import com.model.*;
public class PlayerController
{
	public  ArrayList<Player> players = new ArrayList<Player>();
	public  void setPlayer(String name,String color)
	{
			Player p = new Player();
			p.setName(name);
			p.setColor(color);
			players.add(p);
	}
	
	
 }

