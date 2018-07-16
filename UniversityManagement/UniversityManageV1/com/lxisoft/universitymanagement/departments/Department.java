package com.lxisoft.universitymanagement.departments;
import java.util.ArrayList;
import com.lxisoft.universitymanagement.university.University;
import com.lxisoft.universitymanagement.person.Faculty;
import java.io.File;
import com.lxisoft.universitymanagement.college.College;
import java.io.FileReader;
import com.lxisoft.universitymanagement.semester.Semester;
import java.io.BufferedReader;
import java.io.IOException;

public abstract class Department
{
	private String name;
	private ArrayList<Faculty> facultyList=new ArrayList<Faculty>();
	private Semester[] semList=new Semester [4];
	private File facultyFile =new File("./com/lxisoft/universitymanagement/database/faculty.txt");
	protected String abbr;
	
	public Department(College c,String abbr)
	{
		name=this.getClass().getSimpleName();
		this.abbr=abbr;
		try
		{
			FileReader fr=new FileReader(facultyFile);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null) 
			{
				String id="";
				String name="";
				ArrayList<String> subjects=new ArrayList<String>();
				int i=0;
                
					while(line.charAt(i)!='|')
					{
						id+=line.charAt(i);
						i++;
					}
					if(id.contains(c.getAbbr()) && id.contains(getAbbr()))
					{
						i++;
						while(line.charAt(i)!='|')
						{
							name+=line.charAt(i);
							i++;
						}
						i++;
						while(i<line.length() && line.charAt(i)!='|')
						{
							String temp="";
							while(line.charAt(i)!=' ' && line.charAt(i)!='|')
							{
								temp+=line.charAt(i);
								i++;
							}
							subjects.add(temp);
							i++;
						}
					}
					else
					{
						continue;
					}
				
				String[] subjectsArr=new String[subjects.size()];
				subjectsArr=subjects.toArray(subjectsArr);
				Faculty f=new Faculty(id,name,subjectsArr);
				facultyList.add(f);
            }
		}
		catch(IOException e)
		{
			
		}
		int k=0;
		int n=0;
		for(int i=0;i<4;i++)
		{
			k++;
			semList[i]=new Semester(c,this,k+n);
			n++;
		}
	}
	
	public Semester getSemester(int semNo)
	{
		Semester s=null;
		for(Semester sem:semList)
		{
			if(sem.getSemNo()==semNo)
			{
				s=sem;
			}
		}
		return s;
	}
	
	public void setAbbr(String abbr)
	{
		this.abbr=abbr;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAbbr()
	{
		return abbr;
	}
	
	public String addFaculty(College c,String name,String subjects)
	{
		String facID="KTU"+c.getAbbr()+this.getAbbr()+facultyList.size();
		String[] subs=subjects.split(" ");
		Faculty f=new Faculty(facID,name,subs);
		facultyList.add(f);
		University.writeToFile(facultyFile,facID,name,subjects);
		return facID;
	}
	
	public void printFacultyList()
	{
		for(Faculty fac:facultyList)
		{
			System.out.println(fac);
		}
	}
}