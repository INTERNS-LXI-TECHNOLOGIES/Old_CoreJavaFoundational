//package com.lxisoft.intern.files.Contact;
import java.io.*;
import java.util.*;
public class Contact
{ 
	String name;
	String number;
	String id;
	Data d = new Data();
   
   static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
     static Scanner in = new Scanner(System.in);
    
    public void readContact()
   {
	   System.out.println("Enter the number of the persons:");
    	int x = in.nextInt();
        for(int i=1;i<=x;i++)
        {
            try{
                System.out.println("Enter the name:");
                this.name = input.readLine();
                d.setName(name);
                System.out.println("Enter the phone number:");
                this.number = input.readLine();
                d.setNumber(number);
                System.out.println("Enter the main ID:");
                this.id = input.readLine();
                d.setId(id);
                AddressData a = new AddressData();
                a.readAddress();}catch(IOException e){}
                
              }
        }
    
}