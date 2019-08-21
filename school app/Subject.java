import java.util.Scanner; 

public class Subject
{
	String subName;
	int marks;

	public void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subject name");
		subName=sc.nextLine();
		System.out.println("enter marks obtained");
		marks=sc.nextInt();
	}

	public void print()
	{
		System.out.println(" mark obtained in "+subName+" is "+marks);
	}
}

