import java.util.Scanner; 
public class Teacher
{
	String teacherName;

	public void setDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teachers name"); 
		teacherName=sc.nextLine();
	}
	public void printDetails()
	{
		System.out.println(" name of the teacher is "+teacherName);
	}

}