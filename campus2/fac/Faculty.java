package com.lxisoft.project.stud;
public class Faculty 
{
	private String name;
	private String adm;
	Facultysal fc = new Facultysal();
	
	
	public void setname(String nm1)
	{
		this.name=nm1;
	
	}
	
	public void setadm(String adm1)
	{
		this.adm=adm1;
	}

	
	public String getname()
	{
		return name;
	}
	
	public String getadm()
	{
		return adm;
	}
	
	public void salary()
	{
	fc.salary();
	}
	

}