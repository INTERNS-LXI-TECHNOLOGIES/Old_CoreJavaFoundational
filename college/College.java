import java.util.*;
class College
{
	String name;
	String address;
	 
	private String collegeId="123";
	public void setCollegeId(String collegeId)
	{
	this.collegeId=collegeId;
	}
	public String getCollegeId()
	{
		return collegeId;
	}
   


void display()
{
	String name="ABC College";
	System.out.print("-------------------------"+name+"----------------------------\n\t\t\t\t\tId="+getCollegeId());	
   Department departments=new Department();
	departments.menu();
	
}

}