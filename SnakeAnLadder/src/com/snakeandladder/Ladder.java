package com.snakeandladder;
import java.util.ArrayList;
public class Ladder
{
	
	private int start;
	private int end;

	public int getEnd()
	{
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	public boolean equals(Ladder ladder)
	{

		if(ladder.getEnd() == this.getEnd())return true;

		return false;
	}



}
