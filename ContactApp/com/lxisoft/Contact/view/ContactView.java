package com.lxisoft.Contact.view;
import com.lxisoft.Contact.controller.ContactController;
import java.util.*;
import java.io.*;
public class ContactView{
	Scanner scan = new Scanner(System.in);
	ContactController controll = new ContactController();
	public void display(){
		int a;
		do{
		System.out.println("1.create\n2.read\n3.update\n4.delete\n");
		System.out.println("Enter your choice:");
		a=scan.nextInt();
		switch(a){
			case 1:controll.create();
			break;
			case 2:controll.read();
			break;
			case 3:controll.update();
			break;
			case 4:controll.delete();
			break;
			case 5:controll.closeCon();break;
			default :System.out.println("no more operations left!");
			break;
		}
		
	}
	while(a!=5);
		
	}
	// public String search(){
	// 	System.out.println("Enter name: ");
	// 	String namer=scan.next();
	// 	System.out.println("Enter new phone number: ");
	// 	String numbr=scan.next();
	// 	return namer+","+numbr;
	// }
}