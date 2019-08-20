import java.util.Scanner;
public class Teacher
{
	
  String name;
  String subject;


  void setTeacherDetails()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("\n");
  System.out.println("Enter teacher name");
	name=sc.nextLine();
	System.out.println("Enter subject ");
	subject=sc.nextLine();
  }

  void getTeacherDetails()
  {
   
  	System.out.println("Teacher: "+name);
  	System.out.println("Subject: "+subject);
  }

}