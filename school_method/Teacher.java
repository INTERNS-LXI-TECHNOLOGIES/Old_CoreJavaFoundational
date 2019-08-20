import java.util.Scanner;
public class Teacher
{
  String name;
  int empId;
  
 public void scan()
 {
   Scanner read = new Scanner(System.in);
   System.out.println("enter the Teacher name");
   name=read.nextLine();
   System.out.println("enter the empId id");
   empId=read.nextInt();
 
}
 public void print()
 {
	 System.out.println("name of teacher is  "+name+" empId :"+empId);
	 
 }
}