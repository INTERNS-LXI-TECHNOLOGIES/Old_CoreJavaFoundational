package com.lxisoft.animalgame.test;
import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.exceptions.*;
import java.util.Scanner;
import java.io.*;

public class TDD{
	
	public static void main(String args[])throws DeadException
	{Scanner sc=new Scanner(System.in);
	int z,d;
	System.out.println("\t\t\t\t**********************MY SURVIVAL GAME***********************\n");
        System.out.println("\n");
		System.out.println("Enter The number of Zebras and Deers");
		z=sc.nextInt();
		d=sc.nextInt();
	System.out.println("\n\n\t\t\t\t********POSITION OF THE ANIMALS IN THE FOREST********\n");
	Forest f=new Forest(z,d);
	System.out.println("\n\n\t\t\t\t********SURVIVAL STATUS OF THE ANIMALS********\n");
	f.outGrid();
	f.finalStatus(z,d);	
	}
	
    }