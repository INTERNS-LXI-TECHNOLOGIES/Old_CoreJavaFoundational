package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.controller.LadderController;

public class Ladder
{

	public int start;
	public int end;


	public int getEnd() {
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

