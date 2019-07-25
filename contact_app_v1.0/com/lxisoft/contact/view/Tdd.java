package com.lxisoft.contact.view;
import com.lxisoft.contact.view.*;
import java.util.*;
/**
*This class is the main class  Tdd
*
*@author Arya Vineesh
*
*@version 1.0
*
*Date Modified:25/07/2019
*/
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
		int choice;
		do
		{
			System.out.println("...........Contact Menu.............");
			System.out.println("1.Create New Contact\n2.Edit Contact\n3.Delete Contact\n4.Search Contact\n5.display contacts\n6.Exit");
			System.out.println("Enter your choice:\n");
			choice=sc.nextInt();
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
				case 6:System.exit(0);
				default:System.out.println("please enter correct choice!....");
			}
		}while(choice!=0);
		
		
		
	}
	
}