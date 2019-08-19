import java.util.Scanner;
public class Teacher
{
	Scanner sc=new Scanner(System.in);
  String name;
  String subject;


  void setTeacherDetails()
  {
  	System.out.println("enter teacher name");
	name =sc.nextLine();
	System.out.println("enter subject ");
	subject=sc.nextLine();


  }

  void getTeacherDetails()
  {
  	System.out.println("Teacher: " +name);
  	System.out.println("Subject: " +subject);
  }

}