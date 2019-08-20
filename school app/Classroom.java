import java.util.Scanner; 

public class Classroom
{

	int std;
	Teacher teacher;
	
	Student student[];
	
	public void scan()
	{
		int i,o;
		student[]=new Student[10];
		teacher=new Teacher();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the standard");
		std=sc.nextInt();
		
		teacher.scan();
		System.out.println("enter no. of students");
		o=sc.nextInt();
		
			for(i=0;i<o;i++)
			{
			student[i]=new Student();
			student[i].scan();
			}

	}


	public void print()
{
	int i,o;
	System.out.println(" standard :- "+std);
	teacher.print();
		
		for(i=0;i<o;i++)
		{
			student[i].print();
		}
}
}