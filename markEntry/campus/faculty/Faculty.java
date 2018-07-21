package com.lxisoft.markEntry.campus.faculty;

public class Faculty
{

private String name;
private String address;
Facultysalary fs=new Facultysalary();
	
public void setname(String name1)
{
this.name=name1;
}
public void setaddress(String address1)
{
this.address=address1;
}
public String getname()
{

return name;
}
public String getaddress()
{
	

return address;

}
public void salary()
{
fs.salary();
}

} 