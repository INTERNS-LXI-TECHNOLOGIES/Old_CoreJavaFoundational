public class Student{
	String name;
	int rollNo;
	public Student(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	public void printDetailss()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student Rollno:"+rollNo);
	}

}