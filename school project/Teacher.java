import java.util.*;
public class Teacher
{
	public String name;
	public int id;
	public void scan()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of the Teacher : ");
		name=s.next();
		System.out.println("Enter EMP code : ");
		id=s.nextInt();
	}	
	public void print()
	{
		System.out.println("\nTeacher name : "+name+"\t\tEMP code : "+id);
	
} 
}