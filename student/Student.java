import java.util.Scanner;
public class Student
{

int regno;
String name;
int cls;
int sub1;
int sub2;
int sub3;
float total;
float percentage;

Scanner scan=new Scanner(System.in);

public void setStudentDetails()
{

System.out.println("Enter the register number");
regno=scan.nextInt();
System.out.println("Enter the name");
name=scan.next();
System.out.println("Enter the class");
cls=scan.nextInt();
System.out.println("Enter the mark of subject1");
sub1=scan.nextInt();
System.out.println("Enter the mark of subject2");
sub2=scan.nextInt();
System.out.println("Enter the mark of subject3");
sub3=scan.nextInt();

total=sub1+sub2+sub3;
percentage=(total*100)/300;

}

public void printStudentDetails()
{

System.out.println("STUDENT DETAILS");
System.out.println("***************");
System.out.println("Register no :"+regno);
System.out.println("Name :"+name);
System.out.println("Class :"+cls);
System.out.println("Mark of subject1 :"+sub1);
System.out.println("Mark of subject2 :"+sub2);
System.out.println("Mark of subject3 :"+sub3);
System.out.println("Total mark :"+total);
System.out.println("Percentage :"+percentage+"%");

}


}