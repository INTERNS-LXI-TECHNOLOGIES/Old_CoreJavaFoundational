import java.util.Scanner;
public class Classroom
{
String div;
int i,n;
Student students[]=new Student[5];
Teacher teacher=new Teacher();
Scanner sc=new Scanner(System.in);
public void setdetails()
{
	System.out.println(" Enter the class and division: ");
	 div=sc.nextLine();
	System.out.println("Enter the number of students: ");
	n=sc.nextInt();
	System.out.println(" Number of students: "+n);
	teacher.setdetails();
	for(i=0;i<n;i++)
	{
		students[i]=new Student();
		students[i].setdetails();
}
}
	public void printdetails()
	{
	System.out.println("class and division is :"+div);
	
	teacher.printdetails();
	
for(i=0;i<n;i++)
	{
	
	students[i].printdetails();}


}
}