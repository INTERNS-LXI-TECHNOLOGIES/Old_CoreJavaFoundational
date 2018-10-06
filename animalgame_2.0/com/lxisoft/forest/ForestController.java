package com.lxisoft.forest;
import com.lxisoft.forest.ForestView;
import com.lxisoft.forest.Forest;
import com.lxisoft.animal.Animal;
public class ForestController
{
	private Forest model;
	private ForestView view;
	Forest[][] grid=new Forest[50][50];
	ArrayList<Lion> lions=new ArrayList<Lion>();
	ArrayList<Tiger> tigers=new ArrayList<Tiger>();
	ArrayList<Elephant> elephants=new ArrayList<Elephant>();
	ArrayList<Deer> deers=new ArrayList<Deer>();
	Lion lion;
	Tiger tiger;
	Elephant elephant;
	Deer deer;
	int lionCount,deerCount,tigerCount,elephantCount;

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

	public void createLion()
	{
		lionCount=(int)(Math.random()*1)+2;
		for(int i=0;i<lionCount;i++)
		{
			lion=new Lion();
			lions.add(lion);
			lions.get(i).setAnimalId(i);
		}
		
	}

	public void createTiger()
	{
		tigerCount=(int)(Math.random()*1)+3;
		for(int i=0;i<tigerCount;i++)
		{
			tiger=new Tiger();
			tigers.add(tiger);
			tigers.get(i).setAnimalId(i);
		}
		
	}
	
	public void createElephant()
	{
		elephantCount=(int)(Math.random()*1)+4;
		for(int i=0;i<elephantCount;i++)
		{
			elephant=new Elephant();
			elephants.add(elephant);
			elephant.get(i).setAnimalId(i);
		}
		
	}

	public void createDeer()
	{
		deerCount=(int)(Math.random()*1)+4;
		for(int i=0;i<deerCount;i++)
		{
			deer=new Deer();
			deers.add(deer);
			deers.get(i).setAnimalId(i);
		}
		
	}


}