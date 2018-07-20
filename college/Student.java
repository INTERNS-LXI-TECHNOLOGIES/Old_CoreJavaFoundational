public class Student
{
	String name;
	int rollno;
	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	} 
	void detailss()
	{
		System.out.println("name of the student:"+name);
		System.out.println("roll number of the student:"+rollno);
	}
}