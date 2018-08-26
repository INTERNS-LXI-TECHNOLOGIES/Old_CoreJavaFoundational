package com.lxisoft.animalGame.game.forest;
import com.lxisoft.animalGame.game.forest.ForestControl;
public class ForestDistance
{
	double[] distance=new double[10];
	ForestControl forestControl= new ForestControl();
public void setDistance(int m,int n)
	{
		int breadth,length;
		//distance=new double[10];
		String animalName;
		forestControl.getForeststatus();
		for(int i=0;i<forestControl.n1;i++)
		{
			for(int j=0;j<forestControl.n2;j++)
			{
				if(forestControl.animalArray[i][j]!=null)
				{
					if(i==m&&j==n)
					{
						
					}
				else{
					 animalName=forestControl.findAnimal(forestControl.animalArray[i][j]);
					breadth=j-n;
					length=i-m;
				
					distance[forestControl.animalCount]=Math.sqrt((breadth*breadth)+(length*length));
					forestControl.name[forestControl.animalCount]= animalName;
					forestControl.animalCount++;
					}
				}
			}
		}
					
		
	}
	public double[] getDistance()
	{
		return distance;
	}
}