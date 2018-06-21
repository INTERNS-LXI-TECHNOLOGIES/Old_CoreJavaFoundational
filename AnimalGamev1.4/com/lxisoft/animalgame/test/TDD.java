package com.lxisoft.animalgame.test;
import com.lxisoft.animalgame.forest.Forest;
import java.io.*;

public class TDD{
	
	public static void main(String args[])
	{
	System.out.println("**********************MY SURVIVAL GAME***********************\n");
        System.out.println("\n\n");
	System.out.println("\n\n********POSITION OF THE ANIMALS IN THE FOREST************\n");
	Forest f=new Forest(6,3,5,4,5);
	System.out.println("\n\n********SURVIVAL STATUS OF THE ANIMALS*******************\n");
	f.outGrid();
	f.finalStatus();	
	}
	
    }