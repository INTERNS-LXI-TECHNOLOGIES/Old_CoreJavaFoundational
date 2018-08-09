package com.lxisoft.campusv2.student;
import java.util.Scanner;
public class StudentEntry
{
Scanner sc=new Scanner(System.in);	
Student st=new Student();
public void entry()
{

System.out.println("enter the admission id");
int id=sc.nextInt();
if(id>100)
{
System.out.println("sorry seat is unavailable");}
else
{System.out.println("Enter the details of student");
                            Scanner sc1=new Scanner(System.in);
					        System.out.println("Enter the name ");
							String name=sc1.nextLine();
							st.setname(name);
							Scanner sc2=new Scanner(System.in);
							 System.out.println("Enter the address ");
						   String address=sc2.nextLine();
							st.setaddress(address);
							System.out.println("your  name is"+st.getname());
							System.out.println("your  address is"+st.getaddress());

}

}
} 