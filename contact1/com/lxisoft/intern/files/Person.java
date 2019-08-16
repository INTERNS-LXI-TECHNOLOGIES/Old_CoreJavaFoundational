import java.io.*;
import java.util.*;
public class Person
{   String name;      
	String number;
	static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner(System.in);
    ArrayList <Contact> contactslist = new  ArrayList <Contact>();
    
    public Person(String name,String number)
    {
     this.name = name;
     this.number = number;
    }
    public void menu()
    {  int a;
    	do{
    	  System.out.println("\t\t\t***************MENU****************");
    	  System.out.println("\t\t\t1. ADD"+"\t\t\t2. DELETE\n");
    	  System.out.println("\t\t\t3. DISPLAY"+"\t\t");
    	  a = in.nextInt();
    	 switch(a)
    	  {
    	     case 1 : //ADD
                   readContact();
                   break;
           case 2 : //DELETE
                   deleteContact();
                   break;
           case 3 : //DISPLAY
                   displayAll();
                   break;         
        
          }//end switch
        }while(a!=3);//do end
    }

public void deleteContact()
{   for(int i=0;i<contactslist.size();i++)
        {
          System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getName());
        }
	      System.out.println("Enter the name for delete:");
	      
        try{String c = input.readLine();
        
        for(int i=0;i<contactslist.size();i++)
        if(c.equals(contactslist.get(i).getName())) 
          
          	contactslist.remove(i);}catch(IOException e){}
}
    public void readContact()
   {
      System.out.println("Enter the number of the persons:");
      int x = in.nextInt();
        for(int i=1;i<=x;i++)
        {   try{       
  				Contact c = new Contact();
  	            System.out.println("Enter the name:");
                String name = input.readLine();
                c.setName(name);
                System.out.println("Enter the phone number:");
                String number = input.readLine();
                c.setNumber(number);
                System.out.println("Enter the main ID:");
                String id = input.readLine();
                c.setId(id);
                contactslist.add(c); 
              }catch(IOException e){}
              
        }  

    }  
    public void displayAll()
    {
      for(int i=0;i<contactslist.size();i++)
          {
            System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getName());
            System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getNumber());
            System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getId());
            System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getName());
          }
    }           
     

    
}