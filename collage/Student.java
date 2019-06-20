import java.util.*;
import java.io.*;
public class Student
 {
	private String name;
	private int id;
	private String department;
	public void setName(String name)
   {
	this.name=name;
   }	
  public String getName()
   {
	return this.name;
   }
  public void setId(int id)
   {
	this.id=id;
   }	
  public int  getId()
   {
	return this.id;
   }
  public void setDepartment(String department)
   {
	this.department=department;
   }	
  public String  getDepartment()
   {
	return this.department;
   }
}