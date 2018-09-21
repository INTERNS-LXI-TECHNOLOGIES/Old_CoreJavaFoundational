package com.lxisoft.arthadh.forest;
import com.lxisoft.arthadh.forest.Forest;
public class ForestControllerArthadh
{
	Forest forest=new Forest();
	int row,column;
	Animal grid[][];
	//int xLoc,yLoc;
	public void setSize()
	{
		Scanner size=new Scanner(System.in);
		System.out.println("Enter size of Row");
		row=size.nextInt();
		System.out.println("Enter size of column");
		column=size.nextInt();
		setAnimalGrid(row,column);
	}


	public Animal[][] getAnimalGrid()
	{
		return grid;
	}

public Animal setAnimalGrid(int row,int column)
	{
		
		for(int i=0;i<row;i++)
		{
			for(int i=0;i<column;i++)
			{
				grid[i][j]=null;
				System.out.println("\t");
			}
		}
			grid[i][j]=forest.setGrid();
		System.out.println(grid[i][j]);
	}
	/*public void placeAnimal()
	{

		do
		{
			xLoc=(int)(Math.random()*row);
			yLoc=(int)(Math.random()*column);
	
			grid=forest.getForestArea();
		}
		while(grid[i][j]!=null);
			grid[i][j]=animal;
	}*/
}