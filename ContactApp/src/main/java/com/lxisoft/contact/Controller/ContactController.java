package com.lxisoft.contact.Controller;
import com.lxisoft.contact.Model.*;
import com.lxisoft.contact.ServiceImpl.*;
import java.util.*;

public class ContactController
{
	public ArrayList<Contact> cont=new ArrayList<Contact>();
	Contact contact=new Contact();
	ServiceImpl serviceImpl=new ServiceImpl();
	public void createContact(String name,String number)
	{
		contact.setName(name);
		contact.setNumber(number);
	
		serviceImpl.createContact(contact);
	}

	public ArrayList<Contact> viewContact()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		contactList=serviceImpl.viewContact();
		return contactList;
	}

	public void updateContact(int id,String newName,String newNumber)
	{
		contact.setName(newName);
		contact.setNumber(newNumber);
	
		serviceImpl.updateContact(id,contact);	
	}

	public void deleteContact(int id)
	{
		serviceImpl.deleteContact(id);
	}

	public ArrayList<Contact> searchContact(String name)
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		contactList=serviceImpl.searchContact(name);
		return contactList;
	}
}