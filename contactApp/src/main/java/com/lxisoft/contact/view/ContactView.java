package com.lxisoft.contact.view;
import com.lxisoft.contact.controller.*;
import com.lxisoft.contact.model.*;
import java.io.*;
import java.util.*;
public class ContactView
{
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
	ContactController contactC;
	public ContactView()
	{
		contactC=new ContactController();
	}
	public void contactAppOperations(ContactView contactV)throws Exception
	{
		String name=null;
		String editName=null;
		System.out.println("1.Create new contact\n2.Display contacts\n3.Edit contacts\n4.Delete contact");
		switch(scan.nextInt())
		{
		case 1:
		createContactView(contactV);
		
		break;
		case 2:
		displayContactView();
		break;
		case 3:
		editContactView(contactV,name,editName);
		break;
		case 4:
		deleteContactView(name,contactV);
		break;
		default:System.out.println("Wrong choice");
		break;
		}
	}
	public Contact createContactView(ContactView contactV)throws Exception
	{
		Contact contact=new Contact();
		try
		{
		System.out.println("Create new contact");
		do{	
		System.out.print("Enter the contact name:");
		contact.setName(br.readLine());
		System.out.print("Enter the contact number:");
		contact.setNum(br.readLine());
		//System.out.print(contact.getName());
		System.out.println("Create new contact again press 1");
		}while(scan.nextInt()==1);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		contactC.createdContacts(contact,contactV);
		return contact;
	}
	public void displayContactView()throws Exception
	{
		contactC.readContacts();
		/*for(int i=0;i<contacts.size();i++)
		{
			System.out.print("Contact name:"+contacts.getName()+"\nContact number:"+contacts.getNum());
		}*/
	}
	public void editContactView(ContactView contactV,String name,String editName)throws Exception
	{
		try{
			do{
			System.out.print("Which one you want to edit:");
			name=br.readLine();
			System.out.print("New contact name:");
			editName=br.readLine();
			System.out.println("Edit again press 1");
		}while(scan.nextInt()==1);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		contactC.editedContact(contactV,contactC,name,editName);
	}
	public String deleteContactView(String name,ContactView contactV)throws Exception
	{
		try{
			do{
			System.out.print("Which one you want to delete:");
			name=br.readLine();
			System.out.println("Delete again press 1");
		}while(scan.nextInt()==1);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		contactC.deletedContact(contactC,contactV,name);
		System.out.println(name+"deleted");
		return name;
	}
}