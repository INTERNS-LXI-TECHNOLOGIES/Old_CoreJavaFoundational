package com.lxisoft.collection;
import java.util.*;
import com.lxisoft.set.*;
import com.lxisoft.list.*;
import com.lxisoft.queue.*;

public class CollectionDemo
{
HashSetDemo ha=new HashSetDemo();
LinkedHashSetDemo lh=new LinkedHashSetDemo();
TreeSetDemo tr=new TreeSetDemo();
ArrayListDemo ar=new ArrayListDemo();
LinkedListDemo lr=new LinkedListDemo();
PriorityQueueDemo pr=new PriorityQueueDemo();
Scanner scan=new Scanner(System.in);

public void setOptions()
{
 int x,choice;
			
			do
			{
			System.out.println("  "+"PLEASE CHOOSE A COLLECTION "+"\n"+"  ");
			System.out.println("1.HASHSET ");
			System.out.println("2.LINKEDHASHSET ");
			System.out.println("3.TREESET ");
			System.out.println("4.ARRAYLIST");
			System.out.println("5.LINKEDLIST");
			System.out.println("6.PRIORITYQUEUE");
			System.out.println(" ");
			System.out.print("Enter your choice:");
			    choice=scan.nextInt();
				
				
				 switch(choice)
			  {
				 case 1:ha.setOperations();
				 break;
				 case 2:lh.setOperations();
				 break;
				 case 3:tr.setOperations();
				 break;
				 case 4:ar.setOperations();
				 break;
				 case 5:lr.setOperations();
				 break;
				 case 6:pr.setOperations();
				 break;
				  default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			  System.out.print("want to do any other operation...?Yes=1/No=0:");
			  x=scan.nextInt();
			}while(x==1);
		}
		}