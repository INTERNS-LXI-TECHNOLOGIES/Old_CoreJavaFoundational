import java.util.Scanner;
public class Classroom
{
	int std;
    Teacher teacher1=new Teacher();
	Teacher teacher2=new Teacher();
	
	 Student student1=new Student();
	 Student student2=new Student();
     Student student3=new Student();
     Student student4=new Student();	 
	Scanner sc=new Scanner(System.in);

	public void setClassroomDetails()
	{
	System.out.println("\nEnter standard:");
	std =sc.nextInt();

	 System.out.println("\nEnter teacher details");
	 teacher1.setTeacherDetails();
	
	 System.out.println("\nEnter student details");
	 student1.setStudentDetails();
	 student2.setStudentDetails();
     student3.setStudentDetails();
	 student4.setStudentDetails();

    }


    public void getClassroomDetails()
	{
		System.out.println("\nStandard" +std);


		teacher1.getTeacherDetails();
	   
	

	  student1.getStudentDetails();
	  student2.getStudentDetails();
	  student3.getStudentDetails();
	  student4.getStudentDetails();
	
	}

	 
	

	  
}