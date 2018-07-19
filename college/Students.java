package com.lxisoft.college;
import java.util.*;

public class Students
{
	public static void main(String args[])
	{
		int i;
		Scanner scn = new Scanner(System.in);
	
		System.out.println("Enter the no.of Students to be entered:");
		
		int no = Integer.parseInt(scn.nextLine());
	
	//to store no.of inputs in array
	
		String name[] = new String[no];
	
		for(i=0;i<name.length;i++)
		{
			System.out.println((i+1) + ":");
			name[i] = scn.nextLine();
		}
	
	//to print the entered inputs
	
		for(i=0;i<name.length;i++)
		{
			System.out.print("student" + (i+1));
			System.out.println(name[i]);
		}
		scn.close();
	}
	
}
