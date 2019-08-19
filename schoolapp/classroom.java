import java.util.Scanner;
public class classroom {
String std;

student stud1=new student();
student stud2=new student();
teacher teach=new teacher();
Scanner sc=new Scanner(System.in);
public void setdetails()
{
	System.out.println(" Enter the standered: ");
	std=sc.nextLine();
	stud1.setdetails();
	stud2.setdetails();
	teach.setdetails();
	}
public void printdetails()
{
	System.out.println("standered is:"+std);
	
	stud1.printdetails();
	stud2.printdetails();
	teach.printdetails();


}
}