import java.util.Scanner; 
public class Student
{
	String studentName;
	Subject[] subjects;	
	public void setDetails()
	{
		
		Scanner word=new Scanner(System.in);
		System.out.println("enter student name");
		studentName=word.nextLine();
		System.out.println("enter the number of subjects");		
		int n=word.nextInt();
		subjects=new Subject[n];
		for(int i=0;i<n;i++)
		{
			subjects[i]=new Subject();
	    	subjects[i].setDetails();
		}
	}
	public void printDetails()
	{
		int totalMark=0;
		System.out.println(" student name is "+studentName);
		int l=subjects.length;
		for(int i=0;i<l;i++)
		{
	
			subjects[i].printDetails();
			totalMark+=subjects[i].mark;
			
		
			
		}
		
		System.out.println("total mark:"+totalMark);
		
				
	}
}