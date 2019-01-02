package com.lxisoft.model;

public class Box {

	private int id;

	private double rowid;
	
	private double colid;

	
	// Setters

	public void setId(int id) {

		this.id = id;
	}

	public void setRowId(double rid) {

		this.rowid = rid;
	}

	public void setColId(double cid) {

		this.colid = cid;
	}

	// Getters
	
	public int getId() { return this.id; }

	public double getRowId() { return this.rowid; }

	public double getColId() { return this.colid; }


	public boolean equals(Box box) {

		if(box.getId() == this.getId()) return true;

		else if(box.getColId() == this.getColId()) return true;

		else if(box.getRowId() == this.getRowId()) return true;

		else return false;
	}

}
