import java.util.Scanner; 

public class Classroom
{

	int std;
	Teacher teacher;
	
	Student[] student;
	
	public void scan()
	{
		int i,o;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the standard");
		std=sc.nextInt();
		System.out.println("enter no. of students");
		o=sc.nextInt();

		teacher=new Teacher();
		teacher.scan();
		student=new Student[o];
		for(i=0;i<o;i++)
		{
			student[i]=new Student();
			student[i].scan();
		}
		
	}


	public void print()
{
	int i,o;
	o=student.length;
	System.out.println(" standard :- "+std);
	teacher.print();

	for(i=0;i<o;i++)
	{
		student[i].print();
	}
}
}