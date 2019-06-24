package com.lxisoft.snake_and_ladder.view;
import com.lxisoft.snake_and_ladder.controller.*;
import com.lxisoft.snake_and_ladder.model.*;
import java.util.*;
public class CellView
{
	ArrayList <CellController> cells;
	public void setCell()
	{
		cells=new ArrayList <CellController>();
		int n=100;
		for(int i=1;i<=10;i++)
		{ 
		CellController cellC=new CellController();
			int m=n;
			if(n%2==0)
			{
				for(int k=m;k>=n-9;k=k-1)
				{
				System.out.print(k+"\t");
				m=k-1;
				}
				n=n-19;
			}
			else
			{
				for(int j=n;j<=n+9;j=j+1)
				{
				System.out.print(j+"\t");
				m=j-1;
				}
				n=n-1;
			}
			System.out.println("\n");
		}
	}
}
	