package com.lxisoft.contact.view;
import com.lxisoft.contact.view.*;
import java.util.*;
public class Tdd
{
	
	public Tdd()
	{
		printMenuItems();
	}
	
	public static void main(String arg[])
	{
		Tdd view=new Tdd();
		
	}
	
	public void printMenuItems()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("...........Contact Menu.............");
			System.out.println("1.Create New Contact\n2.Edit Contact\n3.Delete Contact\n4.Search Contact\n5.display contacts");
			System.out.println("Enter your choice:\n");
			int choice=sc.nextInt();
			ContactView contacts=new ContactView();
			switch(choice)
			{
				case 1:contacts.enterContactDetails();
					break;
				case 2:contacts.editContactView();
					break;
				case 3:contacts.deleteView();
					break;
				case 4:contacts.searchView();
					break;
				case 5:contacts.displayContacts();
					break;
				default:System.out.println("please enter correct choice!....");
			}
		}while(true);
		
		
		
	}
	
}