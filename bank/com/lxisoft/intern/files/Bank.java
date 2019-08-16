import com.lxisoft.intern.files.Bank;
import java.util.*;
public class Bank
{
	String name;
	String address;
	Manager manager;
	ArrayList <Customer> customerslist = new ArrayList<Customer>();
	static Scanner in = new Scanner(System.in);
	
	public Bank(String name,String address)
	{
		this.name = name;
		this.address = address; 
	}

	public void createManager()
	{   
        Manager m = new Manager();
		    m.readManager();
  	   
	}
	 
    public void createCustomers()
	{
		System.out.println("enter the number of the customers:");
		int a=in.nextInt();
       for (int i=0;i<a;i++)
       {
        Customer c = new Customer();
        c.readCustomer();
        customerslist.add(c);
       }
    }

   
      public void displayCustomers()
      {
      	for(int i=0;i<customerslist.size();i++)
      	{
      		System.out.println("Name of the customer "+(i+1)+"          :"+customerslist.get(i).name);
      		System.out.println("amount in the account "+(i+1)+"         :"+customerslist.get(i).cash);
      		System.out.println("Account number of the customer"+(i+1)+" :"+customerslist.get(i).account.accno);
      	}
      }
}