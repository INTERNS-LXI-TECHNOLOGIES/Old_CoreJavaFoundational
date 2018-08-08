package com.lxisoft.treasurer.model;
/**
*The OutputModel program  which holds some related variables required for the output
*@author Sumi G
*/
public class OutputModel
{
	String fullname;
	int totalmark;
/**
*Set the value of fullname.  
*@param fullname A variable of type String.
*/	
	public void setFullname(String fullname)
	{
		this.fullname=fullname;
	}
/**
*Retrieve the value of fullname.  
*@return A String data type.
*/
	public String getFullname()
	{
		return fullname;
	}
/**
*Set the value of totalmark.  
*@param totalmark A variable of type int.
*/	
	public void setTotalmark(int totalmark)
	{
		this.totalmark=totalmark;
	}
/**
*Retrieve the value of totalmark.  
*@return A int data type.
*/	
	public int getTotalmark()
	{
		return totalmark;
	}
}