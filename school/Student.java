import java.util.Scanner;
public class Student
{
	int id;
	String studentName;	
	Subject[] subject;
	
public void setDetails()
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the student name : ");
	studentName=sc.nextLine();
	System.out.println(" Enter the roll number : ");
	id=sc.nextInt();
	System.out.println("Enter the number of subjects: ");
	 n=sc.nextInt();
	subject=new Subject[n];
	for(int i=0;i<n;i++)
	{
		subject[i]=new Subject();
		subject[i].setDetails();
	}
}
public void printDetails()
{
	int sum=0,n;
	float percentage=0;
	System.out.println("roll number is :"+id);
	System.out.println("student name is :"+studentName);
	//System.out.println("Total mark is :"+sum);
	n=subject.length;
	for(int i=0;i<n;i++)
	{
		subject[i].printDetails();
		sum=sum+subject[i].subjectMark;
	
		
	}
		percentage=sum/n;
		
		
	System.out.println("total mark is :"+sum);
	//System.out.println("average mark is :"+avg);
	System.out.println("percentage is :"+percentage);
	System.out.println("\n");
	//System.out.println("RESULT : ");
	//System.out.println("--------------------------------------------------------------");
	//System.out.println("\n");
	
	
	if(percentage>80)
	{
		System.out.println("RESULT:  PASS");
	}
	else if(percentage>60&&percentage<80)
	{
		System.out.println("RESULT:  PASS");
	}
	else if(percentage>40&&percentage<60)
	{
		System.out.println("RESULT:  PASS");
	}
	else{
	System.out.println("RESULT:  FAIL");
	
	}
}
}