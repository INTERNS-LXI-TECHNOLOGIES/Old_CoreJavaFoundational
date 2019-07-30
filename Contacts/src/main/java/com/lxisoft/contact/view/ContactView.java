package com.lxisoft.contact.view;
import com.lxisoft.contact.controller.*;
import com.lxisoft.contact.model.*;
import java.util.*;
public class  ContactView
{	
    public ContactController cc=new ContactController();
	ArrayList<ContactModel> datas=new ArrayList<ContactModel>();
	Scanner scan=new Scanner (System.in);
	public void  choice()
	{
	 System.out.println("enter your choice \n 1)create\n 2)read\n 3)update\n 4)delete");
	 switch(scan.nextInt())
	 {
		 case 1: createContactView(); break;
		 case 2: read();break;
		 case 3:update();break;
		 case 4:delete();break;
	 }
   cc.closeCon();
	}
	
	public void createContactView()
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name and number");
		String name=scan.next();
		String number=scan.next();
		cc.add(name,number);
	}
	public void read()
	{
		datas=cc.read();
		for(int i=0;i<datas.size();i++)
		{
		   System.out.println("name="+datas.get(i).getName()+"\t\t"+"number="+datas.get(i).getNumber()+"\n\n");
		}
	}
	public void update()
	{
		read();
		System.out.println("choose update 1)name\n2)number");
		int n=scan.nextInt();
		if(n==1)
		{
		System.out.println("enter old name");
	    String old=scan.next();
		System.out.println("enter new name");
	    String newOne=scan.next();
		cc.updateName(old,newOne);
		}
        else
		{
			System.out.println("enter old number");
			String old=scan.next();
			System.out.println("enter new number");
			String newOne=scan.next();
			cc.updateNumber(old,newOne);
		}			
	}
	public void delete()
	{
		read();
		System.out.println("which contact you want to delete");
		String name=scan.next();
		cc.delete(name);
	}
}