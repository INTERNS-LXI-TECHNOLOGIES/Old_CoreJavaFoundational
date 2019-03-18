import java.util.*;
class Classroom
{
	int classroomNo,classStrenght;
	String classTeacher;
	
	Student[] students=new Student[4];
	Teacher teacher=new Teacher();
	
	

void setData()
{
	Scanner n=new Scanner(System.in);
	System.out.println("\nEnter the number of class room: ");
	classroomNo=n.nextInt();
	System.out.println("Enter the number of the students in the class: ");
	classStrenght=n.nextInt();
	

	teacher.setData();

	for(int i=0;i<1;i++)
	{
		students[i]=new Student();
		System.out.print("Student: "+(i+1));
		students[i].setData();
	}
	
	
	

}
void getData()
{
	System.out.println("\nNumber of class room: "+classroomNo+"\nStrenght of students: "+classStrenght);
    System.out.println("class teacher details-");
    teacher.getData();

	for(int i=0;i<1;i++)
	{
		
		System.out.print("\nStudent: "+(i+1));
		students[i].getData();
	}
	
	

	
}
}