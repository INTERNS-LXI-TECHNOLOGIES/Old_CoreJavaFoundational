package com.lxisoft.arthadh.forest;
import com.lxisoft.arthadh.animals.Animal;

public class ForestArthadh
{
	private Animal[][] grid=new Animal[10][10];
	//private List<Animal> animals=null;
	
	public void setGrid(Animal[][] grid)
	{
		this.grid=grid;
	}

	public Animal[][] getAnimalGrid()
	{
		return grid;
	}
	/*public Boolean startGame() 
	{
		
		//implement code here
	}
	
	public meetanimals(Animal a,Animal b)
	{

	}
	//@Todo implment method if necessary
	
	public animal getWinner()
	{

	} *///@Todo implment method if necessary
}
