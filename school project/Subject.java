import java.util.Scanner; 
public class Subject
{
	String subjectName;
	int mark;
	public void setDetails()
	{
		Scanner word=new Scanner(System.in);		
		System.out.println("enter the subject name:");
		subjectName=sc.nextLine();
		System.out.println("enter the mark:");
		mark=word.nextInt();
		
	}
	public void printDetails()
	{
		System.out.println(" subject name is "+subjectName);
		System.out.println(" mark is "+mark);
		
	}
}
