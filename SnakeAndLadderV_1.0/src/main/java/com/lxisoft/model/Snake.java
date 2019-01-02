package com.lxisoft.model;

import java.util.List;
import java.util.ArrayList;

public class Snake {

	private int id;

	private List<Integer> boxes_id;

	public Snake() {

		this.boxes_id = new ArrayList<>();
	}
	
	public Snake(int id , List<Integer> boxes_id)
	{
		this.id = id;
		this.boxes_id = boxes_id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public int getId() {

		return this.id;
	}

	public void setBoxIds(List<Integer> bids) {

		this.boxes_id = bids;
	}

	public List<Integer> getBoxIds() {

		return this.boxes_id;
	}

	public boolean equals(Snake snake) {

		if(snake.getId() == this.getId()) return true;

		return false;
	}
}
