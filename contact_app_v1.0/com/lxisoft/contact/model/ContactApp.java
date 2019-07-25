package com.lxisoft.contact.model;
import com.lxisoft.contact.model.*;
import java.util.*;
/**
*This class is used as a model class for ContactApp
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:25/07/2019
*/
public class ContactApp
{
	public ContactApp()
	{
		log.setLevel(Level.WARNING);
	}
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(ContactApp.class.getName());
	
	/**
	*This is an arraylist of contacts
	*/
	private ArrayList<Contact> contactList;
	
	/**
	*This method is used to set an arraylist of contact
	*
	*@param contactList - the list to be set
	*/
	public void setContactList(ArrayList<Contact> contactList)
	{
		log.info("ContactApp class...........setContactList.............start");
		this.contactList=contactList;
		log.info("ContactApp class...........setContactList.............end");
	}
	
	/**
	*This method will return an arraylist of contact
	*
	*@return contactList
	*/
	public ArrayList<Contact> getContactList()
	{
		log.info("ContactApp class...........getContactList.............start/end");
		return contactList;
	}
}