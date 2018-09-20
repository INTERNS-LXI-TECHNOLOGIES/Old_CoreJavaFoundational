package com.lxisoft.forest;
import com.lxisoft.forest.ForestView;
import com.lxisoft.forest.Forest;
public class ForestController
{
	private Forest model;
	private ForestView view;

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


}