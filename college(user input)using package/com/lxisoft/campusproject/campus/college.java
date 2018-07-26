package com.lxisoft.campusproject.campus;
import java.util.*;
public class college
{
String name;
String location;
Department[] dep;

			public college()
			{
			
				cdetails();
				createdep();
			}
			void cdetails()
			{
				Scanner c=new Scanner(System.in);
				System.out.println("name of the college");
				name=System.console().readLine();
				System.out.println("location of the college");
				location=System.console().readLine();
			}
			void createdep()
			{
				Scanner c=new Scanner(System.in);
				System.out.println("enter the limit of the department");
				int n=c.nextInt();
				dep=new Department[n];
				for( int i=0;i<n;i++)
				{
					System.out.println("enter the name of department");
					String depname=System.console().readLine();
					System.out.println("enter the location of department");
					String deplocation=System.console().readLine();
					dep[i]=new Department(depname,deplocation);
				}
			}
				public void printdetails()
				{
					System.out.println("name of the college:"+name);
					System.out.println("enter the location of the college:"+location);
					for(int i=0;i<dep.length;i++)
					{
					dep[i].printdetailsD();
					}

				}

				




			


}