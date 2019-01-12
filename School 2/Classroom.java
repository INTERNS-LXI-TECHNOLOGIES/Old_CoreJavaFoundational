import java.util.Scanner;
public class Classroom{
		String name;
		String noOfStudents;
		int noOfStudentsInt;
		Student[] student;
		Scanner scan = new Scanner(System.in);

public Classroom(){
	System.out.println("How Many Students in  This Class");
	noOfStudents = scan.nextLine();
	noOfStudentsInt = Integer.parseInt(noOfStudents);
}
	
public void setStudents(){	
		student = new Student[noOfStudentsInt];
	for (int i=0;i<noOfStudentsInt;i++){
			student[i] = new Student();
			System.out.println("Enter Student Name");
			student[i].name = scan.nextLine();
			student[i].marks();
		}
}
public void display(){
	for(int i=0;i<noOfStudentsInt;i++){
	System.out.println("Student Name  = "+student[i].name);
	System.out.println("Student Class = "+name);
	student[i].display();
	System.out.println("Total         = "+student[i].totalMark);
	if(student[i].totalMark<200){
		System.out.println(" ");
		System.out.println("    ***Failed***");
	}
	else{
		System.out.println(" ");
		System.out.println("    ***Passed***");
	}
	System.out.println("____________________");
	}
}

}