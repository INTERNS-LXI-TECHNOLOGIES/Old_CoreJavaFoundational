package com.lxisoft.map;
import com.lxisoft.collection.*;
import java.util.*;
public class HashMapDemo implements CollectionRepository
{
Map<Integer,String> map=new HashMap<>();

Scanner scan=new Scanner(System.in);
	public void setOperations()
		{
		    int x,choice;
			
			do
			{
			    System.out.println("----------------------------------------------------------------");
				System.out.println("                            HASHMAP                        ");
				System.out.println("----------------------------------------------------------------");
			    System.out.println("1.ADD");
				System.out.println("2.DISPLAY");
				System.out.println("3.DELETE");
				System.out.println("4.SORT");
				System.out.println("5.UPDATE");
				System.out.println("  ");
			    System.out.print("Enter your choice:");
			    choice=scan.nextInt();
				
				
				switch(choice)
			  {
				 case 1:add();
				 break;
				 case 2:display();
				 break;
				 case 3:delete();
				 break;
				 case 4:sort();
				 break;
				 case 5:update();
				 break;
				 default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			  System.out.print("want to do any other operation...?Yes=1/No=0:");
			  x=scan.nextInt();
			}while(x==1);
		}
		
		public void add()
		{
		int num;
		  
	    System.out.println(" ");
        System.out.print("No.of Items you want to add..?:");
		num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
		map.put(scan.nextInt(),scan.next());
		}
		
	    System.out.println("   ");
		System.out.println("Record saved.....");
		System.out.println("   ");
		}
		
		public void display()
		{
			//System.out.println(">>>");
			System.out.println("        UPDATED LIST       ");
			System.out.println("---------------------------");
			 for(Map.Entry m:map.entrySet())
	 {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }
		}
		
		public void delete()
		{
			System.out.println("<<<");
		}
		public void sort()
		{
			System.out.println("###");
		}
		public void update()
		{
			System.out.println("$$$$$$$$$");
		}
		
		
		
		}