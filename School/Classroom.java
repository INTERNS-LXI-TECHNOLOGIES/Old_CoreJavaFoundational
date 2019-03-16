import java.util.*;
class Classroom
{
	int i;
	Student[] students=new Student[4];
	Teacher[] teachers=new Teacher[4];
	Principal principal=new Principal();
	int classroomNo,classStrenght;
	String classTeacher;

void setData()
{
	Scanner n=new Scanner(System.in);
	System.out.println("\nEnter the number of class room: ");
	classroomNo=n.nextInt();
	System.out.println("Enter the number of the students in the class: ");
	classStrenght=n.nextInt();
	System.out.println("Enter the class teacher name: ");
	classTeacher=n.next();

	
	for(int i=0;i<1;i++)
	{
		students[i]=new Student();
		System.out.print("Student: "+(i+1));
		students[i].setData();
	}
	for(int i=0;i<1;i++)
	{
		teachers[i]=new Teacher();
		System.out.print("Teacher: "+(i+1));
		teachers[i].setData();
	}

	principal.setData();

}
void getData()
{
	System.out.println("\nNumber of class room: "+classroomNo+"\nStrenght of students: "+classStrenght+"\nClass teacher name: "+classTeacher);

	for(int i=0;i<1;i++)
	{
		students[i].getData();
		System.out.print("Student: "+(i+1));
	}
	for(int i=0;i<1;i++)
	{
		teachers[i].getData();
		System.out.print("Teacher: "+(i+1));
	}

	principal.getData();
}
}