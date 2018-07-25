package com.lxisoft.campus2.fac;

import java.util.*;

public class FacultySal
{
	
Scanner scn = new Scanner(System.in);
 
 public void salary()
 {
 
			System.out.println("enter salary for taking an hour:");
			int sal = scn.nextInt();
			System.out.println("Enter the num.of hours taken today:");
			int hr = scn.nextInt();
			int ts;
			ts=hr*sal;
			System.out.println("Total salary of a day: " + ts);

	}
}