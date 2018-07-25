
package com.lxisoft.inheritance.student;
public class Faculity
{
	String faculityName;
	int noOfHours;
	int perHrWages;
	int wages;
	public void setName(String faculityName1)
		{  
			this.faculityName=faculityName1;
			
		}
	public void setNoofHours(int noOfHours1)
		{  
			this.noOfHours=noOfHours1;
		} 
		public void setwages(int perHrWages1)
		{  
			this.perHrWages=perHrWages1;
		} 
 public void printfac()
 {
	 System.out.println("Facuility name:"+faculityName);
	 System.out.println("No of hours of work:"+noOfHours);
	 wages=perHrWages*noOfHours;
	 System.out.println("Total salaray of the Facuility="+wages);
	 
	 
 }
		
		
}
