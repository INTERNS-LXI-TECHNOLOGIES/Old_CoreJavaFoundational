import java.util.*;
class School
{
	private String Schoolname;
	Classroom[] classes=new Classroom[4];
	 
public void setname(String Schoolname)
{
	this.Schoolname=Schoolname;
}
public String getname()
{
	return Schoolname;
	System.out.println("school name is: "+school.Schoolname);
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
	
}

void getData()
{
	System.out.println("\nShool name is:Sree sankara vidhya peetam.\nSchool formation year:25-06-1994.");
	for(int i=0;i<1;i++)
	{
		System.out.print("Classroom:"+(i+1));
		classes[i].getData();	
	}
	
}
}