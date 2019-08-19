import java.util.Scanner; 

public class Classroom
{

	int std,i,o;
	Teacher teacher=new Teacher();
	
	Student student[]=new Student[10];
	
	public void scan()
	{
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
	
	System.out.println(" standard :- "+std);
	teacher.print();
	for(i=0;i<o;i++)
		{
			student[i].print();
		}
}

	 
}