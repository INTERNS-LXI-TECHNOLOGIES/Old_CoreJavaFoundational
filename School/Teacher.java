import java.util.*;
class Teacher
{
	String name, subject;
	int joinYear;
	Scanner n=new Scanner(System.in);
	Teacher teachers[]=new Teacher[4];

void setData()
{
	System.out.println("nEnter the name of the teacher: ");
	name=n.next();
	System.out.println("\nEnter the subject of the teacher: ");
	subject=n.next();
	System.out.println("\nEnter the joining year of the teacher: ");
	joinYear=n.nextInt();
	
}
void getData()
{
	System.out.println("\nName of the teacher: "+name+"\nSubject of the teacher: "+subject+"\nJoining year of the teacher: "+joinYear);
}
}


		