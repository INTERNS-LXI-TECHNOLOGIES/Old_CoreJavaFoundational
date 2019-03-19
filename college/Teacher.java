import java.util.*;
class Teacher
{
	String name,address,depart,teacher_id;
   
   
   int age,depart_id,salary;
   void getData()
   {
   	Scanner in =new Scanner(System.in);
   	System.out.print("Enter Teacher details:\n Name:");
    name=in.nextLine();
    System.out.print("Address:");
    address=in.nextLine();
    System.out.print("Salary:");
    salary=in.nextInt();  
    System.out.print("Teacher_id:");
    teacher_id=in.nextLine();
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
   		depart="Unknown";
   		
   	}
   }
 

}