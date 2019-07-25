package com.lxisoft.contact.control;
import com.lxisoft.contact.repository.*;
import com.lxisoft.contact.model.*;
import java.util.*;
public class ContactControl
{
	ContactRepository contactRepo;
	ContactApp contactApp;
	public void createNewContact(Contact contact)
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		contactApp=new ContactApp();
		contactList.add(contact);
		contactApp.setContactList(contactList);
		contactRepo=new ContactRepository();
		contactRepo.insertIntoDb(contact);
	}
	
	public void editContact(Contact contact)
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		contactApp=new ContactApp();
		contactList.add(contact);
		contactApp.setContactList(contactList);
		contactRepo=new ContactRepository();
		contactRepo.updateDB(contact);
	}
	
	public void deleteContact(String name)
	{
		contactRepo=new ContactRepository();
		contactRepo.deleteFromDb(name);
	}
	
	public ArrayList<Contact> searchContact(String name)
	{
		contactRepo=new ContactRepository();
		ArrayList<Contact> contactList=contactRepo.searchContactFromDb(name);
		return contactList;
	}
	
	public ArrayList<Contact> selectContact()
	{
		contactRepo=new ContactRepository();
		ArrayList<Contact> contactList=contactRepo.selectContactFromDb();
		return contactList;
	}
}