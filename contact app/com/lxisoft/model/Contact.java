package com.lxisoft.model;
import java.util.*;
public class Contact
{
private String name;
private String phoneNumber;
//public ArrayList<String> phno=new ArrayList<String>();

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}

public void setPhoneNumber(String phoneNumber)
{
	this.phoneNumber=phoneNumber;
}
public String getPhoneNumber()
{
	return phoneNumber;
}
}