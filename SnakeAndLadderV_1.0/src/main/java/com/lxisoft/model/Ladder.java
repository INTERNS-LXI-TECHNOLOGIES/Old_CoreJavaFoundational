package com.lxisoft.model;

import java.util.List;
import java.util.ArrayList;

public class Ladder {

	private int id;

	private  List<Integer> boxes_id;

	public Ladder() {

		this.boxes_id = new ArrayList<>();
	}

	// Setters

	public void setId(int id) {

		this.id = id;
	}

	public void setBoxIds(List<Integer> bids) {

		this.boxes_id = bids;
	}

	// Getters

	public int getId() {

		return this.id;
	}

	public List<Integer> getBoxIds() {

		return this.boxes_id;
	}

	public boolean equals(Ladder ladder) {

		if(ladder.getId() == this.getId()) return true;

		return false;
	}


}
