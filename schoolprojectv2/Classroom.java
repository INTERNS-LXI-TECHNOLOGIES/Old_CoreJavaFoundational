import java.util.Scanner;
public class Classroom
{
	int std;
	String div;
	Teacher teacher1=new Teacher();
	Student student1=new Student();
	public void scan()
	{
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter division");
	div=s.nextLine();
	System.out.println("enter standard");
	std=s.nextInt();
	student1.scan();
	teacher1.scan();
	}
	
	
public void print()
{
	System.out.println("standard="+std);
	System.out.println("division="+div);
	teacher1.print();
	student1.print();
}

}	
