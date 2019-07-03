package com.controller;

import java.awt.List;
import java.util.ArrayList;
import com.model.*;
import com.view.*;

public class GameController
{
	

	private ArrayList<Cell>sankes=new ArrayList<Cell>();
	private ArrayList<Cell>ladders=new ArrayList<Cell>();
	PlayerController pc=new PlayerController();
	public SnakeModel snakes;
	
	public ArrayList<Cell> getSankes() {
		return sankes;
	}
	public void setSankes(ArrayList<Cell> sankes) {
		this.sankes = sankes;
	} 
	
	
	
	
}
