package com.lxisoft.customer;
import com.lxisoft.fooditem.*;
/*import com.lxisoft.bill.*;*/
import java.util.*;
import java.io.*;
public class Customer
{
private String userName;
private String password;

public void setUserName(String userName)
{
this.userName=userName;
}
public String getUserName()
{
return userName;
}

public void setPassword(String password)
{
this.password=password;
}
public String getPassword()
{
return password;
}

Scanner scan=new Scanner(System.in);
/*Bill bill=new Bill();*/

public void logUser(ArrayList<FoodItem> foodItems)throws Exception
	{
		String password;
		/*Hotel hotel=new Hotel();*/
		
		File s=new File("foodItems.txt");
		FileWriter fw=new FileWriter(s,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		FileReader fr=new FileReader(s);
		BufferedReader br=new BufferedReader(fr);
        String b=null;
		
		System.out.println(" ");
		System.out.println("                         CUSTOMER LOGGIN                          ");
		System.out.println("------------------------------------------------------------------");
		System.out.print("Username:");
		setUserName(scan.next());
		System.out.print("Password:");
		setPassword(scan.next());
		System.out.print("Confirm password:");
		password=scan.next();
		if(password.equals(getPassword()))
		{
			 System.out.println(" ");
		     System.out.println("Access granted");
		     System.out.println(" ");
			 System.out.println("                               FOOD MENU                               ");
	         System.out.println("-----------------------------------------------------------------------");
	         System.out.println("FoodItem                                                           Price");
	         System.out.println("-----------------------------------------------------------------------");
			 
			 for(FoodItem f:foodItems)
		{
		bw.write(f.getName()+";"+f.getPrice());
		bw.newLine();
		}
        bw.close();	
			 int i=0;
			 while((b=br.readLine())!=null)
			 {
				
				 System.out.println(">>>"+b);
				  String a[]=b.split(";");
				  foodItems.add(new FoodItem());
				  foodItems.get(i).setName(a[0]);
				  foodItems.get(i).setPrice(Integer.parseInt(a[1]));
				  i++;
			 }
			
	
			 for(FoodItem f:foodItems)
	{
		
		System.out.println(f.getName()+"                                          "+f.getPrice());
	}
		/*hotel.placeOrder();*/
		placeOrder();
		
	    }
		else
		{
			System.out.println("Incorrect password....Please try again...!!!");
		}
	}
	public String item;
	public int value;
	public void placeOrder()
	{
		
			
			 System.out.println(" ");
			 System.out.print("choose anything: ");
			 item=scan.next();
			 System.out.print("How many......?:");
			 value=scan.nextInt();
			 
		
	}

}