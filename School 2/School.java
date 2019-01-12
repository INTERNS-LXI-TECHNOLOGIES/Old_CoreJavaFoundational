import java.util.Scanner;
public class School{
	Scanner scan = new Scanner(System.in);
	
	int noOfClassesInt;
	Classroom[] classes;
	String name = "LXI High school";

	public School(){	
	System.out.println("How Many Classes in  This School");
	String noOfClasses;
	noOfClasses = scan.nextLine();
	noOfClassesInt = Integer.parseInt(noOfClasses);
}
	
public void setClass(){
	classes=new Classroom[noOfClassesInt];
		for (int i=0;i<noOfClassesInt;i++){
			classes[i] = new Classroom();

			System.out.println("Enter Class Standard");
			classes[i].name = scan.nextLine();
			classes[i].setStudents();
		}
	}
public void display(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("  "+name);
		System.out.println(" ");
		for(int i=0;i<noOfClassesInt;i++){
		classes[i].display();
		}
}
}