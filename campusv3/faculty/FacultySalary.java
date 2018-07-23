package com.lxisoft.campusv3.faculty;
import java.util.Scanner;
public class FacultySalary
{
	int solids=500;
	int cad=300;
	int dbms=400;
	int toc=600;
	Scanner fs=new Scanner(System.in);
	public void salary()
	{
		System.out.println("Enter the number of hours taken in SOLIDS: ");
		int solidhour=fs.nextInt();
		System.out.println("Enter the number of hours taken in CAD: ");
		int cadhour=fs.nextInt();
		System.out.println("Enter the number of hours taken in DBMS: ");
		int dbmshour=fs.nextInt();
		System.out.println("Enter the number of hours taken in TOC: ");
		int tochour=fs.nextInt();
		int totalsalary=(solids*solidhour)+(cad*cadhour)+(dbms*dbmshour)+(toc*tochour);
		System.out.println("TotalSalary is : "+totalsalary);
	}
}