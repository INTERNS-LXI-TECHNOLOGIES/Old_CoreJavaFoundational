public class Tdd
{
public static void main(String []args)
{
	School s=new School();
	
	s.class1=new Classroom();
	s.class2=new Classroom();
	
	s.class1.teacher1=new Teacher();
	s.class2.teacher2=new Teacher();
	
	s.class1.student1=new Student();
	s.class1.student2=new Student();
	
	
	s.class2.student3=new Student();
	s.class2.student4=new Student(); 
	
	s.name="GHSS BIGBAZZAR";
	s.place="PALAKKAD";
	
	s.class1.std=10;
	s.class2.std=8;
	
	s.class1.teacher1.name="Sarangi";
	s.class1.teacher1.subject="IT";
	s.class2.teacher2.name="Ajith";
	s.class2.teacher2.subject="Maths";
	
	s.class1.student1.rollno=101;
	s.class1.student1.name="Ami";
	
	
	s.class1.student2.rollno=102;
	s.class1.student2.name="Anu";
	
	s.class2.student3.rollno=103;
	s.class2.student3.name="Sanjay";
	
	s.class2.student4.rollno=104;
	s.class2.student4.name="Sanil";
	
	
	System.out.println(s.name);
	System.out.println(s.place);
	System.out.println("-----------------");
	
	System.out.println(" CLASS A");
	System.out.println("---------");
	
	System.out.println("std: " +s.class1.std);
	System.out.println("");
	System.out.println("Teacher name: " +s.class1.teacher1.name);
	System.out.println("Subject: " +s.class1.teacher1.subject);
	System.out.println("");
	System.out.println("Roll no: " +s.class1.student1.rollno);
	System.out.println("Name: " +s.class1.student1.name);
	System.out.println("");
	System.out.println("Roll no: " +s.class1.student2.rollno);
	System.out.println("Name: " +s.class1.student2.name);
	
	System.out.println("");
	
	System.out.println(" CLASS B");
	System.out.println("---------");
	
	System.out.println("std: " +s.class2.std);
	System.out.println("");
	System.out.println("Teacher name: " +s.class2.teacher2.name);
	System.out.println("Subject: " +s.class2.teacher2.subject);
	System.out.println("");
	System.out.println("Roll no: " +s.class2.student3.rollno);
	System.out.println("Name: " +s.class2.student3.name);
	System.out.println("");
	System.out.println("Roll no: " +s.class2.student4.rollno);
	System.out.println("Name: " +s.class2.student4.name);
	
}
}