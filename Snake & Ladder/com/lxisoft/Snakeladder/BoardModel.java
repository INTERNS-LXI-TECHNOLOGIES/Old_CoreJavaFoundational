package com.lxisoft.Snakeladder;
import java.util.*;

public class BoardModel
{
	private int noOfSnakes;
	private int noOfLadders; 
	public void setNoOfSnakes(int noOfSnakes)
	{
		this.noOfSnakes = noOfSnakes;
	}
	public int getNoOfSnakes()
	{
		return noOfSnakes;
	}
	public void setNoOfLadders(int noOfLadders)
	{
		this.noOfLadders = noOfLadders;
	}
	public int getNoOfLadders()
	{
		return noOfLadders;
	}

}