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
				}
				}
				else
				{
				System.out.println("Username is incorrect");
				}
				break;
			case 2:
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
				}
				}
				else
				{
				System.out.println("Username is incorrect");
				}
				break;
				default:System.out.println("Wrong choice");
				break;
				}
				System.out.println("Login page press 2");
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
		do{
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
				administrator.editFood(foods);
				if(foods.size()!=0)
				{
					foodDetails();
				}
				else
				{
					System.out.println("No food");
				}
				break;	
				default:System.out.println("Wrong choice");
				break;				
			}
			System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
		
}
public void foodOrdering()
{
				int noOfOrder;
				foodDetails();
				do{
				System.out.print("Which food you want:");
				String nameOfFood=customer.selectFood();
				if(foods.size()!=0)
				{
						System.out.println("Food available");
						cashier.printBill(foods,nameOfFood);
				}
				else{System.out.println("No food");}
				System.out.println("\n again order food press 1");
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