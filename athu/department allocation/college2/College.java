package com.lxisoft.college2;
import java.util.Scanner;
public class College
{

	
Scanner sc=new Scanner(System.in);


CSE c=new CSE();
MECH m=new MECH();

public void inputDept()
{
System.out.println("which department? 1.CSE 2.MECH");
int choice=sc.nextInt();

switch(choice)
{
	case 1:c.choice1();
	break;
	
	case 2:m.choice1();
	break;
	
	default:System.out.println("INVALID");
}

}

}
