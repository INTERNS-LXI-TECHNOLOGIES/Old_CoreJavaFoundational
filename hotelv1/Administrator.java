package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Administrator
{
	Scanner scan=new Scanner(System.in);
	private String username;
	private String password;
	int noOfFood;
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
		return username;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void adminDetails()
	{
		username="administ";
		password="admin";
	}
	public Food addFood() throws Exception
	{	
	System.out.println("   Food Details   ");
	Food foods=new Food();
			System.out.print("Food item:");
			foods.setName(scan.next());
			System.out.print("Count:");
			foods.setFoodCount(scan.nextInt());
			System.out.print("Price:");
			foods.setFoodPrice(scan.nextInt());
			return foods;
			
	}
	public void deleteFood(ArrayList <Food> foods) throws Exception
	{
		File file=new File("fooddetails.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		System.out.print("which one you want to delete:");
		String  n=scan.next();
				for(int i=0;i<foods.size();i++)
				{
				String data=br.readLine();
				//System.out.println(data);
				String item[]=data.split(",");
				for(int k=0;k<3;k=k+3)
				{
				
				if(n.equals(item[k]))
				{
					for(int l=k;l<3;l++){
						
				String dup=item[l];	
					foods.remove(i);
					}
					}
				}
				}
			
	}
	public void editFood(ArrayList <Food> foods)
	{
		System.out.println("To edit\n1.Food name\n2.Food Count\n3.Food price");
				switch(scan.nextInt()){
				case 1:
				System.out.print("which one you want to edit:");
				String edit=scan.next();
				for(int i=0;i<foods.size();i++)
				{	
			
					if(edit.equals(foods.get(i).getName()))
					{
						String name=foods.get(i).getName();
						System.out.print("add food:");
						foods.get(i).setName(scan.next());
					}
				}
				break;
				case 2:
				System.out.print("which one you want to edit:");
				String edit1=scan.next();
				for(int i=0;i<foods.size();i++)
				{	
					if(Integer.parseInt(edit1)==(foods.get(i).getFoodCount()))
					{
						int count=foods.get(i).getFoodCount();
						System.out.print("add count:");
						foods.get(i).setFoodCount(scan.nextInt());
					}
				}
				break;
				case 3:
				System.out.print("which one you want to edit:");
				String edit2=scan.next();
				for(int i=0;i<foods.size();i++)
				{	
					if(Integer.parseInt(edit2)==(foods.get(i).getFoodPrice()))
					{
						int price=foods.get(i).getFoodPrice();
						System.out.print("add price:");
						foods.get(i).setFoodPrice(scan.nextInt());
					}
				}
				break;
				default:System.out.println("Wrong choice");
				break;
				}	
		
	
	}
}
		