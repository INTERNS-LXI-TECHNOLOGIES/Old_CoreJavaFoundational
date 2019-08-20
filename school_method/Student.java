import java.util.Scanner;
public class Student
{
 String name;
 int id;
 
 public void scan()
 {
   Scanner read = new Scanner(System.in);
   System.out.println("enter the student name");
   name=read.nextLine();
   System.out.println("enter the student id");
   id=read.nextInt();
 
}
 public void print()
 {
	 System.out.println("name of student is  "+name+" student Id :"+id);
	 
 }
}