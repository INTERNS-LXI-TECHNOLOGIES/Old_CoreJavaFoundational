package com.lxisoft.contact.ServiceImpl;
import com.lxisoft.contact.RepoImpl.*;
import com.lxisoft.contact.Model.*;
import java.util.*;
public class ServiceImpl
{
	RepoImpl repoImpl=new RepoImpl();

	public void createContact(Contact contact)
	{
		repoImpl.createContact(contact);
	}

	public ArrayList<Contact> viewContact()
	{
		ArrayList<Contact> contactList=repoImpl.viewContact();
		return contactList;
	}

	public void updateContact(int id,Contact contact)
	{
		repoImpl.updateContact(id,contact);
	}

	public void deleteContact(int id)
	{
		repoImpl.deleteContact(id);
	}

	public ArrayList<Contact> searchContact(String name)
	{
		ArrayList<Contact> contactList= repoImpl.searchContact(name);
		return contactList;
	}
}

