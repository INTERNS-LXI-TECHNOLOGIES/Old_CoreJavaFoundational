import java.util.Scanner; 

public class School

{
	String schoolname;
	String place;
	Classroom class1=new Classroom();
	// Classroom class2=new Classroom();

	public void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the school name ");
		schoolname=sc.nextLine();
		System.out.println(" enter the school location ");
		place=sc.nextLine();
		class1.scan();

	}

public void print()
{
	System.out.println(" name of the school is "+schoolname);
	System.out.println("situated in "+place);
	class1.print();
}

}