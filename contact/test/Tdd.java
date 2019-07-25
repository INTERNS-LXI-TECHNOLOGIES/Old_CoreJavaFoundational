package com.lxisoft.contact.test;
import com.lxisoft.contact.view.*;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.controller.*;
import com.lxisoft.contact.repository.*;
public class Tdd
{
	public static void main(String[] args)throws Exception
	{
		ContactView contactV=new ContactView();
		contactV.contactAppOperations(contactV);
	}
}