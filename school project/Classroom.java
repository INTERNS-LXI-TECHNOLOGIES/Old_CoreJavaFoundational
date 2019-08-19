import java.util.Scanner;
public class Classroom
{
	Scanner word=new Scanner(System.in);
	int number,n;
// Teacher teacher;
// Student student1;
// Student student2;
// Student student3;
Teacher teacher=new Teacher();
 Student student[]=new Student[15];


void getDetails(){
	System.out.println("enter the class nmber");
	number=word.nextInt();
	teacher.getDetails();
	
	System.out.println("entrer the students count");
	n=word.nextInt();
	for(int i=0; i<n; i++){
		student[i]=new Student();
	
	student[i].getDetails();}
	
}
void printDetails(){
	System.out.println("class room number= "+number);
	teacher.printDetails();
	for(int i=0; i<n; i++)
	student[i].printDetails();
	
}

}