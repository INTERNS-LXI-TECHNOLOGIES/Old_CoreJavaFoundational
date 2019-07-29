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
		contactR.readContact();
	}
	public void editContacts(ContactView contactV,String name,String editName)throws Exception
	{
		contactV.editContactView(contactV,name,editName);
	}
	public void editedContact(ContactView contactV,ContactController contactC,String name,String editName)throws Exception
	{
		contactR.updateContact(contactV,contactC,name,editName);
	}
	public String deleteContacts(ContactView contactV,String name)throws Exception
	{
		name=contactV.deleteContactView(name,contactV);
		return name;
	}
	public void deletedContact(ContactController contactC,ContactView contactV,String name)throws Exception
	{
		contactR.deleteContact(contactC,contactV,name);
	}
}
