package com.lxisoft.controller;
import com.lxisoft.model.*;
import com.lxisoft.repoimpl.*;
import java.util.*;
public class ContactController
{
Scanner scan=new Scanner(System.in);
public ArrayList<Contact> contact=new ArrayList<Contact>();
RepositoryImpl repo=new RepositoryImpl();

public void display()
{
     int choice=0;
	 int x;
	 do{
	 System.out.println("\n"+"1.Create"+"\n"+"2.View"+"\n"+"3.Edit"+"\n"+"4.Delete"+"\n"+"5.Search"+"\n");
	 System.out.print("Please enter your choice...: ");
	 choice=scan.nextInt();
	 switch(choice)
	 {
		case 1:create();
             break;
        case 2:view();
             break;
        case 3:edit();
             break;
        case 4:delete();
             break;
	    case 5:search();
		break;
        default:System.out.println("Invalid choice made...please try again...!!!");
		break;			 		 
	 }
	 System.out.print("want to do any other operation...?Yes=1/No=0:");
			  x=scan.nextInt();
			}while(x==1);
}

public void create()
{
	int x;
	do{
		Contact c=new Contact();
	 System.out.print("Enter name : ");
	 c.setName(scan.next());
	 System.out.print("Enter phoneNo : ");
	 c.setPhoneNumber(scan.next());
	// contact.add(c);
	 repo.create(c);
	 System.out.println("\n"+"Contact saved...."+"\n");
	 System.out.print("Add more...?Yes=1/No=0: ");
	 x=scan.nextInt();
	}while(x==1);
}

public void view()
{
	System.out.println("Recently added contacts"+"\n");
	repo.view();
	//contact.forEach(a->{System.out.println("Name :"+a.getName()+"\n"+"PhoneNumber :"+a.getPhoneNumber()+"\n");});
}

public void delete()
{
	int x;
	String item;
	do{
		System.out.print("Which contact name do you want to delete...? : ");
		item=scan.next();
	       repo.delete(item);
		System.out.print("Delete more...?Yes=1/No=0: ");
		x=scan.nextInt();
	}while(x==1);
	
}

public void edit()
{
	String name,num;
	System.out.print("Which contact do you want to edit...? :");
	String con=scan.next();
	System.out.print("Which field you want to edit...?Name=1/phoneNo=2: ");
			int f=scan.nextInt();
			if(f==1)
			{
				System.out.print("Type here to update : ");
				name=scan.next();
				System.out.println("\n"+"Updated...."+"\n");
				repo.edit(f,con,name);
			}
			if(f==2)
			{
				System.out.print("Type here to update : ");
				num=scan.next();
				System.out.println("\n"+"Updated...."+"\n");
				repo.edit(f,con,num);
			}
			
	
	/*System.out.print("Which contact do you want to edit...? :");
	String con=scan.next();
	for(int i=0;i<contact.size();i++)
	{
		if(con.equals(contact.get(i).getName()))
		{
			System.out.print("Which field you want to edit...?Name=1/phoneNo=2: ");
			int f=scan.nextInt();
			if(f==1)
			{
				System.out.print("Type here to update : ");
				contact.get(i).setName(scan.next());
				System.out.println("\n"+"Updated...."+"\n");
			}
			else
			{
				System.out.print("Type here to update : ");
				contact.get(i).setPhoneNumber(scan.next());
				System.out.println("\n"+"Updated...."+"\n");
			}
		}		
	}*/
}

public void search()
{
	System.out.print("Type a contactname to search :");
	String x=scan.next();
	repo.search(x);
}

}