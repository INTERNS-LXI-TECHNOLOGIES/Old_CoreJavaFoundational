package com.lxisoft.contact.control;
import com.lxisoft.contact.repository.*;
import com.lxisoft.contact.model.*;
import java.util.*;
/**
*This class is used as a control class for Contact
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:25/07/2019
*/
public class ContactControl
{
	ContactRepository contactRepo;
	ContactApp contactApp;
	
	public ContactControl()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(ContactControl.class.getName());
	
	
	public void createNewContact(Contact contact)
	{
		log.info("ContactControl class...........createNewContact.............start");
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		contactApp=new ContactApp();
		contactList.add(contact);
		contactApp.setContactList(contactList);
		contactRepo=new ContactRepository();
		contactRepo.insertIntoDb(contact);
		log.info("ContactControl class...........createNewContact.............end");
	}
	
	public void editContact(Contact contact)
	{
		log.info("ContactControl class...........editContact.............start");
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		contactApp=new ContactApp();
		contactList.add(contact);
		contactApp.setContactList(contactList);
		contactRepo=new ContactRepository();
		contactRepo.updateDB(contact);
		log.info("ContactControl class...........editContact.............end");
	}
	
	public void deleteContact(String name)
	{
		log.info("ContactControl class...........deleteContact.............start");
		contactRepo=new ContactRepository();
		contactRepo.deleteFromDb(name);
		log.info("ContactControl class...........deleteContact.............end");
	}
	
	public ArrayList<Contact> searchContact(String name)
	{
		log.info("ContactControl class...........searchContact.............start");
		contactRepo=new ContactRepository();
		ArrayList<Contact> contactList=contactRepo.searchContactFromDb(name);
		log.info("ContactControl class...........searchContact.............end");
		return contactList;
	}
	
	public ArrayList<Contact> selectContact()
	{
		log.info("ContactControl class...........selectContact.............start");
		contactRepo=new ContactRepository();
		ArrayList<Contact> contactList=contactRepo.selectContactFromDb();
		log.info("ContactControl class...........selectContact.............end");
		return contactList;
	}
}