package com.lxisoft.universitymanagement.semester;
import com.lxisoft.universitymanagement.college.College;
import com.lxisoft.universitymanagement.departments.Department;
import com.lxisoft.universitymanagement.person.Student;
import com.lxisoft.universitymanagement.university.University;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Semester
{
	private int semNo;
	private ArrayList<Student> studList=new ArrayList<Student>();
	private File studentFile =new File("./com/lxisoft/universitymanagement/database/student.txt");
	
	public Semester(College c,Department d,int semNo)
	{
		this.semNo=semNo;
		try
		{
			FileReader fr=new FileReader(studentFile);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null) 
			{
				String id="";
				String name="";
				int sNo=0;
                for(int i=0;i<line.length();i++)
				{
					while(line.charAt(i)!='|')
					{
						id+=line.charAt(i);
						i++;
					}
					i++;
					while(line.charAt(i)!='|')
					{
						name+=line.charAt(i);
						i++;
					}
					i++;
					sNo=Integer.parseInt(String.valueOf(line.charAt(i)));
					i++;
				}
				int index=id.indexOf(c.getAbbr())+(c.getAbbr().length());
				if(id.contains(c.getAbbr()) && id.substring(index,index+2).contains(d.getAbbr()) && semNo==sNo)
				{
					Student s=new Student(id,name);
					studList.add(s);
				}
            }
		}
		catch(IOException e)
		{
			
		}
	}
	
	public String addStudent(College c,Department d,String name)
	{
		String id="KTU"+c.getAbbr()+d.getAbbr()+"STUD"+studList.size();
		Student s=new Student(id,name);
		studList.add(s);
		University.writeToFile(studentFile,id,name,String.valueOf(semNo));
		return id;
	}
	public int getSemNo()
	{
		return semNo;
	}
	
	public void getStudents()
	{
		for(Student s:studList)
		{
			System.out.println("Student ID : \t"+s.getID()+"\nName : \t\t"+s.getName());
		}
	}
}