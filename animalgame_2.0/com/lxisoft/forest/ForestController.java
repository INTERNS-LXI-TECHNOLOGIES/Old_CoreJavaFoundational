package com.lxisoft.forest;
import com.lxisoft.forest.ForestView;
import com.lxisoft.forest.Forest;
import com.lxisoft.animal.Animal;
public class ForestController
{
	private Forest model;
	private ForestView view;
	Forest[][] grid=new Forest[50][50];


	public ForestController(Forest model, ForestView view)
	{
		this.model=model;
		this.view=view;
	}

	public void setForestName()
	{
		model.setName(view.askName());
	}

	public void getForestName()
	{
		view.printName(model.getName());
	}

	public void setForestSize()
	{
		model.setArea(view.setSize());
	}

	public void getForestSize()
	{
		view.printSize(model.getArea());
	}

	public Forest[][] setAnimalGrid()
	{
		int[] rowCol=model.getArea();
		
		for (int i=0;i<rowCol[0];i++)
		{
			for (int j=0;j<rowCol[1];j++)
			{
				grid[i][j]=null;
				
			}	
		}
		return grid;
	}

	public void setForestGrid()
	{
		model.setGrid(setAnimalGrid());
	}

	public void getForestGrid()
	{
		view.getAnimalGrid(model.getGrid());
	}
}