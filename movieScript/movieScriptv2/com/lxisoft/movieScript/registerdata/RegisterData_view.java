package com.lxisoft.movieScript.registerdata;
import java.util.*;
public class RegisterData_view{
	Scanner sc;
	RegisterData_controller con;
	public RegisterData_view()throws Exception
	{
		sc=new Scanner(System.in);
		con=new RegisterData_controller();
		System.out.println("\n\n\t\t\t::Enter the details::\n");
		System.out.println("Specify type of person:");
		System.out.println("|1.cast|\t\t|2.crew|");
		switch(sc.nextInt())
		{
		case 1:
		System.out.println("|1.hero|\t\t|2.heroine|\t\t|3.comedian|\t\t|4.villain|");
		con.setClass("cast",sc.nextInt());
		break;
		case 2:
		System.out.println("|1.director|\t\t|2.scriptwriter|\t\t|3.producer|");
		con.setClass("crew",sc.nextInt());
		break;
		}
	}
}