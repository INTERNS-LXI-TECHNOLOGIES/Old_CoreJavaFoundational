import java.util.*;
class School
{
	private String schoolName;
	Classroom[] classes=new Classroom[4];
	Principal principal=new Principal();
	Teacher[] teachers=new Teacher[4];
	 
public void setSchoolName(String schoolName)
{
	this.schoolName=schoolName;
}
public String getSchoolName()
{
	return schoolName;
	
}

void setData()
{
	System.out.println("\nShool name is:Sree sankara vidhya peetam.\nSchool formation year:25-06-1994.");
	for(int i=0;i<1;i++)
	{
		classes[i]=new Classroom();
		System.out.print("Classroom:"+(i+1));
		classes[i].setData();	
	}
	for(int i=0;i<1;i++)
	{
		teachers[i]=new Teacher();
		System.out.print("Teacher: "+(i+1));
		teachers[i].setData();
	}
	principal.setData();

	
}

void getData()
{
	System.out.println("\nShool name is:"+schoolName+"\nSchool formation year:25-06-1994.");
	for(int i=0;i<1;i++)
	{
		System.out.print("\nClassroom:"+(i+1));
		classes[i].getData();	
	}
	for(int i=0;i<1;i++)
	{
		
		System.out.print("\nTeacher: "+(i+1));
		teachers[i].getData();
	}
	principal.getData();
	
}
}