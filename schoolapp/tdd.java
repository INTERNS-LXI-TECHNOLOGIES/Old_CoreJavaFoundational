public class tdd{

  public static void main(String[] args)
  {
	  school scl=new school();
	  scl.class1=new classroom();
	  scl.class1.Stud=new student();
	  scl.class1.Teach=new teacher();
	  scl.name="ideal";
	  scl.address="karumanamkursi,palakkad";
	  scl.class1.std=9;
	  scl.class1.Teach.trname="seeta";
	  scl.class1.Teach.subject="maths";
	  scl.class1.Stud.studname="ann maria";
	  
	  System.out.println("school Name: "+scl.name);
	  System.out.println("school Adress: "+scl.address);
	  System.out.println("standerd: "+scl.class1.std);
	  
	  System.out.println("teacher name: "+scl.class1.Teach.trname);
	  System.out.println("student name: "+ scl.class1.Stud.studname);
	  
	  
	  
	  
  }
}
	  
	  
  
  
  
  