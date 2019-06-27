package com.lxisoft.Snakeladder;
//import com.lxisoft.Snakeladder.view.*;
import java.util.*;
import java.lang.*;

public class Ladder
{
	private int ladderStartPosition;
	private int ladderEndPosition;
	//private String ladderName;
	
	public void setLadderStartPosition(int ladderStart)
	{
		this.ladderStartPosition=ladderStart;
	}
	public int getLadderStartPosition()
	{
		return this.ladderStartPosition;
	}
	
	public void setLadderEndPosition(int ladderEnd)
	{
		this.ladderEndPosition=ladderEnd;
	}
	public int getLadderEndPosition()
	{
		return this.ladderEndPosition;
	}
	
	// public void setLadderName(String nam)
	// {
	// 	this.ladderName=nam;
	// }
	// public String getLadderName()
	// {
	// 	return this.ladderName;
	// }
}