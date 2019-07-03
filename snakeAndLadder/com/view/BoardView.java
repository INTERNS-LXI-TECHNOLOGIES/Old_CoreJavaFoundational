package com.view;
import java.util.HashMap;
import java.util.Map;

import com.controller.GameController;
import com.controller.*;
import com.model.*;
public class BoardView
{
	
	PlayerController pc=new PlayerController(); 
	GameController gc=new GameController();

public void setGrid()
{
	
	int cell[][]=new int[11][11];
	
	
	for(int i=10; i>0;i--) 
	{ 
		
		
		if(i%2==0)
		{
		for(int j=10; j>0;j--) 
		{
			//System.out.println("jggh"+j+"\n ii"+i);
		cell[i][j] = (10*(i-1))+j;
		//i--;
		
		System.out.print(cell[i][j]+" 		");
		}
		System.out.println("		\n");
		}
		else
		{
			for(int k=1;k<=10;k++)
			{
				cell[i][k]=(10*((i-1))+k);
				
					System.out.print(cell[i][k]+" 		");
			}
				System.out.println("		\n");
		}
		}
	
	
	}

	}


	



