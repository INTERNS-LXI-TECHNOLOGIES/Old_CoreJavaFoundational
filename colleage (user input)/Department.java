import java.util.*;
 public class Department
 {
 	String name;
 	String location;
 	Classroom[] room;
 		public Department(String name,String location)
 		{
 			this.name=name;
 			this.location=location;
 			createclassroom();
 		}
 				void createclassroom()
 				{
 				     Scanner c=new Scanner(System.in);
 				     System.out.println("enter the limit of classroom");
 				     int n=c.nextInt();
 				     room=new Classroom[n];
 				     for(int i=0;i<n;i++)
 				     {
 				     	System.out.println("enter the name of the classroom");
 				     	String classname=System.console().readLine();
 				     	System.out.println("enter the location of classroom");
 				     	String classloc=System.console().readLine();
 				     	room[i]=new Classroom(classname,classloc);
 				     }


 				}

 						public void  printdetailsD()						
 						{
 							System.out.println("name of the department:"+name);
 							System.out.println("location of the department:"+location);//next line is the classroom object creation
 							for(int i=0;i<room.length;i++)
					         {
					            room[i].printdetailsC();
					             }

 						}
 		

 	
 }