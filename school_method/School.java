import java.util.Scanner;
public class School
{
  String name;
  int regNo;
  Classroom classes = new Classroom();
 public void scan()
 {
	 
   Scanner read = new Scanner(System.in);
   System.out.println("enter name school");
   name=read.nextLine();
   System.out.println("enter the regNo");
   regNo=read.nextInt();
   classes.scan();
 }
 public void print()
 {
	 System.out.println("name of school is  "+name+" RegNo:"+regNo);
	 classes.print();
 }
}