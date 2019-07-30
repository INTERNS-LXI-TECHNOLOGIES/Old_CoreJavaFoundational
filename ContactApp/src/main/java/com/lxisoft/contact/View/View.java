package com.lxisoft.contact.View;
import com.lxisoft.contact.Controller.*;
import com.lxisoft.contact.Model.*;
import java.io.*;
import java.util.*;

import java.util.*;

public class View
{
	ContactController cc=new ContactController();
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	public ArrayList<Contact> contactlist=new ArrayList<Contact>();
	public void contact()
	{
		do
		{
			System.out.println("1. Create New Contact");
			System.out.println("2. View Contact Details");
			System.out.println("3. Update Contact");
			System.out.println("4. Delete Contact");
			System.out.println("5. Search");
			System.out.println("Choose your choice");
			switch(scan.nextInt())
			{
				case 1: createContact();
						break;
				case 2: viewContact();
						break;
				case 3: updateContact();
						break;
				case 4: deleteContact();
						break;
				case 5: searchContact();
						break;
			}
			System.out.println("Do you want to continue Press 1");
		}while(scan.nextInt()==1);
	}
	public void createContact()
	{
		try
		{
			System.out.print("Enter the new contact name :");
			String name=br.readLine();
			System.out.print("Enter the contact number :");
			String number=br.readLine();
			cc.createContact(name,number);
			System.out.println("Successfully added to list");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void viewContact()
	{
		System.out.println("CONTACT LIST....");
		ArrayList<Contact> contactList=cc.viewContact();
		
		for(int i=0;i<contactList.size();i++)
		{
			System.out.println(contactList.get(i).getId()+"\t"+contactList.get(i).getName()+"\t"+contactList.get(i).getNumber());
		}

	}

	public void updateContact()
	{
		try
		{
			viewContact();
			System.out.println("Enter the id for the updation:");
			int id=scan.nextInt();
			System.out.println("Enter the new Name:");
			String newName=br.readLine();
			System.out.println("Enter new number:");
			String newNumber=br.readLine();

			cc.updateContact(id,newName,newNumber);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void deleteContact()
	{
		viewContact();
		System.out.println("Enter id for which contact do you want to delete");
		int id=scan.nextInt();

		cc.deleteContact(id); 
	}

	public void searchContact()
	{
		System.out.println("Enter name for search:");
		String name=scan.next();
		ArrayList<Contact> contactList=cc.searchContact(name);
		for(int i=0;i<contactList.size();i++)
		{
			System.out.println("Contact id."+contactList.get(i).getId());
			System.out.println("Contact Name:"+contactList.get(i).getName());
			System.out.println("Contact Number:"+contactList.get(i).getNumber());
		}
	}
}