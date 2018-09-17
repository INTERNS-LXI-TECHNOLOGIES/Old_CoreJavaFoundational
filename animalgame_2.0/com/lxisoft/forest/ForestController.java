package com.lxisoft.forest;
import com.lxisoft.forest.ForestView;
import com.lxisoft.forest.Forest;
public class ForestController
{
	private Forest model;
	private ForestView view;

	public ForestController(Forest model,ForestView view)
	{
		this.model=model;
		this.view=view;
	}

	public void setForestName(String name)
	{
		model.setName(name);
	}

	public String getForestName()
	{
		return model.getName();
	}

	public void updateView()
	{
		view.printForestDetails(model.getName());
	}
}