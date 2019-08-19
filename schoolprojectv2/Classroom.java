import java.util.Scanner;
public class Classroom
{
	int std,i;
	String div;
	Teacher teacher=new Teacher();
	Student student[]=new Student[4];
	public void scan()
	{
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter division");
	div=s.nextLine();
	System.out.println("enter standard");
	std=s.nextInt();
	teacher.scan();
	for(i=0;i<4;i++)
	{
	student[i]=new Student();
	student[i].scan();
	}
	}
	
	
public void print()
{
	System.out.println("------------");
	System.out.println("standard="+std);
	System.out.println("division="+div);
	teacher.print();
	for(i=0;i<4;i++)
	{
	student[i].print();
	}
}

}	
