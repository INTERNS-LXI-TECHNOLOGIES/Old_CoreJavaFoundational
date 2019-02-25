package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Hotel
{
	Scanner scan=new Scanner(System.in);
	private Administrator administrator;
	private Cashier cashier;
	private ArrayList <Food> foods;
	private Customer customer;
	//private Bill bill;
	int noOfFood;
	public void setAdministrator(Administrator administrator)
	{
		this.administrator=administrator;
	}
	public Administrator getAdministrator()
	{
		return administrator;
	}
	public void setCashier(Cashier cashier)
	{
		this.cashier=cashier;
	}
	public Cashier getCashier()
	{
		return cashier;
	}
	public void setFoods(ArrayList <Food> foods)
	{
		this.foods=foods;
	}
	public ArrayList <Food> getFoods()
	{
		return foods;
	}
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	public Customer getCustomer()
	{
		return customer;
	}
public void authentication()throws Exception
{	
			//int noOfCustomers;
			//int total=0;
			//int noOfOrder;
			
			
		//System.out.println(file.exists());
		//bw.write("pizza");
			System.out.println("FOOD PALACE");
			setAdministrator(new Administrator());
			setCashier(new Cashier());
		do
		{
			System.out.println("Login \n 1.Admin \n 2.User \n");
			switch(scan.nextInt())
			{
			case 1:
				do
				{
				administrator.adminDetails();
				System.out.print("Username :");
				if(scan.next().equals(administrator.getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(administrator.getPassword()))
				{	
				adminOptions();
				}
				else
				{
					System.out.println("Password is incorrect");
					System.out.println("Do you want to continue press 1");
				}
				}
				else
				{
				System.out.println("Username is incorrect");
				System.out.println("Do you want to continue press 1");
				}
				}while(scan.nextInt()==1);
				break;
			case 2:
				do
				{
				setCustomer(new Customer());
				customer.userDetails();
				System.out.print("Username :");
				if(scan.next().equals(getCustomer().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(getCustomer().getPassword()))
				{
				foodOrdering();
				}
				else
				{
					System.out.println("Password is incorrect");
					System.out.println("Do you want to continue press 1");
				}
				}
				else
				{
				System.out.println("Username is incorrect");
				System.out.println("Do you want to continue press 1");
				}
				}while(scan.nextInt()==1);
				break;
				default:System.out.println("Wrong choice");
				break;
				}
				System.out.println("To order food press 2");
		}while(scan.nextInt()==2);
}	
public void adminOptions()throws Exception
{
		File file=new File("fooddetails.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		foods=new ArrayList <Food>();
			System.out.println("1.Add \n2.Delete\n3.Edit");
			switch(scan.nextInt())
			{
			case 1:	
				do{
				foods.add(administrator.addFood());
				System.out.println("To add food again press 1");
				}while(scan.nextInt()==1);
				/*for(int i=0;i<foods.size();i++)
				{
				
				bw.write(foods.get(i).getName()+","+foods.get(i).getFoodCount()+","+foods.get(i).getFoodPrice()+"\n");
				}*/
				//bw.flush();
				//bw.close();
				
				/*for(int l=0;l<noOfFood;l++)
				{
				String data=br.readLine();
				System.out.println(data);
				for(int i=0;i<noOfFood;i++)
				{
					foods.add(new Food());
				for(int k=0;k<3;k++)
				{
					
				
				String item[]=data.split(",");
					System.out.println(item[k]);
					//foods.get(i).setFoodName(item[k]);
				//foods.get(i).setFoodCount(item[k+1]);
				//foods.get(i).setFoodPrice(item[k+2]);
				}	
				}
				}
				br.close();*/
				foodDetails();
				break;
			case 2:
				administrator.deleteFood(foods);
				if(foods.size()!=0)
				{
				foodDetails();
				}
				else
				{
					System.out.println("No food");
				}
				break;
			case 3:
				if(foods.size()!=0)
				{
				System.out.println("To edit\n1.Food name\n2.Food Count\n3.Food price");
				switch(scan.nextInt()){
				case 1:
				String edit1=administrator.editFood();
				for(int i=0;i<foods.size();i++)
				{	
			
					if(edit1.equals(foods.get(i).getName()))
					{
						String name=foods.get(i).getName();
						System.out.print("add food:");
						foods.get(i).setName(scan.next());
					}
				}
				foodDetails();
				break;
				case 2:
				String edit2=administrator.editFood();
				for(int i=0;i<foods.size();i++)
				{	
					if(Integer.parseInt(edit2)==(foods.get(i).getFoodCount()))
					{
						int count=foods.get(i).getFoodCount();
						System.out.print("add count:");
						foods.get(i).setFoodCount(scan.nextInt());
					}
				}
				foodDetails();
				break;
				case 3:
				String edit3=administrator.editFood();
				for(int i=0;i<foods.size();i++)
				{	
					if(Integer.parseInt(edit3)==(foods.get(i).getFoodPrice()))
					{
						int price=foods.get(i).getFoodPrice();
						System.out.print("add price:");
						foods.get(i).setFoodPrice(scan.nextInt());
					}
				}
				foodDetails();
				break;
				default:System.out.println("Wrong choice");
				break;
				}	
				}else{System.out.println("No food");}				
			}
}
public void foodOrdering()
{
			
				int noOfCustomers;
				int noOfOrder;
				
				//System.out.print("number of customers:");
				//noOfCustomers=scan.nextInt();
				foodDetails();
				do{
				int total=0;
				//do{
					//int c=0;
				System.out.print("Which food you want:");
				String nameOfFood=customer.selectFood();
				System.out.print("number of order:");
				noOfOrder=scan.nextInt();
				//c++;
				//System.out.print("order next item press 1");
				//}while(scan.nextInt()==1);
				if(foods.size()!=0)
				{
				for(int i=0;i<foods.size();i++)
					{
				if((nameOfFood).equals(foods.get(i).getName()))
						{
						System.out.println("Food available");
						cashier.printBill();
						System.out.printf((i+1)+"\t\t"+foods.get(i).getName()+"\t\t"+noOfOrder+"\t\t"+foods.get(i).getFoodPrice()+"\n");
						
						total=total+(noOfOrder*foods.get(i).getFoodPrice());
						System.out.print("Total\t\t\t\t:"+total);
						foods.get(i).setFoodCount(foods.get(i).getFoodCount()-noOfOrder);
						}
				}
				}
				else{System.out.println("No food");}
				System.out.println("again order food press 1");
				break;
				}while(scan.nextInt()==1);
				
			
}
public void foodDetails()
{
	System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
			for(int i=0;i<foods.size();i++)
			{
			System.out.print((i+1)+"\t\t"+foods.get(i).getName()+"\t\t\t"+foods.get(i).getFoodCount()+"\t\t"+foods.get(i).getFoodPrice()+"\n");
			}
	
}
	
	
}