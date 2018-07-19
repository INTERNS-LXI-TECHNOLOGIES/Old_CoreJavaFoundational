import java.util.*;
public class College
{
	Scanner sc=new Scanner(System.in);
	String name;
	String location;
	Department[] deps=new Department[9];
	int i;
	public College()
	{
		System.out.println("Enter the name of college:");
		name=sc.nextLine();
		System.out.println("Enter the location of college:");
		location=sc.nextLine();
		setdetails();
	}
	void setdetails()
	{
		deps[0]=new Department();
		deps[1]=new Department();
	}
	void details()
	{
		System.out.println("CollegeName:"+name);
		System.out.println("Location:"+location);
		for(i=0;i<2;i++)
		{
		deps[i].output();
		}
	}
		
	
	
}

	