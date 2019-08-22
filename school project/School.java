import java.util.*;
public class School
{
	public String name;
	public Classroom c1;
	public void scan()
	{
		c1=new Classroom();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of the school : ");
		name=s.next();
		c1.scan();
		
		}
		public void print()
		{
			System.out.println("\n\t\t\t "+name);
			c1.print();
		}
		}			