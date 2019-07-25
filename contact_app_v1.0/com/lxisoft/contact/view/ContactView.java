package com.lxisoft.contact.view;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.control.*;
import java.util.*;
public class ContactView
{
	ContactControl control;
	Contact contact;
	Scanner sc=new Scanner(System.in);
	Scanner input=new Scanner(System.in);
	public void enterContactDetails()
	{
		System.out.println(" enter how many contact you want to create:\n");
		int limit=input.nextInt();
		for(int i=0;i<limit;i++)
		{
			System.out.println("Enter the Contact name:\n");
			String name=sc.nextLine();
			System.out.println("Enter the contact number:\n");
			int num=input.nextInt();
			System.out.println("Enter the place:\n");
			String place=sc.nextLine();
			System.out.println("enter the email:\n");
			String email=sc.nextLine();
			contact=new Contact();
			contact.setName(name);
			contact.setPhoneNumber(num);
			contact.setPlace(place);
			contact.setEmail(email);
			control=new ContactControl();
			control.createNewContact(contact);
		}
		
	}
	
	public void editContactView()
	{
		contact=new Contact();
		System.out.println("Enter the Contact name to be updated:\n");
		String name=sc.nextLine();
		System.out.println("Enter the new contact number:\n");
		int num=input.nextInt();
		System.out.println("Enter the place to be updated:\n");
		String place=sc.nextLine();
		System.out.println("enter the email to be updated:\n");
		String email=sc.nextLine();
		contact.setName(name);
		contact.setPhoneNumber(num);
		contact.setPlace(place);
		contact.setEmail(email);
		control=new ContactControl();
		control.editContact(contact);
		
	}
	
	public void deleteView()
	{
		System.out.println("Enter the name of the contact to be deleted:\n");
		String name=sc.nextLine();
		control=new ContactControl();
		control.deleteContact(name);
	}
	
	public void searchView()
	{
		System.out.println("Enter the contact name to be searched:\n");
		String name=sc.nextLine();
		control=new ContactControl();
		ArrayList<Contact> contactList=control.searchContact(name);
		if(contactList.size()==0)
		{
			System.out.println("No contact matched");
		}
		else
		{
			for(int i=0;i<contactList.size();i++)
			{
				System.out.println("Search found:-\n");
				System.out.println("Contact No."+(i+1)+":\n");
				System.out.println("Contact name:"+contactList.get(i).getName());
				System.out.println("Contact number:"+contactList.get(i).getPhoneNumber());
				System.out.println("Place:"+contactList.get(i).getPlace());
				System.out.println("Email:"+contactList.get(i).getEmail());
				
			}
		}
		
	}
	
	public void displayContacts()
	{
		control=new ContactControl();
		ArrayList<Contact> contactList=control.selectContact();
		System.out.println("...............Contact list View................\n");
		for(int i=0;i<contactList.size();i++)
		{
			
			System.out.println("Contact No."+(i+1)+":\n");
			System.out.println("Contact name:"+contactList.get(i).getName());
			System.out.println("Contact number:"+contactList.get(i).getPhoneNumber());
			System.out.println("Place:"+contactList.get(i).getPlace());
			System.out.println("Email:"+contactList.get(i).getEmail());
		}
	}
}