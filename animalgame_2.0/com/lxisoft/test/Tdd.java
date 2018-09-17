package com.lxisoft.test;
import com.lxisoft.forest.ForestController;
import com.lxisoft.forest.ForestView;
import com.lxisoft.forest.Forest;
public class Tdd
{
	public static void main(String args[])
	{
		Forest model=retrieveForestDetail();
		ForestView view=new ForestView();
		ForestController controller=new ForestController(model,view);
		controller.updateView();
	}

	private static Forest retrieveForestDetail()
	{
		Forest forest=new Forest();
		forest.setName("Amazon Forest");
		return forest;
	}
}