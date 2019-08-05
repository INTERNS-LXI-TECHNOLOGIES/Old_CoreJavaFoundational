package com.lxisoft.Contact.controller;
import com.lxisoft.Contact.model.ContactModel;
import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;
import java.io.*;
import java.util.*;
public class ContactController{

Scanner scan = new Scanner(System.in);
ArrayList <ContactModel> contacts = new ArrayList <ContactModel>();
ArrayList<String> phno = new ArrayList<String>();
RepositoryImpl ri = new RepositoryImpl();
RepositoryImpl si = new RepositoryImpl();

	public void create()
	{
		ContactModel cm=new ContactModel();
		System.out.println("Enter the name: ");
		cm.setName(scan.next());
		String c;
		do{
		System.out.println("Enter the Phone Number: ");
		//cm.setPhoneNumber(scan.nextInt());
		String num=scan.next();
		phno.add(num);
		System.out.println("Do you want to continue?Y:N");
		c=scan.next();
		}
		while(c.equals("Y") || c.equals("y"));
		cm.setPhoneNumber(phno);
		//contact.phoneNumber.add(scan.nextInt());
		System.out.println("Enter the emailid: ");
		cm.setMailId(scan.next());
		//contacts.add(cm);
		ri.createContact(cm);
	}

	public void read(){
		contacts=ri.readContact();
		System.out.println(contacts.size());
	}

	public void update(){
		read();
		System.out.println("1.Name\n2.Phone Number\n3.Email id\n");
		System.out.println("Enter your choice: ");
		int a=scan.nextInt();
		switch(a){
		case 1:
			String tb="contactlist";
			String c="Name";
			System.out.println("Enter Name: ");
			String b=scan.next();
			System.out.println("Enter new Name: ");
			String d=scan.next();
			si.updateContact(tb,c,b,d);
			break;
		case 2:
			System.out.println("1.Update Existing contact\n2.Add new number");
			System.out.println("Enter your choice: ");
			int n=scan.nextInt();
			String nbr="PhoneNumber";
			switch(n){
				case 1:
						String tbn="contactnumber";
						System.out.println("Enter Phone Number: ");
					 	String number=scan.next();
					 	System.out.println("Enter new Number: ");
					 	String newnumber=scan.next();
					 	si.updateContact(tbn,nbr,number,newnumber);
					 	break;
				case 2:
						System.out.println("Enter name: ");
						String namer=scan.next();
						System.out.println("Enter new phone number: ");
						String numbr=scan.next();
						si.searchContact(namer,numbr);
						// String nm = v.search();
						// String name[]=nm.split(",");
						//si.searchContact(name[0],name[1]);
						// ContactModel cmd=new ContactModel();
						// System.out.println("Enter the name: ");
						// String nm=scan.next();
						// System.out.println("Enter new number: ");
						// String num=scan.next();
						// phno.add(num);
						// cmd.setPhoneNumber(phno);
						// si.addNumber(nbr,nm,num);
						break;
				default:System.out.println("no operations !"); 
				break;
				}
			break;
		case 3:
			String tbna="Contactlist";
		    String ml="Email_id";
			System.out.println("Enter the Email id: ");
		 	String email=scan.next();
		 	System.out.println("Enter the new Email id: ");
		 	String mail=scan.next();
		 	si.updateContact(tbna,ml,email,mail);
		 	break;
		}
	}

	public void delete(){
		System.out.println("Enter the name: ");
		String name=scan.next();
		ri.deleteContact(name);
	}

	public void closeCon(){
		ri.closer();
	}
	
}