package com.lxisoft.campusv2;
import com.lxisoft.campusv2.faculty.Faculty;
import java.util.Scanner;
public class Campus
{
public static void main (String args[])
{
	Faculty f=new Faculty();
Scanner sc=new Scanner(System.in);
System.out.println("-----\t\tChoose the Department----\n1)CSE\n2)MECH");
int choice=sc.nextInt();
switch(choice)
{
case 1:Scanner s=new Scanner(System.in);
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
							String name=s.nextLine();
							f.setname(name);
							
							 System.out.println("\nEnter the address:\t ");
						   String address=s.nextLine();
							f.setaddress(address);
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
                      break;
					  case 2:System.out.println("student");
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
							String name=s.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=s.nextLine();
							f.setaddress(address);
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
                      break;
					  case 2:System.out.println("student");
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
							String name=s.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=s.nextLine();
							f.setaddress(address);
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
                      break;
					  case 2:System.out.println("student");
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
							String name=s.nextLine();
							f.setname(name);
						
							 System.out.println("\nEnter the address:\t ");
						   String address=s.nextLine();
							f.setaddress(address);
							System.out.println("\nEntered name is:\t"+f.getname());
							System.out.println("\nEntered address is:\t"+f.getaddress());
                      break;
					  case 2:System.out.println("student");
                      break;
					  default:System.out.println("\ninvalid choice");
					  break;
					 }
					 break;
             default:System.out.println("invalid choice");
				break;
            }
			break;
        
case 2:System.out.println("mech");
       break;
default:System.out.println("invalid");

}


}
}