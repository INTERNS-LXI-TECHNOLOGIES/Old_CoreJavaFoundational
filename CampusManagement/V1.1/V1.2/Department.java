import java.util.*;
public class Department
{
	static int count=1;
	Scanner sc=new Scanner(System.in);
	String dep_name;
	String hod_name;
	Room cr;
	int i;
	public Department()
	{
		System.out.println("Enter the name of "+count+" Department:");
		count++;
		dep_name=sc.nextLine();
		System.out.println("Enter the name of HOD:");
		hod_name=sc.nextLine();
		String roomLocation=(dep_name.equals("CSE")) ? "1st floor" : "2nd floor";
		setdetails(roomLocation);
	}
	void setdetails(String roomLocation)
	{
			cr=new Room(roomLocation);
		 
	}
	void output()
	{
		System.out.println("Department Name:"+dep_name);
		System.out.println("Hod Name:"+hod_name);
		cr.printDetails();
	}
		
	
}