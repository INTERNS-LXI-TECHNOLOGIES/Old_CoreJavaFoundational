import java.util.Scanner; 

public class Classroom
{

	int std;
	for(int i=1;i<=2;i++)
	{
		Teacher teacher=new Teacher();
	}
	
	
	Student student1=new Student();
	// Student student2=new Student();

	public void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the standard");
		std=sc.nextInt();
		teacher1.scan();
		student1.scan();
	}

	public void print()
{
	System.out.println(" standard :- "+std);
	teacher1.print();
	student1.print();
}

	 
}