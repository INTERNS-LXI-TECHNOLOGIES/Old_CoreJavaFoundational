package com.lxisoft.metro.passenger;
import java.util.Scanner;
public class Passenger
{                       
  PassengerDetails p=new PassengerDetails();
				public void details()
				    {
                         Scanner s=new Scanner(System.in);
                      
                         System.out.println("Enter the details of Passenger");
					     System.out.println("Enter the name ");
						String name=s.nextLine();
						p.setname(name);
						
						 System.out.println("Enter the address ");
					    String address=s.nextLine();
						p.setaddress(address);

                    }
					public void ticket()
				    {
                      
                        System.out.println("\t\t Name\t=\t"+p.getname());
						System.out.println("\t\t Address=\t"+p.getaddress());

                    }




}