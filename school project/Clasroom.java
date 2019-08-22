import java.util.*;
public class Classroom
{
	public int std;
	public String div;
	public Student[] st=new Student[50];
	public Teacher t;
	public void studentDeatails()
	{
		Scanner s=new Scanner(System.in);
		t=new Teacher();
		t.name="Anjali";
		t.subject="Chemisty";
		System.Out.println("Name of the teacher : "+t.name);
		System.Out.println("Name of the subject : "+t.subject);
		System.Out.println("Enter the number of students : ");
		int r=s.nextInt();
		for(int i=0;i<r;i++)
		{
			st[i]=new Student();
			System.Out.println("Enter the name of student : ");
			st[i].name=s.next();
			System.Out.println("Enter the rollno. of student : ");
			st[i].rollno=s.nextint();
			st[i].studentMark();
	 }
}
}	 
	