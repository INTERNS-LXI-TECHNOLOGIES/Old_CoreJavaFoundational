import java.util.*;
class Student 
{
	String name,address,grade,result,register_no,category,depart;
    float [] mark=new float[10];
   float percentage;
   int age,depart_id,category_option,total_fee;
   void getData()
   {
   	Scanner in =new Scanner(System.in);
   	System.out.print("Enter Student details:\n Name:");
    name=in.nextLine();
    System.out.print("Address:");
    address=in.nextLine();
     System.out.print("Register no:");
    register_no=in.nextLine();
    System.out.print("\n\t1.NRI\n\t2.Allotment\n\t3.Management\nSelect the category:");
    category_option=in.nextInt();
    if(category_option==3)
     {
     	category="Management";
     	total_fee=50000;
     } 
  else if(category_option==2)
       {
       	category="Allotment";
       	total_fee=20000;
       }
   else
   	{
   		category="NRI";
   		total_fee=70000;
   	}
   	 System.out.print("\n\t1.CS\n\t2.MECH\n\t3.CIVIL\nSelect the Department:");
   depart_id=in.nextInt();
    if(depart_id==1)
     {
     	depart="CS";
     	
     } 
  else if(depart_id==2)
       {
       	depart="MECH";
       
       }
       else if(depart_id==3)
       {
       	depart="CIVIL";
       
       }
   else
   	{
   		depart="UNknown";
   		
   	}


   }
  

void display()
{
	System.out.println("");
}
}