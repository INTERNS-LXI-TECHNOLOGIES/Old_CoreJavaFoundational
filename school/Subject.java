import java.util.Scanner;
public class Subject
{

	String subjectName;	
		int subjectMark;
		int totalMark;
		int n;
	
	Scanner sc=new Scanner(System.in);

public void setDetails()
{
	
	System.out.println(" Enter number of subjects : ");
	int n=sc.nextInt();
	System.out.println(" Enter subjectname : ");
	subjectName=sc.next();
	System.out.println(" Enter the mark : ");
	subjectMark=sc.nextInt();
	//System.out.println(" total mark : ");
	//ubjectMark=sc.nextInt();

	
	
}
public void printDetails()
{
	System.out.println("subjectname is :"+subjectName);
	System.out.println("mark is :"+subjectMark);
			
}
}