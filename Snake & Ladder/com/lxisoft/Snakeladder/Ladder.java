package com.lxisoft.Snakeladder;
import java.util.*;
import java.lang.*;

public class Ladder
{
	private int ladderStartPosition;
	private int ladderEndPosition;
		
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
}