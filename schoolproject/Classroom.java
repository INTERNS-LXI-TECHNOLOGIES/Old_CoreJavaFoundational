import java.util.Scanner;
public class Classroom
{
	int std;
	String div;
	Teacher teacher;
	Student[] student;
	public void scan()
	{
		int i,t;	
		Scanner s=new Scanner(System.in);
		System.out.println("enter division");
		div=s.nextLine();
		System.out.println("enter standard");
		std=s.nextInt();
		teacher=new Teacher();
		teacher.scan();
		System.out.println("enter number of student");
		t=s.nextInt();
		student=new Student[t];
		
		for(i=0;i<t;i++)
		{
			student[i]=new Student();
			student[i].scan();
		}
	}
	public void print()
	{
		int i,t;
		t=student.length;
		System.out.println("------------");
		System.out.println("standard:-"+std);
		System.out.println("division:-"+div);
		teacher.print();
		
		for(i=0;i<t;i++)
		{
			student[i].print();
		}
	}
}	
