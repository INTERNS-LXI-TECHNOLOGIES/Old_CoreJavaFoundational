import java.util.Scanner;
public class Classroom
{
  int std;
  String div;
  Teacher teacher= new Teacher();
  Student student = new Student();
  
  public void scan()
 {
	 
   Scanner read = new Scanner(System.in);
   
   System.out.println("enter the DIV");
    div=read.nextLine();
   System.out.println("enter STD");
   std=read.nextInt();
   teacher.scan();
   student.scan();
 }
 public void print()
 {
	 System.out.println("STD  "+std+" & DIV:"+div);
	 teacher.print();
	 student.print();
 }
}