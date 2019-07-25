package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.view.*;
import com.lxisoft.contact.repository.*;
import java.util.*;
public class ContactController
{
	public ArrayList<Contact> contacts;
	public ContactRepository contactR;
	public ContactController()
	{
		contacts=new ArrayList <Contact>();
		contactR=new ContactRepository();
	}
	public void createContacts(ContactView contactV)throws Exception
	{ 
		contacts.add(contactV.createContactView(contactV));
		
	}
	public void createdContacts(Contact contact,ContactView contactV)throws Exception
	{
		contactR.createContact(contact,contactV);
	}
	public void readContacts()throws Exception
	{
		contactR.readContact(contacts);
	}
}
