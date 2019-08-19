import java.util.Scanner;
public class Classroom
{
	int std,limit;
    Teacher teacher1=new Teacher();
	
	
	Student student[]=new Student[10];	 
	Scanner sc=new Scanner(System.in);

	public void setClassroomDetails()
	{
	System.out.println("\nEnter standard:");
	std =sc.nextInt();

	 System.out.println("\nEnter teacher details");
	 teacher1.setTeacherDetails();
	
	 System.out.println("\nEnter  no of student");
     limit=sc.nextInt();

	 System.out.println("\nEnter  details of student");
	 for(int i=0;i<limit;i++)
	 {
	 	student[i]=new Student();
	 	student[i].setStudentDetails();
	 }

    }


    public void getClassroomDetails()
	{
		System.out.println("\nStandard" +std);
		teacher1.getTeacherDetails();
	   
	   for(int i=0;i<limit;i++)
         {
	       student[i].getStudentDetails();
	     }
	}

}