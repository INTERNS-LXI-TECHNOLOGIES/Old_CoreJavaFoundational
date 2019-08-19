import java.util.Scanner; 

public class Student{
	String stname;
	int rno;

public void scan()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter student name");
	stname=sc.nextLine();
	System.out.println("enter student rollno");
	rno=sc.nextInt();
}

public void print()
{
	System.out.println(" rollno of the student is "+rno+" and name is "+stname);
}
}