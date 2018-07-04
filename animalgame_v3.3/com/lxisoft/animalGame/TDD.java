package com.lxisoft.animalGame;
import com.lxisoft.animalGame.forest.Forest;
import java.io.*;
import java.util.*;
class TDD{
	public static void main(String args[])
	{
		
		System.out.println("**************************Animal GAME**************************************\n");
		System.out.println("**************************SURVIVAL Result**************************************\n");
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of Zebra:\n");
		int ze=ob.nextInt();
		System.out.println("Enter the number of Tiger:\n");
		int ti=ob.nextInt();
		System.out.println("Enter the number of Rabbit:\n");
		int ra=ob.nextInt();
		System.out.println("Enter the number of Hunter:\n");
		int hu=ob.nextInt();
		int tot=ze+ti+ra;
		Forest f=new Forest(ze,ti,ra,hu);
		f.outputGrid();
		f.animalSurvived(tot,hu);
		
	}
	
	
	}