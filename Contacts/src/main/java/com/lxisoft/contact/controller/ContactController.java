package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repositoryimpl.*;
import java.util.ArrayList;
public class ContactController
{
    RepositoryImpl rimpl=new  RepositoryImpl();
	public void add(String name,String number)
	{
		System.out.println("* "+name+"   ."+number);
		rimpl.add(name,number);
	}
	public ArrayList<ContactModel> read()
	{
		ArrayList<ContactModel> datas=new ArrayList<ContactModel>();
		datas=rimpl.read();
		return datas;
	}
	public void closeCon()
	{
		 rimpl.closer();
	}
	public void updateName(String old,String newOne)
	{
		rimpl.updateName(old,newOne);
	}
	public void updateNumber(String old,String newOne)
	{
		rimpl.updateNumber(old,newOne);
	}
	public void delete(String name)
	{
	    rimpl.delete(name);
	}
}