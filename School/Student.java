import java.util.*;
class Student
{
	String name,standard;
	int admNo;
	Scanner n=new Scanner(System.in);

void setData()
{
	System.out.println("Enter the name of the student: ");
	name=n.next();
	System.out.println("Enter the class of the student: ");
	standard=n.next();
	System.out.println("Enter the admission number of the student: ");
	admNo=n.nextInt();
}
void getData()
{
	System.out.println("\nName of student: "+name+"\nClass of student: "+standard+"\nAdmission number: "+admNo);
}
}