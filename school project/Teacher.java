import java.util.Scanner;
public class Teacher
{
	Scanner word=new Scanner(System.in);
	String name;
	String sub;
	void getDetails()
	{
		System.out.println("enter teacher name");
		name=word.nextLine();
		System.out.println("enter the subject");
		sub=word.nextLine();
	}
	void printDetails(){
		System.out.println(name);
		System.out.println(sub);
	}
}