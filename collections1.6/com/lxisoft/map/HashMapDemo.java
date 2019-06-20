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
			int ch;
			//System.out.println("<<<");
			do{
			System.out.println("1.key-based removal"+"\n"+"2.key-value pair based removal"+"\n"+" ");
			System.out.print("Enter your choice:");
			    ch=scan.nextInt();
				switch(ch)
				{
					case 1:System.out.println(" ");
					System.out.print("which key you want to delete ? :");
					map.remove(scan.nextInt());
					System.out.println(" "+"\n"+"deleted...."+"\n"+" ");
					break;
					case 2:System.out.println(" ");
					System.out.print("Enter a key & value to delete :");
					map.remove(scan.nextInt(),scan.next());
					System.out.println(" "+"\n"+"deleted...."+"\n"+" ");
					break;
					default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			}while(ch>2);
					
				
			/*//key-based removal  
    map.remove(100);  
    System.out.println("Updated list of elements: "+map);  
    //value-based removal
	map.remove(102);
	System.out.println("Updated list of elements: "+map); 
//key-value pair based removal  
    map.remove(102, "Rahul");  
    System.out.println("Updated list of elements: "+map);  
 	
	//key-value pair based removal  
    map.remove(103, "Gaurav");  
    System.out.println("Updated list of elements: "+map); */ 
 
		}
		public void sort()
		{
			//System.out.println("###");
			//sorting by keys
			Map<Integer, String> tm = new TreeMap<Integer, String>(map);
           /* System.out.println("sorted order"+"\n"+" ");
			 for(Map.Entry m:map.entrySet())
	 {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }*/
		System.out.println("After Sorting:");
         Set set2 = tm.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }	
  
		}
		public void update()
		{
			//System.out.println("$$$$$$$$$");
			System.out.print("Enter the key and type a value to update: ");
			map.replace(scan.nextInt(),scan.next());
			System.out.println(" "+"\n"+"updated....."+"\n"+" ");
			
			//map.replace(102,"akhil");
			
		}
		
		
		
		}