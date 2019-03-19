import java.util.*;
import java.io.*;
class Department
{
  
    Student students;
	ArrayList <Student> studentslist= new ArrayList <Student> ();
    Teacher teachers;
	ArrayList < Teacher>  teacherslist= new ArrayList < Teacher> ();

void menu()
{
int choice1,choice2,limit,p=0,i;
int depart_id_check;
String depart_check;
do {
System.out.print("\n1.ADD\t\t2.DELETE\t\t3.VIEW\t\t 4.EXIT\nSelect the option:");
Scanner in =new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

choice1=in.nextInt();
switch(choice1)
{
	case 1:
	System.out.print("\n1.Add Student\t\t2.Add Teacher\nSelect the option:");
    choice2=in.nextInt();
    switch(choice2)
    {
    	case 1:
    	System.out.print("\nEnter the number of Student to add:");
    	limit=in.nextInt();
    	for ( i=0;i<limit ; i++) 
    	{
    		students=new Student();
    	    students.getData();
            studentslist.add(students);
        }
    	break;
    	case 2:
    	System.out.print("\nEnter the number of Teacher to add:");
    	limit=in.nextInt();
    	for ( i=0;i<limit ; i++) 
    	{
    		teachers=new  Teacher();
    	    teachers.getData();
            teacherslist.add(teachers);
        }
    	break;
    	default:
    	System.out.print("Invalid Entry!!");
    	break;
    }
	break;
	case 2:
	int students_arraylist_size=studentslist.size();
	int teachers_arraylist_size=teacherslist.size();
	System.out.print("\nSub Menu:\t1.Delete Student\t2.Delete Teacher\nSelect the option:");
    choice2=in.nextInt();
    String id_delete=null;
    switch(choice2)
    {
    	case 1:
    	
    	

if(students_arraylist_size==0)
    	{
          System.out.print("\nEmpty list!!\n");
    	}
    	else{
System.out.print("\nEnter the Student register number to delete:");
          try{
             id_delete=br.readLine();
             
           }
           catch(IOException ex)
           {
           	System.out.print("	ERROR"+ex);
           }
            catch(Exception e)
           {
           	System.out.print("	ERROR"+e);
           }
    for( i=0;i<students_arraylist_size;i++)
	{
	
		
     if(studentslist.get(i).register_no.equals(id_delete))
		{
			System.out.println("Student Data deleted..Successfully");
			studentslist.remove(i);
        }
    }
}
    	break;
    	case 2:
    	
    if(teachers_arraylist_size==0)
    	{
          System.out.print("\nEmpty list!!\n");
    	}
    	else{
System.out.print("\nEnter the Teachers register number to delete:");
          try{
             id_delete=br.readLine();
             
           }
           catch(IOException ex)
           {
           	System.out.print("	ERROR"+ex);
           }
            catch(Exception e)
           {
           	System.out.print("	ERROR"+e);
           }
    for( i=0;i<teachers_arraylist_size;i++)
	{
	
		
     if(teacherslist.get(i).register_no.equals(id_delete))
		{
			System.out.println("Teachers Data deleted..Successfully");
			teacherslist.remove(i);
        }
    }
}
    	break;
    	default:
    	System.out.print("Invalid Entry!!");
    	break;
    }
	break;
	case 3:
	System.out.print("\n1.Student details\t\t2.Teacher details\nSelect the option:");
    choice2=in.nextInt();
    System.out.print("\n\t1.CS\n\t2.MECH\n\t3.CIVIL\nSelect the Department:");
   depart_id_check=in.nextInt();
    if(depart_id_check==1)
     {
     	depart_check="CS";
     	
     } 
  else if(depart_id_check==2)
       {
       	depart_check="MECH";
       
       }
       else if(depart_id_check==3)
       {
       	depart_check="CIVIL";
       
       }
   else
   	{
   		depart_check="Unknown";
   		
   	}
    switch(choice2)
    {
    	case 1:

    	
    	students_arraylist_size=studentslist.size();
    	    int xy1=0;	

	for( i=0;i<students_arraylist_size;i++)
	{
		
     if(studentslist.get(i).depart==depart_check)
		{
			xy1=1;
			System.out.print("\nStudent\nName:"+studentslist.get(i).name+"\nAddress:"+studentslist.get(i).address+"\nRegister_no:"+studentslist.get(i).register_no+"\nDepartment:"+studentslist.get(i).depart+"\nCategory:"+studentslist.get(i).category+"\nTotal_fee:"+studentslist.get(i).total_fee);
        }
    }
        if(students_arraylist_size==0||xy1==0)
    	{
          System.out.print("\nEmpty list!!\n");
    	}
	


	
    	break;
    	case 2:
    	 teachers_arraylist_size=teacherslist.size();
    	    int xy2=0;	

	for( i=0;i<teachers_arraylist_size;i++)
	{
		
     if(teacherslist.get(i).depart==depart_check)
		{
			xy2=1;
			System.out.print("\nTeachers\nName:"+teacherslist.get(i).name+"\nAddress:"+teacherslist.get(i).address+"\nTeacher id:"+teacherslist.get(i).teacher_id+"\nDepartment:"+teacherslist.get(i).depart+"\nSalary:"+teacherslist.get(i).salary);
        }
    }
        if(teachers_arraylist_size==0||xy2==0)
    	{
          System.out.print("\nEmpty list!!\n");
    	}
    	break;
    	default:
    	System.out.print("Invalid Entry!!");
    	break;
    }
	break;
	case 4:p=1;
	break;
	default: 
	System.out.print("Invalid entry!!\n");
	break;

}
}while(p==0);

}


}