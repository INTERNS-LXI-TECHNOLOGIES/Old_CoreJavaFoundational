import java.io.*;
import java.util.*;
public class Customer
{    
     String name;
     int cash;
     Account account;
	   static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
     static Scanner in = new Scanner(System.in);


  public void readCustomer()
  { 
    //this.accno=accno;
    try{
  	System.out.println("enter the customer name:");
  	name=input.readLine();
    System.out.println("enter the amount:");
    cash = in.nextInt();
    //System.out.println("account number:");
    //accno = in.nextInt();
     Account a = new Account();
     a.readAccount();
     this.account = a;
       }
       catch(IOException e){}
  }

}
