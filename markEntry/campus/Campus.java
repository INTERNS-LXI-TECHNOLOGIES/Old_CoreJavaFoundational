package com.lxisoft.markEntry.campus;
import com.lxisoft.markEntry.campus.faculty.Faculty;
import com.lxisoft.markEntry.campus.faculty.Facultysalary;
import com.lxisoft.markEntry.campus.student.StudentEntry;
import com.lxisoft.markEntry.campus.student.StudentmarkEntry;
import com.lxisoft.markEntry.campus.student.Student;
import java.util.Scanner;
public class Campus
{
public  void campus ()
{
	System.out.println("welcome to campus platform");
	Faculty f=new Faculty();
	
	StudentmarkEntry se=new StudentmarkEntry();
Scanner sc=new Scanner(System.in);
System.out.println("choose the Department---- 1-cse ,2-mech");
int choice=sc.nextInt();
switch(choice)
{
case 1:Scanner s=new Scanner(System.in);
           System.out.println("choose the batch---- 1-First year ,2-Second Year,3-Third year,4-Fourth year");
            int ch=sc.nextInt();
             switch(ch)
            {
             case 1:System.out.println("you chose first year\n");
					System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int ch1=sc.nextInt();
					 switch(ch1)
                     {
						 
                      case 1:
					  System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=s.nextLine();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=s.next();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					        se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
             case 2:System.out.println("you chose second year");
                    System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int ch2=sc.nextInt();
					 switch(ch2)
                     {
                      case 1:System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=s.next();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=s.nextLine();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					        se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 3:System.out.println("you chose Third year");
                    System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int ch3=sc.nextInt();
					 switch(ch3)
                     {
                      case 1:System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=s.next();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=s.nextLine();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					  se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 4:System.out.println("you chose fourth year");
		             System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int ch4=sc.nextInt();
					 switch(ch4)
                     {
                      case 1:System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=s.next();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=s.next();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					  se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
             default:System.out.println("invalid choice");
				break;
            }
			break;
        
case 2:System.out.println("mech");
          Scanner sm=new Scanner(System.in);
           System.out.println("choose the batch---- 1-First year ,2-Second Year,3-Third year,4-Fourth year");
            int chm=sc.nextInt();
             switch(chm)
            {
             case 1:System.out.println("you chose first year\n");
					System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int chm1=sc.nextInt();
					 switch(chm1)
                     {
						 
                      case 1:
					  System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=sm.next();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=sm.next();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					        se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
             case 2:System.out.println("you chose second year");
                    System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int chm2=sc.nextInt();
					 switch(chm2)
                     {
                      case 1:System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=sm.nextLine();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=sm.next();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					        se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 3:System.out.println("you chose Third year");
                    System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int chm3=sc.nextInt();
					 switch(chm3)
                     {
                      case 1:System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=sm.next();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=sm.nextLine();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					  se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 4:System.out.println("you chose fourth year");
		             System.out.println("Are you student or Faculty ? (1.faculty  2.student)");
					 int chm4=sc.nextInt();
					 switch(chm4)
                     {
                      case 1:System.out.println("Enter the details of faculty");
					        System.out.println("Enter the name ");
							String name=sm.next();
							f.setname(name);
							
							 System.out.println("Enter the address ");
						   String address=sm.nextLine();
							f.setaddress(address);
							System.out.println("your  name is"+f.getname());
							System.out.println("your  address is"+f.getaddress());
							f.salary();
                      break;
					  case 2:System.out.println("student");
					  se.markEntry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
             default:System.out.println("invalid choice");
				break;
            }
       break;
default:System.out.println("invalid");

}


}
}