package com.lxisoft.Contact.repository;
import com.lxisoft.Contact.model.ContactModel;
import java.util.*;
public interface Repository{
	
	public void createContact(ContactModel c);
	public ArrayList<ContactModel> readContact();
	public void deleteContact(String data);
	public void updateContact(String t,String d,String data,String data1);
	public void searchContact(String n,String no);
}