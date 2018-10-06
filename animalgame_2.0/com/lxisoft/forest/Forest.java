package com.lxisoft.forest;
import com.lxisoft.animal.Animal;
public class Forest
{
	private String name;
	private int[] rowCol;
	private Forest[][] grid;

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	} 

	public void setArea(int[] rowCol)
	{
		this.rowCol=rowCol;
	}
	public int[] getArea()
	{
		return rowCol;
	}

	public void setGrid(Forest[][] grid)
	{
		this.grid=grid;
	}

	public Forest[][] getGrid()
	{
		return grid;
	}
}