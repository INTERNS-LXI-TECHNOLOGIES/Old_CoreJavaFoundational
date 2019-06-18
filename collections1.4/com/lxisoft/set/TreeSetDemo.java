package com.lxisoft.set;
import com.lxisoft.collection.*;
import java.util.*;
public class TreeSetDemo implements CollectionRepository
{
TreeSet<String>programmingLanguages = new TreeSet<String>();

	Scanner scan=new Scanner(System.in);
	public void setOperations()
		{
		    int x,choice;
			
			do
			{
			    System.out.println("----------------------------------------------------------------");
				System.out.println("                     TREESET OPERATIONS                        ");
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
		System.out.print("Language "+(i+1)+" : ");
		programmingLanguages.add(scan.next());
		}
		
	    System.out.println("   ");
		System.out.println("Record saved.....");
		System.out.println("   ");
		}
		
		public void display()
		{
		Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
		System.out.println("   ");
		System.out.println("   PROGRAMMING LANGUAGES   ");
		System.out.println("---------------------------");
        while (programmingLanguageIterator.hasNext())
		{
            String programmingLanguage = programmingLanguageIterator.next();
            System.out.println(programmingLanguage);
        }
		}
		
				public void delete()
		{
			System.out.print("Which item do you want to delete...? :");
			programmingLanguages.remove(scan.next());
			System.out.println(" ");
			System.out.println("Item deleted");
			System.out.println(" ");
		}
		public void sort()
			{
			   System.out.println("   ");
		       System.out.println("  Elements in sorted order  ");
		       System.out.println("---------------------------");
				for(String programmingLanguage: programmingLanguages)
			      {
                      System.out.println(programmingLanguage);
			      }
		  }
		  
		  public void update()
			{
				String ele;
				int index;
				
				List<String> ls=new ArrayList<String>(programmingLanguages);
				//System.out.println("Elements => "+ls);
				System.out.print("Which index you want to update...? :");
				index=scan.nextInt();
				System.out.print("Type here to update : ");
				ele=scan.next();
				ls.set(index,ele);
				System.out.println(" ");
				System.out.println("        MODIFIED PROGRAMMING LANGUAGES         ");
				System.out.println("-----------------------------------------------");
				for(int i=0;i<ls.size();i++)
				{
					System.out.println(ls.get(i));
				}
			}
		  }
				