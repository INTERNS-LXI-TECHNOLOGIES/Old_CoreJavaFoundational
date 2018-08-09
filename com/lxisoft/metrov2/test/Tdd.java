package com.lxisoft.metrov2.test;
import com.lxisoft.metrov2.admin.Admin;
import  com.lxisoft.metrov2.metro.station.ticketcounter.TicketCounter;
import java.util.*;

public class Tdd
{

public static void main(String args[])
{
 int adminpassword=123;
Scanner scan=new Scanner(System.in);
Admin admin=new Admin();
TicketCounter ticketcounter=new TicketCounter();
System.out.println("Enter the password");
int password=scan.nextInt();
if(adminpassword==password)

	{

	System.out.println("\t\t\tAuthorisation acheived");
	admin.adminAccess();
    ticketcounter.ticket(admin); 
	
	}
else
	{
	System.out.println("Password not matched");
	}

}
}