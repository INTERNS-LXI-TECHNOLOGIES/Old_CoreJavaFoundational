package com.lxisoft.campusv3.campus;
import com.lxisoft.campusv3.faculty.Faculty;
import com.lxisoft.campusv3.faculty.FacultySalary;
import com.lxisoft.campusv3.student.StudentEntry;
import com.lxisoft.campusv3.student.Student;
import com.lxisoft.campusv3.student.StudentMarks;
import java.util.Scanner;
public class Campus
{
public void campus()
{
	Faculty f=new Faculty();
	StudentEntry se=new StudentEntry();
	StudentMarks marks=new StudentMarks();
	FacultySalary sal=new FacultySalary();
Scanner sc=new Scanner(System.in);
System.out.println("-----\t\tChoose the Department----\n1)CSE\n2)MECH");
int choice=sc.nextInt();
switch(choice)
{
case 1:		System.out.println("You chose CSE");
			Scanner cs=new Scanner(System.in);
           System.out.println("\t\t----choose the batch----\n1)First year\n2)Second Year\n3)Third year\n4)Fourth year");
            int ch=sc.nextInt();
             switch(ch)
            {
             case 1:System.out.println("You chose first year\n");
					System.out.println("Are you Student or Faculty ? \n\t1)Faculty\n\t2)Student");
					 int ch1=sc.nextInt();
					 switch(ch1)
                     {
						 
                      case 1:
					  System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=cs.nextLine();
							f.setname(name);
							System.out.println("\nEnter the address:\t ");
						    String address=cs.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
							
                      break;
					  case 2:System.out.println("Enter student details");
					  marks.markEntry();
					  se.entry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
             case 2:System.out.println("You chose second year\n");
                    System.out.println("Are you Student or Faculty ? \n\t1)Faculty\n\t2)Student");
					 int ch2=sc.nextInt();
					 switch(ch2)
                     {
                      case 1:System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=cs.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=cs.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
							
                      break;
					  case 2:System.out.println("Enter student details");
					  marks.markEntry();
					  se.entry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 3:System.out.println("you chose Third year");
                    System.out.println("Are you Student or Faculty ? \n\t1)Faculty\n\t2)Student");
					 int ch3=sc.nextInt();
					 switch(ch3)
                     {
                      case 1:System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=cs.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=cs.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
							
                      break;
					  case 2:System.out.println("Enter student details");
					
					  marks.markEntry();
					    se.entry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 4:System.out.println("\nYou chose fourth year");
		             System.out.println("Are you Student or Faculty ?\n\t1)faculty\n\t2)student)");
					 int ch4=sc.nextInt();
					 switch(ch4)
                     {
                      case 1:System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=cs.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=cs.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
                      break;
					  case 2:System.out.println("Enter student details");
					  
					  marks.markEntry();
					  se.entry();
                      break;
					  default:System.out.println("\ninvalid choice");
					  break;
					 }
					 break;
             default:System.out.println("invalid choice");
				break;
            }
			break;
        
case 2:System.out.println(" You chose mech");
Scanner me=new Scanner(System.in);
           System.out.println("\t\t----choose the batch----\n1)First year\n2)Second Year\n3)Third year\n4)Fourth year");
            int c=sc.nextInt();
             switch(c)
            {
             case 1:System.out.println("You chose first year\n");
					System.out.println("Are you Student or Faculty ? \n\t1)Faculty\n\t2)Student");
					 int ch11=sc.nextInt();
					 switch(ch11)
                     {
						 
                      case 1:
					  System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=me.nextLine();
							f.setname(name);
							
							 System.out.println("\nEnter the address:\t ");
						   String address=me.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
							
                      break;
					  case 2:System.out.println("Enter student details");
				
					  marks.markEntry();
					  se.entry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
             case 2:System.out.println("You chose second year\n");
                    System.out.println("Are you Student or Faculty ? \n\t1)Faculty\n\t2)Student");
					 int ch12=sc.nextInt();
					 switch(ch12)
                     {
                      case 1:System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=me.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=me.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
							
                      break;
					  case 2:System.out.println("Enter student details");
					
					  marks.markEntry();
					  se.entry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 3:System.out.println("you chose Third year");
                    System.out.println("Are you Student or Faculty ? \n\t1)Faculty\n\t2)Student");
					 int ch13=sc.nextInt();
					 switch(ch13)
                     {
                      case 1:System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=me.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=me.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
                      break;
					  case 2:System.out.println("Enter student details");
					  marks.markEntry();
					  se.entry();
                      break;
					  default:System.out.println("invalid choice");
					  break;
					 }
					 break;
			 case 4:System.out.println("\nYou chose fourth year");
		             System.out.println("Are you Student or Faculty ?\n\t1)faculty\n\t2)student)");
					 int ch14=sc.nextInt();
					 switch(ch14)
                     {
                      case 1:System.out.println("\nEnter the details of faculty");
					        System.out.println("\nEnter the name:\t ");
							String name=me.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=me.nextLine();
							f.setaddress(address);
							sal.salary();
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
                      break;
					  case 2:System.out.println("Enter student details");
				
					  marks.markEntry();
					  se.entry();
                      break;
					  default:System.out.println("\ninvalid choice");
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